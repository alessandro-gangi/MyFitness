package com.example.myfitness.data

class Esercizio(var nome: String, var serie: Int, var ripetizioni: Int, var recupero: Double = 0.0, var commento: String = "") {

    override fun toString(): String {
        return "Esercizio(nome='$nome', serie=$serie, ripetizioni=$ripetizioni, recupero=$recupero, commento='$commento')"
    }


}