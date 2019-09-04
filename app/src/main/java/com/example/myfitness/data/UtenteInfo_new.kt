package com.example.myfitness.data

data class UtenteInfo_new(val username: String, val nome: String, val eta: Int, val descrizione: String, val imageUri: String) {

    override fun toString(): String {
        return "UtenteInfo_new(username='$username', nome='$nome', eta=$eta, descrizione='$descrizione', imageUri='$imageUri')"
    }
}