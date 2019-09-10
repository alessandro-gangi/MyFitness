package com.example.myfitness.model

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.model.local.UtentiDao
import com.example.myfitness.webService.User
import com.example.myfitness.webService.restService.UserRestService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class UtentiRepository(private val utentiDao: UtentiDao, private val webService: UserRestService) {

    fun observeUtente(username: String): LiveData<Utente?> = utentiDao.getUtente(username)

    fun addUtente(utente: Utente) {
        //utentiDao.addUtente(utente)

        //E' provvisorio finchè non sistemiamo le classi dei dati
        val testUtent = User(
            utente.username, utente.mail, utente.password,
            utente.isAllenatore, utente.nome, utente.cognome, utente.eta,
            utente.descrizione, utente.imageURI, utente.peso, utente.altezza,
            utente.genere, utente.allenatore, utente.idScheda.toString()
        )

        webService.addUser(testUtent).also {
            it.enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d("addUserServer", response.body()!!.toString())
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.d("addUserServer", t!!.message)
                }
            })
        }
    }

    fun deleteUtente(username: String) {
        //utentiDao.deleteUtente(username)

        webService.deleteUser(username)
            .enqueue(object : Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    Log.d("deleteUserServer: ", response.body().toString())
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    Log.d("deleteUserServer: ", t.message)
                }
            })
    }

    fun updateUtente(utente: Utente) {
        //utentiDao.updateUtente(utente)

        //Provvisorio come sopra
        val testUtent = User(
            utente.username, "belllaaaa", utente.password,
            utente.isAllenatore, utente.nome, utente.cognome, utente.eta,
            utente.descrizione, utente.imageURI, utente.peso, utente.altezza,
            utente.genere, utente.allenatore, utente.idScheda.toString()
        )

        webService.updateUserById(utente.username, testUtent).also {
            it.enqueue(object : Callback<User> {
                override fun onResponse(call: Call<User>, response: Response<User>) {
                    val userUpdate = response.body()!!
                    Log.d("updateUserByIdServer", userUpdate.toString())
                }

                override fun onFailure(call: Call<User>, t: Throwable) {
                    Log.d("updateUserByIdServer", t!!.message)
                }
            })

        }
    }

    fun getUtenti() = utentiDao.getUtenti()

    fun getUtentiServer() {

        //per il momento mostra gli utenti solamente tramite Log
        webService.listUsers().enqueue(object : Callback<List<User>> {

            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                val userList = response.body()!!.toMutableList()

                for (i in userList!!.indices)
                    Log.d("listUsersServer", userList[i].toString())
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                Log.d("listUsersServer", t!!.message)
            }
        })
    }

    suspend fun fetchUtente(username: String) {
        webService.getUserById(username).also {
            it.enqueue(object : Callback<User> {
                override fun onResponse(call: Call<User>, response: Response<User>) {
                    val user = response.body()!!

                    //Provvisorio come sopra per i dati
                    var userServer = Utente(
                        user.usernameId, user.mail!!, user.password!!,
                        user.flagAllenatore, user.nome!!, user.cognome!!, user.eta,
                        user.descrizione, user.imageURI, user.peso, user.altezza,
                        user.genere!!, user.allenatore, user.idScheda!!.toInt()
                    )

                    utentiDao.addUtente(userServer)

                    Log.d("fetchUtente", user.toString())
                }

                override fun onFailure(call: Call<User>, t: Throwable) {
                    Log.d("fetchUtente", t!!.message)
                }
            })

        }
    }
}
