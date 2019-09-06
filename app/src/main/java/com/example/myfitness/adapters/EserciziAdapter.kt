package com.example.myfitness.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.myfitness.R
import com.example.myfitness.data.Esercizio
import kotlinx.android.synthetic.main.cardview_esercizio.view.*

class EserciziAdapter(val clickListener: (numEsercizio: Int) -> Unit): RecyclerView.Adapter<EsercizioViewHolder>(){
    val TAG = "EserciziAdapter"

    var listaEsercizi: ArrayList<Esercizio> = ArrayList()

    fun setListaEsercizi(nuovaListaEsercizi: List<Esercizio>){
        listaEsercizi = ArrayList(nuovaListaEsercizi)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        //Qua in pratica si farà il return della "size" della lista degli allenatori di una certa palestra
        return listaEsercizi.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EsercizioViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cell = layoutInflater.inflate(R.layout.cardview_esercizio, parent, false)

        return EsercizioViewHolder(cell)
    }

    override fun onBindViewHolder(viewHolder: EsercizioViewHolder, position: Int){
        viewHolder.nome.text = listaEsercizi[position].nome
        viewHolder.serie.text = listaEsercizi[position].serie.toString()
        viewHolder.ripetizioni.text = listaEsercizi[position].ripetizioni.toString()
        viewHolder.recupero.text = listaEsercizi[position].recupero.toString()
        viewHolder.commento.text = listaEsercizi[position].commento

        //TODO: rimettere a posto di sotto
        viewHolder.itemView.setOnClickListener { clickListener(position) }
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