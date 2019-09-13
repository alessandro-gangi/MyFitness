package com.example.myfitness.model.dataClasses


import androidx.room.*

//TODO:FRA ho cambiato la chiave in autogenerate=true almeno l'id si autoincrementa da solo.
// per farlo funzionare basta settarlo a 0 quando crei la scheda e, in automatico, quando
// la inserisci nel db prende il valore corretto

@Entity(tableName = "schede_table")
data class Scheda(@PrimaryKey(autoGenerate = true) var schedaId: Int,
                  var num_giorni: Int = -1,
                  var data: String = "",
                  var tipo: String = "",
                  var commento: String = "",
                  @Embedded(prefix = "autore_")var autore: Utente,
                  @Embedded(prefix = "possessore_")var possessore: Utente,
                  var esercizi: ArrayList<ArrayList<Esercizio>> = ArrayList(),
                  var is_current: Boolean = false)
{


    override fun toString(): String {
        return "Scheda(schedaId=$schedaId, num_giorni=$num_giorni, " +
                "data='$data', tipo='$tipo', commento='$commento', " +
                "autore=$autore, possessore=$possessore, " +
                "esercizi=$esercizi, is_current=$is_current)"
    }
}