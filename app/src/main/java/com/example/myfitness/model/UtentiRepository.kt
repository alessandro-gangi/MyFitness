package com.example.myfitness.model

import android.app.Application
import android.os.Build
import android.os.StrictMode
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.model.local.UtentiDao
import com.example.myfitness.model.webService.restService.UserRestService
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.net.URI
import kotlin.random.Random


class UtentiRepository (private val utentiDao: UtentiDao, private val webService: UserRestService){

    val TAG = "UtentiRepository"
    var utenteTmp: Utente? = null


    fun observeAllenatori(utente: Utente) = utentiDao.getObservableAllenatori((utente.usernameId))

    //Serve a fornire i dati sempre aggiornati dell'utente dell'app
    fun observeUtente(username: String): LiveData<Utente?> = utentiDao.getObservableUtente(username)

    fun observeAllenatore(utente: Utente): LiveData<Utente?> = utentiDao.getObservableUtente(utente.allenatore ?: "")

    fun addUtente(utente: Utente) {

        //TODO: In teoria basta aggiungere l'utente solo sul server
        // perchè poi viene fatta dopo la fetch sulla base di dati locale

        utentiDao.addUtente(utente)
        webService.addUser(utente).also {
            it.enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d(TAG, response.body().toString())
                }
                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })
        }
    }

    fun deleteUtente(username: String) {

        //TODO: In teoria basta eliminare l'utente solo dal server

        utentiDao.deleteUtente(username)

        webService.deleteUser(username)
            .enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d(TAG, response.body().toString())
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })
    }

    fun updateUtente(utente: Utente) {
        utentiDao.updateUtente(utente)

        webService.updateUserById(utente.usernameId, utente).also {
            it.enqueue(object : Callback<Utente> {
                override fun onResponse(call: Call<Utente>, response: Response<Utente>) {
                    val userUpdate = response.body()!!
                    Log.d(TAG, userUpdate.toString())
                }

                override fun onFailure(call: Call<Utente>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })

        }
    }

    @RequiresApi(Build.VERSION_CODES.GINGERBREAD)
    fun getUtente(username: String) :Utente?{
        var utente = utentiDao.getUtente(username)

        if(utente == null){
            val utenteServer = fetchUtente(username)
            if(utenteServer != null)
                utentiDao.addUtente(utenteServer)
            utente = utenteServer
        }

        return utente
    }

    fun getUtenti() = utentiDao.getObservableUtenti()

    @RequiresApi(Build.VERSION_CODES.GINGERBREAD)
    fun getUtentiServer(): List<Utente>? {

        try {
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()

            StrictMode.setThreadPolicy(policy)
            return webService.listUsers().execute().body()

        } catch (e: IOException) {
            Log.d(TAG, e.message)
        }
        return null
    }

    @RequiresApi(Build.VERSION_CODES.GINGERBREAD)
    fun fetchUtente(usernameId: String): Utente? {
        var utente: Utente? = null

        try {
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()

            StrictMode.setThreadPolicy(policy)
            return webService.getUserById(usernameId).execute().body()

        }catch (e : IOException) {
            Log.d(TAG, e.message )

        }

        return utente
    }

    @RequiresApi(Build.VERSION_CODES.GINGERBREAD)
    fun login(usr: String, pwd: String): Boolean{
        var response = false

        try {
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()

            StrictMode.setThreadPolicy(policy)
            var utente = webService.getUserById(usr).execute().body()

            if(utente != null && pwd == utente.password)
                response = true

            if(!response)
                Log.d(TAG, "accesso negato")

        }catch (e : IOException) {
            Log.d(TAG, e.message )
        }

        return response
    }


    @RequiresApi(Build.VERSION_CODES.GINGERBREAD)
    fun uploadImage(username: String, image: File): String? {

        var uri: String? = null

        val imagePart = MultipartBody.Part.createFormData(
            "file",
            "$username.jpg",
            RequestBody.create(MediaType.parse("/*"), image)
        )

        try {
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()

            StrictMode.setThreadPolicy(policy)
            uri = webService.retrieveUri(imagePart).execute().body().toString()

            Log.d("URI", uri)

        }catch (e : IOException) {
            Log.d(TAG, e.message )
        }

        return uri

    }



}