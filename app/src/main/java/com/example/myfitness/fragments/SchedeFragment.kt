package com.example.myfitness.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.R
import com.example.myfitness.adapters.SchedeAdapter
import com.example.myfitness.data.MockSchede
import kotlinx.android.synthetic.main.fragment_schede.*
import kotlinx.android.synthetic.main.fragment_schede.view.*


class SchedeFragment : Fragment() {
    val TAG = "SchedeFragment"
    lateinit var listener: SchedeInteractionListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_schede, container, false)
        rootView.schede_recycler_view.layoutManager = LinearLayoutManager(activity)
        listener = activity as SchedeInteractionListener
        rootView.schede_recycler_view.adapter = SchedeAdapter(MockSchede.schede){ schedaId ->
            listener.onSchedaSelected(schedaId)
        }

        rootView.button_add_scheda.setOnClickListener {
            showPopupMenu(this.button_add_scheda)
        }

        return rootView
    }


    private fun showPopupMenu(view: View) {
        var popup: PopupMenu? = null;
        popup = PopupMenu(view.context, view)
        popup.inflate(R.menu.popup_add_scheda_menu)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {

            when (it!!.itemId) {
                R.id.popup_menu_item_richiedi -> {
                    Toast.makeText(view.context, it.title, Toast.LENGTH_SHORT).show();
                }

                R.id.popup_menu_item_crea -> {
                    Toast.makeText(view.context, it.title, Toast.LENGTH_SHORT).show();
                }
            }
            true
        })
        popup.show()
    }

    interface SchedeInteractionListener{
        fun onSchedaSelected(schedaId: Long)
    }




}
