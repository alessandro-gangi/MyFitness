package com.example.myfitness.model.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myfitness.model.dataClasses.Utente

@Dao
interface UtentiDao {

    //NOME TABELLA: utenti_table

    @Query("SELECT * from utenti_table ORDER BY usernameId ASC")
    fun getObservableUtenti(): LiveData<List<Utente>>

    @Query("SELECT * from utenti_table WHERE flagAllenatore = 1 AND usernameId != :username ORDER BY usernameId ASC")
    fun getObservableAllenatori(username: String): LiveData<List<Utente>>

    @Query("SELECT * from utenti_table WHERE usernameId = :username LIMIT 1")
    fun getUtente(username: String): Utente?

    @Query("SELECT * from utenti_table WHERE usernameId = :username LIMIT 1")
    fun getObservableUtente(username: String): LiveData<Utente?>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addUtente(utente: Utente)

    @Update
    fun updateUtente(utente: Utente)

    @Query("DELETE FROM utenti_table WHERE usernameId = :username")
    fun deleteUtente(username: String)

    @Query("DELETE FROM utenti_table")
    fun deleteAllUtenti()
}