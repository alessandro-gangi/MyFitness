package com.example.myfitness.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UtentiDao {

    //val myTable: String = "utenti_table"

    @Query("SELECT * from utenti_table ORDER BY username ASC")
    fun getAllUtenti(): LiveData<List<Utente>>

    @Query("SELECT * from utenti_table WHERE username = :username")
    fun getUtente(username: String): LiveData<Utente>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUtente(utente: Utente)

    @Query("DELETE FROM utenti_table WHERE username = :username")
    fun deleteUtente(username: String)

    @Query("DELETE FROM utenti_table")
    fun deleteAllUtenti()
}