package com.example.myfitness.activities

import android.Manifest
import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.myfitness.*
import com.example.myfitness.fragments.*
import com.example.myfitness.interfaces.SchedeInteractionListener

class MainActivity : AppCompatActivity(), SchedeInteractionListener {

    val TAG = "MainActivity"

    private val SCHEDA_ID_SEND_CODE: String = "SCHEDA_ID"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate MainActivity")

        setContentView(R.layout.activity_main)

        //imposto come fragment iniziale quello della home (delle schede)
        supportFragmentManager.beginTransaction().replace(
            R.id.container_main,
            ProfileFragment()
        ).commit()

        val navView: BottomNavigationView = findViewById(R.id.nav_view_main)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

    }


    override fun onBackPressed() {
        val count = supportFragmentManager.backStackEntryCount
        if (count == 0) {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Attenzione")
            builder.setMessage("Vuoi uscire dall'app?")
            builder.setPositiveButton("Si", DialogInterface.OnClickListener { dialog, id ->
                super.onBackPressed()
                finish()
            })
            builder.setNegativeButton("No",
                DialogInterface.OnClickListener { dialog, id -> Unit })
            builder.show()
        } else {
            supportFragmentManager.popBackStack()
        }
    }


    //Per cambiare tab a seconda del click
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.container_main,
                    ProfileFragment()
                ).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_schede -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.container_main,
                    SchedeFragment()
                ).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    //Quando clicchi sulla cardView di una scheda passa al fragment per la visualizzazione completa
    override fun onSchedaSelected(schedaId: Int) {
        Toast.makeText(this, "Scheda $schedaId selected", Toast.LENGTH_SHORT).show()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container_main, VisualizzazioneSchedaFragment.newInstance(schedaId))
            .addToBackStack(null)
            .commit()
    }

    override fun onEsercizioSelected(schedaId: Int, numGiorno: Int) {
        Toast.makeText(this, "Esercizio della scheda $schedaId nel giorno $numGiorno", Toast.LENGTH_SHORT).show()

        // TODO: passare al fragment modificaEsercizio come nel metodo sopra
    }



//

    //

    //










}
