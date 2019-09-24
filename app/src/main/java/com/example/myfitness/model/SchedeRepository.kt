package com.example.myfitness.model

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

class SchedeRepository(private val schedeDao: SchedeDao, private val webService: CardRestService) {
    private val TAG = "SchedeRepository"


    fun addScheda(scheda: Scheda) {
        schedeDao.addScheda(scheda)
        webService.addCard(scheda).also {
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

    fun deleteScheda(id: Int) {
        schedeDao.deleteScheda(id)

        webService.deleteCard(id).enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d(TAG, response.body().toString())
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })
    }

    fun updateScheda(scheda: Scheda) {
        schedeDao.updateScheda(scheda)

        webService.updateCardById(scheda.schedaId, scheda).also {
            it.enqueue(object : Callback<Scheda> {
                override fun onResponse(call: Call<Scheda>, response: Response<Scheda>) {
                    val userUpdate = response.body()!!
                    Log.d(TAG, userUpdate.toString())
                }

                override fun onFailure(call: Call<Scheda>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })
        }


    }

    fun getScheda(id: Int): Scheda {
        return schedeDao.getScheda(id)
    }

    fun setAsCurrentScheda(idScheda: Int, username: String) {
        schedeDao.removeCurrentScheda(username)
        schedeDao.setAsCurrentScheda(idScheda, username)

        //TODO:FRA idem su base di dati esterna
    }

    fun removeCurrentScheda(username: String) {
        schedeDao.removeCurrentScheda(username)

        //TODO:FRA idem su base di dati esterna
    }

    fun getSchedaGiornaliera(id: Int, numGiorno: Int): ArrayList<Esercizio> {
        return getScheda(id).esercizi[numGiorno]
    }

    fun deleteAllUserSchede(username: String) {
        schedeDao.deleteAllUserSchede(username)

        //TODO:FRA idem su base di dati esterna
    }


    fun observeSchede(username: String): LiveData<List<Scheda>?> = schedeDao.getUserSchede(username)

    fun observeCurrentScheda(username: String): LiveData<Scheda?> =
        schedeDao.getCurrentScheda(username)

    fun observeRichiesteCompletate(username: String): LiveData<List<Scheda>?> =
        schedeDao.getRichiesteCompletate(username)

    fun fetchSchede(username: String) {
        //TODO:FRA In questo metodo devi pescare le schede dell'utente dalla base di dati esterna e metterlo in quella interna
        //una roba del genere..
        //schedeDao.addSchede(webService.getSchede(username)) dove webService.getSchede(username) ritorna una List<Scheda>
    }
}