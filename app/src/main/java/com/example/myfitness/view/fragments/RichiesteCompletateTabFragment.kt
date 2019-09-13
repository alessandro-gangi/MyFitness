package com.example.myfitness.view.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.Esercizio
import com.example.myfitness.viewmodel.SchedeViewModel
import java.lang.Exception
import android.util.Log
import com.example.myfitness.view.adapters.CreaSchedeAdapter
import com.example.myfitness.view.adapters.RichiesteCompletateAdapter
import kotlinx.android.synthetic.main.tab_crea_scheda.view.*
import kotlinx.android.synthetic.main.tab_richieste_completate.view.*


class RichiesteCompletateTabFragment: Fragment() {
    val TAG = "RichiesteCompletateTabFragment"



    private lateinit var username: String

    private lateinit var adapter: RichiesteCompletateAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Fetch dati
        username = arguments?.getString(USERNAME) ?: ""

        // Adapter
        adapter = RichiesteCompletateAdapter()

        username = "ghingo" //TODO: TEST

        // viewModel
        //TODO: inserire richiesteViewModel



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




    companion object {
        val USERNAME = "USERNAME"

        @JvmStatic
        fun newInstance(username: String) = RichiesteCompletateTabFragment().apply {
            arguments = Bundle().apply {
                putString(USERNAME, username)
            }
        }
    }

}
