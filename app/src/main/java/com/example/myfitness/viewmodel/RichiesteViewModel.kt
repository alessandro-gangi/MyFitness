package com.example.myfitness.viewmodel

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.*
import com.example.myfitness.model.local.MyDatabase
import com.example.myfitness.model.dataClasses.Richiesta
import com.example.myfitness.model.RichiesteRepository
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.model.webService.ClientRetrofit
import com.example.myfitness.model.webService.restService.RequestRestService
import kotlinx.coroutines.launch

class RichiesteViewModel (application: Application): AndroidViewModel(application){
    private val TAG = "RichiesteViewModel"
    private val USER_DATA_PREFERENCE: String = "USER_DATA_PREFERENCE"
    private val TOKEN_KEY = "TOKEN"

    private val username: MutableLiveData<String> = MutableLiveData()

    var richieste = Transformations.switchMap(username){ repository.observeRichieste(it)}

    // Repo
    private val repository: RichiesteRepository

    // Token
    private var token: String? = null


    init {
        val richiesteDao = MyDatabase.getDatabase(application).RichiesteDao()
        val webService = ClientRetrofit.setService(RequestRestService::class.java) as RequestRestService
        repository = RichiesteRepository(richiesteDao, webService)
        token = application.getSharedPreferences(USER_DATA_PREFERENCE, Context.MODE_PRIVATE)
            .getString(TOKEN_KEY, null)
    }


    fun setUsername(username: String){
        this.username.value = username
        Log.d(TAG, "Richieste-setUsername: username = $username, token = $token, richieste.isNull ${richieste==null}," +
                " richieste = ${richieste.value}")

        if(token != null)
            viewModelScope.launch {
                repository.fetchRichieste(token!!, username)
                Log.d(TAG, "Richieste-fetchRichieste")
            }
    }

    fun addRichiesta(richiesta: Richiesta) {
        if(token != null) viewModelScope.launch{repository.addRichiesta(token!!, richiesta)}
    }

    fun getRichiesta(id: Int) : Richiesta? = repository.getRichiesta(id)

    fun getRichiestaFromAtoB(a: Utente, b: Utente) :Richiesta? = repository.getRichiestaFromAtoB(a, b)

    fun deleteRichiesta(richiesta: Richiesta) {
        if(token != null) viewModelScope.launch {repository.deleteRichiesta(token!!, richiesta)}
    }

}