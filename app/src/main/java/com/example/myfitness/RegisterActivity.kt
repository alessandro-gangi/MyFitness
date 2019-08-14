package com.example.myfitness

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    val TAG = "RegisterActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //Gestione click su bottone "Registrati"
        register_button.setOnClickListener {
            Log.d(TAG, "Button register clicked")
            register()
        }

        //Gestione click su "Hai già un account? Accedi"
        switch_to_login_textView.setOnClickListener {
            Log.d(TAG, "switched to login activity")
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
        }

    }

    private fun register(){
        val mail = mail_register_editText.text.toString()
        val usr = username_register_editText.text.toString()
        val pwd = password_register_editText.text.toString()

        if(mail.isEmpty() or usr.isEmpty() or pwd.isEmpty()){
            Log.d(TAG, "Some fields were not filled correctly")
        }else{
            Log.d(TAG, "Performing registration")
            Log.d(TAG, "mail is $mail")
            Log.d(TAG, "username is $usr")
            Log.d(TAG, "password is $pwd")

            //perform registration with model methods

        }
    }

}
