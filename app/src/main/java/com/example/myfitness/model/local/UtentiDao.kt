package com.example.myfitness.model.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myfitness.model.dataClasses.Utente

@Dao
interface UtentiDao {

    //NOME TABELLA: utenti_table

    @Query("SELECT * from utenti_table ORDER BY username ASC")
    fun getObservableUtenti(): LiveData<List<Utente>>

    @Query("SELECT * from utenti_table WHERE is_allenatore = 1 ORDER BY username ASC")
    fun getObservableAllenatori(): LiveData<List<Utente>>

    @Query("SELECT * from utenti_table WHERE username = :username LIMIT 1")
    fun getUtente(username: String): Utente?

    @Query("SELECT * from utenti_table WHERE username = :username LIMIT 1")
    fun getObservableUtente(username: String): LiveData<Utente?>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addUtente(utente: Utente)

    @Update
    suspend fun updateUtente(utente: Utente)

    @Query("DELETE FROM utenti_table WHERE username = :username")
    suspend fun deleteUtente(username: String)

    @Query("DELETE FROM utenti_table")
    suspend fun deleteAllUtenti()
}