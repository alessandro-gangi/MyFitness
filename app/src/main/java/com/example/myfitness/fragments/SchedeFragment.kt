package com.example.myfitness.fragments

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.PopupMenu
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.dataManager.MyDataManager
import com.example.myfitness.R
import com.example.myfitness.adapters.SchedeAdapter
import com.example.myfitness.data.Scheda
import com.example.myfitness.interfaces.SchedeInteractionListener
import kotlinx.android.synthetic.main.dialog_request_scheda.view.*
import kotlinx.android.synthetic.main.fragment_schede.*
import kotlinx.android.synthetic.main.fragment_schede.view.*


class SchedeFragment : Fragment() {
    val TAG = "SchedeFragment"
    private lateinit var listener: SchedeInteractionListener
    private lateinit var listaSchede: ArrayList<Scheda>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        listaSchede = MyDataManager.retrieve_all_schede_info()
        listener = activity as SchedeInteractionListener

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_schede, container, false)
        rootView.schede_recycler_view.layoutManager = LinearLayoutManager(activity)



        //MI SERVIREBBE CAPIRE MEGLIO LA SINTASSI "schedaId ->"
        rootView.schede_recycler_view.adapter = SchedeAdapter(listaSchede){ schedaId ->
            listener.onSchedaSelected(schedaId)
        }

        rootView.button_add_scheda.setOnClickListener {
            show3DotsPopupMenu(this.button_add_scheda)
        }

        return rootView
    }


    private fun show3DotsPopupMenu(view: View) {
        var popup: PopupMenu? = null;
        popup = PopupMenu(view.context, view)
        popup.inflate(R.menu.popup_add_scheda_menu)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {

            when (it!!.itemId) {
                R.id.popup_menu_item_richiedi -> {
                    if(userHasSelectedCoach())
                        prepareRequestToCoach()
                    else {
                        val msg = "Devi prima selezionare un allenatore"
                        Toast.makeText(activity, msg, Toast.LENGTH_LONG).show()
                    }
                }

                R.id.popup_menu_item_crea -> {
                    Toast.makeText(view.context, it.title, Toast.LENGTH_SHORT).show()
                    createScheda()
                }
            }
            true
        })
        popup.show()
    }

    private fun prepareRequestToCoach(){
        //TODO: creare un dialogo dove l'utente mette le informazioni
        //sulla scheda che vuole richiedere
        //Es: num giorni + commento

        val context = activity
        val builder = AlertDialog.Builder(context)
        builder.setTitle("Richiedi una scheda al tua allenatore")


        val view = layoutInflater.inflate(R.layout.dialog_request_scheda, null)

        val numGiorni: EditText = view.numGiorni_dialog
        val commento: EditText = view.commento_dialog

        builder.setView(view)

        // set up the ok button
        builder.setPositiveButton(R.string.richiedi) { dialog, p1 ->
            Toast.makeText(activity, "OK", Toast.LENGTH_SHORT).show()

            //TODO: sendRequest to coach
            //sendRequestToCoach()

        }

        builder.setNegativeButton(R.string.annulla) { dialog, p1 ->
            dialog.cancel()
        }

        builder.show()
    }

    private fun userHasSelectedCoach(): Boolean{

        var flag: Boolean = true

        //TODO: controlla se l'utente ha selezionato un allenatore

        return flag
    }


    private fun createScheda(){

        //TODO: effettua il passaggio al fragment per creare la scheda
    }


}
