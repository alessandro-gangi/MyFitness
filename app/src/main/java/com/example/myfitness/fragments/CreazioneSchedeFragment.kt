package com.example.myfitness.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.R
import com.example.myfitness.adapters.CreazioneSchedeAdapter
import com.example.myfitness.adapters.SchedeAdapter
import com.example.myfitness.data.MockSchede
import kotlinx.android.synthetic.main.fragment_creazione_schede.*
import kotlinx.android.synthetic.main.fragment_creazione_schede.view.*


class CreazioneSchedeFragment : Fragment() {
    val TAG = "CreazioneSchedeFragment"
    //lateinit var listener: CreazioneSchedeInteractionListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_creazione_schede, container, false)
        rootView.creazione_schede_recycler_view.layoutManager = LinearLayoutManager(activity)
        //listener = activity as CreazioneSchedeInteractionListener
        rootView.creazione_schede_recycler_view.adapter = CreazioneSchedeAdapter()

        rootView.button_add_esercizio.setOnClickListener {
            //CREAZIONE ALTRA RIGA PER NUOVO ESERCIZIO
        }

        return rootView
    }


    /*interface CreazioneSchedeInteractionListener {
        fun onNewExerciseCreated(schedaId: Long)
    }*/


}
