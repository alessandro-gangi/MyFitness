package com.example.myfitness.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SchedeGiornaliereDao {

    //val myTable: String = "schede_giornaliere_table"

    @Query("SELECT * from schede_giornaliere_table ORDER BY num_giorno ASC")
    fun getAllSchedeGiornaliere(): LiveData<List<SchedaGiornaliera>>

    @Query("SELECT * from schede_giornaliere_table WHERE scheda = :schedaId AND num_giorno = :numGiorno")
    fun getSchedaGiornaliera(schedaId: Int, numGiorno: Int): LiveData<SchedaGiornaliera>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addSchedaGiornaliera(schedaGiornaliera: SchedaGiornaliera)

    @Query("DELETE FROM schede_giornaliere_table WHERE scheda = :schedaId AND num_giorno = :numGiorno")
    fun deleteSchedaGiornaliera(schedaId: Int, numGiorno: Int)

    @Query("DELETE FROM schede_giornaliere_table")
    fun deleteAllSchedeGiornaliere()
}