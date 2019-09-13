package com.example.myfitness.model.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myfitness.model.dataClasses.Scheda

@Dao
interface SchedeDao {

    //val myTable: String = "schede_table"

    @Query("SELECT * from schede_table ORDER BY data ASC")
    fun getAllSchede(): LiveData<List<Scheda>>

    @Query("SELECT * FROM schede_table WHERE schedaId = :schedaId LIMIT 1")
    fun getScheda(schedaId: Int): Scheda

    @Query("UPDATE schede_table SET is_current = 1 WHERE possessore_usernameId = :username AND schedaId = :idScheda")
    fun setAsCurrentScheda(idScheda: Int, username: String)

    @Query("UPDATE schede_table SET is_current = 0 WHERE possessore_usernameId = :username")
    fun removeCurrentScheda(username: String)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addScheda(scheda: Scheda)

    @Update
    fun updateScheda(scheda: Scheda)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addSchede(scheda: List<Scheda>)

    @Query("DELETE FROM schede_table WHERE schedaId = :schedaId")
    fun deleteScheda(schedaId: Int)

    @Query("DELETE FROM schede_table WHERE possessore_usernameId = :username")
    fun deleteAllUserSchede(username: String)

    @Query("DELETE FROM schede_table WHERE 1 = 1")
    fun deleteAllSchede()


    @Query("SELECT * FROM schede_table WHERE possessore_usernameId = :username")
    fun getUserSchede(username: String): LiveData<List<Scheda>?>

    @Query("SELECT * FROM schede_table WHERE is_current = 1 AND possessore_usernameId = :username LIMIT 1")
    fun getCurrentScheda(username: String): LiveData<Scheda?>
}