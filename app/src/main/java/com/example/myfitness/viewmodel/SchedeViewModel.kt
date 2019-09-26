package com.example.myfitness.viewmodel

import android.app.Application
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

    private val username: MutableLiveData<String> = MutableLiveData()

    val schedeUtente = Transformations.switchMap(username){ repository.observeSchede(it)}
    val currentSchedaUtente = Transformations.switchMap(username){ repository.observeCurrentScheda(it)}

    // Rappresentano le schede che un utente (allenatore) ha fatto ad altre persone
    val richiesteCompletate = Transformations.switchMap(username){ repository.observeRichiesteCompletate(it)}

    // Repo
    private val repository: SchedeRepository


    init {
        val schedeDao = MyDatabase.getDatabase(application).SchedeDao()
        val webService = ClientRetrofit.setService(CardRestService::class.java) as CardRestService
        repository = SchedeRepository(schedeDao, webService)
    }


    fun setUsername(username: String){
        this.username.value = username

        // scarica i dati dal server e li salva nel db (per adesso la commento)
        if(schedeUtente == null || currentSchedaUtente == null)
            viewModelScope.launch { repository.fetchSchedeUtente(username)}

        if(richiesteCompletate == null)
            viewModelScope.launch { repository.fetchRichiesteCompletate(username)}


    }


    fun addScheda(scheda: Scheda) = viewModelScope.launch{repository.addScheda(scheda)}

    fun updateScheda(scheda: Scheda) = viewModelScope.launch{repository.updateScheda(scheda)}

    fun deleteScheda(id: Int) = viewModelScope.launch {repository.deleteScheda(id)}

    fun getScheda(id: Int) : Scheda = repository.getScheda(id)

    fun setAsCurrentScheda(idScheda: Int) = viewModelScope.launch {repository.setAsCurrentScheda(idScheda, username.value!!)}

    fun removeCurrentScheda() = viewModelScope.launch { repository.removeCurrentScheda(username.value!!) }

    fun getSchedaGiornaliera(id: Int, numGiorno: Int) :ArrayList<Esercizio> = repository.getSchedaGiornaliera(id, numGiorno)

    fun deleteAllUserSchede() = viewModelScope.launch { repository.deleteAllUserSchede(username.value!!) }




}