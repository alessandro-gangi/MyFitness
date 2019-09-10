package com.example.myfitness.view.activities


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.example.myfitness.view.fragments.LogoFragment
import com.example.myfitness.R

class StartActivity : AppCompatActivity() {
    val TAG = "StartActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_start)
        supportFragmentManager.beginTransaction().replace(
            R.id.container_start,
            LogoFragment()
        ).commit()

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

