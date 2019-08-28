package com.example.myfitness.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.myfitness.data.Utente
import com.example.myfitness.R
import kotlinx.android.synthetic.main.fragment_register_step2.view.*


class RegisterStep2Fragment : Fragment() {
    val TAG = "RegisterFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_register_step2, container, false)

        val nome: EditText = view.nome_register_editText
        val cognome: EditText = view.cognome_register_editText
        val eta: EditText = view.eta_register_editText
        val sesso_maschio: RadioButton = view.maschio_register_radio
        val sesso_femmina: RadioButton = view.femmina_register_radio

        val completaRegistrazione: Button = view.completa_registrazione_button

        // Imposto i radio buttons
        sesso_maschio.setOnClickListener {
            onRadioButtonClicked(it)
        }
        sesso_femmina.setOnClickListener {
            onRadioButtonClicked(it)
        }


        // Imposto il bottone COMPLETA REGISTRAZIONE
        completaRegistrazione.setOnClickListener {
            Log.d(TAG, "<<Click sul bottone completa registrazione>>")
        }


        return view
    }


    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.maschio_register_radio ->
                    if (checked) {
                        Toast.makeText(activity, "Maschio", Toast.LENGTH_LONG).show()
                    }
                R.id.femmina_register_radio ->
                    if (checked) {
                        Toast.makeText(activity, "Femmina", Toast.LENGTH_LONG).show()
                    }
            }
        }
    }


    private fun register(utente: Utente){
        Log.d(TAG, "<<Effettuo la registrazione>>")
        Log.d(TAG, utente.toString())

        //FAI LA REGISTRAZIONE

    }


    override fun onPause() {
        super.onPause()
    }
}
