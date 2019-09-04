package com.example.myfitness.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class UtenteInfoDAO {

    // A fake database table
    private val utentiInfoList = mutableListOf<UtenteInfo_new>()
    // MutableLiveData is from the Architecture Components Library
    // LiveData can be observed for changes
    private val utentiInfo = MutableLiveData<List<UtenteInfo_new>>()

    init {
        // Immediately connect the now empty quoteList
        // to the MutableLiveData which can be observed
        utentiInfo.value = utentiInfoList
    }

    fun addUtente(utenteInfo: UtenteInfo_new) {
        utentiInfoList.add(utenteInfo)
        // After adding a quote to the "database",
        // update the value of MutableLiveData
        // which will notify its active observers
        utentiInfo.value = utentiInfoList
    }

    // Casting MutableLiveData to LiveData because its value
    // shouldn't be changed from other classes
    fun getUtenti() = utentiInfo as LiveData<List<UtenteInfo_new>>


}