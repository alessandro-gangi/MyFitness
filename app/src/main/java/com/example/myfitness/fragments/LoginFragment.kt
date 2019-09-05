package com.example.myfitness.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.myfitness.R
import com.example.myfitness.viewmodel.UtentiViewModel
import kotlinx.android.synthetic.main.fragment_login.view.*


class LoginFragment : Fragment() {
    val TAG = "LoginFragment"

    private lateinit var viewModel: UtentiViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_login, container, false)

        viewModel = ViewModelProvider(this).get(UtentiViewModel::class.java)

        setupUI(view)

        return view
    }

    private fun setupUI(view: View) {

        val loginButton: Button = view.login_button
        val nonHaiunAccount: TextView = view.switch_to_register_textView

        setupLoginButton(loginButton)
        setupNonHaiUnAccount(nonHaiunAccount)
    }

    private fun setupLoginButton(login: Button) {

        login.setOnClickListener {
            Log.d(TAG, "<<Click sul bottone accedi>>")
        }
    }

    private fun setupNonHaiUnAccount(nonHaiUnAccount: TextView){

        nonHaiUnAccount.setOnClickListener {
            activity?.supportFragmentManager?.popBackStack()
        }
    }


}
