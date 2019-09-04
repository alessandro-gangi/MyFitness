package com.example.myfitness.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.dataManager.MyDataManager

import com.example.myfitness.R
import com.example.myfitness.adapters.EserciziAdapter
import com.example.myfitness.data.SchedaGiornaliera
import com.example.myfitness.interfaces.SchedeInteractionListener
import kotlinx.android.synthetic.main.fragment_visualizzazione_esercizi.view.*


class VisualizzazioneEserciziFragment: Fragment() {
    val TAG = "VisualEserciziFragment"

    private lateinit var schedaGiornaliera: SchedaGiornaliera
    private var schedaId: Long? = null
    private var numGiorno: Int? = null

    lateinit var listener: SchedeInteractionListener


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        listener = activity as SchedeInteractionListener

        // fetch scheda giornaliera
        schedaId = arguments?.getLong(SCHEDA_ID)
        numGiorno = arguments?.getInt(SCHEDA_NUM_GIORNO)
        schedaGiornaliera = MyDataManager.retrieve_scheda_giornaliera(schedaId!!, numGiorno!!)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_visualizzazione_esercizi, container, false)
        rootView.visual_esercizi_recyclerView.layoutManager = LinearLayoutManager(activity)

        //bisognerà poi fare il ciocco di lucius per gestire il cambio di fragment (es. quando
        // clicco su un esercizio per modificarlo) dall'activity principale

        rootView.visual_esercizi_recyclerView.adapter = EserciziAdapter(schedaGiornaliera) { schedaId, numGiorno ->
            listener.onEsercizioSelected(schedaId, numGiorno)
        }

        return rootView

    }


    companion object {
        val SCHEDA_ID = "SCHEDA_ID"
        val SCHEDA_NUM_GIORNO = "SCHEDA_NUM_GIORNO"

        @JvmStatic
        fun newInstance(scheda_id: Long, numGiorno: Int) = VisualizzazioneEserciziFragment().apply {
            arguments = Bundle().apply {
                putLong(SCHEDA_ID, scheda_id)
                putInt(SCHEDA_NUM_GIORNO, numGiorno)
            }
        }
    }

}
