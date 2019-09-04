package com.example.myfitness.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.myfitness.R


class ModificaEsercizioFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var schedaId: Long? = null
    private var numGiorno: Int? = null
    private var numEsercizio: Int? = null
    private var nome: String? = null
    private var serie: Int? = null
    private var ripetizioni: Int? = null
    private var recupero: Int? = null
    private var commento: String? = null

    //private var listener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            // TODO: Completare l'estrazione di parametri
            schedaId = it.getLong(SCHEDA_ID)
            //...
            nome = it.getString(NOME)

            // TODO: Capire come gestire la possibile assenza dei parametri opzionali

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_modifica_esercizio, container, false)
    }


    companion object {
        val SCHEDA_ID = "SCHEDA_ID"
        val NUM_GIORNO = "NUM_GIORNO"
        val NUM_ESERCIZIO = "NUM_ESERCIZIO"

        val NOME = "NOME"
        val SERIE = "SERIE"
        val RIPETIIZIONI = "RIPETIZIONI"
        val RECUPERO = "RECUPERO"
        val COMMENTO = "COMMENTO"

        @JvmStatic
        fun newInstance(schedaId: Long, numGiorno: Int, numEsercizio: Int, nome: String, serie: Int?,
                        ripetizioni: Int?, recupero: Double?, commento: String?)
                = VisualizzazioneSchedaFragment().apply {
                    arguments = Bundle().apply {
                    putLong(SCHEDA_ID, schedaId)
                    putInt(NUM_GIORNO, numGiorno)
                    putInt(NUM_ESERCIZIO, numEsercizio)
                    putString(NOME, nome)
                    if (serie != null)
                        putInt(SERIE, serie)
                    if (ripetizioni != null)
                        putInt(SERIE, ripetizioni)
                    if (recupero != null)
                        putDouble(SERIE, recupero)
                    if (commento != null)
                        putString(COMMENTO, commento)
                }
        }
    }

}
