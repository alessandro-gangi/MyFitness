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
import kotlinx.android.synthetic.main.tab_crea_scheda.view.*


class CreaSchedaTabFragment: Fragment() {
    val TAG = "CreaSchedaTabFragment"

    private lateinit var schedeViewModel: SchedeViewModel

    private lateinit var username: String
    private var numGiorno: Int? = null

    private lateinit var adapter: CreaSchedeAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Fetch dati scheda giornaliera
        username = arguments?.getString(USERNAME) ?: ""

        // Adapter
        adapter = CreaSchedeAdapter()

        // viewModel
        schedeViewModel = activity?.run {
            ViewModelProvider(this).get(SchedeViewModel::class.java)
        } ?: throw Exception("Invalid Activity")



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.tab_crea_scheda, container, false)
        rootView.crea_schede_recycler_view.layoutManager = LinearLayoutManager(activity)

        rootView.crea_schede_recycler_view.adapter = adapter

        rootView.button_add_esercizio.setOnClickListener {
            addEsercizio()
        }

        return rootView

    }


    private fun addEsercizio(){
        adapter.listaEsercizi.add(Esercizio())
        adapter.notifyDataSetChanged()
    }

    fun getSchedaCreata(): ArrayList<Esercizio>{
        return adapter.getSchedaCreata()
    }



    companion object {
        val USERNAME = "USERNAME"

        @JvmStatic
        fun newInstance(username: String) = CreaSchedaTabFragment().apply {
            arguments = Bundle().apply {
                putString(USERNAME, username)
            }
        }
    }

}
