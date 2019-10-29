package com.example.myfitness.utilis

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import android.net.ConnectivityManager
import android.util.Log
import com.example.myfitness.model.dataClasses.Scheda
import com.example.myfitness.model.local.SchedeDao
import com.example.myfitness.model.local.SchedeDao_Impl
import java.net.InetAddress


object AllineaDB {
    private var sharedPref: SharedPreferences? = null

    private val ALLINEA_DB: String = "ALLINEA_DB"
    private val SCHEDE_TO_ADD: String = "SCHEDE_TO_ADD"
    private val SCHEDE_TO_UPDATE: String = "SCHEDE_TO_UPDATE"
    private val SCHEDE_TO_DELETE: String = "SCHEDE_TO_DELETE"
    private val RICHIESTE_IN_ATTESA_TO_DELETE: String = "RICHIESTE_IN_ATTESA_TO_DELETE"

    fun initialize(activity: Activity){
        sharedPref = activity.getSharedPreferences(ALLINEA_DB, Context.MODE_PRIVATE)
    }

    fun addSchedaToAdd(schedaID: Int){
        val schede = HashSet<String>()
        schede.add(schedaID.toString())

        val previousSchede = sharedPref!!.getStringSet(SCHEDE_TO_ADD, null)
        if(previousSchede != null)
            schede.addAll(previousSchede)

        sharedPref!!.edit().putStringSet(SCHEDE_TO_ADD, schede).apply()
    }

    fun getSchedeToAdd(): ArrayList<String>{
        val result = ArrayList<String>()
        val schede = sharedPref!!.getStringSet(SCHEDE_TO_ADD, null)
        if(schede != null)
            result.addAll(schede)
        return result
    }

    fun clearSchedeToAdd(){
        sharedPref!!.edit().remove(SCHEDE_TO_ADD).apply()
    }


    fun addSchedaToUpdate(schedaID: Int){
        val schede = HashSet<String>()
        schede.add(schedaID.toString())

        val previousSchede = sharedPref!!.getStringSet(SCHEDE_TO_UPDATE, null)
        if(previousSchede != null)
            schede.addAll(previousSchede)

        sharedPref!!.edit().putStringSet(SCHEDE_TO_UPDATE, schede).apply()
    }

    fun getSchedeToUpdate(): ArrayList<String>{
        val result = ArrayList<String>()
        val schede = sharedPref!!.getStringSet(SCHEDE_TO_UPDATE, null)
        if(schede != null)
            result.addAll(schede)
        return result
    }

    fun clearSchedeToUpdate(){
        sharedPref!!.edit().remove(SCHEDE_TO_UPDATE).apply()
    }


    fun addSchedaToDelete(schedaID: Int){
        val schede = HashSet<String>()
        schede.add(schedaID.toString())

        val previousSchede = sharedPref!!.getStringSet(SCHEDE_TO_DELETE, null)
        if(previousSchede != null)
            schede.addAll(previousSchede)

        sharedPref!!.edit().putStringSet(SCHEDE_TO_DELETE, schede).apply()
    }

    fun getSchedeToDelete(): ArrayList<String>{
        val result = ArrayList<String>()
        val schede = sharedPref!!.getStringSet(SCHEDE_TO_DELETE, null)
        if(schede != null)
            result.addAll(schede)
        return result
    }

    fun clearSchedeToDelete(){
        sharedPref!!.edit().remove(SCHEDE_TO_DELETE).apply()
    }



    // --------------------- richieste ----------------------

    fun addRichiestaInAttesaToDelete(richiestaID: Int){
        val richieste = HashSet<String>()
        richieste.add(richiestaID.toString())

        val previousRichieste = sharedPref!!.getStringSet(RICHIESTE_IN_ATTESA_TO_DELETE, null)
        if(previousRichieste != null)
            richieste.addAll(previousRichieste)

        sharedPref!!.edit().putStringSet(RICHIESTE_IN_ATTESA_TO_DELETE, richieste).apply()
    }

    fun getRichiesteInAttesaToDelete(): ArrayList<String>{
        val result = ArrayList<String>()
        val richieste = sharedPref!!.getStringSet(RICHIESTE_IN_ATTESA_TO_DELETE, null)
        if(richieste != null)
            result.addAll(richieste)
        return result
    }

    fun clearRichiesteInAttesaToDelete(){
        sharedPref!!.edit().remove(SCHEDE_TO_DELETE).apply()
    }

}