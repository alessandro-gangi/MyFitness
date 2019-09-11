package com.example.myfitness.view.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myfitness.view.activities.MainActivity
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.MockUtenti
import com.example.myfitness.viewmodel.UtentiViewModel
import kotlinx.android.synthetic.main.fragment_register.view.*


class RegisterFragment : Fragment() {
    val TAG = "RegisterFragment"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_register, container, false)

        //val sharedPref: SharedPreferences = activity!!.getSharedPreferences(USER_DATA_PREFERENCE, Context.MODE_PRIVATE)

        setupUI(view)

        return view

    }

    private fun setupUI(view: View) {
        val mail: EditText = view.mail_register_editText
        val username: EditText = view.username_register_editText
        val password: EditText = view.password_register_editText
        val registrati: Button = view.continua_registration_button
        val haiGiaUnAccount: TextView = view.switch_to_login_textView
        val skip: Button = view.test_skip_register_button

        setupSkipButton(skip)
        setupRegistratiButton(registrati, mail, username, password)
        setupHaiGiaUnAccount(haiGiaUnAccount)
    }


    private fun setupSkipButton(skip: Button) {

        skip.setOnClickListener {

            //TODO: test inserimento utenti (DA RIMUOVERE)
            val utentiViewModel = activity?.run {
                ViewModelProvider(this).get(UtentiViewModel::class.java)
            } ?: throw Exception("Invalid Activity")

            //utentiViewModel.deleteUtente("ghingo")
            utentiViewModel.addUtente(MockUtenti.mockUtenteAle)
            utentiViewModel.addUtente(MockUtenti.mockUtenteFra)
            utentiViewModel.addUtente(MockUtenti.mockUtenteLuca)

            startActivity(Intent(this.context, MainActivity::class.java))

        }
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
            ).addToBackStack(null).commit()
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

        //CONTINUA LA REGISTRAZIONE

        //passo al fragment per continuare la registrazione
        fragmentManager!!.beginTransaction().replace(
            R.id.container_start,
            RegisterStep2Fragment.newInstance(usr, mail, pwd)
        ).addToBackStack(null).commit()
    }


}
