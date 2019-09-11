package com.example.myfitness.model

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.model.local.UtentiDao
import com.example.myfitness.webService.restService.UserRestService


class UtentiRepository (private val utentiDao: UtentiDao){

    //TODO:FRA Allora dovremmo passare al costruttore della Repository anche il webService (oltre che il DAO).
    // Dovrebbe venire una roba del genere:
    // class UtentiRepository (private val utentiDao: UtentiDao, private val webService: webService){
    // --> in questo modo chiamiamo poi i metodi facendo webService.addUtente(utente)  (ad esempio..)


    val classService = UserRestService::class.java

    val allAllenatori = utentiDao.getObservableAllenatori()


    //Serve a fornire i dati sempre aggiornati dell'utente dell'app
    fun observeUtente(username: String): LiveData<Utente?> = utentiDao.getObservableUtente(username)

    fun observeAllenatore(username: String): LiveData<Utente?> {
        val utente = utentiDao.getUtente(username)
        return utentiDao.getObservableUtente(utente?.allenatore ?: "")
    }


    suspend fun addUtente(utente: Utente) {
        utentiDao.addUtente(utente) //aggiungo l'utente alla base di dati interna

        //TODO:FRA Questa era roba tua che ho commentato perchè altrimenti non va sul mio
        // in ogni caso qua si dovrebbe aggiungere l'utente (anche) alla base di dati esterna -> webService.addUtente(utente)
        /*
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
        */
    }

    suspend fun deleteUtente(username: String){
        utentiDao.deleteUtente(username)

        //TODO:FRA Eliminare l'utente dalla base di dati esterna -> webService.deleteUtente(username)
    }

    suspend fun updateUtente(utente: Utente){
        utentiDao.updateUtente(utente)

        //TODO:FRA Aggiornare l'utente nella base di dati esterna -> webService.updateUtente(username)
    }

    fun getUtente(username: String) = utentiDao.getUtente(username)

    fun getUtenti() = utentiDao.getObservableUtenti()

    suspend fun fetchUtente(username: String){
        //TODO:FRA In questo metodo devi pescare l'utente dalla base di dati esterna e metterlo in quella interna
        //una roba del genere..
        //utentiDao.addUtente(webService.getUtente(username))
    }

    fun login(usr: String, pwd: String): Boolean{
        var response = true
        //TODO:FRA QUESTO METODO DEVE AGIRE SOLO SULLA BASE DI DATI ESTERNA
        //  e deve restituire true se i dati del login sono corretti e false altrimenti
        // (per adesso facciamo il controllo così senza token, poi vedremo)

        return response
    }


}