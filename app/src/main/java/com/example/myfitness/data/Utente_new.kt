package com.example.myfitness.data

data class Utente_new(val username: String, val mail: String, val password: String, val isAllenatore: Boolean,
                      val nome: String, val cognome: String, val eta: Int?, val descrizione: String?,
                      val imageURI: String?, val peso: Double?, val altezza: Int?, val genere: Char,
                      val allenatore: String?, val idScheda: Int?) {

    override fun toString(): String {
        return "Utente_new(username='$username', mail='$mail', password='$password', " +
                "isAllenatore=$isAllenatore, nome='$nome', eta=$eta, descrizione='$descrizione', imageURI='$imageURI')"
    }

}