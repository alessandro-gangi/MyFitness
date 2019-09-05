package com.example.myfitness.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.myfitness.R
import com.example.myfitness.data.Utente
import kotlinx.android.synthetic.main.cardview_allenatore.view.*



class AllenatoriAdapter(var listaAllenatori: ArrayList<Utente>): RecyclerView.Adapter<AllenatoreViewHolder>(){
    val TAG = "AllenatoriAdapter"

    var listaAllenatoriCopy: ArrayList<Utente>

    init {
        listaAllenatoriCopy = ArrayList()
        listaAllenatoriCopy.addAll(listaAllenatori)
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
        viewHolder.threeDotsMenu.setOnClickListener {
            showPopupMenu(viewHolder.threeDotsMenu)
        }
    }


    private fun showPopupMenu(view: View) {
        var popup: PopupMenu? = null;
        popup = PopupMenu(view.context, view)
        popup.inflate(R.menu.popup_allenatore_card_menu)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {

            when (it!!.itemId) {
                R.id.popup_menu_item_seleziona_allenatore -> {
                    //Do something...
                    Toast.makeText(view.context, it.title, Toast.LENGTH_SHORT).show()
                }
            }
            true
        })

        popup.show()
    }


    fun filter(text: String) {
        listaAllenatori.clear()

        if (text.isEmpty()) {
            listaAllenatori.addAll(listaAllenatoriCopy)
        }
        else {
            val result: ArrayList<Utente> = ArrayList()
            for (allenatore in listaAllenatoriCopy) {
                if (allenatore.nome.toLowerCase().contains(text.toLowerCase())) {
                    result.add(allenatore)
                }
            }
            listaAllenatori.addAll(result)

        }
        notifyDataSetChanged()
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