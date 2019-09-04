package com.example.myfitness.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class UtenteDAO {

    // A fake database table
    private val utentiList = mutableListOf<Utente_new>()
    // MutableLiveData is from the Architecture Components Library
    // LiveData can be observed for changes
    private val utenti = MutableLiveData<List<Utente_new>>()

    init {
        // Immediately connect the now empty quoteList
        // to the MutableLiveData which can be observed
        utenti.value = utentiList
    }

    fun addUtente(utente: Utente_new) {
        utentiList.add(utente)
        // After adding a quote to the "database",
        // update the value of MutableLiveData
        // which will notify its active observers
        utenti.value = utentiList
    }

    // Casting MutableLiveData to LiveData because its value
    // shouldn't be changed from other classes
    fun getUtenti() = utenti as LiveData<List<Utente_new>>

}

