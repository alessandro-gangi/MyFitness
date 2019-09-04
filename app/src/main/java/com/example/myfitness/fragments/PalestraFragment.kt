package com.example.myfitness.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.adapters.AllenatoriAdapter
import com.example.myfitness.R
import com.example.myfitness.data.Utente
import kotlinx.android.synthetic.main.cardview_allenatore.*
import kotlinx.android.synthetic.main.cardview_palestra.*
import kotlinx.android.synthetic.main.cardview_palestra.view.*
import kotlinx.android.synthetic.main.fragment_palestra.*
import kotlinx.android.synthetic.main.fragment_palestra.view.*


class PalestraFragment : Fragment() {
    val TAG = "PalestraFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_palestra, container, false)
        rootView.allenatori_recyclerView.layoutManager = LinearLayoutManager(activity)
        rootView.allenatori_recyclerView.adapter = AllenatoriAdapter(arrayListOf<Utente>())

        rootView.threeDots_palestra_button.setOnClickListener {
            showPopupMenu(this.threeDots_palestra_button)
        }

        return rootView
    }


    private fun showPopupMenu(view: View) {
        var popup: PopupMenu? = null;
        popup = PopupMenu(view.context, view)
        popup.inflate(R.menu.popup_palestra_menu)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {

            when (it!!.itemId) {
                R.id.popup_menu_item_elimina_palestra-> {
                    //Do something...
                    Toast.makeText(view.context, it.title, Toast.LENGTH_SHORT).show()

                    //passo al fragment dove seleziono la palestra
                    fragmentManager!!.beginTransaction().replace(
                        R.id.container_main,
                        SelezionaPalestraFragment()).commit()
                }
            }
            true
        })

        popup.show()
    }

}
