package com.example.myfitness.view.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.Scheda
import com.example.myfitness.view.adapters.RichiesteCompletateAdapter
import kotlinx.android.synthetic.main.tab_richieste_completate.view.*


class RichiesteCompletateTabFragment(clickListener: (scheda: Scheda, command: Char) -> Unit): Fragment() {
    val TAG = "RichiesteCompletateTabFragment"



    private lateinit var username: String

    private val adapter: RichiesteCompletateAdapter = RichiesteCompletateAdapter(clickListener)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Fetch dati
        username = arguments?.getString(USERNAME) ?: ""

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.tab_richieste_completate, container, false)
        rootView.richieste_completate_recycler_view.layoutManager = LinearLayoutManager(activity)

        rootView.richieste_completate_recycler_view.adapter = adapter

        return rootView

    }

    fun setRichiesteCompletate(listaRichieste: ArrayList<Scheda>){
        adapter.setListaRichieste(listaRichieste)
    }



    companion object {
        val USERNAME = "USERNAME"

        @JvmStatic
        fun newInstance(username: String, clickListener: (scheda: Scheda, command: Char) -> Unit) = RichiesteCompletateTabFragment(clickListener).apply {
            arguments = Bundle().apply {
                putString(USERNAME, username)
            }
        }
    }

}
