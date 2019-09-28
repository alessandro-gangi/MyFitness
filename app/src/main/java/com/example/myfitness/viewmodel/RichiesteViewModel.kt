package com.example.myfitness.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.myfitness.model.local.MyDatabase
import com.example.myfitness.model.dataClasses.Richiesta
import com.example.myfitness.model.RichiesteRepository
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.model.webService.ClientRetrofit
import com.example.myfitness.model.webService.restService.RequestRestService
import kotlinx.coroutines.launch

class RichiesteViewModel (application: Application): AndroidViewModel(application){

    private val username: MutableLiveData<String> = MutableLiveData()

    var richieste = Transformations.switchMap(username){ repository.observeRichieste(it)}

    // Repo
    private val repository: RichiesteRepository


    init {
        val richiesteDao = MyDatabase.getDatabase(application).RichiesteDao()
        val webService = ClientRetrofit.setService(RequestRestService::class.java) as RequestRestService
        repository = RichiesteRepository(richiesteDao, webService)
    }


    fun setUsername(username: String){
        this.username.value = username

        if(richieste == null)
            viewModelScope.launch {
                repository.fetchRichieste(username)
            }
    }

    fun addRichiesta(richiesta: Richiesta) = viewModelScope.launch{repository.addRichiesta(richiesta)}

    fun getRichiestaFromAtoB(a: Utente, b: Utente) :Richiesta? = repository.getRichiestaFromAtoB(a, b)

    fun deleteRichiesta(richiesta: Richiesta) = viewModelScope.launch {repository.deleteRichiesta(richiesta)}

}