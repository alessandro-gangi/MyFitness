package com.example.myfitness.view.fragments

import android.app.AlertDialog
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
import com.example.myfitness.model.dataClasses.Scheda
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

    //viewModel
    private lateinit var schedeViewModel: SchedeViewModel
    private lateinit var utentiViewModel: UtentiViewModel

    private lateinit var adapter: SchedeAdapter

    private val username = "ghingo" //TODO: da tenere solo per i test


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //schedeViewModel = ViewModelProvider(this).get(SchedeViewModel::class.java)

        adapter = SchedeAdapter { schedaId, command -> onSchedaClicked(schedaId, command) }

        schedeViewModel = activity?.run {
            ViewModelProvider(this).get(SchedeViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

        utentiViewModel = activity?.run {
            ViewModelProvider(this).get(UtentiViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_schede, container, false)
        rootView.schede_recycler_view.layoutManager = LinearLayoutManager(activity)

        rootView.schede_recycler_view.adapter = adapter

        //TODO: nuove funzionalita' (prima era nell'oncreate)
        schedeViewModel.schedeUtente.observe(this, Observer {
            if(it != null)
                adapter.setListaSchede(it)
        })


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

            //TODO: al posto della roba sotto bisogna inviare la richiesta all'allenatore
            /*
            fragmentManager!!.beginTransaction()
                .replace(R.id.container_main,
                    CreaSchedaFragment.newInstance(
                        username = username,
                        data = currentDate,
                        tipologia = tipologia,
                        numGiorni = numGiorni,
                        commento = commento.text.toString())
                )
                .addToBackStack(null)
                .commit()
                */
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
        builder.setTitle("Crea una scheda")

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
                        commento = commento.text.toString())
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
                    VisualizzazioneSchedaFragment.newInstance(schedaId)
                )
                .addToBackStack(null)
                .commit()


            }

            'D' -> {

                schedeViewModel.deleteScheda(schedaId)
            }

            'S' -> {

                schedeViewModel.setAsCurrentScheda(schedaId)
            }
        }
    }
}
