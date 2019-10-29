package com.example.myfitness.view.adapters

import android.content.Context
import android.content.SharedPreferences
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
import com.example.myfitness.model.dataClasses.Utente
import kotlinx.android.synthetic.main.cardview_allenatore.view.*



class AllenatoriAdapter(val activity: Context, val menuClickListener: (numAllenatore: Int, itemClicked: Int) -> Unit): RecyclerView.Adapter<AllenatoreViewHolder>(){
    val TAG = "AllenatoriAdapter"
    // SharedPref
    private var sharedPref: SharedPreferences
    private val USER_DATA_PREFERENCE: String = "USER_DATA_PREFERENCE"
    private val TOKEN_KEY = "TOKEN"

    private var listaAllenatori: ArrayList<Utente>

    private var listaAllenatoriCopy: ArrayList<Utente>

    init {
        listaAllenatori = ArrayList()
        listaAllenatoriCopy = ArrayList()
        sharedPref = activity.getSharedPreferences(USER_DATA_PREFERENCE, Context.MODE_PRIVATE)
    }

    fun setListaAllenatori(nuovaListaAllenatori: List<Utente>){
        listaAllenatori = ArrayList(nuovaListaAllenatori)
        listaAllenatoriCopy = ArrayList(listaAllenatori)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return listaAllenatori.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllenatoreViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cell = layoutInflater.inflate(R.layout.cardview_allenatore, parent, false)

        return AllenatoreViewHolder(cell)
    }

    override fun onBindViewHolder(viewHolder: AllenatoreViewHolder, position: Int){
        viewHolder.nome.text = listaAllenatori[position].nome
        viewHolder.cognome.text = listaAllenatori[position].cognome
        viewHolder.descrizione.text = listaAllenatori[position].descrizione
        if(listaAllenatori[position].imageURI != null)
            loadImageIntoImageView(listaAllenatori[position].imageURI!!, viewHolder.imgProfilo)
        viewHolder.threeDotsMenu.setOnClickListener {
            showPopupMenu(viewHolder.threeDotsMenu, position)
        }
    }


    private fun showPopupMenu(view: View, numAllenatore: Int) {
        var popup: PopupMenu? = null;
        popup = PopupMenu(view.context, view)
        popup.inflate(R.menu.popup_allenatore_card_menu)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {
            menuClickListener(numAllenatore, it.itemId)
            true
        })

        popup.show()
    }


    fun filter(text: String) {
        listaAllenatori.clear()

        if (text.isEmpty())
            listaAllenatori.addAll(listaAllenatoriCopy)

        else
            for (allenatore in listaAllenatoriCopy) {
                if (allenatore.nome.toLowerCase().contains(text.toLowerCase())
                    || allenatore.cognome.toLowerCase().contains(text.toLowerCase()))
                    listaAllenatori.add(allenatore)

            }
        notifyDataSetChanged()
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

class AllenatoreViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var imgProfilo: ImageView
    var nome: TextView
    var cognome: TextView
    var descrizione: TextView
    var threeDotsMenu: Button

    init {
        imgProfilo = itemView.allenatore_imageView
        nome = itemView.nomeAllenatore_textView
        cognome = itemView.cognomeAllenatore_textView
        descrizione = itemView.descrizioneAllenatore_textView
        threeDotsMenu = itemView.threeDots_button
    }



}