package com.example.myfitness.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.view.adapters.PalestreAdapter
import com.example.myfitness.R
import kotlinx.android.synthetic.main.fragment_seleziona_palestra.view.*


class SelezionaPalestraFragment : Fragment() {
    val TAG = "SelezionaPalestraFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_seleziona_palestra, container, false)
        rootView.palestre_recycler_view.layoutManager = LinearLayoutManager(activity)
        rootView.palestre_recycler_view.adapter = PalestreAdapter()

        return rootView
    }





}
