package com.example.myfitness.data

import java.lang.IllegalArgumentException

class Utente(var username: String, var mail: String, var password: String) {

    var nome: String = ""
    var cognome: String = ""
    var eta: Int = -1
    var sesso: Char = 'M'


    init {
        if (eta <=0) throw IllegalArgumentException("Imposta un'età corretta")
    }

    constructor(_username: String, _mail: String, _password: String, nome: String, cognome: String, eta: Int, sesso: Char): this(_username, _mail, _password){
        this.nome = nome
        this.cognome= cognome
        this.eta = eta
        this.sesso = sesso
    }

    override fun toString(): String {
        return "Utente(username='$username', mail='$mail', password='$password')"
    }
}