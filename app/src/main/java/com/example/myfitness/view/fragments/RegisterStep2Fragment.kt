package com.example.myfitness.view.fragments


import android.Manifest
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.app.ActivityCompat
import com.example.myfitness.R
import kotlinx.android.synthetic.main.fragment_register_step2.*
import kotlinx.android.synthetic.main.fragment_register_step2.view.*
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.net.toUri
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.utilis.ImageCompressor
import com.example.myfitness.viewmodel.UtentiViewModel
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.InputStream


class RegisterStep2Fragment : Fragment() {
    val TAG = "RegisterFragment"

    //viewModel
    private lateinit var utentiViewModel: UtentiViewModel
    private lateinit var listaUtenti: List<Utente>

    val IMAGE_PICK_CODE = 1
    val READ_EXTERNAL_STORAGE_CODE = 2

    private var username: String? = null
    private var mail: String? = null
    private var password: String? = null
    private var file: File? = null
    private var serverImageUri: String? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        utentiViewModel = ViewModelProvider(this).get(UtentiViewModel::class.java)

        // fetch dati utente precedentemente immessi
        username = arguments?.getString(USERNAME)
        mail = arguments?.getString(MAIL)
        password = arguments?.getString(PASSWORD)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_register_step2, container, false)
        setupUI(view)

        return view
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun setupUI(view: View) {
        val nome: EditText = view.nome_register_editText
        val cognome: EditText = view.cognome_register_editText
        val eta: EditText = view.eta_register_editText
        val genereRadioGroup: RadioGroup = view.sesso_register_radio
        val radioMaschio: RadioButton = view.maschio_register_radio
        val radioFemmina: RadioButton = view.femmina_register_radio

        val imageView: ImageView = view.register_imageView
        val backButton: Button = view.back_register_button
        val completaRegistrazione: Button = view.completa_registrazione_button

        setupRadioButtons(radioMaschio, radioFemmina)
        setupImmagine(imageView)
        setupBackButton(backButton)
        setupCompletaRegistrazioneButton(completaRegistrazione, nome, cognome, eta, genereRadioGroup)
    }

    private fun setupRadioButtons(radioMaschio: RadioButton, radioFemmina: RadioButton) {
        radioMaschio.setOnClickListener {
            onRadioButtonClicked(it)
        }
        radioFemmina.setOnClickListener {
            onRadioButtonClicked(it)
        }

    }

    private fun setupImmagine(image: ImageView) {
        image.setOnClickListener {
            val myPermission: String = Manifest.permission.READ_EXTERNAL_STORAGE
            if (!isPermissionGranted(myPermission))
                preparePermissionForPickingImage()
            else{
                val intent =
                    Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
                startActivityForResult(intent, IMAGE_PICK_CODE)
            }
        }

    }

    private fun setupBackButton(back: Button) {
        back.setOnClickListener {
            activity?.supportFragmentManager?.popBackStack()
        }
    }

    private fun setupCompletaRegistrazioneButton(completaRegistrazione: Button, nome: EditText, cognome: EditText,
                                                 eta: EditText, genereRadioGroup: RadioGroup){

        //setup button
        completaRegistrazione.setOnClickListener {
            val sessoCheckedRadioButton: RadioButton = it.rootView.findViewById(genereRadioGroup.checkedRadioButtonId)
            val genere: Char = sessoCheckedRadioButton.text[0]

            if(controllaCorrettezzaDati(nome.text.toString(), cognome.text.toString(), eta.text.toString().toInt())) {
                if(file != null){
                    serverImageUri = utentiViewModel.uploadImage(username!!, file!!)
                    Log.d(TAG, "ServerImageURI: ${serverImageUri}")
                }
                val nuovoUtente = Utente(
                    username!!, mail!!, password!!, false, nome.text.toString(),
                    cognome.text.toString(), eta.text.toString().toInt(), null, serverImageUri, null, null,
                    genere, null)

                utentiViewModel.addUtente(nuovoUtente)

                Toast.makeText(activity, "Registrazione avvenuta correttamente",Toast.LENGTH_LONG).show()
                passaAlLogin()
            }

        }
    }


    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.maschio_register_radio ->
                    if (checked) {
                        Toast.makeText(activity, "M", Toast.LENGTH_LONG).show()
                    }
                R.id.femmina_register_radio ->
                    if (checked) {
                        Toast.makeText(activity, "F", Toast.LENGTH_LONG).show()
                    }
            }
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val errorMsg = "errore nella selezione dell'immagine"

        if (data != null) {
            val contentURI = data.data
            try {
                val realPath: String = getRealPathFromURI(contentURI!!)
                file = File(realPath)
                file?.let {
                    file = ImageCompressor.compressFile(file!!, activity!!)
                    //serverImageUri = utentiViewModel.uploadImage(username!!, file!!)

                    loadImageIntoImageView(contentURI, register_imageView)
                }

            } catch (e: FileNotFoundException) {
                Log.d(TAG, errorMsg + e.message)
            }
        }

    }

    private fun preparePermissionForPickingImage(){
        val myPermission: String = Manifest.permission.READ_EXTERNAL_STORAGE
        if (!isPermissionGranted(myPermission)) {
            if (!shouldShowRequestPermissionRationale(Manifest.permission.READ_EXTERNAL_STORAGE)) {
                explainPermissionRequest("Attenzione", "Ci serve il permesso di accedere alle tue foto")
            } else
                requestPermissions(arrayOf(myPermission), READ_EXTERNAL_STORAGE_CODE)
        }
    }

    private fun isPermissionGranted(permission: String): Boolean {
        var response = false
        if(ActivityCompat.checkSelfPermission(context!!, permission) == PackageManager.PERMISSION_GRANTED)
            response = true

        return response
    }

    private fun explainPermissionRequest(titolo: String, messaggio: String){
        val builder = AlertDialog.Builder(activity)
        builder.setTitle(titolo)
        builder.setMessage(messaggio)
        builder.setPositiveButton("Si", DialogInterface.OnClickListener { dialog, id ->
            goToSettings()
        })
        builder.setNegativeButton("No"
        ) { _, _ -> Unit }
        builder.show()
    }

    private fun goToSettings(){
        val MY_PACKAGE_NAME: String = "com.example.myfitness"

        val intent = Intent(
            Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
            Uri.fromParts("package", MY_PACKAGE_NAME, null))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }

    private fun controllaCorrettezzaDati(nome: String, cognome: String, eta: Int): Boolean{
        var flag: Boolean = true

        //controllo correttezza nome
        if(nome.isEmpty()){
            Toast.makeText(activity, "Nome non valido", Toast.LENGTH_SHORT).show()
            flag = flag and false
        }

        //controllo correttezza cognome
        if(cognome.isEmpty()){
            Toast.makeText(activity, "Cognome non valido", Toast.LENGTH_SHORT).show()
            flag = flag and false
        }

        if(eta.compareTo(0) == 0){
            Toast.makeText(activity, "Età non valida", Toast.LENGTH_SHORT).show()
            flag = flag and false
        }

        return flag
    }

    private fun passaAlLogin(){

        //passo al fragment per continuare la registrazione
        activity?.supportFragmentManager?.popBackStack()
        fragmentManager!!.beginTransaction().replace(
            R.id.container_start,
            LoginFragment()
        ).commit()
    }

    private fun getRealPathFromURI(contentURI: Uri): String {
        val result: String
        val cursor: Cursor? = activity!!.contentResolver.query(contentURI, null, null, null, null)
        if (cursor == null) { // Source is Dropbox or other similar local file path
            result = contentURI.path!!
        } else {
            cursor.moveToFirst()
            val index: Int = cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA)
            result = cursor.getString(index)
            cursor.close()
        }
        return result
    }

    private fun loadImageIntoImageView(imageURI: Uri, imageView: ImageView){
        Glide.with(activity!!)
            .load(imageURI)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .into(imageView)
    }




    companion object {
        val USERNAME = "USERNAME"
        val MAIL = "MAIL"
        val PASSWORD = "PASSWORD"

        @JvmStatic
        fun newInstance(username: String, mail: String, password: String) = RegisterStep2Fragment().apply {
            arguments = Bundle().apply {
                putString(USERNAME, username)
                putString(MAIL, mail)
                putString(PASSWORD, password)
            }
        }
    }
}
