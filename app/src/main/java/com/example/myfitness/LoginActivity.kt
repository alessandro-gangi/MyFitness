package com.example.myfitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    val TAG = "LoginActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_button.setOnClickListener {
            Log.d(TAG, "clicked login")
            login()
        }
    }


    private fun login(){
        val usr = username_login_editText.text.toString()
        val pwd = password_login_editText.text.toString()

        if(usr.isEmpty() or pwd.isEmpty()){
            Log.d(TAG, "Some fields were not filled correctly")
        }else{
            Log.d(TAG, "Performing login")
            Log.d(TAG, "username is $usr")
            Log.d(TAG, "password is $pwd")

            //perform login
            //...
        }
    }
}
