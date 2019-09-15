package com.example.myfitness.view.adapters


import android.transition.Scene
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.Richiesta
import com.example.myfitness.model.dataClasses.Scheda
import kotlinx.android.synthetic.main.cardview_richiesta_completata.view.*
import kotlin.collections.ArrayList



class RichiesteCompletateAdapter(val clickListener: (scheda: Scheda, command: Char) -> Unit): RecyclerView.Adapter<RichiestaCompletataViewHolder>(){
    val TAG = "RichiesteCompletateAdapter"



    var listaRichiesteCompletate: ArrayList<Scheda> = ArrayList()


    fun setListaRichieste(nuovaListaRichiesteCompletate: List<Scheda>){
        listaRichiesteCompletate = ArrayList(nuovaListaRichiesteCompletate)
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int {
        return listaRichiesteCompletate.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RichiestaCompletataViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cell = layoutInflater.inflate(R.layout.cardview_richiesta_completata, parent, false)

        return RichiestaCompletataViewHolder(cell)
    }

    override fun onBindViewHolder(holder: RichiestaCompletataViewHolder, position: Int) {
        holder.nomeRichiedente.text = listaRichiesteCompletate[position].possessore.nome
        holder.cognomeRichiedente.text = listaRichiesteCompletate[position].possessore.cognome
        holder.data.text = listaRichiesteCompletate[position].data
        holder.numGiorni.text = listaRichiesteCompletate[position].num_giorni.toString()
        holder.tipologia.text = listaRichiesteCompletate[position].tipo

        when (holder.tipologia.text.toString().toLowerCase()){
            "forza" -> holder.tipologiaImg.setImageResource(R.drawable.ic_tipologia_forza)
            "massa" -> holder.tipologiaImg.setImageResource(R.drawable.ic_tipologia_massa)
            "definizione" -> holder.tipologiaImg.setImageResource(R.drawable.ic_tipologia_definizione)
        }

        holder.itemView.setOnClickListener {
            clickListener(listaRichiesteCompletate[position], 'V')
        }

        //TODO: implementa
        // glide per caricare l'immagine dell'utente richiedente

    }


}

class RichiestaCompletataViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var nomeRichiedente: TextView
    var cognomeRichiedente: TextView
    var data: TextView
    var numGiorni: TextView
    var tipologia: TextView
    var tipologiaImg: ImageView
    var imageRichiedente: ImageView


    init {
        nomeRichiedente = itemView.nome_richiedente_textView
        cognomeRichiedente = itemView.cognome_richiedente_textView
        data = itemView.data_textView
        numGiorni = itemView.numGiorni_textView
        tipologia = itemView.tipologia_textView
        tipologiaImg = itemView.tipologia_imageView
        imageRichiedente = itemView.richiedente_imageView
    }


}



