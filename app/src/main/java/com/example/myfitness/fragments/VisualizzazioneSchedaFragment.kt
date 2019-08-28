package com.example.myfitness.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.R
import com.example.myfitness.adapters.EserciziAdapter
import com.example.myfitness.data.MockSchede
import com.example.myfitness.data.Scheda
import kotlinx.android.synthetic.main.fragment_visualizzazione_scheda.view.*


class VisualizzazioneSchedaFragment : Fragment() {
    val TAG = "VisualizzazioneFragment"


    // DOBBIAMO MOSTRARE NELL'HEADER DATA, GIORNI, TIPOLOGIA DELLA SCHEDA
    // E POI NELLA RECYCLER TUTTI I VARI ESERCIZI DELLA SCHEDA

    lateinit var scheda: Scheda


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        // fetch scheda dato id
        arguments?.getInt(SCHEDA_ID)?.let {schedaId ->
            scheda = MockSchede.allMockSchede
                .find { it.id == schedaId }!!
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_visualizzazione_scheda, container, false)
        rootView.esercizi_recyclerView.layoutManager = LinearLayoutManager(activity)
        rootView.esercizi_recyclerView.adapter = EserciziAdapter()

        //DA ERRORE QUA DICENDO CHE LE TEXTVIEW SONO NULLE (E NON POSSONO ESSERLO)
        rootView.data_textView.text = scheda.data
        rootView.tipologia_textView.text = scheda.tipo
        rootView.numGiorni_textView.text = scheda.schedeGiornaliere.size.toString()
        rootView.commento_textView.text = scheda.commento

        return rootView
    }

    companion object {
        val SCHEDA_ID = "schedaId"

        @JvmStatic
        fun newInstance(schedaId: Int) = VisualizzazioneSchedaFragment().apply {
            arguments = Bundle().apply {
                putInt(SCHEDA_ID, schedaId)
            }
        }
    }



}
