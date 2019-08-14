package com.example.myfitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
    val TAG = "StartActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        start_button.setOnClickListener {
            Log.d(TAG, "Button start clicked")
            val intent = Intent(this@StartActivity, RegisterActivity::class.java)
            startActivity(intent)
        }

    }

}

