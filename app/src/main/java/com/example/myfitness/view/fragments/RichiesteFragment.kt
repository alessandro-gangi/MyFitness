package com.example.myfitness.view.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.Richiesta
import com.example.myfitness.model.dataClasses.Scheda
import com.example.myfitness.utilis.ConnectionChecker
import com.google.android.material.tabs.TabLayout
import java.lang.Exception
import com.example.myfitness.view.adapters.RichiestePagerAdapter
import com.example.myfitness.viewmodel.RichiesteViewModel
import com.example.myfitness.viewmodel.SchedeViewModel
import kotlinx.android.synthetic.main.fragment_richieste.view.*


class RichiesteFragment : Fragment() {
    val TAG = "RichiesteFragment"

    // SharedPref
    private lateinit var sharedPref: SharedPreferences
    private val USER_DATA_PREFERENCE: String = "USER_DATA_PREFERENCE"
    val USERNAME_KEY = "USERNAME"
    private lateinit var username: String

    // ViewModel
    private lateinit var richiesteViewModel: RichiesteViewModel
    private lateinit var schedeViewModel: SchedeViewModel

    // PagerAdapter
    private lateinit var adapter: RichiestePagerAdapter

    // RichiesteFragment constants
    private val RICHIESTE_IN_ATTESA_INDEX = 0
    private val RICHIESTE_COMPLETATE_INDEX = 1




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPref = activity!!.getSharedPreferences(USER_DATA_PREFERENCE, Context.MODE_PRIVATE)
        username = sharedPref.getString(USERNAME_KEY, "") ?: ""

        richiesteViewModel = activity?.run {
            ViewModelProvider(this).get(RichiesteViewModel::class.java)
        } ?: throw Exception("Invalid Activity")
        richiesteViewModel.setUsername(username)

        schedeViewModel = activity?.run {
            ViewModelProvider(this).get(SchedeViewModel::class.java)
        } ?: throw Exception("Invalid Activity")
        schedeViewModel.setUsername(username)

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_richieste, container, false)

        activity!!.title = resources.getString(R.string.title_richieste)

        //imposto i tab con il pager
        setupViewPager(rootView.richieste_view_pager, rootView.richieste_tab_layout)

        richiesteViewModel.richieste.observe(this, Observer {
            if(it != null)
                setListaRichiesteInAttesa(ArrayList(it))
        })

        schedeViewModel.richiesteCompletate.observe(this, Observer {
            if(it!= null)
                setListaRichiesteCompletate(ArrayList(it))
        })

        return rootView
    }



    private fun setupViewPager(viewPager: ViewPager, tabLayout: TabLayout){
        adapter = RichiestePagerAdapter(childFragmentManager)
        val inAttesaTitle = resources.getString(R.string.in_attesa)
        val completateTitle = resources.getString(R.string.completate)

        adapter.addFragment(RichiesteInAttesaTabFragment
            .newInstance(activity!!, username) { richiesta, command -> onRichiestaInAttesaClicked(richiesta, command) }, title = inAttesaTitle)

        adapter.addFragment(RichiesteCompletateTabFragment.newInstance(activity!!, username) { scheda, command -> onRichiestaCompletataClicked(scheda, command) }, title = completateTitle)

        viewPager.adapter= adapter
        tabLayout.setupWithViewPager(viewPager)

    }

    private fun setListaRichiesteInAttesa(listaRichieste: ArrayList<Richiesta>){
        val rFragment: RichiesteInAttesaTabFragment = adapter.getItem(RICHIESTE_IN_ATTESA_INDEX) as RichiesteInAttesaTabFragment
        rFragment.setRichiesteInAttesa(listaRichieste)
    }

    private fun setListaRichiesteCompletate(listaRichieste: ArrayList<Scheda>){
        val rFragment: RichiesteCompletateTabFragment = adapter.getItem(RICHIESTE_COMPLETATE_INDEX) as RichiesteCompletateTabFragment
        rFragment.setRichiesteCompletate(listaRichieste)
    }

    fun onRichiestaInAttesaClicked(richiesta: Richiesta, command: Char) {
        when (command){
            'I' -> { //Invia scheda al richiedente
                inviaScheda(richiesta)
            }

            'D' -> { //Delete scheda
                richiesteViewModel.deleteRichiesta(richiesta)
            }

        }
    }

    fun onRichiestaCompletataClicked(scheda: Scheda, command: Char) {
        when (command){
            'V' -> { //Visualizza
                fragmentManager!!.beginTransaction()
                    .replace(R.id.container_main,
                        VisualizzazioneSchedaFragment.newInstance(username, scheda.schedaId)
                    )
                    .addToBackStack(null)
                    .commit()

            }

        }
    }


    private fun inviaScheda(richiesta: Richiesta){

        if(ConnectionChecker.isConnectionAvailable(activity!!))
            fragmentManager!!.beginTransaction()
                .replace(R.id.container_main,
                    CreaSchedaFragment.newInstance(
                        username = username,
                        data = richiesta.data,
                        tipologia = richiesta.tipologia,
                        numGiorni = richiesta.numGiorni,
                        commento = richiesta.commento,
                        richiesta = richiesta)
                ).addToBackStack(null)
                .commit()

        else {
            val errorMSg = "Connessione alla rete non disponibile. Riprova in seguito"
            Toast.makeText(activity!!, errorMSg, Toast.LENGTH_LONG).show()
        }

    }


}
