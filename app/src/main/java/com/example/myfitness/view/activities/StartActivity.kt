package com.example.myfitness.view.activities


import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfitness.R
import com.example.myfitness.view.fragments.LoginFragment
import com.example.myfitness.view.fragments.RegisterFragment

class StartActivity : AppCompatActivity() {
    val TAG = "StartActivity"

    // SharedPref
    private lateinit var username: String
    private lateinit var sharedPref: SharedPreferences
    private val USER_DATA_PREFERENCE: String = "USER_DATA_PREFERENCE"
    val USERNAME_KEY = "USERNAME"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        sharedPref = getSharedPreferences(USER_DATA_PREFERENCE, Context.MODE_PRIVATE)
        username = sharedPref.getString(USERNAME_KEY, "") ?: ""

        if(username.isNotEmpty()){
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        }
        else
            supportFragmentManager.beginTransaction().replace(
                R.id.container_start,
                LoginFragment()).commit()

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }


    override fun onStop() {
        super.onStop()
        //QUESTO FINISH SERVIVA PER NON POTER TORNARE INDIETRO DALLA SUCCESSIVA ACTIVITY
        //if(utente è loggato)
        //  finish()
    }
}

