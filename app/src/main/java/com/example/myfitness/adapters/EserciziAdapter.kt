package com.example.myfitness.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.myfitness.R
import com.example.myfitness.data.Esercizio
import com.example.myfitness.data.MockSchede
import com.example.myfitness.data.Scheda
import kotlinx.android.synthetic.main.cardview_esercizio.view.*

class EserciziAdapter: RecyclerView.Adapter<EsercizioViewHolder>(){
    val TAG = "EserciziAdapter"

    private val scheda1 : Scheda = MockSchede.mockScheda1
    private val esercizi: ArrayList<Esercizio>? = scheda1.esercizi


    override fun getItemCount(): Int {
        //Qua in pratica si farà il return della "size" della lista degli allenatori di una certa palestra
        return esercizi!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EsercizioViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cell = layoutInflater.inflate(R.layout.cardview_esercizio, parent, false)

        return EsercizioViewHolder(cell)
    }

    override fun onBindViewHolder(viewHolder: EsercizioViewHolder, position: Int){
        viewHolder.nome.text = esercizi!![position].nome
        viewHolder.serie.text = esercizi!![position].serie.toString()
        viewHolder.ripetizioni.text = esercizi!![position].ripetizioni.toString()
        viewHolder.recupero.text = esercizi!![position].recupero.toString()
        viewHolder.commento.text = esercizi!![position].commento

    }



}

class EsercizioViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var nome: TextView
    var serie: TextView
    var ripetizioni: TextView
    var recupero: TextView
    var commento: TextView

    init {
        nome = itemView.nomeEsercizio_textView
        serie = itemView.serieEsercizio_textView
        ripetizioni = itemView.ripetizioniEsercizio_textView
        recupero = itemView.recuperoEsercizio_textView
        commento = itemView.commentoEsercizio_textView
    }



}