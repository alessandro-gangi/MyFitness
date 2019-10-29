package com.example.myfitness.model

import android.util.JsonToken
import android.util.Log
import androidx.lifecycle.LiveData
import com.example.myfitness.model.dataClasses.Richiesta
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.model.local.RichiesteDao
import com.example.myfitness.model.local.UtentiDao
import com.example.myfitness.model.webService.restService.RequestRestService
import com.example.myfitness.model.webService.restService.UserRestService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RichiesteRepository (private val richiesteDao: RichiesteDao, private val webService: RequestRestService){

    val TAG = "RichiesteRepository"


    fun observeRichieste(username: String): LiveData<List<Richiesta>?> = richiesteDao.getObservableRichieste(username)

    fun addRichiesta(token: String, request: Richiesta) {
        var requestId = richiesteDao.addRichiesta(request)
        request.richiestaId = requestId.toInt()

        webService.addRequest(token, request).also {
            it.enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d(TAG, "AddRichiesta: ${response.body()}")
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })
        }
    }

    //Bisogna farla anche per il server???
    fun getRichiestaFromAtoB(a: Utente, b: Utente): Richiesta? = richiesteDao.getRichiestaFromAtoB(a.usernameId, b.usernameId)

    fun getRichiesta(richiestaID: Int) = richiesteDao.getRichiesta(richiestaID)

    fun deleteRichiesta(token: String, request: Richiesta) {
        richiesteDao.deleteRichiesta(request)

        webService.deleteRequestById(token, request.richiestaId).enqueue(object : Callback<String> {
            override fun onResponse(call: Call<String>, response: Response<String>) {
                Log.d(TAG, "DeleteRichiesta: ${response.body()}")
            }

            override fun onFailure(call: Call<String>, t: Throwable) {
                Log.d(TAG, t.message!!)
            }
        })
    }

    //Recupero tutte le richieste per l'allenatore e per ogni richiesta faccio addRichiesta per il database in locale
    fun fetchRichieste(token: String, usernameId: String) {

        webService.getTrainerRequests(token, usernameId).also {
            it.enqueue(object : Callback<List<Richiesta?>> {
                override fun onResponse(call: Call<List<Richiesta?>>, response: Response<List<Richiesta?>>) {
                    response.body()?.map {
                        request -> richiesteDao.addRichiesta(request!!)
                        Log.d(TAG, "FetchRichieste: $request")
                    }
                }
                override fun onFailure(call: Call<List<Richiesta?>>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })

        }
    }



}