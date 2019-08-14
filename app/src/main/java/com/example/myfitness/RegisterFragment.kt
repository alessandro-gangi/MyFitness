package com.example.myfitness

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_register.view.*


class RegisterFragment : Fragment() {
    val TAG = "RegisterFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_register, container, false)

        // Imposto il bottone SKIP
        view.test_skip_register_button.setOnClickListener { view ->
            Log.d(TAG, "<<Click sul bottone skip>>")
            val intent = Intent(this.context, MainActivity::class.java)
            startActivity(intent)
        }

        // Imposto il bottone REGISTRATI
        view.register_button.setOnClickListener { view ->
            Log.d(TAG, "<<Click sul bottone registrati>>")
        }

        // Imposto il bottone HAI_GIA_UN_ACCOUNT
        view.switch_to_login_textView.setOnClickListener {
            Log.d(TAG, "<<Click sul bottone hai già un account>>")
            fragmentManager!!.beginTransaction().replace(R.id.container_start, LoginFragment()).commit()
        }


        return view
    }
}
