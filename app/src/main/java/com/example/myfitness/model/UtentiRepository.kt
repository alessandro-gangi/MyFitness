package com.example.myfitness.model

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.model.local.UtentiDao
import com.example.myfitness.model.webService.restService.UserRestService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class UtentiRepository (private val utentiDao: UtentiDao, private val webService: UserRestService){
    val TAG = "UtentiRepository"


    fun observeAllenatori(username: String) = utentiDao.getObservableAllenatori((username))

    //Serve a fornire i dati sempre aggiornati dell'utente dell'app
    fun observeUtente(username: String): LiveData<Utente?> = utentiDao.getObservableUtente(username)

    fun observeAllenatore(utente: Utente): LiveData<Utente?> = utentiDao.getObservableUtente(utente.allenatore ?: "")



    fun addUtente(utente: Utente) {
        utentiDao.addUtente(utente)

        return //TODO: blocco la parte server finchè non viene sistemato il campo uri a String

        webService.addUser(utente).also {
            it.enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d(TAG, response.body()!!.toString())
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.d(TAG, t.message!!)
                }
            })
        }
    }

    fun deleteUtente(username: String) {
        utentiDao.deleteUtente(username)

        return //TODO: blocco la parte server finchè non viene sistemato il campo uri a String

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

        return //TODO: blocco la parte server finchè non viene sistemato il campo uri a String

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

    fun getUtente(username: String) :Utente?{
        var utente = utentiDao.getUtente(username)
        /*
        if(utente == null){//TODO: se non trova niente deve fare la fetch dalla base di dati esterna e riprovare
            fetchUtente(username)
            utente = utentiDao.getUtente(username)
        }
        */
        return utente
    }


    fun getUtenti() = utentiDao.getObservableUtenti()


    fun getUtentiServer() {
        //per il momento mostra gli utenti solamente tramite Log
        webService.listUsers().enqueue(object : Callback<List<Utente>> {

            override fun onResponse(call: Call<List<Utente>>, response: Response<List<Utente>>) {
                val userList = response.body()!!.toMutableList()

                for (i in userList.indices)
                    Log.d(TAG, userList[i].toString())
            }

            override fun onFailure(call: Call<List<Utente>>, t: Throwable) {
                Log.d(TAG, t.message!!)
            }
        })
    }

    fun fetchUtente(usernameId: String) {
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
    }

    fun login(usr: String, pwd: String): Boolean{
        var response = true
        //TODO:FRA QUESTO METODO DEVE AGIRE SOLO SULLA BASE DI DATI ESTERNA
        //  e deve restituire true se i dati del login sono corretti e false altrimenti
        // (per adesso facciamo il controllo così senza token, poi vedremo)

        return response
    }


}