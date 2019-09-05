package com.example.myfitness.dataManager

import android.util.Log
import com.example.myfitness.data.*
import org.json.JSONObject

object MyDataManager {
    val TAG = "MyDataManager"

    fun controlla_disponibilita_username(usr: String){

        //controlla se l'username è disponibile

    }

//    fun perform_registration(usr: String, mail: String, pwd: String): String? {
//        val registration = JSONObject()
//
//        registration.put("mail", mail)
//        registration.put("username", usr)
//        registration.put("password", pwd)
//
//        return HTTPHandler().postCall("/api/insert/member", registration)
//
//    }
//
//    fun perform_login(mail: String, pwd: String): Boolean {
//        return HTTPHandler().getCallLogin(mail, pwd)
//    }

    fun retrieve_all_schede_info(): ArrayList<Scheda>{
        Log.d(TAG, "retrieve_all_schede_info")

        // CONNESSIONE ALLA BASE DI DATI PER RECUPERARE:
        // data, tipologia e commento di tutte le schede

        // L'ideale sarebbe restituire la lista in modo che il primo elemento
        // sia la scheda corrente (con isCurrent = true) e poi le altre in
        // ordine cronologico

        // Per adesso restituisco (in modo fittizio) le intere
        // schede ma in realtà non devo restituire (per ogni scheda)
        // anche l'arraylist di schede giornaliere perchè appesantisco il tutto

        val schede = MockSchede.allMockSchede
        return schede
    }

    fun retrieve_scheda_info(schedaId: Int): Scheda{
        Log.d(TAG, "retrieve_scheda_info")
        Log.d(TAG, "id scheda: $schedaId")

        // CONNESSIONE ALLA BASE DI DATI PER RECUPERARE:
        // data, tipologia e commento

        // Per adesso restituisco (in modo fittizio) l'intera
        // scheda ma in realtà non devo restituire anche l'arraylist
        // di schede giornaliere perchè appesantisco il tutto

        val scheda = MockSchede.allMockSchede.find {
            it.id == schedaId
        }!!

        return scheda
    }

    fun retrieve_scheda_giornaliera(schedaId: Int, numGiorno: Int): SchedaGiornaliera{
        Log.d(TAG, "retrieve_scheda_giornaliera")
        Log.d(TAG, "id scheda: $schedaId and numgiorno: $numGiorno")
        // CONNESSIONE ALLA BASE DI DATI PER RECUPERARE
        // L'INTERA SCHEDA GIORNALIERA

        val scheda = MockSchede.allMockSchede.find {
            it.id == schedaId
        }!!

        return scheda.schede_giornaliere[numGiorno]

    }

    /*
    fun retrieve_all_allenatori(): ArrayList<Utente>{
        // CONNESSIONE ALLA BASE DI DATI PER RECUPERARE:
        // nome e descrizione

        return MockUtenti.listaAllenatori
    }

    fun retrieve_all_utenti(): ArrayList<Utente>{
        // CONNESSIONE ALLA BASE DI DATI PER RECUPERARE:
        // nome e descrizione

        return MockUtenti.listaUtenti
    }
    */
}
