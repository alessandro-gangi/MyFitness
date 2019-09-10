package com.example.myfitness.view.fragments

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.myfitness.R
import com.example.myfitness.view.adapters.VisualSchedaPagerAdapter
import com.example.myfitness.model.dataClasses.Scheda
import com.example.myfitness.viewmodel.SchedeViewModel
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_visualizzazione_scheda.view.*
import java.lang.Exception


class VisualizzazioneSchedaFragment : Fragment() {
    val TAG = "VisualSchedaFragment"


    private lateinit var schedeViewModel: SchedeViewModel
    private lateinit var scheda: Scheda


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Fetch dati scheda
        val schedaID: Int? = arguments?.getInt(SCHEDA_ID)

        schedeViewModel = activity?.run {
            ViewModelProvider(this).get(SchedeViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

        scheda = schedeViewModel.getScheda(schedaID!!)


    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_visualizzazione_scheda, container, false)
        setupUI(rootView)
        //imposto i tab con il pager
        setupViewPager(rootView.visual_scheda_view_pager, rootView.visual_scheda_tab_layout)


        return rootView
    }

    private fun setupUI(view: View){
        activity!!.title = "Visualizzazione scheda"
        view.data_textView.text = scheda.data
        view.tipologia_textView.text = scheda.tipo
        view.commento_textView.text = scheda.commento
        view.commento_textView.movementMethod = (ScrollingMovementMethod())
        imposta_immagine(view.scheda_imageView, scheda.tipo)
    }

    private fun setupViewPager(viewPager: ViewPager, tabLayout: TabLayout){
        val myAdapter = VisualSchedaPagerAdapter(childFragmentManager)

        for (index in 0 until scheda.num_giorni)
            myAdapter.addFragment(
                VisualizzazioneEserciziFragment.newInstance(
                    scheda.id,
                    index
                ), title = (index+1).toString())

        viewPager.adapter= myAdapter
        tabLayout.setupWithViewPager(viewPager)
    }


    fun imposta_immagine(imageView: ImageView, tipologia: String){
        when (tipologia.toLowerCase()){
            "forza" -> imageView.setImageResource(R.drawable.ic_tipologia_forza)
            "massa" -> imageView.setImageResource(R.drawable.ic_tipologia_massa)
            "definizione" -> imageView.setImageResource(R.drawable.ic_tipologia_definizione)
        }
    }

    companion object {
        val SCHEDA_ID = "SCHEDA_ID"

        @JvmStatic
        fun newInstance(schedaId: Int) = VisualizzazioneSchedaFragment().apply {
            arguments = Bundle().apply {
                putInt(SCHEDA_ID, schedaId)
            }
        }
    }



}
