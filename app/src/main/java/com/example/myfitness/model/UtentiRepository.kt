package com.example.myfitness.model

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.model.local.UtentiDao
import com.example.myfitness.webService.restService.UserRestService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class UtentiRepository (private val utentiDao: UtentiDao, private val webService: UserRestService){
    val TAG = "UtentiRepository"

    val allAllenatori = utentiDao.getObservableAllenatori()


    //Serve a fornire i dati sempre aggiornati dell'utente dell'app
    fun observeUtente(username: String): LiveData<Utente?> = utentiDao.getObservableUtente(username)

    fun observeAllenatore(username: String): LiveData<Utente?> {
        val utente = utentiDao.getUtente(username)
        return utentiDao.getObservableUtente(utente?.allenatore ?: "")
    }


    fun addUtente(utente: Utente) {
        utentiDao.addUtente(utente)


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

    suspend fun deleteUtente(username: String) {
        utentiDao.deleteUtente(username)

        webService.deleteUser(username)
            .enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d("deleteUserServer: ", response.body().toString())
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.d("deleteUserServer: ", t.message!!)
                }
            })
    }

    suspend fun updateUtente(utente: Utente) {
        utentiDao.updateUtente(utente)

        webService.updateUserById(utente.usernameId, utente).also {
            it.enqueue(object : Callback<Utente> {
                override fun onResponse(call: Call<Utente>, response: Response<Utente>) {
                    val userUpdate = response.body()!!
                    Log.d("updateUserByIdServer", userUpdate.toString())
                }

                override fun onFailure(call: Call<Utente>, t: Throwable) {
                    Log.d("updateUserByIdServer", t.message!!)
                }
            })

        }
    }

    fun getUtente(username: String) = utentiDao.getUtente(username)

    fun getUtenti() = utentiDao.getObservableUtenti()


    fun getUtentiServer() {
        //per il momento mostra gli utenti solamente tramite Log
        webService.listUsers().enqueue(object : Callback<List<Utente>> {

            override fun onResponse(call: Call<List<Utente>>, response: Response<List<Utente>>) {
                val userList = response.body()!!.toMutableList()

                for (i in userList.indices)
                    Log.d("listUsersServer", userList[i].toString())
            }

            override fun onFailure(call: Call<List<Utente>>, t: Throwable) {
                Log.d("listUsersServer", t.message!!)
            }
        })
    }

    suspend fun fetchUtente(usernameId: String) {
        webService.getUserById(usernameId).also {
            it.enqueue(object : Callback<Utente> {
                override fun onResponse(call: Call<Utente>, response: Response<Utente>) {
                    val user = response.body()!!

                    utentiDao.addUtente(user)

                    Log.d("fetchUtente", user.toString())
                }

                override fun onFailure(call: Call<Utente>, t: Throwable) {
                    Log.d("fetchUtente", t.message!!)
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