package com.example.myfitness.activities

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import com.example.myfitness.*
import com.example.myfitness.fragments.*

class MainActivity : AppCompatActivity(), SchedeFragment.SchedeInteractionListener {

    override fun onSchedaSelected(schedaId: Long) {
        Toast.makeText(this, "Scheda $schedaId selected", Toast.LENGTH_SHORT).show()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container_main, VisualizzazioneSchedaFragment.newInstance(schedaId.toInt()))
            .addToBackStack(null)
            .commit()
    }

    val TAG = "MainActivity"

    //Per cambiare tab a seconda del click
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.container_main,
                    SchedeFragment()
                ).addToBackStack(null).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_palestra -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.container_main,
                    PalestraFragment()
                ).addToBackStack(null).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_profile -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.container_main,
                    CreazioneSchedeFragment()
                ).addToBackStack(null).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.container_main,
                    NotificationsFragment()
                ).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "created mainActivity")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //imposto come fragment iniziale quello della home (delle schede)
        supportFragmentManager.beginTransaction().replace(
            R.id.container_main,
            SchedeFragment()
        ).commit()
        val navView: BottomNavigationView = findViewById(R.id.nav_view_main)

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
