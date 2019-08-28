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
import kotlinx.android.synthetic.main.cardview_creazione_esercizio.view.*

class CreazioneSchedeAdapter: RecyclerView.Adapter<CreazioneEsercizioViewHolder>(){
    val TAG = "CreazioneSchedeAdapter"
    var esercizi: ArrayList<Esercizio> = arrayListOf(MockSchede.es1, MockSchede.es2)

    override fun getItemCount(): Int {
        return esercizi.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CreazioneEsercizioViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cell = layoutInflater.inflate(R.layout.cardview_creazione_esercizio, parent, false)

        return CreazioneEsercizioViewHolder(cell)
    }

    override fun onBindViewHolder(holder: CreazioneEsercizioViewHolder, position: Int) {
        holder.nome.setText(esercizi[position].nome)
        holder.serie.setText(esercizi[position].serie.toString())
        holder.ripetizioni.setText(esercizi[position].ripetizioni.toString())
        holder.recupero.setText(esercizi[position].recupero.toString())
        holder.commento.setText(esercizi[position].commento)

        holder.eliminaBtn.setOnClickListener {
            Toast.makeText(it.context, "Cliccato tasto elimina", Toast.LENGTH_SHORT).show()
            //GESTISCI TASTO PER ELIMINARE RIGA ESERCIZIO
            esercizi.removeAt(position)
            notifyDataSetChanged()
        }
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