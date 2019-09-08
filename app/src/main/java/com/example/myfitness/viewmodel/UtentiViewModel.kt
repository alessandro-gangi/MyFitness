package com.example.myfitness.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.myfitness.model.local.MyDatabase
import com.example.myfitness.model.UtentiRepository
import com.example.myfitness.model.dataClasses.Utente
import kotlinx.coroutines.launch

class UtentiViewModel (application: Application): AndroidViewModel(application){

    //TODO: test nuove funzionalità
    private val username: MutableLiveData<String> = MutableLiveData()

    val utente = Transformations.switchMap(username){ repository.observeUtente(it)}

    // Repo
    private val repository: UtentiRepository


    init {
        val utentiDao = MyDatabase.getDatabase(application).UtentiDao()
        repository = UtentiRepository(utentiDao) //TODO:FRA -> questo diventerà UtentiRepository(utentiDao, webService)

    }


    fun setUsername(username: String){
        this.username.value = username

        // scarica i dati dal server e li salva nel db (per adesso la commento)
        /*
        viewModelScope.launch {
            repository.fetchUtente(username)
        }
        */
    }

    fun updateUtente(utente: Utente) = viewModelScope.launch {repository.updateUtente(utente)}

    fun addUtente(utente: Utente) = viewModelScope.launch{repository.addUtente(utente)}

    fun deleteUtente(username: String) = viewModelScope.launch {repository.deleteUtente(username)}

    fun getUtenti() = repository.getUtenti()

}