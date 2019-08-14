package com.example.myfitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class StartActivity : AppCompatActivity() {
    val TAG = "StartActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "created mainActivity")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        supportFragmentManager.beginTransaction().replace(R.id.container_start, LogoFragment()).commit()
    }

}

