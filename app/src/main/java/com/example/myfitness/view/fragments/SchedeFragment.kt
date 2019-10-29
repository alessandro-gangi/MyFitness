package com.example.myfitness.view.fragments

import android.app.AlertDialog
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.R
import com.example.myfitness.view.adapters.SchedeAdapter
import com.example.myfitness.model.dataClasses.MockSchede
import com.example.myfitness.model.dataClasses.Richiesta
import com.example.myfitness.model.dataClasses.Scheda
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.utilis.AllineaDB
import com.example.myfitness.utilis.ConnectionChecker
import com.example.myfitness.viewmodel.RichiesteViewModel
import com.example.myfitness.viewmodel.SchedeViewModel
import com.example.myfitness.viewmodel.UtentiViewModel
import kotlinx.android.synthetic.main.dialog_crea_scheda.view.*
import kotlinx.android.synthetic.main.dialog_richiedi_scheda.view.*
import kotlinx.android.synthetic.main.fragment_schede.*
import kotlinx.android.synthetic.main.fragment_schede.view.*
import java.text.SimpleDateFormat
import java.util.*


class SchedeFragment : Fragment(){
    val TAG = "SchedeFragment"

    // SharedPref
    private lateinit var sharedPref: SharedPreferences
    private val USER_DATA_PREFERENCE: String = "USER_DATA_PREFERENCE"
    val USERNAME_KEY = "USERNAME"
    private lateinit var username: String

    // ViewModel
    private lateinit var schedeViewModel: SchedeViewModel
    private lateinit var utentiViewModel: UtentiViewModel
    private lateinit var richiesteViewModel: RichiesteViewModel

    // Adapter
    private lateinit var adapter: SchedeAdapter

    // Utente
    private lateinit var utente: Utente
    private var allenatore: Utente? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPref = activity!!.getSharedPreferences(USER_DATA_PREFERENCE, Context.MODE_PRIVATE)
        username = sharedPref.getString(USERNAME_KEY, "") ?: ""

        adapter = SchedeAdapter { schedaId, command -> onSchedaClicked(schedaId, command) }

        schedeViewModel = activity?.run {
            ViewModelProvider(this).get(SchedeViewModel::class.java)
        } ?: throw Exception("Invalid Activity")
        schedeViewModel.setUsername(username)

        utentiViewModel = activity?.run {
            ViewModelProvider(this).get(UtentiViewModel::class.java)
        } ?: throw Exception("Invalid Activity")
        utentiViewModel.setUsername(username)

