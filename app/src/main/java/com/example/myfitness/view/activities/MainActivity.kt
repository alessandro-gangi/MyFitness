package com.example.myfitness.view.activities

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import com.example.myfitness.*
import com.example.myfitness.view.fragments.ProfileFragment
import com.example.myfitness.view.fragments.RichiesteFragment
import com.example.myfitness.view.fragments.SchedeFragment

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    private val SCHEDA_ID_SEND_CODE: String = "SCHEDA_ID"
    private lateinit var navView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate MainActivity")

        setContentView(R.layout.activity_main)

        //imposto come fragment iniziale quello della home (delle schede)
        supportFragmentManager.beginTransaction().replace(
            R.id.container_main,
            ProfileFragment()
        ).commit()

        navView = findViewById(R.id.nav_view_main)
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
                if(navView.selectedItemId != item.itemId)
                    supportFragmentManager.beginTransaction().replace(
                        R.id.container_main,
                        ProfileFragment()
                    ).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_schede -> {
                if(navView.selectedItemId != item.itemId)
                    supportFragmentManager.beginTransaction().replace(
                        R.id.container_main,
                        SchedeFragment()
                    ).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_richieste -> {
                if(navView.selectedItemId != item.itemId)
                    supportFragmentManager.beginTransaction().replace(
                        R.id.container_main,
                        RichiesteFragment()
                    ).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

}
