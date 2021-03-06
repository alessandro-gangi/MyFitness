package com.example.myfitness.view.adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.Scheda
import kotlinx.android.synthetic.main.cardview_scheda.view.*




class SchedeAdapter(val clickListener: (schedaId: Int, command: Char) -> Unit): RecyclerView.Adapter<SchedaViewHolder>(){
    val TAG = "SchedeAdapter"

    var listaSchede: ArrayList<Scheda> = ArrayList()

    fun setListaSchede(nuovaListaSchede: List<Scheda>){
        listaSchede = ArrayList(nuovaListaSchede)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return listaSchede.size
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchedaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cell = layoutInflater.inflate(R.layout.cardview_scheda, parent, false)

        return SchedaViewHolder(cell)
    }



    override fun onBindViewHolder(viewHolder: SchedaViewHolder, position: Int){
        viewHolder.numGiorni.text = "${listaSchede[position].num_giorni}"

        var tmpNumEsercizi = 0
        for (i in 0 until listaSchede[position].esercizi.size){
            tmpNumEsercizi += listaSchede[position].esercizi[i].size
        }
        viewHolder.numEsercizi.text = tmpNumEsercizi.toString()
        viewHolder.data.text = listaSchede[position].data
        viewHolder.autore.text = "(${listaSchede[position].autore.nome} ${listaSchede[position].autore.cognome})"
        viewHolder.tipologia.text = listaSchede[position].tipo

        impostaImmagine(viewHolder.imgScheda, listaSchede[position].tipo)

        viewHolder.view.setOnClickListener { clickListener(listaSchede[position].schedaId, 'V') }
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

                    clickListener(listaSchede[position].schedaId, 'V')
                    // VISUALIZZA SCHEDA
                    // TODO: fare il passaggio di activity tramite interfaccia
                }

                R.id.popup_menu_item_seleziona_scheda -> {
                    Toast.makeText(view.context, it.title, Toast.LENGTH_SHORT).show()
                    // TODO: creare metodo in "dataManager" per settare la scheda come "corrente"
                    // IMPOSTA COME SCHEDA CORRENTE
                    clickListener(listaSchede[position].schedaId, 'S')
                }

                R.id.popup_menu_item_elimina_scheda -> {
                    Toast.makeText(view.context, it.title, Toast.LENGTH_SHORT).show()

                    //TODO: creare metodo in "dataManager" per eliminare la scheda

                    // ELIMINA SCHEDA
                    clickListener(listaSchede[position].schedaId, 'D')


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
    var numEsercizi: TextView
    var tipologia: TextView
    var data: TextView
    var autore: TextView
    var threeDotsMenu: TextView

    init {
        imgScheda = itemView.scheda_imageView
        numGiorni = itemView.days_textView
        numEsercizi = itemView.numEsercizi_textView
        tipologia = itemView.tipologia_textView
        data = itemView.data_textView
        autore = itemView.autore_textView
        threeDotsMenu = itemView.threeDots_button

    }

}