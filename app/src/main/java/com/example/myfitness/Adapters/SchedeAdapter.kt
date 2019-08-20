package com.example.myfitness.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfitness.R

class SchedeAdapter: RecyclerView.Adapter<SchedaViewHolder>(){
    override fun getItemCount(): Int {
        //Qua in pratica si farà il return della "size" della lista delle scheda di un certo utente
        return 10
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchedaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cell = layoutInflater.inflate(R.layout.cardview_scheda, parent, false)
        return SchedaViewHolder(cell)
    }


    override fun onBindViewHolder(holder: SchedaViewHolder, position: Int){

    }
}

class SchedaViewHolder(view: View): RecyclerView.ViewHolder(view){

}