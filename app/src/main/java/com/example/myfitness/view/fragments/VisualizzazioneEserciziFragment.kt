package com.example.myfitness.view.fragments


import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.R
import com.example.myfitness.view.adapters.EserciziAdapter
import com.example.myfitness.model.dataClasses.Esercizio
import com.example.myfitness.model.dataClasses.Scheda
import com.example.myfitness.viewmodel.SchedeViewModel
import kotlinx.android.synthetic.main.dialog_aggiungi_commento_esercizio.view.*
import kotlinx.android.synthetic.main.tab_visualizzazione_esercizi.view.*
import java.lang.Exception
import android.content.Intent
import android.net.Uri
import kotlinx.android.synthetic.main.dialog_modifica_esercizio.view.*


class VisualizzazioneEserciziFragment: Fragment() {
    val TAG = "VisualEserciziFragment"

    private lateinit var schedeViewModel: SchedeViewModel
    private lateinit var scheda: Scheda
    private lateinit var listaEsercizi: ArrayList<Esercizio>

    private var schedaId: Int? = null
    private var numGiorno: Int? = null
    private var username: String? = null

    private lateinit var adapter: EserciziAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Fetch dati scheda giornaliera
        schedaId = arguments?.getInt(SCHEDA_ID)
        numGiorno = arguments?.getInt(SCHEDA_NUM_GIORNO)
        username = arguments?.getString(USERNAME)

        // Adapter
        adapter = EserciziAdapter { numEsercizio, itemClicked -> onMenuEsercizioItemClicked(numEsercizio, itemClicked) }


        // viewModel
        schedeViewModel = activity?.run {
            ViewModelProvider(this).get(SchedeViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

        schedeViewModel.schedeUtente.observe(this, Observer {
            if(it != null) {
                //listaEsercizi = schedeViewModel.getSchedaGiornaliera(schedaId!!, numGiorno!!)
                scheda = schedeViewModel.getScheda(schedaId!!)
                listaEsercizi = scheda.esercizi[numGiorno!!]
                adapter.setListaEsercizi(listaEsercizi)
            }
        })

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.tab_visualizzazione_esercizi, container, false)
        rootView.visual_esercizi_recyclerView.layoutManager = LinearLayoutManager(activity)

        rootView.visual_esercizi_recyclerView.adapter = adapter

        return rootView

    }


    fun onMenuEsercizioItemClicked( numEsercizio: Int, itemClicked: Int) {

        if(username == scheda.possessore.usernameId)
            when (itemClicked) {
                R.id.popup_menu_item_commento -> {
                    aggiungiCommento(numEsercizio)
                }

                R.id.popup_menu_item_guarda_video -> {
                    guardaVideo(numEsercizio)
                }

                R.id.popup_menu_item_modifica_esercizio -> {
                    modificaEsercizio(numEsercizio)
                }

                R.id.popup_menu_item_elimina_esercizio -> {
                    eliminaEsercizio(numEsercizio)
                }
            }
        else {
            val errorMsg = "Non puoi modificare una scheda di cui non sei il proprietario"
            Toast.makeText(activity, errorMsg, Toast.LENGTH_LONG).show()
        }

    }




    private fun aggiungiCommento(numEsercizio: Int){

        val builder = AlertDialog.Builder(activity)
        builder.setTitle("Aggiungi un commento")

        val view = layoutInflater.inflate(R.layout.dialog_aggiungi_commento_esercizio, null)

        val commento: EditText = view.commento_dialog

        builder.setView(view)

        builder.setPositiveButton(R.string.aggiungi) { dialog, p1 ->
            val scheda: Scheda = schedeViewModel.getScheda(schedaId!!)
            scheda.esercizi[numGiorno!!][numEsercizio].commento = commento.text.toString()
            schedeViewModel.updateScheda(scheda)
        }

        builder.setNegativeButton(R.string.annulla) { dialog, p1 ->
            dialog.cancel()
        }

        builder.show()
    }

    private fun modificaEsercizio(numEsercizio: Int){

        val builder = AlertDialog.Builder(activity)
        builder.setTitle("Modifica esercizio")

        val view = layoutInflater.inflate(R.layout.dialog_modifica_esercizio, null)

        val serie: EditText = view.serie_dialog
        val ripetizioni: EditText = view.ripetizioni_dialog
        val recupero: EditText = view.recupero_dialog

        builder.setView(view)

        builder.setPositiveButton(R.string.aggiungi) { dialog, p1 ->
            val scheda: Scheda = schedeViewModel.getScheda(schedaId!!)
            if (serie.text.toString() != "")
                scheda.esercizi[numGiorno!!][numEsercizio].serie = serie.text.toString().toInt()
            else
                scheda.esercizi[numGiorno!!][numEsercizio].serie = null

            if (ripetizioni.text.toString() != "")
                scheda.esercizi[numGiorno!!][numEsercizio].ripetizioni = ripetizioni.text.toString().toInt()
            else
                scheda.esercizi[numGiorno!!][numEsercizio].ripetizioni = null

            if (recupero.text.toString() != "")
                scheda.esercizi[numGiorno!!][numEsercizio].recupero = serie.text.toString().toDouble()
            else
                scheda.esercizi[numGiorno!!][numEsercizio].recupero = null

            schedeViewModel.updateScheda(scheda)
        }

        builder.setNegativeButton(R.string.annulla) { dialog, p1 ->
            dialog.cancel()
        }

        builder.show()
    }

    private fun eliminaEsercizio(numEsercizio: Int){
        val scheda: Scheda = schedeViewModel.getScheda(schedaId!!)
        scheda.esercizi[numGiorno!!].removeAt(numEsercizio)
        schedeViewModel.updateScheda(scheda)
    }


    private fun guardaVideo(numEsercizio: Int){
        val nomeEsercizio = listaEsercizi[numEsercizio].nome
        nomeEsercizio.replace(' ', '+')
        val uri = "https://www.youtube.com/results?search_query=palestra+$nomeEsercizio"
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(uri)))
    }


    companion object {
        val USERNAME = "USERNAME"
        val SCHEDA_ID = "SCHEDA_ID"
        val SCHEDA_NUM_GIORNO = "SCHEDA_NUM_GIORNO"

        @JvmStatic
        fun newInstance(username: String, scheda_id: Int, numGiorno: Int) = VisualizzazioneEserciziFragment().apply {
            arguments = Bundle().apply {
                putString(USERNAME, username)
                putInt(SCHEDA_ID, scheda_id)
                putInt(SCHEDA_NUM_GIORNO, numGiorno)
            }
        }
    }

}
