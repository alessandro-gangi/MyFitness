package com.example.myfitness.adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.myfitness.R
import com.example.myfitness.data.Scheda
import kotlinx.android.synthetic.main.cardview_scheda.view.*




class SchedeAdapter(val listaSchede: ArrayList<Scheda>, val clickListener: (schedaId: Long) -> Unit): RecyclerView.Adapter<SchedaViewHolder>(){
    val TAG = "SchedeAdapter"


    override fun getItemCount(): Int {
        return listaSchede.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchedaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cell = layoutInflater.inflate(com.example.myfitness.R.layout.cardview_scheda, parent, false)

        return SchedaViewHolder(cell)
    }



    override fun onBindViewHolder(viewHolder: SchedaViewHolder, position: Int){
        viewHolder.numGiorni.text = "${listaSchede[position].schedeGiornaliere.size}"
        viewHolder.data.text = listaSchede[position].data
        viewHolder.tipologia.text = listaSchede[position].tipo

        impostaImmagine(viewHolder.imgScheda, listaSchede[position].tipo)

        viewHolder.view.setOnClickListener { clickListener(listaSchede[position].id) }
        viewHolder.threeDotsMenu.setOnClickListener {
            showPopupMenu(viewHolder.threeDotsMenu, position)
        }
    }

    private fun showPopupMenu(view: View, position: Int) {
        var popup: PopupMenu?
        popup = PopupMenu(view.context, view)
        popup.inflate(R.menu.popup_scheda_menu)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {

            when (it!!.itemId) {
                R.id.popup_menu_item_visualizza_scheda -> {
                    Toast.makeText(view.context, it.title, Toast.LENGTH_SHORT).show()

                    // VISUALIZZA SCHEDA
                    // TODO: fare il passaggio di activity tramite interfaccia
                }

                R.id.popup_menu_item_seleziona_scheda -> {
                    Toast.makeText(view.context, it.title, Toast.LENGTH_SHORT).show()
                    // TODO: creare metodo in "dataManager" per settare la scheda come "corrente"
                    // IMPOSTA COME SCHEDA CORRENTE

                }

                R.id.popup_menu_item_elimina_scheda -> {
                    Toast.makeText(view.context, it.title, Toast.LENGTH_SHORT).show()

                    //TODO: creare metodo in "dataManager" per eliminare la scheda

                    // ELIMINA SCHEDA
                    listaSchede.removeAt(position)
                    notifyDataSetChanged()

                }
            }
            true
        })

        popup.show()
    }


    fun impostaImmagine(imageView: ImageView, tipologia: String){
        when (tipologia.toLowerCase()){
            "forza" -> imageView.setImageResource(R.drawable.ic_tipologia_forza)
            "massa" -> imageView.setImageResource(R.drawable.ic_tipologia_massa)
            "definizione" -> imageView.setImageResource(R.drawable.ic_tipologia_definizione)
        }
    }
}

class SchedaViewHolder(val view: View): RecyclerView.ViewHolder(view){
    var imgScheda: ImageView
    var numGiorni: TextView
    var tipologia: TextView
    var data: TextView
    var threeDotsMenu: TextView

    init {
        imgScheda = itemView.scheda_imageView
        numGiorni = itemView.days_textView
        tipologia = itemView.tipologia_textView
        data = itemView.data_textView
        threeDotsMenu = itemView.threeDots_button

    }

}