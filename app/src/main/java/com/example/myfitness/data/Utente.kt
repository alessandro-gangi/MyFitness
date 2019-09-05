package com.example.myfitness.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "utenti_table")
data class Utente(@PrimaryKey @ColumnInfo(name = "username")val username: String,
             @ColumnInfo(name = "mail") val mail: String,
             @ColumnInfo(name = "password") val password: String,
             @ColumnInfo(name = "is_allenatore") val isAllenatore: Boolean,
             @ColumnInfo(name = "nome") val nome: String,
             @ColumnInfo(name = "cognome") val cognome: String,
             @ColumnInfo(name = "eta") val eta: Int?,
             @ColumnInfo(name = "descrizione") val descrizione: String?,
             @ColumnInfo(name = "image_uri") val imageURI: String?,
             @ColumnInfo(name = "peso") val peso: Double?,
             @ColumnInfo(name = "altezza") val altezza: Int?,
             @ColumnInfo(name = "genere") val genere: Char,
             @ColumnInfo(name = "allenatore") val allenatore: String?,
             @ColumnInfo(name = "id_scheda") val idScheda: Int?) {

    override fun toString(): String {
        return "Utente(username='$username', mail='$mail', password='$password', " +
                "isAllenatore=$isAllenatore, nome='$nome', cognome='$cognome', " +
                "eta=$eta, descrizione=$descrizione, imageURI=$imageURI, peso=$peso, " +
                "altezza=$altezza, genere=$genere, allenatore=$allenatore, idScheda=$idScheda)"
    }
}