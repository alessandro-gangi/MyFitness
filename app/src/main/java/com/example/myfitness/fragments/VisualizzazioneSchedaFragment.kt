package com.example.myfitness.fragments

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import com.example.myfitness.dataManager.MyDataManager
import com.example.myfitness.R
import com.example.myfitness.adapters.VisualSchedaPagerAdapter
import com.example.myfitness.data.Scheda
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_visualizzazione_scheda.view.*


class VisualizzazioneSchedaFragment : Fragment() {
    val TAG = "VisualizzazioneSchedaFragment"

    private lateinit var scheda: Scheda


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // fetch scheda
        val schedaID: Int? = arguments?.getInt(SCHEDA_ID)
        if (schedaID != null)
            scheda = MyDataManager.retrieve_scheda_info(schedaID)
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_visualizzazione_scheda, container, false)

        rootView.data_textView.text = scheda.data
        rootView.tipologia_textView.text = scheda.tipo
        rootView.commento_textView.text = scheda.commento
        rootView.commento_textView.movementMethod = (ScrollingMovementMethod())
        imposta_immagine(rootView.scheda_imageView, scheda.tipo)

        //imposto i tab con il pager
        setupViewPager(rootView.visual_scheda_view_pager, rootView.visual_scheda_tab_layout)

        return rootView
    }

    private fun setupViewPager(viewPager: ViewPager, tabLayout: TabLayout){
        val myAdapter = VisualSchedaPagerAdapter(childFragmentManager)

        for (index in 0 until scheda.schede_giornaliere.size)
            myAdapter.addFragment(VisualizzazioneEserciziFragment.newInstance(scheda.id, index), title = (index+1).toString())

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
