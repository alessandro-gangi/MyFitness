package com.example.myfitness.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.Esercizio
import com.example.myfitness.model.dataClasses.MockSchede
import com.example.myfitness.model.dataClasses.Scheda
import kotlinx.android.synthetic.main.cardview_crea_esercizio.view.*
import kotlin.collections.ArrayList

class CreaSchedeAdapter(): RecyclerView.Adapter<CreazioneEsercizioViewHolder>(){
    val TAG = "CreazioneSchedeAdapter"

    var listaEsercizi: ArrayList<Esercizio> = arrayListOf(Esercizio())


    fun setListaEsercizi(nuovaListaEsercizi: List<Esercizio>){
        listaEsercizi = ArrayList(nuovaListaEsercizi)
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int {
        return listaEsercizi.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CreazioneEsercizioViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cell = layoutInflater.inflate(R.layout.cardview_crea_esercizio, parent, false)

        return CreazioneEsercizioViewHolder(cell)
    }

    override fun onBindViewHolder(holder: CreazioneEsercizioViewHolder, position: Int) {

        holder.nome.setText(listaEsercizi[position].nome)
        holder.serie.setText(listaEsercizi[position].serie?.toString() ?: "")
        holder.ripetizioni.setText(listaEsercizi[position].ripetizioni?.toString() ?: "")
        holder.recupero.setText(listaEsercizi[position].recupero?.toString() ?: "")
        holder.commento.setText(listaEsercizi[position].commento)

        holder.nome.setOnFocusChangeListener { _, onFocus -> saveTmpData(holder, position, onFocus) }
        holder.serie.setOnFocusChangeListener { _, onFocus -> saveTmpData(holder, position, onFocus) }
        holder.ripetizioni.setOnFocusChangeListener { _, onFocus -> saveTmpData(holder, position, onFocus) }
        holder.recupero.setOnFocusChangeListener { _, onFocus -> saveTmpData(holder, position, onFocus) }
        holder.commento.setOnFocusChangeListener { _, onFocus -> saveTmpData(holder, position, onFocus) }

        holder.eliminaBtn.setOnClickListener {
            listaEsercizi.removeAt(position)
            notifyDataSetChanged()
        }
    }

    private fun saveTmpData(holder: CreazioneEsercizioViewHolder, position: Int, onFocus: Boolean){
        if(onFocus) {
            listaEsercizi[position].nome = holder.nome.text.toString()
            if (holder.serie.text.isNotEmpty())
                listaEsercizi[position].serie = holder.serie.text.toString().toInt()
            if (holder.ripetizioni.text.isNotEmpty())
                listaEsercizi[position].ripetizioni = holder.ripetizioni.text.toString().toInt()
            listaEsercizi[position].commento = holder.commento.text.toString()
            if (holder.recupero.text.isNotEmpty())
                listaEsercizi[position].recupero = holder.recupero.text.toString().toDouble()
        }
    }

    fun getSchedaCreata(): ArrayList<Esercizio>{
        return listaEsercizi
    }
}

class CreazioneEsercizioViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var nome: EditText
    var serie: EditText
    var ripetizioni: EditText
    var recupero: EditText
    var commento: EditText
    var eliminaBtn: Button

    init {
        nome = itemView.nomeEsercizio_editText
        serie = itemView.serieEsercizio_editText
        ripetizioni = itemView.ripetizioniEsercizio_editText
        recupero = itemView.recuperoEsercizio_editText
        commento = itemView.commentoEsercizio_editText
        eliminaBtn = itemView.elimina_esercizio_button
    }



}