package com.example.myfitness.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.myfitness.activities.MainActivity
import com.example.myfitness.data.Utente
import com.example.myfitness.R
import kotlinx.android.synthetic.main.fragment_register.view.*


class RegisterFragment : Fragment() {
    val TAG = "RegisterFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_register, container, false)

        val mail: EditText = view.mail_register_editText
        val username: EditText = view.username_register_editText
        val password: EditText = view.password_register_editText

        val registrati: Button = view.continua_registration_button
        val accedi: TextView = view.switch_to_login_textView
        val skip: Button = view.test_skip_register_button


        // Imposto il bottone SKIP
        skip.setOnClickListener {
            Log.d(TAG, "<<Click sul bottone skip>>")
            val intent = Intent(this.context, MainActivity::class.java)
            startActivity(intent)
        }

        // Imposto il bottone REGISTRATI
        registrati.setOnClickListener {
            Log.d(TAG, "<<Click sul bottone registrati>>")
            continua_registrazione(Utente(username.text.toString(), mail.text.toString(), password.text.toString()))
        }

        // Imposto il bottone HAI_GIA_UN_ACCOUNT
        accedi.setOnClickListener {
            Log.d(TAG, "<<Click sul bottone hai già un account>>")
            fragmentManager!!.beginTransaction().replace(
                R.id.container_start,
                LoginFragment()
            ).addToBackStack(null).commit()
        }

        return view
    }


    private fun continua_registrazione(utente: Utente){
        Log.d(TAG, "<<Continuo la registrazione>>")
        Log.d(TAG, utente.toString())

        //CONTINUA LA REGISTRAZIONE

        //passo al fragment per continuare la registrazione
        fragmentManager!!.beginTransaction().replace(
            R.id.container_start,
            RegisterStep2Fragment()).commit()
    }


    override fun onPause() {
        super.onPause()
    }
}