        richiesteViewModel = activity?.run {
            ViewModelProvider(this).get(RichiesteViewModel::class.java)
        } ?: throw Exception("Invalid Activity")
        richiesteViewModel.setUsername(username)

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_schede, container, false)
        rootView.schede_recycler_view.layoutManager = LinearLayoutManager(activity)

        rootView.schede_recycler_view.adapter = adapter

        utente = utentiViewModel.utente.value!!
        allenatore = utentiViewModel.allenatore.value

        schedeViewModel.schedeUtente.observe(this, Observer {
            if(it != null)
                adapter.setListaSchede(it)
        })

        activity!!.title = resources.getString(R.string.le_tue_schede)


        rootView.button_add_scheda.setOnClickListener {
            showAddPopupMenu(this.button_add_scheda)
        }

        return rootView
    }


    private fun showAddPopupMenu(view: View) {
        val popup: PopupMenu?
        popup = PopupMenu(view.context, view)
        popup.inflate(R.menu.popup_add_scheda_menu)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {

            when (it!!.itemId) {
                R.id.popup_menu_item_richiedi -> {
                    if(userHasSelectedCoach())
                        prepareRequestToCoach()
                    else {
                        val msg = "Devi prima selezionare un allenatore"
                        Toast.makeText(activity, msg, Toast.LENGTH_LONG).show()
                    }
                }

                R.id.popup_menu_item_crea -> {
                    Toast.makeText(view.context, it.title, Toast.LENGTH_SHORT).show()
                    creaScheda()
                }
            }
            true
        })
        popup.show()
    }

    private fun prepareRequestToCoach(){

        // Controllo che non abbia già mandato un'altra richiesta
        if(richiesteViewModel.getRichiestaFromAtoB(utente, allenatore!!) != null){
            val errorMsg = "Hai già mandato una richiesta a questo allenatore. Attendi che risponda."
            Toast.makeText(activity, errorMsg, Toast.LENGTH_LONG).show()
            return
        }

        val builder = AlertDialog.Builder(activity)
        builder.setTitle("Richiedi una scheda")

        val view = layoutInflater.inflate(R.layout.dialog_richiedi_scheda, null)

        val numGiorniPicker: NumberPicker = view.numGiorni_picker_richiedi_scheda_dialog
        var numGiorni = 1
        val tipologiaRadioGroup: RadioGroup = view.tipologia_radio_group_richiedi_scheda_dialog
        var tipologia = ""
        val commento: EditText = view.commento_richiedi_scheda_dialog
        val currentDate = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(Date()).toString()

        numGiorniPicker.maxValue = 7
        numGiorniPicker.minValue = 1
        numGiorniPicker.setOnValueChangedListener { _, _, newVal ->
            numGiorni = newVal
        }

        tipologiaRadioGroup.setOnCheckedChangeListener { _, selectedId ->
            when(selectedId){
                R.id.radio_forza_richiedi_scheda_dialog -> tipologia = "Forza"
                R.id.radio_massa_richiedi_scheda_dialog -> tipologia = "Massa"
                R.id.radio_definizione_richiedi_scheda_dialog -> tipologia = "Definizione"
                R.id.radio_nonSpecificare_richiedi_scheda_dialog -> tipologia = ""
            }
        }

        builder.setView(view)

        builder.setPositiveButton(R.string.richiedi) { _, _ ->
            val richiesta = Richiesta(0,utente, allenatore!!,
                currentDate, numGiorni, tipologia, commento.text.toString())

            richiesteViewModel.addRichiesta(richiesta)
            val richiestaMsg = "Richiesta inviata"
            Toast.makeText(activity, richiestaMsg, Toast.LENGTH_LONG).show()
        }

        builder.setNegativeButton(R.string.annulla) { dialog, _ ->
            dialog.cancel()
        }
        builder.show()
    }

    private fun userHasSelectedCoach(): Boolean{
        if(utentiViewModel.utente.value?.allenatore != null)
            return true
        return false
    }

    private fun creaScheda(){

        val builder = AlertDialog.Builder(activity)
        builder.setTitle(resources.getString(R.string.crea_scheda))

        val view = layoutInflater.inflate(R.layout.dialog_crea_scheda, null)

        val numGiorniPicker: NumberPicker = view.numGiorni_picker_crea_scheda_dialog
        var numGiorni = 1
        val tipologiaRadioGroup: RadioGroup = view.tipologia_radio_group_crea_scheda_dialog
        var tipologia = ""
        val commento: EditText = view.commento_crea_scheda_dialog
        val currentDate = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(Date()).toString()

        numGiorniPicker.maxValue = 7
        numGiorniPicker.minValue = 1
        numGiorniPicker.setOnValueChangedListener { _, _, newVal ->
            numGiorni = newVal
        }

        tipologiaRadioGroup.setOnCheckedChangeListener { _, selectedId ->
            when(selectedId){
                R.id.radio_forza_crea_scheda_dialog -> tipologia = "Forza"
                R.id.radio_massa_crea_scheda_dialog -> tipologia = "Massa"
                R.id.radio_definizione_crea_scheda_dialog -> tipologia = "Definizione"
                R.id.radio_nonSpecificare_crea_scheda_dialog -> tipologia = ""
            }
        }

        builder.setView(view)

        builder.setPositiveButton(R.string.crea) { _, _ ->

            fragmentManager!!.beginTransaction()
                .replace(R.id.container_main,
                    CreaSchedaFragment.newInstance(
                        username = username,
                        data = currentDate,
                        tipologia = tipologia,
                        numGiorni = numGiorni,
                        commento = commento.text.toString(),
                        richiesta = null)
                )
                .addToBackStack(null)
                .commit()
        }

        builder.setNegativeButton(R.string.annulla) { dialog, p1 ->
            dialog.cancel()
        }
        builder.show()
    }


    fun onSchedaClicked(schedaId: Int, command: Char) {
        when (command){
            'V' -> {

                fragmentManager!!.beginTransaction()
                .replace(R.id.container_main,
                    VisualizzazioneSchedaFragment.newInstance(username, schedaId)
                )
                .addToBackStack(null)
                .commit()


            }

            'D' -> {

                schedeViewModel.deleteScheda(schedaId)
                if(ConnectionChecker.isConnectionAvailable(activity!!) == false)
                    AllineaDB.addSchedaToDelete(schedaId)
            }

            'S' -> {

                schedeViewModel.setAsCurrentScheda(schedaId)
                //TODO: test -> non so se basta fare così
                if(ConnectionChecker.isConnectionAvailable(activity!!) == false)
                    AllineaDB.addSchedaToUpdate(schedaId)

                fragmentManager!!.beginTransaction()
                    .replace(R.id.container_main,
                        ProfileFragment()).commit()
            }
        }
    }
}
