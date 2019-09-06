package com.example.myfitness.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.R
import com.example.myfitness.adapters.EserciziAdapter
import com.example.myfitness.data.Esercizio
import com.example.myfitness.viewmodel.SchedeViewModel
import kotlinx.android.synthetic.main.fragment_visualizzazione_esercizi.view.*
import java.lang.Exception


class VisualizzazioneEserciziFragment: Fragment() {
    val TAG = "VisualEserciziFragment"

    private lateinit var schedeViewModel: SchedeViewModel
    private lateinit var listaEsercizi: ArrayList<Esercizio>

    private lateinit var adapter: EserciziAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // fetch dat scheda giornaliera
        val schedaId: Int? = arguments?.getInt(SCHEDA_ID)
        val numGiorno: Int? = arguments?.getInt(SCHEDA_NUM_GIORNO)

        // viewModel
        schedeViewModel = activity?.run {
            ViewModelProvider(this).get(SchedeViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

        listaEsercizi = schedeViewModel.getSchedaGiornaliera(schedaId!!, numGiorno!!)

        adapter = EserciziAdapter{numEsercizio -> onEsercizioSelected(numEsercizio)}
        adapter.setListaEsercizi(listaEsercizi)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_visualizzazione_esercizi, container, false)
        rootView.visual_esercizi_recyclerView.layoutManager = LinearLayoutManager(activity)

        rootView.visual_esercizi_recyclerView.adapter = adapter

        return rootView

    }


    fun onEsercizioSelected( numEsercizio: Int) {
        Toast.makeText(activity, "Esercizio selected: ${listaEsercizi[numEsercizio].nome}", Toast.LENGTH_SHORT).show()
    }


    companion object {
        val SCHEDA_ID = "SCHEDA_ID"
        val SCHEDA_NUM_GIORNO = "SCHEDA_NUM_GIORNO"

        @JvmStatic
        fun newInstance(scheda_id: Int, numGiorno: Int) = VisualizzazioneEserciziFragment().apply {
            arguments = Bundle().apply {
                putInt(SCHEDA_ID, scheda_id)
                putInt(SCHEDA_NUM_GIORNO, numGiorno)
            }
        }
    }

}
