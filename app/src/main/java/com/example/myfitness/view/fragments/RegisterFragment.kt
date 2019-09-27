package com.example.myfitness.view.fragments

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myfitness.view.activities.MainActivity
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.MockRichieste
import com.example.myfitness.model.dataClasses.MockSchede
import com.example.myfitness.model.dataClasses.MockUtenti
import com.example.myfitness.viewmodel.RichiesteViewModel
import com.example.myfitness.viewmodel.SchedeViewModel
import com.example.myfitness.viewmodel.UtentiViewModel
import kotlinx.android.synthetic.main.fragment_register.view.*


class RegisterFragment : Fragment() {
    val TAG = "RegisterFragment"


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_register, container, false)

        setupUI(view)

        return view

    }

    private fun setupUI(view: View) {
        val mail: EditText = view.mail_register_editText
        val username: EditText = view.username_register_editText
        val password: EditText = view.password_register_editText
        val registrati: Button = view.continua_registration_button
        val haiGiaUnAccount: TextView = view.switch_to_login_textView

        setupRegistratiButton(registrati, mail, username, password)
        setupHaiGiaUnAccount(haiGiaUnAccount)
    }



    private fun setupRegistratiButton(registrati: Button, mail: EditText, username: EditText, password: EditText) {

        registrati.setOnClickListener {
            if (controlla_correttezza_dati(username.text.toString(), mail.text.toString(), password.text.toString()))
                continua_registrazione(username.text.toString(), mail.text.toString(), password.text.toString())
        }

    }


    private fun setupHaiGiaUnAccount(haiGiaUnAccount: TextView){

        haiGiaUnAccount.setOnClickListener {
            Log.d(TAG, "<<Click sul bottone hai già un account>>")
            fragmentManager!!.beginTransaction().replace(
                R.id.container_start,
                LoginFragment()
            ).commit()
        }

    }


    private fun controlla_correttezza_dati(usr: String, mail: String, pwd: String): Boolean{
        var flag: Boolean = true

        //controllo correttezza username
        if(usr.isEmpty()){
            Toast.makeText(activity, "Username non valido", Toast.LENGTH_SHORT).show()
            flag = flag and false
        }

        //controllo correttezza username
        //if(mail.isEmpty() or !android.util.Patterns.EMAIL_ADDRESS.matcher(mail).matches()){
        if(mail.isEmpty()){
            Toast.makeText(activity, "Mail non valida", Toast.LENGTH_SHORT).show()
            flag = flag and false
        }

        if(pwd.isEmpty()){
            Toast.makeText(activity, "Password non valida", Toast.LENGTH_SHORT).show()
            flag = flag and false
        }

        return flag
    }


    private fun continua_registrazione(usr: String, mail: String, pwd: String){

        //passo al fragment per continuare la registrazione
        fragmentManager!!.beginTransaction().replace(
            R.id.container_start,
            RegisterStep2Fragment.newInstance(usr, mail, pwd)
        ).addToBackStack(null).commit()
    }


}
