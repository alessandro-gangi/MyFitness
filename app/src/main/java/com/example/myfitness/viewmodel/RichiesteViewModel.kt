package com.example.myfitness.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.myfitness.model.local.MyDatabase
import com.example.myfitness.model.dataClasses.Richiesta
import com.example.myfitness.model.RichiesteRepository
import kotlinx.coroutines.launch

class RichiesteViewModel (application: Application): AndroidViewModel(application){

    //TODO: test nuove funzionalità
    private val username: MutableLiveData<String> = MutableLiveData()


    var richieste = Transformations.switchMap(username){ repository.observeRichieste(it)}



    // Repo
    private val repository: RichiesteRepository


    init {
        val richiesteDao = MyDatabase.getDatabase(application).RichiesteDao()
        //val webService = ClientRetrofit.setService(UserRestService::class.java) //TODO:FRA roba tua
        //repository = RichiesteRepository(richiesteDao, webService) //TODO: finche non c'è il web serv. uso quello sotto
        repository = RichiesteRepository(richiesteDao)

    }


    fun setUsername(username: String){
        this.username.value = username

        if(richieste == null)
            viewModelScope.launch {
                repository.fetchRichieste(username)
            }
    }

    //fun updateUtente(utente: Utente) = viewModelScope.launch {repository.updateUtente(utente)}

    fun addRichiesta(richiesta: Richiesta) = viewModelScope.launch{repository.addRichiesta(richiesta)}

    fun deleteRichiesta(richiesta: Richiesta) = viewModelScope.launch {repository.deleteRichiesta(richiesta)}

}