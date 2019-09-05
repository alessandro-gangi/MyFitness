package com.example.myfitness.data

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.myfitness.webService.ClientRetrofit
import com.example.myfitness.webService.UserRetrofit
import com.example.myfitness.webService.restService.UserRestService
import retrofit.Callback
import retrofit.Response

// FakeQuoteDao must be passed in - it is a dependency
// You could also instantiate the DAO right inside the class without all the fuss, right?
// No. This would break testability - you need to be able to pass a mock version of a DAO
// to the repository (e.g. one that upon calling getQuotes() returns a dummy list of quotes for testing)
// This is the core idea behind DEPENDENCY INJECTION - making things completely modular and independent.

class UtentiRepository (private val utentiDao: UtentiDao){


    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    val allUtenti: LiveData<List<Utente>> = utentiDao.getAllUtenti()


    // The suspend modifier tells the compiler that this must be called from a
    // coroutine or another suspend function.
    val classService = UserRestService::class.java

    fun addUtente(utente: Utente) {
        //utentiDao.addUtente(utente)

        ClientRetrofit.setService(classService).listUsers().also {
            it.enqueue(object : Callback<List<UserRetrofit>> {
                override fun onResponse(response: Response<List<UserRetrofit>>?) {
                    if (response!!.code() == 200) {
                        val response = response.body()!!

                        val stringBuilder = "Result: $response"

                        Log.d("UtenteRepository", stringBuilder)
                    }
                }

                override fun onFailure(t: Throwable?) {
                    Log.d("UtenteRepository", t!!.message)
                }

            })

        }
    }

    suspend fun deleteUtente(username: String) = utentiDao.deleteUtente(username)

    fun getUtente(username: String) = utentiDao.getUtente(username)

    fun getUtenti() = utentiDao.getAllUtenti()

}