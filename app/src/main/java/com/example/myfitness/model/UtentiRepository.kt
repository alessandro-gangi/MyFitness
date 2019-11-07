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

    fun observeAllenatori(utente: Utente) = utentiDao.getObservableAllenatori((utente.usernameId))
    fun observeUtente(username: String): LiveData<Utente?> = utentiDao.getObservableUtente(username)
    fun observeAllenatore(utente: Utente): LiveData<Utente?> =
        utentiDao.getObservableUtente(utente.allenatore ?: "")


    fun addUtente(utente: Utente) {
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

    fun deleteUtente(token: String, username: String) {
        utentiDao.deleteUtente(username)

        webService.deleteUser(token, username)
            .enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d(TAG, response.body().toString())
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })
    }

    fun updateUtente(token: String, utente: Utente) {
        utentiDao.updateUtente(utente)

        webService.updateUserById(token, utente.usernameId, utente).also {
            it.enqueue(object : Callback<Utente> {
                override fun onResponse(call: Call<Utente>, response: Response<Utente>) {
                    Log.d(TAG, response.body().toString())
                }
                override fun onFailure(call: Call<Utente>, t: Throwable) {
                    Log.d(TAG, t.message ?: "")
                }
            })

        }
    }

    fun getUtente(token: String, username: String) :Utente?{
        var utente = utentiDao.getUtente(username)

        if(utente == null){
            val utenteServer = fetchUtente(token, username)
            if(utenteServer != null)
                utentiDao.addUtente(utenteServer)
            utente = utenteServer
        }

        return utente
    }


    fun fetchUtente(token: String, usernameId: String): Utente? {
        var utente: Utente? = null

        try {
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(policy)

            utente = webService.getUserById(token, usernameId).execute().body()

        }catch (e : IOException) {
            utente = null
            Log.d(TAG, e.message ?: "")
        }finally {
            return utente
        }
    }



    fun login(usr: String, pwd: String): String?{
        var token: String? = null
        try {
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(policy)

            token = webService.login(usr, pwd).execute().body()
        }catch (e : IOException) {
            Log.d(TAG, e.message ?: "" )
            token = null
        }
        finally {
            Log.d(TAG, "Token: $token")
            return token
        }
    }


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
            //uri = webService.retrieveUri(imagePart).execute().body().toString()

        }catch (e : IOException) {
            uri = null
            Log.d(TAG, e.message ?: "")
        }
        finally {
            return uri
        }
    }

}