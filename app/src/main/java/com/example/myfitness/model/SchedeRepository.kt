package com.example.myfitness.model

import androidx.lifecycle.LiveData
import com.example.myfitness.model.dataClasses.Esercizio
import com.example.myfitness.model.dataClasses.Scheda
import com.example.myfitness.model.local.SchedeDao

class SchedeRepository (private val schedeDao: SchedeDao){
    private val TAG = "SchedeRepository"

    //TODO:FRA Allora dovremmo passare al costruttore della Repository anche il webService (oltre che il DAO).
    // Dovrebbe venire una roba del genere:
    // class UtentiRepository (private val schedeDao: SchedeDao, private val webService: webService){
    // --> in questo modo chiamiamo poi i metodi facendo webService.addScheda(scheda)  (ad esempio..)



    suspend fun addScheda(scheda: Scheda){
        schedeDao.addScheda(scheda)

        //TODO:FRA Aggiungere la scheda alla base di dati esterna -> webService.addScheda(scheda)
        // FARLO PER TUTTI I METODI
    }

    suspend fun deleteScheda(id: Int){
        schedeDao.deleteScheda(id)

        //TODO:FRA idem su base di dati esterna
    }

    suspend fun updateScheda(scheda: Scheda){
        schedeDao.updateScheda(scheda)

        //TODO:FRA idem su base di dati esterna
    }

    fun getScheda(id: Int) : Scheda {
        return schedeDao.getScheda(id)
    }

    suspend fun setAsCurrentScheda(idScheda: Int, username: String){
        schedeDao.removeCurrentScheda(username)
        schedeDao.setAsCurrentScheda(idScheda, username)

        //TODO:FRA idem su base di dati esterna
    }

    suspend fun removeCurrentScheda(username: String){
        schedeDao.removeCurrentScheda(username)

        //TODO:FRA idem su base di dati esterna
    }

    fun getSchedaGiornaliera(id: Int, numGiorno: Int) :ArrayList<Esercizio>{
        return getScheda(id).esercizi[numGiorno]
    }

    suspend fun deleteAllUserSchede(username: String){
        schedeDao.deleteAllUserSchede(username)

        //TODO:FRA idem su base di dati esterna
    }



    fun observeSchede(username: String): LiveData<List<Scheda>?> = schedeDao.getUserSchede(username)

    fun observeCurrentScheda(username: String): LiveData<Scheda?> = schedeDao.getCurrentScheda(username)

    suspend fun fetchUtente(username: String){
        //TODO:FRA In questo metodo devi pescare le schede dell'utente dalla base di dati esterna e metterlo in quella interna
        //una roba del genere..
        //schedeDao.addSchede(webService.getSchede(username)) dove webService.getSchede(username) ritorna una List<Scheda>
    }
}