package com.example.myfitness.viewmodel

import android.app.Application
import android.content.ContentValues.TAG
import android.content.Context
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.core.net.toUri
import androidx.lifecycle.*
import com.bumptech.glide.Glide
import com.example.myfitness.model.local.MyDatabase
import com.example.myfitness.model.UtentiRepository
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.model.webService.ClientRetrofit
import com.example.myfitness.model.webService.restService.UserRestService
import kotlinx.coroutines.launch
import retrofit2.http.Url
import java.io.File
import java.net.URL
import com.bumptech.glide.request.target.SimpleTarget



class UtentiViewModel (application: Application): AndroidViewModel(application){
    private val TAG = "UtentiViewModel"
    private val USER_DATA_PREFERENCE: String = "USER_DATA_PREFERENCE"
    private val TOKEN_KEY = "TOKEN"

    private val username: MutableLiveData<String> = MutableLiveData()
    val utente = Transformations.switchMap(username){ repository.observeUtente(it)}
    val allenatore = Transformations.switchMap(utente){ repository.observeAllenatore(it!!)}

    var utenteImage: Drawable? = null
    var allenatoreImage: Drawable? = null


    var allAllenatori = Transformations.switchMap(utente){ repository.observeAllenatori(it!!)}

    // Token
    private var token: String? = null

    // Repo
    private val repository: UtentiRepository


    init {
        val utentiDao = MyDatabase.getDatabase(application).UtentiDao()
        val webService = ClientRetrofit.setService(UserRestService::class.java) as UserRestService
        repository = UtentiRepository(utentiDao, webService)
        token = application.getSharedPreferences(USER_DATA_PREFERENCE, Context.MODE_PRIVATE)
            .getString(TOKEN_KEY, null)

    }


    fun setUsername(username: String){
        this.username.value = username
        if(utente == null && token != null)
            viewModelScope.launch { repository.fetchUtente(token!!, username) }
        if(utente != null)
            viewModelScope.launch {initImageUtente()}

        if (allenatore != null)
            viewModelScope.launch {initImageAllenatore()}
    }

    fun initImageUtente() {
        if (utente.value?.imageURI != null && utenteImage == null && token != null) {
            val url = URL(utente.value!!.imageURI)
            val conn = url.openConnection()
            conn.setRequestProperty("Authorization", token)
            try {
                utenteImage = BitmapDrawable(
                    Resources.getSystem(),
                    BitmapFactory.decodeStream(conn.getInputStream())
                )
            } catch (e: Exception) {
                utenteImage = null
            }
        }
    }

    fun initImageAllenatore() {
        if (allenatore.value?.imageURI != null && allenatoreImage == null && token != null) {
            val url = URL(utente.value!!.imageURI)
            val conn = url.openConnection()
            conn.setRequestProperty("Authorization", token)
            try {
                allenatoreImage = BitmapDrawable(
                    Resources.getSystem(),
                    BitmapFactory.decodeStream(conn.getInputStream())
                )
            } catch (e: Exception) {
                allenatoreImage = null
            }
        }
    }

    fun setImageUtente(imageURL: String) {
        utente.value?.imageURI = imageURL
        viewModelScope.launch {
            updateUtente(utente.value!!)
            if(token != null) {
                val url = URL(imageURL)
                val conn = url.openConnection()
                conn.setRequestProperty("Authorization", token)
                utenteImage = BitmapDrawable(
                    Resources.getSystem(),
                    BitmapFactory.decodeStream(conn.getInputStream())
                )
            }
        }
    }

    fun setImageAllenatore(imageURL: String) {
        allenatore.value?.imageURI = imageURL
        viewModelScope.launch {
            if(token != null) {
                val url = URL(imageURL)
                val conn = url.openConnection()
                conn.setRequestProperty("Authorization", token)
                allenatoreImage = BitmapDrawable(
                    Resources.getSystem(),
                    BitmapFactory.decodeStream(conn.getInputStream())
                )
            }
        }
    }

    fun setToken(token: String) {
        this.token = token
    }

    fun getToken() :String? = token

    fun updateUtente(utente: Utente) =
        viewModelScope.launch {if(token != null)repository.updateUtente(token!!, utente)}

    fun addUtente(utente: Utente) = viewModelScope.launch { repository.addUtente(utente) }

    fun uploadImage(username: String, image: File) :String?{
        if (token != null)
                return repository.uploadImage(token!!, username, image)
        return null
    }

    fun getUtente(username: String) :Utente?{
        if(token != null)
            return repository.getUtente(token!!, username)
        return null
    }

    //fun login(usr: String, pwd: String): Boolean = repository.login(usr, pwd)
    fun login(usr: String, pwd: String): String? = repository.login(usr, pwd)

    fun deleteUtente(token: String, username: String) =
        viewModelScope.launch { repository.deleteUtente(token, username) }


}