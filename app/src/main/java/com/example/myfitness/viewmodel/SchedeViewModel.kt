package com.example.myfitness.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.myfitness.data.*
import kotlinx.coroutines.launch


class SchedeViewModel (application: Application): AndroidViewModel(application){
    private val TAG = "SchedeViewModel"

    // The ViewModel maintains a reference to the repository to get data.
    private val repository: SchedeRepository
    // LiveData gives us updated words when they change.
    val allSchede: LiveData<List<Scheda>>

    var selectedScheda: MutableLiveData<Scheda>

    init {
        // Gets reference to WordDao from WordRoomDatabase to construct
        // the correct WordRepository.
        val schedeDao = MyDatabase.getDatabase(application).SchedeDao()
        repository = SchedeRepository(schedeDao)

        allSchede = repository.allSchede
        selectedScheda = MutableLiveData()
    }


    fun addScheda(scheda: Scheda) = viewModelScope.launch{repository.addScheda(scheda)}

    fun deleteScheda(id: Int) = viewModelScope.launch {repository.deleteScheda(id)}

    fun getScheda(id: Int) : Scheda = repository.getScheda(id)

    fun selectScheda(id: Int){
        selectedScheda = MutableLiveData(repository.getScheda(id))
    }

    fun getSchedaGiornaliera(id: Int, numGiorno: Int) :ArrayList<Esercizio> = repository.getSchedaGiornaliera(id, numGiorno)






}