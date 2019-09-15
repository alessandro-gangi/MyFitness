package com.example.myfitness.model.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myfitness.model.dataClasses.Richiesta
import com.example.myfitness.model.dataClasses.Utente

@Dao
interface RichiesteDao {

    //NOME TABELLA: richieste_table

    @Query("SELECT * FROM richieste_table WHERE allenatore_usernameId = :username")
    fun getObservableRichieste(username: String): LiveData<List<Richiesta>?>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addRichiesta(richiesta: Richiesta)

    @Query("SELECT * FROM richieste_table WHERE utente_usernameId = :utenteUsername AND allenatore_usernameId = :allenatoreUsername LIMIT 1")
    fun getRichiestaFromAtoB(utenteUsername: String, allenatoreUsername: String): Richiesta?

    @Delete
    fun deleteRichiesta(richiesta: Richiesta)

}