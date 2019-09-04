package com.example.myfitness.fragments

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
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
import com.example.myfitness.dataManager.MyDataManager
import kotlinx.android.synthetic.main.fragment_register.view.*


class RegisterFragment : Fragment() {
    val TAG = "RegisterFragment"

    private val USER_DATA_PREFERENCE: String = "USER_PREFERENCE"

    private val mydataManager: MyDataManager = MyDataManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_register, container, false)

        val sharedPref: SharedPreferences = activity!!.getSharedPreferences(USER_DATA_PREFERENCE, Context.MODE_PRIVATE)

        setupUI(view)

        return view

    }

    private fun setupUI(view: View){
        val mail: EditText = view.mail_register_editText
        val username: EditText = view.username_register_editText
        val password: EditText = view.password_register_editText
        val registrati: Button = view.continua_registration_button
        val haiGiaUnAccount: TextView = view.switch_to_login_textView
        val skip: Button = view.test_skip_register_button

        //setupSkipButton(skip)
        //setupRegistratiButton(skip)
        // Imposto il bottone SKIP
        skip.setOnClickListener {

            // TEST PER SALVARE I MIEI DATI
            /*
            sharedPref.edit().putString("USER_USERNAME", "ghingo").apply()
            sharedPref.edit().putString("USER_NAME", "Alessandro Gangi").apply()
            sharedPref.edit().putString("USER_DESC", "Ciao sono uno stronzo di merda figlio di puttana. Vivo ad Alpignano dove non c'è un cazzo" +
                    " e mel tempo libero non faccio un cazzo di niente. Andatevene tutti a fare in culo.").apply()
            */

            val intent = Intent(this.context, MainActivity::class.java)
            startActivity(intent)

        }

        // Imposto il bottone REGISTRATI
        registrati.setOnClickListener {
            if(controlla_correttezza_username(username.text.toString()) and
            controlla_correttezza_mail(mail.text.toString()) and
            controlla_correttezza_password(password.text.toString())) {
                //mydataManager.controlla_disponibilita_username(username.text.toString())
                continua_registrazione(username.text.toString(), mail.text.toString(), password.text.toString())
            }
            else
                Toast.makeText(activity, "Controlla i dati", Toast.LENGTH_SHORT)
        }

        // Imposto il bottone HAI_GIA_UN_ACCOUNT
        haiGiaUnAccount.setOnClickListener {
            Log.d(TAG, "<<Click sul bottone hai già un account>>")
            fragmentManager!!.beginTransaction().replace(
                R.id.container_start,
                LoginFragment()
            ).addToBackStack(null).commit()
        }

    }



    private fun controlla_correttezza_username(usr: String): Boolean{
        var flag: Boolean = false

        //controllo correttezza username
        if(usr.isNotEmpty()) flag = true

        return flag


    }

    private fun controlla_correttezza_mail(mail: String): Boolean{
        //controllo correttezza mail
        if (mail.isNotEmpty())
            return android.util.Patterns.EMAIL_ADDRESS.matcher(mail).matches()
        return false
    }

    private fun controlla_correttezza_password(pwd: String): Boolean{
        var flag: Boolean = false

        //controllo correttezza password
        if(pwd.isNotEmpty()) flag = true

        return flag

    }


    private fun continua_registrazione(usr: String?, mail: String?, pwd: String?){

        //CONTINUA LA REGISTRAZIONE

        //passo al fragment per continuare la registrazione
        fragmentManager!!.beginTransaction().replace(
            R.id.container_start,
            RegisterStep2Fragment.newInstance(usr!!, mail!!, pwd!!)).addToBackStack(null).commit()
    }


}
