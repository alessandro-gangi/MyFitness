package com.example.myfitness

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_login.view.*


class LoginFragment : Fragment() {
    val TAG = "LoginFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_login, container, false)

        // Imposto il bottone ACCEDI
        view.login_button.setOnClickListener { view ->
            Log.d(TAG, "<<Click sul bottone accedi>>")
        }

        // Imposto il bottone NON_HAI_UN_ACCOUNT
        view.switch_to_register_textView.setOnClickListener { view ->
            Log.d(TAG, "<<Click sul bottone non hai un account>>")
            fragmentManager!!.beginTransaction().replace(R.id.container_start, RegisterFragment()).commit()
        }

        return view
    }

}
