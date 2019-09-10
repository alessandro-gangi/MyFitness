package com.example.myfitness.view.fragments

import android.Manifest
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.graphics.drawable.toBitmap
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.Scheda
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.viewmodel.SchedeViewModel
import com.example.myfitness.viewmodel.UtentiViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.cardview_scheda.view.*
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.view.*
import kotlinx.android.synthetic.main.fragment_profile.view.data_textView
import kotlinx.android.synthetic.main.fragment_profile.view.days_textView
import kotlinx.android.synthetic.main.fragment_profile.view.scheda_imageView
import kotlinx.android.synthetic.main.fragment_profile.view.threeDots_button
import kotlinx.android.synthetic.main.fragment_profile.view.tipologia_textView
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileNotFoundException


class ProfileFragment : Fragment() {
    val TAG = "ProfileFragment"

    private lateinit var sharedPref: SharedPreferences
    private val USER_DATA_PREFERENCE: String = "USER_DATA_PREFERENCE"

    private val MY_PACKAGE_NAME: String = "com.example.myfitness"
    private val READ_EXTERNAL_STORAGE_CODE = 1
    private val IMAGE_PICK_CODE = 2

    private var isUserModifyingData: Boolean = false


    //viewModel
    private lateinit var utentiViewModel: UtentiViewModel
    private lateinit var schedeViewModel: SchedeViewModel

    private var utente: Utente? = null
    private var allenatore: Utente? = null
    private var currentScheda: Scheda? = null

    private lateinit var username: String



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPref = activity!!.getSharedPreferences(USER_DATA_PREFERENCE, Context.MODE_PRIVATE)
        val USERNAME_KEY = "USERNAME"
        username = sharedPref.getString(USERNAME_KEY, "") ?: ""

        utentiViewModel = activity?.run {
            ViewModelProvider(this).get(UtentiViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

        schedeViewModel = activity?.run {
            ViewModelProvider(this).get(SchedeViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

        utentiViewModel.setUsername(username)
        schedeViewModel.setUsername(username)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_profile, container, false)

        setupUI(view)

        schedeViewModel.currentSchedaUtente.observe(this, Observer {
            currentScheda = it
            impostaSchedaCorrente(view)
        })

        utentiViewModel.utente.observe(this, Observer {
            utente = it
            impostaDatiUtente(view)
            Log.d(TAG, "Utente: $utente")
        })


        utentiViewModel.allenatore.observe(this, Observer {
            allenatore = it
            impostaAllenatoreCorrente(view)
            Log.d(TAG, "Allenatore: $allenatore")
        })


        return view
    }



    private fun setupUI(view: View){

        // per modificare i dati del profilo
        view.threeDots_button.setOnClickListener {
            showHeaderProfilePopupMenu(it)
        }

        // per confermare le modifiche fatte
        view.confirm_changes_button.setOnClickListener {
            confirm_changes(view)
        }

        //per cambiare la foto profilo
        view.profile_imageView.setOnClickListener {
            if(isUserModifyingData) selezionaImmagine()
        }

        //per cambiare/eliminare l'allenatore
        view.threeDots_allenatore_button.setOnClickListener {
            showEditAllenatorePopupMenu(it)
        }

        //per cambiare/eliminare la scheda attuale
        view.threeDots_scheda_button.setOnClickListener {
            showEditSchedaAttualePopupMenu(it)
        }

        // quando non hai un allenatore e vuoi aggiungerlo
        view.button_add_allenatore.setOnClickListener {
            cambiaAllenatore()
        }

        // quando non hai una scheda e vuoi aggiungerla
        view.button_add_scheda_attuale.setOnClickListener {
            cambiaScheda()
        }

        // quando hai una scheda corrente e ci clicchi sopra
        view.profilo_scheda_attuale_cardview.setOnClickListener {
            apriScheda()
        }

    }

    private fun impostaDatiUtente(view: View){
        utente?.let {
            val username: String = utente!!.username
            val nome: String = utente!!.nome
            val cognome: String = utente!!.cognome
            val descrizione: String? = utente!!.descrizione

            if(utente!!.imageURI != null && view.profile_imageView.width > 0 && view.profile_imageView.height > 0) {
                val immagine: ByteArray? = utente!!.imageURI
                setByteArrayImgToImageView(immagine, view.profile_imageView)
            }

            view.nome_textView.text = nome
            view.cognome_textView.text = cognome
            view.descrizione_textView.text= descrizione

        }
    }

    private fun showEditAllenatorePopupMenu(view: View) {
        val popup: PopupMenu?
        popup = PopupMenu(view.context, view)
        popup.inflate(R.menu.popup_profile_allenatore_menu)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {

            when (it!!.itemId) {
                R.id.popup_menu_item_modifica_allenatore_profilo -> {
                    cambiaAllenatore()
                }

                R.id.popup_menu_item_elimina_allenatore_profilo -> {
                    eliminaAllenatore()
                }
            }
            true
        })

        popup.show()
    }

    private fun showEditSchedaAttualePopupMenu(view: View) {
        val popup: PopupMenu?
        popup = PopupMenu(view.context, view)
        popup.inflate(R.menu.popup_profile_scheda_attuale_menu)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {

            when (it!!.itemId) {
                R.id.popup_menu_item_modifica_scheda_attuale_profilo -> {
                    cambiaScheda()
                }

                R.id.popup_menu_item_elimina_scheda_attuale_profilo -> {
                    eliminaSchedaAttuale(view)
                }
            }
            true
        })

        popup.show()
    }

