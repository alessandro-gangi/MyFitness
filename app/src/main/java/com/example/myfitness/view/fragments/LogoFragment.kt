package com.example.myfitness.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myfitness.R
import kotlinx.android.synthetic.main.fragment_logo.view.*


class LogoFragment : Fragment() {
    val TAG = "LogoFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_logo, container, false)

        // Imposto il bottone START
        view.start_button.setOnClickListener {
            fragmentManager!!.beginTransaction().replace(
                R.id.container_start,
                RegisterFragment()
            ).commit()
        }


        return view
    }


}
