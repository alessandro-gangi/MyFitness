package com.example.myfitness.view.fragments


import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.Richiesta
import com.example.myfitness.view.adapters.RichiesteInAttesaAdapter
import kotlinx.android.synthetic.main.tab_richieste_in_attesa.view.*


class RichiesteInAttesaTabFragment(activity: Context, clickListener: (richiesta: Richiesta, command: Char) -> Unit): Fragment() {
    val TAG = "RichiesteInAttTabFrag"



    private lateinit var username: String

    private val adapter: RichiesteInAttesaAdapter = RichiesteInAttesaAdapter(activity, clickListener)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Fetch dati
        username = arguments?.getString(USERNAME) ?: ""



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.tab_richieste_in_attesa, container, false)
        rootView.richieste_inAttesa_recycler_view.layoutManager = LinearLayoutManager(activity)

        rootView.richieste_inAttesa_recycler_view.adapter = adapter

        return rootView

    }


    fun setRichiesteInAttesa(listaRichieste: ArrayList<Richiesta>){
        adapter.setListaRichieste(listaRichieste)
    }




    companion object {
        val USERNAME = "USERNAME"

        @JvmStatic
        fun newInstance(activity: Context, username: String, clickListener: (richiesta: Richiesta, command: Char) -> Unit) = RichiesteInAttesaTabFragment(activity, clickListener).apply {
            arguments = Bundle().apply {
                putString(USERNAME, username)
            }
        }
    }

}
