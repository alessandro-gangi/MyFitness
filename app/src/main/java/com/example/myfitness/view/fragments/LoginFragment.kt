package com.example.myfitness.view.fragments

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.myfitness.R
import com.example.myfitness.view.activities.MainActivity
import com.example.myfitness.viewmodel.UtentiViewModel
import kotlinx.android.synthetic.main.fragment_login.view.*


class LoginFragment : Fragment() {
    val TAG = "LoginFragment"

    private lateinit var utentiViewModel: UtentiViewModel

    private lateinit var sharedPref: SharedPreferences
    private val USER_DATA_PREFERENCE: String = "USER_DATA_PREFERENCE"



    override fun onCreate(savedInstanceState: Bundle?) {

        sharedPref = activity!!.getSharedPreferences(USER_DATA_PREFERENCE, Context.MODE_PRIVATE)

        utentiViewModel = activity?.run {
            ViewModelProvider(this).get(UtentiViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_login, container, false)

        setupUI(view)

        return view
    }

    private fun setupUI(view: View) {

        val loginButton: Button = view.login_button
        val nonHaiunAccount: TextView = view.switch_to_register_textView
        val username: EditText = view.username_login_editText
        val password: EditText = view.password_login_editText

        loginButton.setOnClickListener {
            login(username.text.toString(), password.text.toString())
        }


        nonHaiunAccount.setOnClickListener {
            fragmentManager!!.beginTransaction()
                .replace(R.id.container_start,
                    RegisterFragment()).commit()
        }
    }

    private fun login(username: String, password: String){
        val response: Boolean = utentiViewModel.login(username, password)
        if(response){
            utentiViewModel.setUsername(username)
            val USERNAME_KEY = "USERNAME"
            sharedPref.edit().putString(USERNAME_KEY, username).apply()
            startActivity(Intent(this.context, MainActivity::class.java))
        }
    }




}
