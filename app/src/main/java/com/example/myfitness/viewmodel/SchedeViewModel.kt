package com.example.myfitness.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.*
import com.example.myfitness.model.SchedeRepository
import com.example.myfitness.model.dataClasses.Esercizio
import com.example.myfitness.model.dataClasses.Scheda
import com.example.myfitness.model.local.MyDatabase
import com.example.myfitness.model.webService.ClientRetrofit
import com.example.myfitness.model.webService.restService.CardRestService
import kotlinx.coroutines.launch


open class SchedeViewModel (application: Application): AndroidViewModel(application){
    private val TAG = "SchedeViewModel"
    private val USER_DATA_PREFERENCE: String = "USER_DATA_PREFERENCE"
    private val TOKEN_KEY = "TOKEN"

    private val username: MutableLiveData<String> = MutableLiveData()

    val schedeUtente = Transformations.switchMap(username){ repository.observeSchede(it)}
    val currentSchedaUtente = Transformations.switchMap(username){ repository.observeCurrentScheda(it)}

    // Rappresentano le schede che un utente (allenatore) ha fatto ad altre persone
    val richiesteCompletate = Transformations.switchMap(username){ repository.observeRichiesteCompletate(it)}

    // Repo
    private val repository: SchedeRepository

    // Token
    private var token: String? = null


    init {
        val schedeDao = MyDatabase.getDatabase(application).SchedeDao()
        val webService = ClientRetrofit.setService(CardRestService::class.java) as CardRestService
        repository = SchedeRepository(schedeDao, webService)
        token = application.getSharedPreferences(USER_DATA_PREFERENCE, Context.MODE_PRIVATE)
            .getString(TOKEN_KEY, null)
    }


    fun setUsername(username: String){
        this.username.value = username

        if(token != null) {
            viewModelScope.launch { repository.fetchSchedeUtente(token!!, username) }
            viewModelScope.launch { repository.fetchRichiesteCompletate(token!!, username) }
        }
    }


    fun addScheda(scheda: Scheda) :Int?{
        if(token != null) viewModelScope.launch{repository.addScheda(token!!, scheda)}
        return null
    }
    //fun addScheda(scheda: Scheda)= repository.addScheda(scheda)

    fun updateScheda(scheda: Scheda){
        if(token != null) viewModelScope.launch{repository.updateScheda(token!!, scheda)}
    }

    fun deleteScheda(id: Int){
        if(token != null)viewModelScope.launch {repository.deleteScheda(token!!, id)}
    }

    fun getScheda(id: Int) : Scheda?{
        if(token != null) return repository.getScheda(id)
        return null
    }

    fun setAsCurrentScheda(idScheda: Int){
        if(token != null)
            viewModelScope.launch {repository.setAsCurrentScheda(token!!, idScheda, username.value!!)}
    }

    fun removeCurrentScheda(){
        if(token != null && username.value != null)
            viewModelScope.launch { repository.removeCurrentScheda(token!!, username.value!!) }
    }


}