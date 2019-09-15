package com.example.myfitness.view.activities

import android.content.Context
import android.content.DialogInterface
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import com.example.myfitness.*
import com.example.myfitness.view.fragments.ProfileFragment
import com.example.myfitness.view.fragments.RichiesteFragment
import com.example.myfitness.view.fragments.SchedeFragment
import android.view.MenuInflater
import androidx.lifecycle.ViewModelProvider
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.viewmodel.UtentiViewModel


class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    // SharedPref
    private lateinit var sharedPref: SharedPreferences
    private val USER_DATA_PREFERENCE: String = "USER_DATA_PREFERENCE"
    val USERNAME_KEY = "USERNAME"
    private lateinit var username: String

    private val SCHEDA_ID_SEND_CODE: String = "SCHEDA_ID"
    private lateinit var navView: BottomNavigationView

    // ViewModel
    private lateinit var utentiViewModel: UtentiViewModel
    private lateinit var utente: Utente

    private var menuToChoose = R.menu.bottom_nav_menu_utente_semplice


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPref = getSharedPreferences(USER_DATA_PREFERENCE, Context.MODE_PRIVATE)
        username = sharedPref.getString(USERNAME_KEY, "") ?: ""

        utentiViewModel = ViewModelProvider(this).get(UtentiViewModel::class.java)
        utente = utentiViewModel.getUtente(username)!!

        navView = findViewById(R.id.nav_view_main)

        if(utente.flagAllenatore) menuToChoose = R.menu.bottom_nav_menu_allenatore
        navView.menu.clear()
        navView.inflateMenu(menuToChoose)

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        //imposto come fragment iniziale quello della home (delle schede)
        supportFragmentManager.beginTransaction().replace(
            R.id.container_main,
            ProfileFragment()
        ).commit()

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
