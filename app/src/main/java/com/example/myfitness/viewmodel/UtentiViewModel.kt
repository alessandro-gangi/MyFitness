package com.example.myfitness.viewmodel

import android.app.Application
import android.content.ContentValues.TAG
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.core.net.toUri
import androidx.lifecycle.*
import com.example.myfitness.model.local.MyDatabase
import com.example.myfitness.model.UtentiRepository
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.model.webService.ClientRetrofit
import com.example.myfitness.model.webService.restService.UserRestService
import kotlinx.coroutines.launch
import retrofit2.http.Url
import java.io.File
import java.net.URL

@RequiresApi(Build.VERSION_CODES.O)
class UtentiViewModel (application: Application): AndroidViewModel(application){

    private val TAG = "UtentiViewModel"

    //TODO: test nuove funzionalità
    private val username: MutableLiveData<String> = MutableLiveData()

    val utente = Transformations.switchMap(username){ repository.observeUtente(it)}
    val allenatore = Transformations.switchMap(utente){ repository.observeAllenatore(it!!)}

    var utenteImage: Bitmap? = null
    var allenatoreImage: Bitmap? = null



    //var allAllenatori = Transformations.switchMap(username){ repository.observeAllenatori(it!!)}
    var allAllenatori = Transformations.switchMap(utente){ repository.observeAllenatori(it!!)}
    var app = application



    // Repo
    private val repository: UtentiRepository


    init {
        val utentiDao = MyDatabase.getDatabase(application).UtentiDao()
        val webService = ClientRetrofit.setService(UserRestService::class.java) as UserRestService
        repository = UtentiRepository(utentiDao, webService)
    }


    fun setUsername(username: String){
        this.username.value = username

        if(utente == null)
            viewModelScope.launch { repository.fetchUtente(username) }

        if (utente.value?.imageURI != null){
            val url = URL(utente.value!!.imageURI)
            utenteImage = BitmapFactory.decodeStream(url.openConnection().getInputStream())
        } else Log.d(TAG, "Utente.value = null")

        if(allenatore.value?.imageURI != null) {
            val url = URL(allenatore.value!!.imageURI)
            allenatoreImage = BitmapFactory.decodeStream(url.openConnection().getInputStream())
        } else Log.d(TAG, "Allenatore.value = null")
    }

    fun updateUtente(utente: Utente) = viewModelScope.launch {repository.updateUtente(utente)}

    fun addUtente(utente: Utente) = viewModelScope.launch{
        repository.addUtente(utente)
    }

    fun uploadImage(username: String, image: File) = repository.uploadImage(username, image)


    fun deleteUtente(username: String) = viewModelScope.launch {repository.deleteUtente(username)}

    fun getUtente(username: String) = repository.getUtente(username)

    fun login(usr: String, pwd: String): Boolean = repository.login(usr, pwd)


}