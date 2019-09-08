package com.example.myfitness.model.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myfitness.model.dataClasses.Utente

@Dao
interface UtentiDao {

    //NOME TABELLA: utenti_table

    @Query("SELECT * from utenti_table ORDER BY username ASC")
    fun getUtenti(): LiveData<List<Utente>>

    @Query("SELECT * from utenti_table WHERE username = :username")
    fun getUtente(username: String): LiveData<Utente?>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUtente(utente: Utente)

    @Update
    suspend fun updateUtente(utente: Utente)

    @Query("DELETE FROM utenti_table WHERE username = :username")
    suspend fun deleteUtente(username: String)

    @Query("DELETE FROM utenti_table")
    suspend fun deleteAllUtenti()
}