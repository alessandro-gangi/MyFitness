package com.example.myfitness.data

import androidx.room.*

@Entity
(foreignKeys = arrayOf(ForeignKey(entity = SchedaGiornaliera::class,
    parentColumns = arrayOf("scheda", "num_giorno"),
    childColumns = arrayOf("scheda", "num_giorno"),
    onDelete = ForeignKey.CASCADE)),
tableName = "esercizi_table",
primaryKeys = arrayOf("scheda", "num_giorno", "num_esercizio"))
data class Esercizio(var scheda: Int = -1,
                     var num_giorno:Int = -1,
                     var num_esercizio: Int = -1,
                     var nome: String = "",
                     var serie: Int = -1,
                     var ripetizioni: Int = -1,
                     val recupero: Double = 0.0,
                     val commento: String = ""){


    override fun toString(): String {
        return "Esercizio(idScheda=$scheda, numGiorno=$num_giorno, " +
                "numEsercizio=$num_esercizio, nome='$nome', serie=$serie, " +
                "ripetizioni=$ripetizioni, recupero=$recupero, commento='$commento')"
    }
}