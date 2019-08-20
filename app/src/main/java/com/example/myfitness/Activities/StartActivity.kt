package com.example.myfitness.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myfitness.Fragments.LogoFragment
import com.example.myfitness.R

class StartActivity : AppCompatActivity() {
    val TAG = "StartActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "created mainActivity")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        supportFragmentManager.beginTransaction().replace(
            R.id.container_start,
            LogoFragment()
        ).commit()
    }



}

