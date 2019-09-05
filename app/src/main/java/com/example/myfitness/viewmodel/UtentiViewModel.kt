package com.example.myfitness.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.myfitness.data.MyDatabase
import com.example.myfitness.data.UtentiRepository
import com.example.myfitness.data.Utente
import kotlinx.coroutines.launch

// QuoteRepository dependency will again be passed in the
// constructor using dependency injection

class UtentiViewModel (application: Application): AndroidViewModel(application){

    // The ViewModel maintains a reference to the repository to get data.
    private val repository: UtentiRepository
    // LiveData gives us updated words when they change.
    val allUtenti: LiveData<List<Utente>>

    init {
        // Gets reference to WordDao from WordRoomDatabase to construct
        // the correct WordRepository.
        val utentiDao = MyDatabase.getDatabase(application).UtentiDao()
        repository = UtentiRepository(utentiDao)
        allUtenti = repository.allUtenti
    }



    fun addUtente(utente: Utente) = viewModelScope.launch{repository.addUtente(utente)}

    fun deleteUtente(username: String) = viewModelScope.launch {repository.deleteUtente(username)}

    fun getUtente(username: String) = repository.getUtente(username)

    fun getUtenti() = repository.getUtenti()

}