package com.example.myfitness.view.adapters

import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.widget.addTextChangedListener
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

        holder.nome.addTextChangedListener(GenericTextWatcher(holder.nome, position, listaEsercizi))
        holder.serie.addTextChangedListener(GenericTextWatcher(holder.serie, position, listaEsercizi))
        holder.ripetizioni.addTextChangedListener(GenericTextWatcher(holder.ripetizioni, position, listaEsercizi))
        holder.recupero.addTextChangedListener(GenericTextWatcher(holder.recupero, position, listaEsercizi))
        holder.commento.addTextChangedListener(GenericTextWatcher(holder.commento, position, listaEsercizi))

        holder.eliminaBtn.setOnClickListener {
            listaEsercizi.removeAt(position)
            notifyDataSetChanged()
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


private class GenericTextWatcher (private val view: View, private val position: Int
                                             , private val listaEsercizi: ArrayList<Esercizio>) : TextWatcher {

    override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
    override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}

    override fun afterTextChanged(editable: Editable) {
        val text = editable.toString()
        if(text.isNotEmpty())
            when (view.id) {
                R.id.nomeEsercizio_editText -> listaEsercizi[position].nome = text
                R.id.serieEsercizio_editText -> listaEsercizi[position].serie = text.toInt()
                R.id.ripetizioniEsercizio_editText -> listaEsercizi[position].ripetizioni = text.toInt()
                R.id.recuperoEsercizio_editText -> listaEsercizi[position].recupero = text.toDouble()
                R.id.commentoEsercizio_editText -> listaEsercizi[position].commento = text
            }
    }
}