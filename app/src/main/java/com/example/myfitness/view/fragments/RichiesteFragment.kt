package com.example.myfitness.view.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.Richiesta
import com.google.android.material.tabs.TabLayout
import java.lang.Exception
import com.example.myfitness.view.adapters.RichiestePagerAdapter
import com.example.myfitness.viewmodel.RichiesteViewModel
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
            }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_richieste, container, false)

        activity!!.title = "Richieste"

        //imposto i tab con il pager
        setupViewPager(rootView.richieste_view_pager, rootView.richieste_tab_layout)

        richiesteViewModel.richieste.observe(this, Observer {
            if(it != null)
                setListaRichieste(ArrayList(it))
        })

        return rootView
    }



    private fun setupViewPager(viewPager: ViewPager, tabLayout: TabLayout){
        adapter = RichiestePagerAdapter(childFragmentManager)

        adapter.addFragment(RichiesteInAttesaTabFragment
            .newInstance(username) { richiesta, command -> onRichiestaClicked(richiesta, command) }, title = "In attesa")
        adapter.addFragment(RichiesteCompletateTabFragment.newInstance(username), title = "Completate")

        viewPager.adapter= adapter
        tabLayout.setupWithViewPager(viewPager)

    }

    private fun setListaRichieste(listaRichieste: ArrayList<Richiesta>){
        val rFragment: RichiesteInAttesaTabFragment = adapter.getItem(RICHIESTE_IN_ATTESA_INDEX) as RichiesteInAttesaTabFragment
        rFragment.setRichiesteInAttesa(listaRichieste)
    }

    fun onRichiestaClicked(richiesta: Richiesta, command: Char) {
        when (command){
            'I' -> { //Invia scheda al richiedente
                inviaScheda(richiesta)
            }

            'D' -> { //Delete scheda
                richiesteViewModel.deleteRichiesta(richiesta)
            }

        }
    }



    private fun inviaScheda(richiesta: Richiesta){
        fragmentManager!!.beginTransaction()
            .replace(R.id.container_main,
                CreaSchedaFragment.newInstance(
                    username = username,
                    data = richiesta.data,
                    tipologia = richiesta.tipologia,
                    numGiorni = richiesta.numGiorni,
                    commento = richiesta.commento,
                    richiesta = richiesta)
            )
            .addToBackStack(null)
            .commit()
    }


}
