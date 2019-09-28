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
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

class SchedeRepository(private val schedeDao: SchedeDao, private val webService: CardRestService) {

    private val TAG = "SchedeRepository"


    fun observeSchede(usernameId: String): LiveData<List<Scheda>?> = schedeDao.getUserSchede(usernameId)

    fun observeCurrentScheda(usernameId: String): LiveData<Scheda?> = schedeDao.getCurrentScheda(usernameId)

    fun observeRichiesteCompletate(usernameId: String): LiveData<List<Scheda>?> = schedeDao.getRichiesteCompletate(usernameId)

    fun addScheda(card: Scheda) {
        val cardId = schedeDao.addScheda(card)
        card.schedaId = cardId.toInt()

        webService.addCard(card).also {
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

    fun deleteScheda(cardId: Int) {
        schedeDao.deleteScheda(cardId)

        webService.deleteCard(cardId).enqueue(object : Callback<String> {
            override fun onResponse(call: Call<String>, response: Response<String>) {
                Log.d(TAG, response.body().toString())
            }

            override fun onFailure(call: Call<String>, t: Throwable) {
                Log.d(TAG, t.message!!)
            }
        })
    }

    fun updateScheda(card: Scheda) {
        schedeDao.updateScheda(card)

        webService.updateCardById(card.schedaId, card).also {
            it.enqueue(object : Callback<Scheda?> {
                override fun onResponse(call: Call<Scheda?>, response: Response<Scheda?>) {
                    val userUpdate = response.body()!!
                    Log.d(TAG, userUpdate.toString())
                }

                override fun onFailure(call: Call<Scheda?>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })
        }
    }

    fun getScheda(cardId: Int) = schedeDao.getScheda(cardId)

    fun getCardServer(cardId: Int): Scheda? {
        var card: Scheda? = null

        try {
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(policy)

            card =  webService.getCardById(cardId).execute().body()

        }catch (e : IOException) {
            Log.d(TAG, e.message )
        }

        return card

    }

    fun setAsCurrentScheda(cardId: Int, usernameId: String) {
        schedeDao.removeCurrentScheda(usernameId)
        schedeDao.setAsCurrentScheda(cardId, usernameId)

        try {
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(policy)

            webService.removeCurrentCard(usernameId)

        }catch (e : IOException) {
            Log.d(TAG, e.message )
        }

        webService.setAsCurrentCard(usernameId, cardId).also {
            it.enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d(TAG, response.body()!!)
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })
        }
    }

    fun removeCurrentScheda(usernameId: String) {
        schedeDao.removeCurrentScheda(usernameId)

        webService.removeCurrentCard(usernameId).also {
            it.enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d(TAG, response.body()!!)
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })
        }
    }

    fun getSchedaGiornaliera(id: Int, numGiorno: Int): ArrayList<Esercizio> {
        return getScheda(id).esercizi[numGiorno]
    }

    fun deleteAllUserSchede(usernameId: String) {
        schedeDao.deleteAllUserSchede(usernameId)

        webService.deleteAllUserCards(usernameId).also {
            it.enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d(TAG, response.body()!!)
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })
        }
    }

    fun fetchSchedeUtente(usernameId: String){
        try {
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(policy)

            webService.getUserCards(usernameId).execute().body()?.map {
                    card -> schedeDao.addScheda(card)
            }
        }catch (e : IOException) {
            Log.d(TAG, e.message )
        }
    }

    //Recupera le schede completate dove username è autore ma non possessore e le inserisce nel db locale
    fun fetchRichiesteCompletate(usernameId: String){
        try {
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(policy)

            webService.getCompletedRequest(usernameId).execute().body()?.map {
                    card -> schedeDao.addScheda(card)
            }
        }catch (e : IOException) {
            Log.d(TAG, e.message )
        }

        
    }
}