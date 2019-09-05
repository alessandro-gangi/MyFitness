package com.example.myfitness.data

import androidx.lifecycle.LiveData

// FakeQuoteDao must be passed in - it is a dependency
// You could also instantiate the DAO right inside the class without all the fuss, right?
// No. This would break testability - you need to be able to pass a mock version of a DAO
// to the repository (e.g. one that upon calling getQuotes() returns a dummy list of quotes for testing)
// This is the core idea behind DEPENDENCY INJECTION - making things completely modular and independent.

class UtentiRepository (private val utentiDao: UtentiDao){


    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    val allUtenti: LiveData<List<Utente>> = utentiDao.getAllUtenti()


    // The suspend modifier tells the compiler that this must be called from a
    // coroutine or another suspend function.
    suspend fun addUtente(utente: Utente) = utentiDao.addUtente(utente)

    suspend fun deleteUtente(username: String) = utentiDao.deleteUtente(username)

    fun getUtente(username: String) = utentiDao.getUtente(username)

    fun getUtenti() = utentiDao.getAllUtenti()

}