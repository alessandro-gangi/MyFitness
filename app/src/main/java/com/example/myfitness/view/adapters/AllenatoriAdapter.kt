package com.example.myfitness.view.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.Utente
import kotlinx.android.synthetic.main.cardview_allenatore.view.*



class AllenatoriAdapter(val activity: Context, val menuClickListener: (numAllenatore: Int, itemClicked: Int) -> Unit): RecyclerView.Adapter<AllenatoreViewHolder>(){
    val TAG = "AllenatoriAdapter"

    private lateinit var listaAllenatori: ArrayList<Utente>

    private lateinit var listaAllenatoriCopy: ArrayList<Utente>

    init {
        listaAllenatori = ArrayList()
        listaAllenatoriCopy = ArrayList()
        Log.d(TAG, "INIT lista: $listaAllenatori")
        Log.d(TAG, "INIT lista_copy: $listaAllenatoriCopy")
    }

    fun setListaAllenatori(nuovaListaAllenatori: List<Utente>){
        Log.d(TAG, "--- SET LISTA --- nuovaLista: $nuovaListaAllenatori")
        listaAllenatori = ArrayList(nuovaListaAllenatori)
        listaAllenatoriCopy = listaAllenatori

        Log.d(TAG, "--- SET LISTA --- lista: $listaAllenatori")
        Log.d(TAG, "--- SET LISTA --- lista_copy: $listaAllenatoriCopy")
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        //Qua in pratica si farà il return della "size" della lista degli allenatori di una certa palestra
        Log.d(TAG, "Size allenatori: ${listaAllenatori.size}")
        return listaAllenatori.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllenatoreViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cell = layoutInflater.inflate(R.layout.cardview_allenatore, parent, false)

        return AllenatoreViewHolder(cell)
    }

    override fun onBindViewHolder(viewHolder: AllenatoreViewHolder, position: Int){
        viewHolder.nome.text = listaAllenatori[position].nome
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
        Log.d(TAG, "1 FILTER lista: $listaAllenatori")
        Log.d(TAG, "1 FILTER lista_copy: $listaAllenatoriCopy")
        listaAllenatori.clear()

        if (text.isEmpty()) {
            listaAllenatori.addAll(listaAllenatoriCopy)
            Log.d(TAG, "2 FILTER lista: $listaAllenatori")
            Log.d(TAG, "2 FILTER lista_copy: $listaAllenatoriCopy")
        }

        else {
            val result: ArrayList<Utente> = ArrayList()
            for (allenatore in listaAllenatoriCopy) {
                if (allenatore.nome.toLowerCase().contains(text.toLowerCase())) {
                    listaAllenatori.add(allenatore)
                }
            }
            Log.d(TAG, "3 FILTER lista: $listaAllenatori")
            Log.d(TAG, "3 FILTER lista_copy: $listaAllenatoriCopy")
            Log.d(TAG, "4 FILTER lista: $listaAllenatori")
            Log.d(TAG, "4 FILTER lista_copy: $listaAllenatoriCopy")

        }
        notifyDataSetChanged()
    }

    private fun loadImageIntoImageView(imageURI: String, imageView: ImageView){
        Glide.with(activity)
            .load(imageURI)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .into(imageView)
    }


}

class AllenatoreViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var imgProfilo: ImageView
    var nome: TextView
    var descrizione: TextView
    var threeDotsMenu: Button

    init {
        imgProfilo = itemView.allenatore_imageView
        nome = itemView.nomeAllenatore_textView
        descrizione = itemView.descrizioneAllenatore_textView
        threeDotsMenu = itemView.threeDots_button
    }



}