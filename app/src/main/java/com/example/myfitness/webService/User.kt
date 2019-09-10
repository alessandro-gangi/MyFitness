package com.example.myfitness.webService

import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*


class User(


    @SerializedName("usernameId")
    @Expose
    var usernameId: String,

    @SerializedName("mail")
    @Expose
    var mail: String? = null,

    @SerializedName("password")
    @Expose
    var password: String? = null,

    @SerializedName("flagAllenatore")
    @Expose
    var flagAllenatore: Boolean = false,

    @SerializedName("nome")
    @Expose
    var nome: String? = null,

    @SerializedName("cognome")
    @Expose
    var cognome: String? = null,

    @SerializedName("eta")
    var eta: Int? = null,

    @SerializedName("descrizione")
    @Expose
    var descrizione: String? = null,

    @SerializedName("imageURI")
    @Expose
    var imageURI: ByteArray? = null,

    @SerializedName("peso")
    @Expose
    var peso: Double? = null,

    @SerializedName("altezza")
    @Expose
    var altezza: Int? = null,

    @SerializedName("genere")
    @Expose
    var genere: Char? = null,

    @SerializedName("allenatore")
    @Expose
    var allenatore: String? = null,

    @SerializedName("idScheda")
    @Expose
    var idScheda: String? = null

) {
    override fun toString(): String {
        return "User(usernameId=$usernameId, mail=$mail, password=$password, flagAllenatore=$flagAllenatore, nome=$nome, cognome=$cognome, eta=$eta, descrizione=$descrizione, imageURI=${Arrays.toString(
            imageURI
        )}, peso=$peso, altezza=$altezza, genere=$genere, allenatore=$allenatore, idScheda=$idScheda)"
    }
}



