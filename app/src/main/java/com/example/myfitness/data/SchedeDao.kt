package com.example.myfitness.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SchedeDao {

    //val myTable: String = "schede_table"

    @Query("SELECT * from schede_table ORDER BY data ASC")
    fun getAllSchede(): LiveData<List<Scheda>>

    @Query("SELECT * from schede_table WHERE id = :schedaId")
    fun getScheda(schedaId: Int): LiveData<Scheda>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addScheda(scheda: Scheda)

    @Query("DELETE FROM schede_table WHERE id = :schedaId")
    fun deleteScheda(schedaId: Int)

    @Query("DELETE FROM schede_table")
    fun deleteAllSchede()
}