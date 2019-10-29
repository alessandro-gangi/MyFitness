package com.example.myfitness.model

import android.os.StrictMode
import android.util.Log
import androidx.lifecycle.LiveData
import com.example.myfitness.model.dataClasses.Esercizio
import com.example.myfitness.model.dataClasses.Scheda
import com.example.myfitness.model.local.DataConverter
import com.example.myfitness.model.local.SchedeDao
import com.example.myfitness.model.webService.ClientRetrofit.gson
import com.example.myfitness.model.webService.restService.CardRestService
import com.example.myfitness.utilis.ConnectionChecker
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

class SchedeRepository(private val schedeDao: SchedeDao, private val webService: CardRestService) {

    private val TAG = "SchedeRepository"


    fun observeSchede(usernameId: String): LiveData<List<Scheda>?> = schedeDao.getUserSchede(usernameId)

    fun observeCurrentScheda(usernameId: String): LiveData<Scheda?> = schedeDao.getCurrentScheda(usernameId)

    fun observeRichiesteCompletate(usernameId: String): LiveData<List<Scheda>?> = schedeDao.getRichiesteCompletate(usernameId)

    //Aggiunge una nuova scheda
    fun addScheda(token: String, card: Scheda) :Int {
        val cardId = schedeDao.addScheda(card)

        card.schedaId = cardId.toInt()

        webService.addCard(token, card).also {
            it.enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d(TAG, response.body().toString())
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })
        }
        return cardId.toInt()
    }

    //Elimina la scheda con il determinato ID
    fun deleteScheda(token: String, cardId: Int) {
        schedeDao.deleteScheda(cardId)

        webService.deleteCard(token, cardId).enqueue(object : Callback<String> {
            override fun onResponse(call: Call<String>, response: Response<String>) {
                Log.d(TAG, response.body().toString())
            }

            override fun onFailure(call: Call<String>, t: Throwable) {
                Log.d(TAG, t.message!!)
            }
        })
    }

    //Aggiorna il contenuto di una scheda
    fun updateScheda(token: String, card: Scheda) {
        schedeDao.updateScheda(card)

        webService.updateCardById(token, card.schedaId, card).also {
            it.enqueue(object : Callback<Scheda?> {
                override fun onResponse(call: Call<Scheda?>, response: Response<Scheda?>) {
                    val userUpdate = response.body()
                    Log.d(TAG, userUpdate.toString())
                }

                override fun onFailure(call: Call<Scheda?>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })
        }
    }

    //Restituisce la scheda con il determinato ID
    fun getScheda(cardId: Int) = schedeDao.getScheda(cardId)

    //Imposta la scheda come "scheda corrente"
    fun setAsCurrentScheda(token: String, cardId: Int, usernameId: String) {
        schedeDao.removeCurrentScheda(usernameId)
        schedeDao.setAsCurrentScheda(cardId, usernameId)

        try {
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(policy)

            webService.removeCurrentCard(token, usernameId)

        }catch (e : IOException) {
            val msg = "setCurrentScheda(remove) ${e.message ?: ""}"
            Log.d(TAG, msg)
        }

        webService.setAsCurrentCard(token, usernameId, cardId).also {
            it.enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d(TAG, response.body().toString())
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    val msg = "setCurrentScheda(set) ${t.message ?: ""}"
                    Log.d(TAG, msg)
                }
            })
        }
    }

    //Deseleziona la scheda da "scheda corrente"
    fun removeCurrentScheda(token: String, usernameId: String) {
        schedeDao.removeCurrentScheda(usernameId)

        webService.removeCurrentCard(token, usernameId).also {
            it.enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d(TAG, response.body().toString())
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.d(TAG, t.message ?: "")
                }
            })
        }
    }

    //Recupera le schede dell'utente le inserisce nel db locale
    fun fetchSchedeUtente(token: String, usernameId: String){
        try {
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(policy)

            webService.getUserCards(token, usernameId).execute().body()?.map {
                    card -> schedeDao.addScheda(card)
            }
        }catch (e : IOException) {
            val msg = "fetchSchedeUtente ${e.message ?: ""}"
            Log.d(TAG, msg)
        }
    }

    //Recupera le schede completate dove username è autore ma non possessore e le inserisce nel db locale
    fun fetchRichiesteCompletate(token: String, usernameId: String){
        try {
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(policy)

            webService.getCompletedRequest(token, usernameId).execute().body()?.map {
                    card -> schedeDao.addScheda(card)
            }
        }catch (e : IOException) {
            val msg = "fetchRichiesteCompletate ${e.message ?: ""}"
            Log.d(TAG, msg)
        }
    }
}