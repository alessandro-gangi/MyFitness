package com.example.myfitness.model.dataClasses

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "utenti_table")
data class Utente(@PrimaryKey val usernameId: String,
             var mail: String,
             var password: String,
             var flagAllenatore: Boolean = false,
             var nome: String,
             var cognome: String,
             var eta: Int?,
             var descrizione: String?,
             var imageURI: String?,
             var peso: Double?,
             var altezza: Int?,
             var genere: Char,
             var allenatore: String?){


    override fun toString(): String {
        return "Utente(usernameId='$usernameId', mail='$mail'," +
                " password='$password', flagAllenatore=$flagAllenatore," +
                " nome='$nome', cognome='$cognome', eta=$eta, descrizione=$descrizione," +
                " imageURI=$imageURI, peso=$peso, altezza=$altezza, genere=$genere," +
                " allenatore=$allenatore)"
    }
}