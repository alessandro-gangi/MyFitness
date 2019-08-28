package com.example.myfitness.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfitness.R
import com.example.myfitness.data.MockSchede
import com.example.myfitness.data.Scheda
import com.example.myfitness.fragments.SchedeFragment
import com.example.myfitness.fragments.VisualizzazioneSchedaFragment
import kotlinx.android.synthetic.main.cardview_scheda.view.*

class SchedeAdapter(val listaSchede: ArrayList<Scheda>, val clickListener: (schedaId: Long) -> Unit): RecyclerView.Adapter<SchedaViewHolder>(){
    val TAG = "SchedeAdapter"


    //private val mock: MockSchede = MockSchede()
    //private val scheda1: Scheda = mock.mockScheda1


    override fun getItemCount(): Int {
        return listaSchede.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchedaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cell = layoutInflater.inflate(R.layout.cardview_scheda, parent, false)
        return SchedaViewHolder(cell)
    }



    override fun onBindViewHolder(viewHolder: SchedaViewHolder, position: Int){
        viewHolder.numGiorni.text = "${listaSchede[position].numGiorni}) giorni"
        viewHolder.data.text = listaSchede[position].data
        viewHolder.view.setOnClickListener { clickListener(listaSchede[position].id.toLong()) }
        viewHolder.threeDotsMenu.setOnClickListener {
            showPopupMenu(viewHolder.threeDotsMenu)
        }
    }

    private fun showPopupMenu(view: View) {
        var popup: PopupMenu? = null;
        popup = PopupMenu(view.context, view)
        popup.inflate(R.menu.popup_scheda_menu)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {

            when (it!!.itemId) {
                R.id.popup_menu_item_visualizza_scheda -> {
                    Toast.makeText(view.context, it.title, Toast.LENGTH_SHORT).show()
                    // VISUALIZZA SCHEDA
                    val mActivity: AppCompatActivity = view.context as AppCompatActivity
                    mActivity.supportFragmentManager.beginTransaction().replace(
                        R.id.container_main,
                        VisualizzazioneSchedaFragment()).addToBackStack(null).commit()
                }

                R.id.popup_menu_item_seleziona_scheda -> {
                    Toast.makeText(view.context, it.title, Toast.LENGTH_SHORT).show()

                    // IMPOSTA COME SCHEDA CORRENTE

                }

                R.id.popup_menu_item_elimina_scheda -> {
                    Toast.makeText(view.context, it.title, Toast.LENGTH_SHORT).show()

                    // ELIMINA SCHEDA

                }
            }
            true
        })

        popup.show()
    }

}

class SchedaViewHolder(val view: View): RecyclerView.ViewHolder(view){
    var imgScheda: ImageView
    var numGiorni: TextView
    var data: TextView
    var threeDotsMenu: TextView

    init {
        imgScheda = itemView.scheda_imageView
        numGiorni = itemView.days_textView
        data = itemView.data_textView
        threeDotsMenu = itemView.threeDots_textView

    }

}