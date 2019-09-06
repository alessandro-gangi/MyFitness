package com.example.myfitness.data


import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "schede_table")
data class Scheda(@PrimaryKey var id: Int = -1,
                  var num_giorni: Int = -1,
                  var data: String = "",
                  var tipo: String = "",
                  var commento: String = "",
                  var autore: String = "",
                  var possessore: String = "",
                  var esercizi: ArrayList<ArrayList<Esercizio>> = ArrayList()
)   {


    override fun toString(): String {
        return "Scheda(id=$id, num_giorni=$num_giorni, data='$data', tipo='$tipo', commento='$commento', autore='$autore', possessore='$possessore', esercizi=$esercizi)"
    }
}