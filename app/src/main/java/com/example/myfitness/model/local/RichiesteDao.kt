package com.example.myfitness.model.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myfitness.model.dataClasses.Richiesta
import com.example.myfitness.model.dataClasses.Utente

@Dao
interface RichiesteDao {

    //NOME TABELLA: richieste_table

    @Query("SELECT * from richieste_table WHERE allenatore_usernameId = :username")
    fun getObservableRichieste(username: String): LiveData<List<Richiesta>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addRichiesta(richiesta: Richiesta)

    @Delete
    fun deleteRichiesta(richiesta: Richiesta)

}