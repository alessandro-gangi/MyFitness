package com.example.myfitness.view.adapters


import android.content.Context
import android.content.SharedPreferences
import android.transition.Scene
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.load.model.LazyHeaders
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.Richiesta
import com.example.myfitness.model.dataClasses.Scheda
import kotlinx.android.synthetic.main.cardview_richiesta_completata.view.*
import kotlin.collections.ArrayList



class RichiesteCompletateAdapter(val activity: Context, val clickListener: (scheda: Scheda, command: Char) -> Unit): RecyclerView.Adapter<RichiestaCompletataViewHolder>(){
    val TAG = "RichiesteCompletateAdapter"
    private val USER_DATA_PREFERENCE: String = "USER_DATA_PREFERENCE"
    private  var sharedPref: SharedPreferences = activity.getSharedPreferences(USER_DATA_PREFERENCE, Context.MODE_PRIVATE)
    private val TOKEN_KEY = "TOKEN"


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

        holder.apriBtn.setOnClickListener {
            clickListener(listaRichiesteCompletate[position], 'V')
        }

        if(listaRichiesteCompletate[position].possessore.imageURI != null)
            loadImageIntoImageView(listaRichiesteCompletate[position].possessore.imageURI!!, holder.imageRichiedente)

    }

    private fun loadImageIntoImageView(imageURI: String, imageView: ImageView) {
        val token = sharedPref.getString(TOKEN_KEY, null)
        if (token != null) {
            val glideURL = GlideUrl(
                imageURI, LazyHeaders.Builder()
                    .addHeader("Authorization", token)
                    .build()
            )
            Glide.with(activity)
                .load(glideURL)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(imageView)
        }
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
    var apriBtn: TextView


    init {
        nomeRichiedente = itemView.nome_richiedente_textView
        cognomeRichiedente = itemView.cognome_richiedente_textView
        data = itemView.data_textView
        numGiorni = itemView.numGiorni_textView
        tipologia = itemView.tipologia_textView
        tipologiaImg = itemView.tipologia_imageView
        imageRichiedente = itemView.richiedente_imageView
        apriBtn = itemView.apri_textView
    }


}



