package com.example.myfitness.fragments


import com.example.myfitness.utilities.InjectorUtils
import android.Manifest
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
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
import com.example.myfitness.data.Utente
import com.example.myfitness.R
import kotlinx.android.synthetic.main.fragment_register_step2.*
import kotlinx.android.synthetic.main.fragment_register_step2.view.*
import android.graphics.drawable.Drawable
import androidx.lifecycle.ViewModelProvider
import com.example.myfitness.data.Utente_new
import com.example.myfitness.ui.utenti.UtentiViewModel
import java.io.FileNotFoundException


class RegisterStep2Fragment : Fragment() {
    val TAG = "RegisterFragment"

    val IMAGE_PICK_CODE = 11
    val READ_EXTERNAL_STORAGE_CODE = 1234

    private var username: String? = null
    private var mail: String? = null
    private var password: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "on create")

        // fetch dati utente precedentemente immessi
        username = arguments?.getString(USERNAME)
        mail = arguments?.getString(MAIL)
        password = arguments?.getString(PASSWORD)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG, "on create view")

        val view: View = inflater.inflate(R.layout.fragment_register_step2, container, false)

        //viewModel
        val factory = InjectorUtils.provideUtentiViewModelFactory()
        val viewModel = ViewModelProvider(this, factory).get(UtentiViewModel::class.java)

        val nome: EditText = view.nome_register_editText
        val cognome: EditText = view.cognome_register_editText
        val eta: EditText = view.eta_register_editText
        val sessoRadioGroup: RadioGroup = view.sesso_register_radio
        val sessoMaschio: RadioButton = view.maschio_register_radio
        val sessoFemmina: RadioButton = view.femmina_register_radio

        val imageView: ImageView = view.register_imageView
        val backButton: Button = view.back_register_button
        val completaRegistrazione: Button = view.completa_registrazione_button

        // Imposto i radio buttons
        sessoMaschio.setOnClickListener {
            onRadioButtonClicked(it)
        }
        sessoFemmina.setOnClickListener {
            onRadioButtonClicked(it)
        }


        // Imposto l'immagine
        imageView.setOnClickListener{
            impostaImmagine(it)
        }

        // Imposto il back button
        backButton.setOnClickListener {
            activity?.supportFragmentManager?.popBackStack()
        }

        // Imposto il bottone COMPLETA REGISTRAZIONE
        completaRegistrazione.setOnClickListener {
            val sessoCheckedRadioButton: RadioButton = view.findViewById(sessoRadioGroup.checkedRadioButtonId)

            val nuovoUtente: Utente_new = Utente_new(username!!, mail!!, password!!, false, nome.text.toString(),
                cognome.text.toString(), eta.text.toString().toInt(), null, null, null, null,
                sessoCheckedRadioButton.text[0], null, null)
            viewModel.addUtente(nuovoUtente)

            val listaUtenti = viewModel.getUtenti().value!!
            Toast.makeText(activity, "Utenti presenti: ${listaUtenti.size}", Toast.LENGTH_SHORT).show()
            Log.d(TAG, "Utenti presenti:\n$listaUtenti" )

            // CONTROLLO DATI

            //Completo la registrazione
            //completaRegistrazione(Utente(username!!, mail!!, password!!, imageview.drawable, nome.text.toString(),
            //    cognome.text.toString(), eta.text.toString().toInt(), 'M'))

        }


        return view
    }


    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.maschio_register_radio ->
                    if (checked) {
                        Toast.makeText(activity, "Maschio", Toast.LENGTH_LONG).show()
                    }
                R.id.femmina_register_radio ->
                    if (checked) {
                        Toast.makeText(activity, "Femmina", Toast.LENGTH_LONG).show()
                    }
            }
        }
    }

    fun impostaImmagine(immagine: View){
        preparePermissionForPickingImage()

        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, IMAGE_PICK_CODE)
        Log.d(TAG, "finito di pickare")
    }

    //handle result of picked image
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.d(TAG, "on activity result")

        if (data != null) {
            val contentURI = data.data
            var yourDrawable: Drawable
            try {
                val inputStream = activity!!.contentResolver.openInputStream(contentURI!!)
                yourDrawable = Drawable.createFromStream(inputStream, contentURI.toString())
                Toast.makeText(activity, "Image Show!", Toast.LENGTH_SHORT).show()
                register_imageView!!.setImageDrawable(yourDrawable)

            } catch (e: FileNotFoundException) {
                Log.d(TAG, "errore nella selezione dell'immagine")
            }
        }

    }

    private fun preparePermissionForPickingImage(){
        val myPermission: String = Manifest.permission.READ_EXTERNAL_STORAGE
        if (!isPermissionGranted(myPermission)) {
            if (!shouldShowRequestPermissionRationale(Manifest.permission.READ_EXTERNAL_STORAGE)) {
                explainPermissionRequest("Attenzione", "Ci serve il permesso cristo di Dio")
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


    private fun completaRegistrazione(utente: Utente){
        Toast.makeText(activity, utente.toString(), Toast.LENGTH_LONG).show()

        //FAI LA REGISTRAZIONE

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
