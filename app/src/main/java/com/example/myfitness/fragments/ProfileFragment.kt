package com.example.myfitness.fragments

import android.Manifest
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.graphics.drawable.Drawable
import android.net.Uri
import android.opengl.Visibility
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.example.myfitness.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.view.*
import kotlinx.android.synthetic.main.fragment_register_step2.*
import java.io.FileNotFoundException


class ProfileFragment : Fragment() {
    val TAG = "ProfileFragment"

    private val USER_DATA_PREFERENCE: String = "USER_PREFERENCE"

    val MY_PACKAGE_NAME: String = "com.example.myfitness"

    val READ_EXTERNAL_STORAGE_CODE = 1
    val IMAGE_PICK_CODE = 2

    var isUserModifyingData: Boolean = false

    lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        sharedPref = activity!!.getSharedPreferences(USER_DATA_PREFERENCE, Context.MODE_PRIVATE)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_profile, container, false)
        inizializza_dati_utente(view)

        // per modificare i dati del profilo
        view.threeDots_button.setOnClickListener {
            showEditProfilePopupMenu(it)
        }

        // per confermare le modifiche fatte
        view.confirm_changes_button.setOnClickListener {
            confirm_changes(view)
            //TODO: salva i nuovi dati nella base di dati
            //saveData()
        }

        //per cambiare la foto profilo
        view.profile_imageView.setOnClickListener {
            if(isUserModifyingData){
                impostaImmagine(it)
            }
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


        return view
    }



    private fun inizializza_dati_utente(view: View){
        val username: String? = sharedPref.getString("USER_USERNAME", "")
        val nome: String? = sharedPref.getString("USER_NAME", "")
        val descrizione: String? = sharedPref.getString("USER_DESC", "")
        view.nome_textView.text = "$nome ($username)"
        view.descrizione_textView.text= descrizione
    }



    private fun showEditAllenatorePopupMenu(view: View) {
        val popup: PopupMenu?
        popup = PopupMenu(view.context, view)
        popup.inflate(R.menu.popup_profile_allenatore_menu)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {

            when (it!!.itemId) {
                R.id.popup_menu_item_modifica_allenatore_profilo -> {
                    //TODO: Cambia allenatore
                    cambiaAllenatore()
                }

                R.id.popup_menu_item_elimina_allenatore_profilo -> {
                    //TODO: creare metodo per eliminare allenatore
                    //eliminaAllenatore()
                    view.rootView.profilo_allenatore_cardview.visibility = View.GONE
                    view.rootView.profilo_selez_allen_layout.visibility = View.VISIBLE
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
                    //TODO: Cambia scheda attuale
                    val msg: String = "Seleziona la tua scheda dal tab \"schede\""
                    Toast.makeText(activity, msg, Toast.LENGTH_LONG).show()

                    //effettuare passaggio al fragment schede
                    cambiaScheda()
                }

                R.id.popup_menu_item_elimina_scheda_attuale_profilo -> {
                    //TODO: creare metodo per eliminare la scheda attuale
                    //eliminaSchedaAttuale()
                    view.rootView.profilo_scheda_attuale_cardview.visibility = View.GONE
                    view.rootView.profilo_selez_scheda_layout.visibility = View.VISIBLE
                }
            }
            true
        })

        popup.show()
    }

    private fun showEditProfilePopupMenu(view: View) {
        val popup: PopupMenu?
        popup = PopupMenu(view.context, view)
        popup.inflate(R.menu.popup_profilo_menu)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {

            when (it!!.itemId) {
                R.id.popup_menu_item_modifica_profilo -> {
                    modify_profile_data(view.rootView)
                }
            }
            true
        })

        popup.show()
    }


    private fun modify_profile_data(view: View){
        view.threeDots_button.visibility = View.GONE
        view.nome_textView.visibility = View.GONE
        view.descrizione_textView.visibility = View.GONE

        view.confirm_changes_button.visibility = View.VISIBLE
        view.nome_editText.visibility = View.VISIBLE
        view.descrizione_editText.visibility = View.VISIBLE

        //imposto il flag a true
        isUserModifyingData = true
    }

    private fun confirm_changes(view: View){

        //TODO: controllare i dati delle varie editText
        //controllaDati()

        //salvo i nuovi dati nelle textView
        view.nome_textView.text = view.nome_editText.text
        view.descrizione_textView.text = view.descrizione_editText.text

        //riporto visibili gli stessi componenti iniziali
        view.threeDots_button.visibility = View.VISIBLE
        view.nome_textView.visibility = View.VISIBLE
        view.descrizione_textView.visibility = View.VISIBLE

        view.confirm_changes_button.visibility = View.GONE
        view.nome_editText.visibility = View.GONE
        view.descrizione_editText.visibility = View.GONE

        //riporto il flag a false
        isUserModifyingData = false
    }


    fun impostaImmagine(immagine: View){
        preparePermissionForPickingImage()

        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, IMAGE_PICK_CODE)
    }

    //handle result of picked image
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.d(TAG, "on activity result")

        if (data != null) {
            val contentURI = data.data
            val yourDrawable: Drawable
            try {
                val inputStream = activity!!.contentResolver.openInputStream(contentURI!!)
                yourDrawable = Drawable.createFromStream(inputStream, contentURI.toString())
                profile_imageView!!.setImageDrawable(yourDrawable)

            } catch (e: FileNotFoundException) {
                Log.d(TAG, "errore nella selezione dell'immagine")
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
        fragmentManager!!.beginTransaction().replace(
            R.id.container_main,
            SchedeFragment()).commit()
        activity!!.nav_view_main.selectedItemId = R.id.navigation_schede
    }
}
