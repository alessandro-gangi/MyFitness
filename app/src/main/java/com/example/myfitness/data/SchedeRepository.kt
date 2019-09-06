package com.example.myfitness.data

import android.util.Log
import androidx.lifecycle.LiveData

class SchedeRepository (private val schedeDao: SchedeDao){
    private val TAG = "SchedeRepository"


    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    val allSchede: LiveData<List<Scheda>> = schedeDao.getAllSchede()


    // The suspend modifier tells the compiler that this must be called from a
    // coroutine or another suspend function.
    suspend fun addScheda(scheda: Scheda) = schedeDao.addScheda(scheda)

    suspend fun deleteScheda(id: Int) = schedeDao.deleteScheda(id)

    fun getScheda(id: Int) :Scheda{
        return schedeDao.getScheda(id)
    }

    fun getSchedaGiornaliera(id: Int, numGiorno: Int) :ArrayList<Esercizio>{
        return getScheda(id).esercizi[numGiorno]
    }

}