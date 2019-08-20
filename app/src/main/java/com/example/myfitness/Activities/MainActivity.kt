package com.example.myfitness.Activities

import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import com.example.myfitness.*
import com.example.myfitness.Fragments.HomeFragment
import com.example.myfitness.Fragments.NotificationsFragment
import com.example.myfitness.Fragments.PalestraFragment
import com.example.myfitness.Fragments.ProfileFragment

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.container_main,
                    HomeFragment()
                ).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_palestra -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.container_main,
                    PalestraFragment()
                ).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_profile -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.container_main,
                    ProfileFragment()
                ).commit()
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
        supportFragmentManager.beginTransaction().replace(
            R.id.container_main,
            HomeFragment()
        ).commit()
        val navView: BottomNavigationView = findViewById(R.id.nav_view_main)

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