    private fun showHeaderProfilePopupMenu(view: View) {
        val popup: PopupMenu?
        popup = PopupMenu(view.context, view)
        popup.inflate(R.menu.popup_profilo_menu)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {

            when (it!!.itemId) {
                R.id.popup_menu_item_modifica_profilo -> {
                    modify_profile_data(view.rootView)
                }

                R.id.popup_menu_item_logout -> {
                    logout()
                }
            }
            true
        })

        popup.show()
    }

    private fun logout(){
        //TODO: logout
    }

    private fun modify_profile_data(view: View){
        view.threeDots_button.visibility = View.GONE
        view.nome_textView.visibility = View.GONE
        view.cognome_textView.visibility = View.GONE
        view.descrizione_textView.visibility = View.GONE

        view.confirm_changes_button.visibility = View.VISIBLE
        view.nome_editText.visibility = View.VISIBLE
        view.cognome_editText.visibility = View.VISIBLE
        view.descrizione_editText.visibility = View.VISIBLE

        view.nome_editText.setText(utente!!.nome)
        view.cognome_editText.setText(utente!!.cognome)
        view.descrizione_editText.setText(utente!!.descrizione)

        isUserModifyingData = true
    }

    private fun confirm_changes(view: View){

        //salvo i dati del nuovo utente
        val nuovoNome = view.nome_editText.text.toString()
        val nuovoCognome = view.cognome_editText.text.toString()
        val nuovaDescrizione = view.descrizione_editText.text.toString()
        val nuovaImmagine: ByteArray? = convertImageForDb(view.profile_imageView)

        //TODO: controllare i dati delle varie editText
        if(nuovoNome.isNotEmpty() && nuovoCognome.isNotEmpty()) {

            utente!!.nome = nuovoNome
            utente!!.cognome = nuovoCognome
            utente!!.descrizione = nuovaDescrizione
            utente!!.imageURI = nuovaImmagine

            utentiViewModel.updateUtente(utente!!)

            //riporto visibili gli stessi componenti iniziali
            view.threeDots_button.visibility = View.VISIBLE
            view.nome_textView.visibility = View.VISIBLE
            view.cognome_textView.visibility = View.VISIBLE
            view.descrizione_textView.visibility = View.VISIBLE

            view.confirm_changes_button.visibility = View.GONE
            view.nome_editText.visibility = View.GONE
            view.cognome_editText.visibility = View.GONE
            view.descrizione_editText.visibility = View.GONE

            isUserModifyingData = false
        }
        else {
            val errorMsg = "Imposta correttamente nome e cognome"
            Toast.makeText(activity, errorMsg, Toast.LENGTH_LONG).show()
        }
    }

    private fun selezionaImmagine(){
        preparePermissionForPickingImage()

        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, IMAGE_PICK_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val errorMsg = "errore nella selezione dell'immagine"

        if (data != null) {
            val contentURI = data.data
            val yourDrawable: Drawable
            try {
                //TODO: Fai funzionare con Glide
                /*
                val inputStream = activity!!.contentResolver.openInputStream(contentURI!!)
                yourDrawable = Drawable.createFromStream(inputStream, contentURI.toString())
                profile_imageView!!.setImageDrawable(yourDrawable)


                Glide.with(activity!!)
                    .load(contentURI!!.path!!)
                    .into(profile_imageView)

                    */

            } catch (e: FileNotFoundException) {
                Log.d(TAG, errorMsg)
            }
        }

    }

    private fun preparePermissionForPickingImage(){
        val myPermission: String = Manifest.permission.READ_EXTERNAL_STORAGE
        val title = "Attenzione"
        val msg = "Ci serve il permesso di accedere alle tue foto"

        if (!isPermissionGranted(myPermission)) {
            if (!shouldShowRequestPermissionRationale(Manifest.permission.READ_EXTERNAL_STORAGE)) {
                explainPermissionRequest(title, msg)
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
        val yesButtonText = "si"
        val noButtonText = "no"
        val builder = AlertDialog.Builder(activity)
        builder.setTitle(titolo)
        builder.setMessage(messaggio)
        builder.setPositiveButton(yesButtonText, DialogInterface.OnClickListener { dialog, id ->
            goToSettings()
        })
        builder.setNegativeButton(noButtonText) { _, _ -> Unit }
        builder.show()
    }

    private fun goToSettings(){
        val intent = Intent(
            Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
            Uri.fromParts("package", MY_PACKAGE_NAME, null))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }

    private fun cambiaAllenatore(){
        fragmentManager!!.beginTransaction().replace(
            R.id.container_main,
            AllenatoriFragment()
        ).addToBackStack(null).commit()
    }

    private fun cambiaScheda(){
        val msg = "Seleziona la tua scheda dal tab \"schede\""
        Toast.makeText(activity, msg, Toast.LENGTH_LONG).show()

        fragmentManager!!.beginTransaction().replace(
            R.id.container_main,
            SchedeFragment()
        ).commit()
        activity!!.nav_view_main.selectedItemId = R.id.navigation_schede
    }

    private fun impostaSchedaCorrente(view: View){
        if(currentScheda != null) {
            view.rootView.profilo_scheda_attuale_cardview.visibility = View.VISIBLE
            view.rootView.profilo_selez_scheda_layout.visibility = View.GONE

            view.days_textView.text = currentScheda!!.num_giorni.toString()

            var tmpNumEsercizi = 0
            for (i in 0 until currentScheda!!.esercizi.size){
                tmpNumEsercizi += currentScheda!!.esercizi[i].size
            }
            view.numEsercizi_profile_textView.text = tmpNumEsercizi.toString()

            view.data_textView.text = currentScheda!!.data
            view.tipologia_textView.text = currentScheda!!.tipo

            when (currentScheda!!.tipo.toLowerCase()){
                "forza" -> view.scheda_imageView.setImageResource(R.drawable.ic_tipologia_forza)
                "massa" -> view.scheda_imageView.setImageResource(R.drawable.ic_tipologia_massa)
                "definizione" -> view.scheda_imageView.setImageResource(R.drawable.ic_tipologia_definizione)
            }
        }
        else{
            view.rootView.profilo_scheda_attuale_cardview.visibility = View.GONE
            view.rootView.profilo_selez_scheda_layout.visibility = View.VISIBLE
        }
    }

    private fun impostaAllenatoreCorrente(view: View){
        if(allenatore != null) {
            view.rootView.profilo_allenatore_cardview.visibility = View.VISIBLE
            view.rootView.profilo_selez_allen_layout.visibility = View.GONE

            view.nomeAllenatore_textView.text = allenatore!!.nome
            view.descrizioneAllenatore_textView.text = allenatore!!.descrizione

        }
        else{
            view.rootView.profilo_allenatore_cardview.visibility = View.GONE
            view.rootView.profilo_selez_allen_layout.visibility = View.VISIBLE
        }
    }

    private fun eliminaSchedaAttuale(view: View){
        schedeViewModel.removeCurrentScheda()
    }

    private fun eliminaAllenatore(){
        utente!!.allenatore = null
        utentiViewModel.updateUtente(utente!!)
    }

    private fun apriScheda(){
        currentScheda?.let {
            fragmentManager!!.beginTransaction()
                .replace(R.id.container_main,
                    VisualizzazioneSchedaFragment.newInstance(it.id)
                )
                .addToBackStack(null)
                .commit()
        }
    }

    private fun convertImageForDb(imageView: ImageView): ByteArray{
        val bitmap: Bitmap = imageView.drawable.toBitmap()
        val baos: ByteArrayOutputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos)
        val imageInByte: ByteArray = baos.toByteArray()
        return imageInByte
    }

    private fun setByteArrayImgToImageView(byteArrayImage: ByteArray?, imageView: ImageView){
        byteArrayImage?.let {
            val bitmapImage: Bitmap = BitmapFactory.decodeByteArray(byteArrayImage, 0, byteArrayImage.size)
            imageView.setImageBitmap(Bitmap.createScaledBitmap(bitmapImage, bitmapImage.width,
                bitmapImage.height, false))
        }
    }
}