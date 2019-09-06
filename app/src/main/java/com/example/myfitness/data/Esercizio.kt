package com.example.myfitness.data


data class Esercizio(var nome: String = "",
                     var serie: Int = -1,
                     var ripetizioni: Int = -1,
                     val recupero: Double = 0.0,
                     val commento: String = ""){


    override fun toString(): String {
        return "Esercizio(nome='$nome', serie=$serie, ripetizioni=$ripetizioni, " +
                "recupero=$recupero, commento='$commento')"
    }
}