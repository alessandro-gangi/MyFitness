package com.example.myfitness.model.dataClasses

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "utenti_table")
data class Utente(@PrimaryKey @ColumnInfo(name = "usernameId")val usernameId: String,
             @ColumnInfo(name = "mail") var mail: String,
             @ColumnInfo(name = "password") var password: String,
             @ColumnInfo(name = "flagAllenatore") var flagAllenatore: Boolean,
             @ColumnInfo(name = "nome") var nome: String,
             @ColumnInfo(name = "cognome") var cognome: String,
             @ColumnInfo(name = "eta") var eta: Int?,
             @ColumnInfo(name = "descrizione") var descrizione: String?,
             @ColumnInfo(name = "image_uri") var imageURI: String? = null,
             @ColumnInfo(name = "peso") var peso: Double?,
             @ColumnInfo(name = "altezza") var altezza: Int?,
             @ColumnInfo(name = "genere") var genere: Char,
             @ColumnInfo(name = "allenatore") var allenatore: String?,
             @ColumnInfo(name = "id_scheda") var idScheda: Int?) {

    override fun toString(): String {
        return "Utente(username='$usernameId', mail='$mail', password='$password', " +
                "isAllenatore=$flagAllenatore, nome='$nome', cognome='$cognome', " +
                "eta=$eta, descrizione=$descrizione, imageURI=$imageURI, peso=$peso, " +
                "altezza=$altezza, genere=$genere, allenatore=$allenatore, idScheda=$idScheda)"
    }
}