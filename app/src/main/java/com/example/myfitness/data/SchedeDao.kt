package com.example.myfitness.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.*

@Dao
interface SchedeDao {

    //val myTable: String = "schede_table"

    @Query("SELECT * from schede_table ORDER BY data ASC")
    fun getAllSchede(): LiveData<List<Scheda>>

    @Query("SELECT * FROM schede_table WHERE id = :schedaId LIMIT 1")
    fun getScheda(schedaId: Int): Scheda

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addScheda(scheda: Scheda)

    @Query("DELETE FROM schede_table WHERE id = :schedaId")
    suspend fun deleteScheda(schedaId: Int)

    @Query("DELETE FROM schede_table")
    suspend fun deleteAllSchede()
}