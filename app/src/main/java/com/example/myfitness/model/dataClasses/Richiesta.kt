package com.example.myfitness.model.dataClasses

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "richieste_table")
data class Richiesta(@PrimaryKey(autoGenerate = true) @ColumnInfo(name = "richiestaId")val richiestaId: Int,
                     @Embedded(prefix = "utente_") var utente: Utente,
                     @Embedded(prefix = "allenatore_") var allenatore: Utente,
                     @ColumnInfo(name = "data") var data: String,
                     @ColumnInfo(name = "numGiorni") var numGiorni: Int,
                     @ColumnInfo(name = "tipologia") var tipologia: String,
                     @ColumnInfo(name = "commento") var commento: String){


}