package com.example.myfitness.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.R
import com.example.myfitness.Adapters.SchedeAdapter
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)
        rootView.schede_recycler_view.layoutManager = LinearLayoutManager(activity)
        rootView.schede_recycler_view.adapter = SchedeAdapter()

        setupButtonAddScheda(rootView)
        setupButtonRichiediScheda(rootView)
        setupButtonCreaScheda(rootView)
        return rootView
    }

    private fun setupButtonAddScheda(view: View){
        view.button_add_scheda.setOnClickListener {
            view.button_add_scheda.visibility=View.GONE
            view.button_richiedi_scheda.visibility=View.VISIBLE
            view.button_crea_scheda.visibility=View.VISIBLE
        }
    }

    private fun setupButtonRichiediScheda(view: View){
        view.button_richiedi_scheda.setOnClickListener {
            view.button_add_scheda.visibility=View.VISIBLE
            view.button_richiedi_scheda.visibility=View.GONE
            view.button_crea_scheda.visibility=View.GONE
        }
    }

    private fun setupButtonCreaScheda(view: View){
        view.button_crea_scheda.setOnClickListener {
            view.button_add_scheda.visibility=View.VISIBLE
            view.button_richiedi_scheda.visibility=View.GONE
            view.button_crea_scheda.visibility=View.GONE
        }
    }



}
