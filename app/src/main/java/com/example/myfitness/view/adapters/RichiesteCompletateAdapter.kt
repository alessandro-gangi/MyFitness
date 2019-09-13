package com.example.myfitness.view.adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.Richiesta
import kotlin.collections.ArrayList



class RichiesteCompletateAdapter(): RecyclerView.Adapter<RichiestaCompletataViewHolder>(){
    val TAG = "RichiesteCompletateAdapter"



    var listaRichieste: ArrayList<Richiesta> = ArrayList()


    fun setListaRichieste(nuovaListaRichieste: List<Richiesta>){
        listaRichieste = ArrayList(nuovaListaRichieste)
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int {
        return listaRichieste.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RichiestaCompletataViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cell = layoutInflater.inflate(R.layout.cardview_richiesta_completata, parent, false)

        return RichiestaCompletataViewHolder(cell)
    }

    override fun onBindViewHolder(holder: RichiestaCompletataViewHolder, position: Int) {

        //TODO: implementa
    }


}

class RichiestaCompletataViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var utente: EditText? = null
    var commento: EditText? = null
    var data: EditText? = null
    var numGiorni: EditText? = null
    var tipologia: EditText? = null
    var bottone: Button? = null

    /*
    init {
        utente = itemView.utente_richiesta_editText
        commento = itemView.commento_richiesta_editText
        data = itemView.data_richiesta_editText
        numGiorni = itemView.numGiorni_richiesta_editText
        tipologia = itemView.tipologia_editText
        bottone = itemView.tipologia_editText
    }
    */



}



