package com.example.myfitness.view.fragments


import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.R
import com.example.myfitness.view.adapters.AllenatoriAdapter
import android.view.*
import android.widget.SearchView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.viewmodel.UtentiViewModel
import kotlinx.android.synthetic.main.fragment_allenatori.view.*


class AllenatoriFragment : Fragment() {
    val TAG = "AllenatoriFragment"

    private lateinit var sharedPref: SharedPreferences
    private val USER_DATA_PREFERENCE: String = "USER_DATA_PREFERENCE"

    private lateinit var username: String

    var listaAllenatori = ArrayList<Utente>()

    private var utente: Utente? = null

    private lateinit var adapter: AllenatoriAdapter
    lateinit var utentiViewModel: UtentiViewModel





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPref = activity!!.getSharedPreferences(USER_DATA_PREFERENCE, Context.MODE_PRIVATE)
        val USERNAME_KEY = "USERNAME"
        username = sharedPref.getString(USERNAME_KEY, "") ?: ""

        utentiViewModel = activity?.run {
            ViewModelProvider(this).get(UtentiViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

        utentiViewModel.allAllenatori.observe(this, Observer {
            adapter.setListaAllenatori(it)
            listaAllenatori = ArrayList(it)
        })

        adapter = AllenatoriAdapter{numEsercizio, itemClicked -> onMenuAllenatoreItemClicked(numEsercizio, itemClicked)}

        utentiViewModel.setUsername(username)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragment_allenatori, container, false)

        rootView.allenatori_recycler_view.layoutManager = LinearLayoutManager(activity)
        rootView.allenatori_recycler_view.adapter = adapter

        utentiViewModel.utente.observe(this, Observer {
            utente = it
        })

        activity!!.title = "Scegli un allenatore"

        setHasOptionsMenu(true)

        return rootView
    }




    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.search_allenatore_menu, menu)

        val searchItem = menu.findItem(R.id.action_search)
        val searchView: SearchView = searchItem.actionView as SearchView

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                adapter.filter(query)
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                adapter.filter(newText)
                return true
            }
        })

        super.onCreateOptionsMenu(menu, inflater)
    }


    fun onMenuAllenatoreItemClicked( numAllenatore: Int, itemClicked: Int) {
        when (itemClicked) {
            R.id.popup_menu_item_seleziona_allenatore -> {
                impostaAllenatoreCorrente(numAllenatore)
            }
        }
    }


    private fun impostaAllenatoreCorrente(numAllenatore: Int){
        if(utente != null) {
            utente!!.allenatore = listaAllenatori[numAllenatore].usernameId
            utentiViewModel.updateUtente(utente!!)

            activity?.supportFragmentManager?.popBackStack()
        }
    }


}
