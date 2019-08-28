package com.example.myfitness.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.myfitness.R
import kotlinx.android.synthetic.main.cardview_palestra.view.*

class PalestreAdapter: RecyclerView.Adapter<PalestraViewHolder>(){
    val TAG = "PalestreAdapter"

    private val nomiPalestre = arrayOf("Palestra One",
        "Palestra Two", "Palestra Three", "Palestra Four",
        "Palestra Five", "Palestra Six", "Palestra Seven",
        "Palestra Eight")


    override fun getItemCount(): Int {
        //Qua in pratica si farà il return della "size" della lista degli allenatori di una certa palestra
        return nomiPalestre.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PalestraViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cell = layoutInflater.inflate(R.layout.cardview_palestra, parent, false)

        return PalestraViewHolder(cell)
    }

    override fun onBindViewHolder(viewHolder: PalestraViewHolder, position: Int){
        viewHolder.nome.text = nomiPalestre[position]
        viewHolder.threeDotsMenu.setOnClickListener {
            showPopupMenu(viewHolder.threeDotsMenu)
        }
    }


    private fun showPopupMenu(view: View) {
        var popup: PopupMenu? = null;
        popup = PopupMenu(view.context, view)
        popup.inflate(R.menu.popup_palestra_card_menu)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {

            when (it!!.itemId) {
                R.id.popup_menu_item_seleziona_palestra -> {
                    //Do something...
                    Toast.makeText(view.context, it.title, Toast.LENGTH_SHORT).show()
                }
            }
            true
        })

        popup.show()
    }

}

class PalestraViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var imgPalestra: ImageView
    var nome: TextView
    var threeDotsMenu: TextView

    init {
        imgPalestra = itemView.scheda_imageView
        nome = itemView.nomePalestra_textView
        threeDotsMenu = itemView.threeDots_textView
    }



}