package com.example.myfitness.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.myfitness.R
import kotlinx.android.synthetic.main.cardview_allenatore.view.*

class AllenatoriAdapter: RecyclerView.Adapter<AllenatoreViewHolder>(){
    val TAG = "AllenatoriAdapter"

    private val nomiAllenatori = arrayOf("Trainer One",
        "Trainer Two", "Trainer Three", "Trainer Four",
        "Trainer Five", "Trainer Six", "Trainer Seven",
        "Trainer Eight")


    override fun getItemCount(): Int {
        //Qua in pratica si farà il return della "size" della lista degli allenatori di una certa palestra
        return nomiAllenatori.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllenatoreViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cell = layoutInflater.inflate(R.layout.cardview_allenatore, parent, false)

        return AllenatoreViewHolder(cell)
    }

    override fun onBindViewHolder(viewHolder: AllenatoreViewHolder, position: Int){
        viewHolder.nome.text = nomiAllenatori[position]
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

}

class AllenatoreViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var imgProfilo: ImageView
    var nome: TextView
    var threeDotsMenu: TextView

    init {
        imgProfilo = itemView.allenatore_imageView
        nome = itemView.nomeAllenatore_textView
        threeDotsMenu = itemView.threeDots_textView
    }



}