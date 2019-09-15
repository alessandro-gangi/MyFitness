package com.example.myfitness.view.adapters


import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.Richiesta
import kotlinx.android.synthetic.main.cardview_richiesta_in_attesa.view.*
import kotlinx.android.synthetic.main.dialog_richiedi_scheda.view.*
import kotlin.collections.ArrayList
import kotlin.contracts.contract


class RichiesteInAttesaAdapter(val clickListener: (richiesta: Richiesta, command: Char) -> Unit): RecyclerView.Adapter<RichiestaInAttesaViewHolder>(){
    val TAG = "RichiesteInAttAdapt"

    private var listaRichieste: ArrayList<Richiesta> = ArrayList()


    fun setListaRichieste(nuovaListaRichieste: List<Richiesta>){
        listaRichieste = ArrayList(nuovaListaRichieste)
        notifyDataSetChanged()
        //TODO: non so perchè il dato non si aggiorna in automatico
        Log.d(TAG, "ADAPTER-> nuova lista richieste in attesa: $listaRichieste")
    }


    override fun getItemCount(): Int {
        return listaRichieste.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RichiestaInAttesaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cell = layoutInflater.inflate(R.layout.cardview_richiesta_in_attesa, parent, false)

        return RichiestaInAttesaViewHolder(cell)
    }

    override fun onBindViewHolder(holder: RichiestaInAttesaViewHolder, position: Int) {
        holder.nomeRichiedente.text = listaRichieste[position].utente.nome
        holder.cognomeRichiedente.text = listaRichieste[position].utente.cognome
        holder.data.text = listaRichieste[position].data
        holder.numGiorni.text = listaRichieste[position].numGiorni.toString()
        holder.tipologia.text = listaRichieste[position].tipologia
        holder.commento.text = listaRichieste[position]. commento

        when (holder.tipologia.text.toString().toLowerCase()){
            "forza" -> holder.tipologiaImg.setImageResource(R.drawable.ic_tipologia_forza)
            "massa" -> holder.tipologiaImg.setImageResource(R.drawable.ic_tipologia_massa)
            "definizione" -> holder.tipologiaImg.setImageResource(R.drawable.ic_tipologia_definizione)
        }

        holder.threeDotsBtn.setOnClickListener {
            showPopupMenu(holder.threeDotsBtn, position)
        }

        //TODO: implementa
        // glide per caricare l'immagine dell'utente richiedente

        holder.inviaBtn.setOnClickListener {
            Log.d(TAG, "Invia scheda!")
        }
    }


    private fun showPopupMenu(view: View, position: Int) {
        val popup: PopupMenu?
        popup = PopupMenu(view.context, view)
        popup.inflate(R.menu.popup_richiesta_in_attesa)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {

            when (it!!.itemId) {
                R.id.popup_menu_item_invia_scheda -> {
                    clickListener(listaRichieste[position], 'I')
                }

                R.id.popup_menu_item_elimina_richiesta -> {
                    clickListener(listaRichieste[position], 'D')
                }
            }
            true
        })

        popup.show()
    }

}

class RichiestaInAttesaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var nomeRichiedente: TextView
    var cognomeRichiedente: TextView
    var data: TextView
    var numGiorni: TextView
    var tipologia: TextView
    var tipologiaImg: ImageView
    var commento: TextView
    var imageRichiedente: ImageView
    var threeDotsBtn : TextView
    var inviaBtn: TextView


    init {
        nomeRichiedente = itemView.nome_richiedente_textView
        cognomeRichiedente = itemView.cognome_richiedente_textView
        data = itemView.data_textView
        numGiorni = itemView.numGiorni_textView
        tipologia = itemView.tipologia_textView
        tipologiaImg = itemView.tipologia_imageView
        commento = itemView.commento_textView
        imageRichiedente = itemView.richiedente_imageView
        threeDotsBtn = itemView.threeDots_button
        inviaBtn = itemView.inviaScheda_button
    }




}

