package com.example.myfitness.fragments

import android.app.AlertDialog
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.PopupMenu
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.R
import com.example.myfitness.adapters.SchedeAdapter
import com.example.myfitness.data.MockSchede
import com.example.myfitness.viewmodel.SchedeViewModel
import kotlinx.android.synthetic.main.dialog_request_scheda.view.*
import kotlinx.android.synthetic.main.fragment_schede.*
import kotlinx.android.synthetic.main.fragment_schede.view.*


class SchedeFragment : Fragment(){
    val TAG = "SchedeFragment"

    //viewModel
    private lateinit var schedeViewModel: SchedeViewModel

    private lateinit var adapter: SchedeAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //schedeViewModel = ViewModelProvider(this).get(SchedeViewModel::class.java)

        adapter = SchedeAdapter{ schedaId, command -> onSchedaClicked(schedaId, command) }

        schedeViewModel = activity?.run {
            ViewModelProvider(this).get(SchedeViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

        schedeViewModel.allSchede.observe(this, Observer { schede ->
            schede?.let {
                adapter.setListeSchede(it)
            }
        })

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_schede, container, false)
        rootView.schede_recycler_view.layoutManager = LinearLayoutManager(activity)


        rootView.schede_recycler_view.adapter = adapter


        rootView.button_add_scheda.setOnClickListener {
            showAddPopupMenu(this.button_add_scheda)
        }

        return rootView
    }


    private fun showAddPopupMenu(view: View) {
        val popup: PopupMenu?
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
        //TODO: creare un dialog dove l'utente mette le informazioni
        //sulla scheda che vuole richiedere
        //Es: num giorni + commento

        val builder = AlertDialog.Builder(activity)
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

        //test aggiungiamo qualche scheda alla recycler view
        schedeViewModel.addScheda(MockSchede.mockScheda1)
        schedeViewModel.addScheda(MockSchede.mockScheda2)
        schedeViewModel.addScheda(MockSchede.mockScheda3)
    }



    fun onSchedaClicked(schedaId: Int, command: Char) {
        when (command){
            'V' -> {

                schedeViewModel.selectScheda(schedaId)
                Log.d(TAG, "Selected scheda: ${schedeViewModel.selectedScheda.value}")


                fragmentManager!!.beginTransaction()
                .replace(R.id.container_main, VisualizzazioneSchedaFragment.newInstance(schedaId))
                .addToBackStack(null)
                .commit()


            }

            'D' -> {
                Log.d(TAG, "trying to delete scheda $schedaId")
                schedeViewModel.deleteScheda(schedaId)
            }

            // 'S' -> imposta come corrente
        }
    }
}
