package com.example.myfitness.data

import androidx.room.*

@Entity
(foreignKeys = arrayOf(ForeignKey(entity = Scheda::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("scheda"),
    onDelete = ForeignKey.CASCADE)),
tableName = "schede_giornaliere_table",
primaryKeys = arrayOf("scheda", "num_giorno"))
data class SchedaGiornaliera(var scheda: Int = -1,
                             var num_giorno: Int = -1,
                             @Ignore var esercizi: ArrayList<Esercizio> = ArrayList()
) {


    override fun toString(): String {
        return "SchedaGiornaliera(idScheda=$scheda, numGiorno=$num_giorno, esercizi=$esercizi)"
    }
}