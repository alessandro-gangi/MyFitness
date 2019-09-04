package com.example.myfitness.activities


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myfitness.fragments.LogoFragment
import com.example.myfitness.R

class StartActivity : AppCompatActivity() {
    val TAG = "StartActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "onCreate Start")

        setContentView(R.layout.activity_start)
        supportFragmentManager.beginTransaction().replace(
            R.id.container_start,
            LogoFragment()
        ).commit()

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        Log.d(TAG, "onActivityResult Start")
    }


    override fun onStop() {
        super.onStop()
        //QUESTO FINISH SERVIVA PER NON POTER TORNARE INDIETRO DALLA SUCCESSIVA ACTIVITY
        //if(utente è loggato)
        //  finish()
    }
}

