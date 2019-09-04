package com.example.myfitness.data

import android.graphics.drawable.Drawable

class Utente(var username: String, var mail: String, var password: String) {

    var image: Drawable? = null
    var nome: String = ""
    var descrizione: String = ""
    var isAllenatore: Boolean = false


    constructor(_username: String, _mail: String, _password: String, image: Drawable?, nome: String, descrizione: String, isAllenatore: Boolean): this(_username, _mail, _password){
        this.image = image
        this.nome = nome
        this.descrizione = descrizione
        this.isAllenatore = isAllenatore
    }

    override fun toString(): String {
        return "Utente(username='$username', mail='$mail', password='$password', image=$image, nome='$nome', descrizione='$descrizione', isAllenatore=$isAllenatore)"
    }


}