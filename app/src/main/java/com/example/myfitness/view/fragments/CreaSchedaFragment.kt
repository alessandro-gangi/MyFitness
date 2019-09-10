package com.example.myfitness.view.fragments

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.Scheda
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.view.adapters.CreaSchedaPagerAdapter
import com.example.myfitness.viewmodel.SchedeViewModel
import com.example.myfitness.viewmodel.UtentiViewModel
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_crea_scheda.view.*
import java.lang.Exception
import com.example.myfitness.model.dataClasses.Esercizio
import kotlinx.android.synthetic.main.fragment_crea_scheda.*


class CreaSchedaFragment : Fragment() {
    val TAG = "CreaSchedaFragment"


    private lateinit var schedeViewModel: SchedeViewModel
    private lateinit var utentiViewModel: UtentiViewModel

    private lateinit var scheda: Scheda
    private lateinit var utente: Utente

    private lateinit var adapter: CreaSchedaPagerAdapter

    //Dati scheda da creare
    private lateinit var username: String
    private lateinit var data: String
    private lateinit var tipologia: String
    private var numGiorni: Int = 0
    private lateinit var commento: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Fetch dati header scheda
        username = arguments?.getString(USERNAME) ?: ""
        data = arguments?.getString(DATA) ?: ""
        tipologia = arguments?.getString(TIPOLOGIA) ?: ""
        numGiorni = arguments?.getInt(NUM_GIORNI) ?: 1
        commento = arguments?.getString(COMMENTO) ?: ""

        schedeViewModel = activity?.run {
            ViewModelProvider(this).get(SchedeViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

        utentiViewModel = activity?.run {
            ViewModelProvider(this).get(UtentiViewModel::class.java)
        } ?: throw Exception("Invalid Activity")



    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_crea_scheda, container, false)
        setupUI(rootView)
        //imposto i tab con il pager
        setupViewPager(rootView.crea_scheda_view_pager, rootView.crea_scheda_tab_layout)


        return rootView
    }

    private fun setupUI(view: View){
        activity!!.title = "Creazione scheda"
        view.data_textView.text = data
        view.tipologia_textView.text = tipologia
        view.commento_textView.text = commento
        view.commento_textView.movementMethod = (ScrollingMovementMethod())
        imposta_immagine(view.utente_imageView, tipologia)

        view.finisci_scheda_button.setOnClickListener {
            finisciScheda()
        }
    }

    private fun setupViewPager(viewPager: ViewPager, tabLayout: TabLayout){
        adapter = CreaSchedaPagerAdapter(childFragmentManager)

        for (index in 0 until numGiorni)
            adapter.addFragment(
                CreaSchedaTabFragment.newInstance(
                    username
                ), title = (index+1).toString())

        viewPager.adapter= adapter
        tabLayout.setupWithViewPager(viewPager)

    }


    private fun imposta_immagine(imageView: ImageView, tipologia: String){
        when (tipologia.toLowerCase()){
            "forza" -> imageView.setImageResource(R.drawable.ic_tipologia_forza)
            "massa" -> imageView.setImageResource(R.drawable.ic_tipologia_massa)
            "definizione" -> imageView.setImageResource(R.drawable.ic_tipologia_definizione)
        }
    }

    private fun finisciScheda(){
        val eserciziScheda: ArrayList<ArrayList<Esercizio>> = ArrayList()
        for (index in 0 until adapter.count){
            val frag: CreaSchedaTabFragment = adapter.getItem(index) as CreaSchedaTabFragment
            val schedaGiornaliera: ArrayList<Esercizio> = frag.getSchedaCreata()
            eserciziScheda.add(schedaGiornaliera)
        }
        val schedaCompleta = Scheda(0, numGiorni, data, tipologia, commento, username, username, eserciziScheda, false)

        if(controllaScheda(schedaCompleta)) {
            schedeViewModel.addScheda(schedaCompleta)

            activity?.supportFragmentManager?.popBackStack()
        }
        else Toast.makeText(activity, "Controlla i dati di tutti gli esercizi", Toast.LENGTH_LONG).show()

    }

    private fun controllaScheda(scheda: Scheda): Boolean{
        var response = true
        for (i in 0 until scheda.num_giorni){
            for (j in 0 until scheda.esercizi[i].size)
                if (scheda.esercizi[i][j].nome.isEmpty()){
                    response = false
                    break
                }
        }
        return response
    }


    companion object {
        val USERNAME = "USERNAME"
        val DATA = "DATA"
        val TIPOLOGIA = "TIPOLOGIA"
        val NUM_GIORNI = "NUM_GIORNI"
        val COMMENTO = "COMMENTO"

        @JvmStatic
        fun newInstance(username: String, data: String, tipologia: String, numGiorni: Int, commento: String) = CreaSchedaFragment().apply {
            arguments = Bundle().apply {
                putString(USERNAME, username)
                putString(DATA, data)
                putString(TIPOLOGIA, tipologia)
                putInt(NUM_GIORNI, numGiorni)
                putString(COMMENTO, commento)
            }
        }
    }



}
