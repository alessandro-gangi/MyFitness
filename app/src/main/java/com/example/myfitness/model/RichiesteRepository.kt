package com.example.myfitness.model

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.myfitness.model.dataClasses.Richiesta
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.model.local.RichiesteDao
import com.example.myfitness.model.local.UtentiDao
import com.example.myfitness.model.webService.restService.UserRestService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

//TODO: finche non c'è il web serv. uso quello classe senza repo
//class RichiesteRepository (private val richiesteDao: RichiesteDao, private val webService: UserRestService){

class RichiesteRepository (private val richiesteDao: RichiesteDao){
    val TAG = "RichiesteRepository"


    fun observeRichieste(username: String): LiveData<List<Richiesta>> = richiesteDao.getObservableRichieste(username)

    fun addRichiesta(richiesta: Richiesta) {
        richiesteDao.addRichiesta(richiesta)

        return //TODO: blocco la parte sotto finche non è pronto il web serv.

        /*
        webService.addUser(utente).also {
            it.enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d(TAG, response.body()!!.toString())
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })
        }*/
    }

    fun deleteRichiesta(richiesta: Richiesta) {
        richiesteDao.deleteRichiesta(richiesta)

        return //TODO: blocco la parte sotto finche non è pronto il web serv.

        /*

        webService.deleteUser(username)
            .enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d(TAG, response.body().toString())
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })

         */
    }


    fun fetchRichieste(usernameId: String) {
        //TODO:FRA fetch richieste dal server per metterle in locale (le richieste dell'allenatore "usernameID"
        // se ti serve poi ri faccio passare l'intero oggetto utente
        /*
        webService.getUserById(usernameId).also {
            it.enqueue(object : Callback<Utente> {
                override fun onResponse(call: Call<Utente>, response: Response<Utente>) {
                    val user = response.body()

                    utentiDao.addUtente(user!!)

                    Log.d(TAG, user.toString())
                }

                override fun onFailure(call: Call<Utente>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })

        }

         */
    }


}