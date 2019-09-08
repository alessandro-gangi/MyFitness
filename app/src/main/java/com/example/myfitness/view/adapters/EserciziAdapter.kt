package com.example.myfitness.view.adapters

import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.Esercizio
import kotlinx.android.synthetic.main.cardview_esercizio.view.*
import org.w3c.dom.Text

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

        if(listaEsercizi[position].serie != null)
            viewHolder.serie.text = listaEsercizi[position].serie.toString()
        else {
            viewHolder.serie.visibility = View.GONE
            viewHolder.xSymbol.visibility = View.GONE
        }

        if(listaEsercizi[position].ripetizioni != null)
            viewHolder.ripetizioni.text = listaEsercizi[position].ripetizioni.toString()
        else
            viewHolder.ripetizioni.visibility = View.GONE

        if(listaEsercizi[position].recupero != null)
            viewHolder.recupero.text = listaEsercizi[position].recupero.toString()
        else{
            viewHolder.recupero_intest.visibility = View.GONE
            viewHolder.recupero.visibility = View.GONE
            viewHolder.recupero_min_intest.visibility = View.GONE
        }

        viewHolder.commento.text = listaEsercizi[position].commento

        viewHolder.itemView.setOnClickListener { clickListener(position) }
    }



}

class EsercizioViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var nome: TextView
    var serie: TextView
    var xSymbol: TextView
    var ripetizioni: TextView
    var recupero: TextView
    var recupero_intest: TextView
    var recupero_min_intest: TextView
    var commento: TextView

    init {
        nome = itemView.nomeEsercizio_textView
        serie = itemView.serieEsercizio_textView
        xSymbol = itemView.simboloXEsercizio_textView
        ripetizioni = itemView.ripetizioniEsercizio_textView
        recupero = itemView.recuperoEsercizio_textView
        recupero_intest = itemView.recuperoIntestEsercizio_textView
        recupero_min_intest = itemView.simboloMinEsercizio_textView
        commento = itemView.commentoEsercizio_textView
    }



}