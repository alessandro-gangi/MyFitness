package com.example.myfitness.data

import kotlin.collections.ArrayList

class Scheda(var id: Long, var data: String, var tipo: String, var schedeGiornaliere: ArrayList<SchedaGiornaliera>, var commento: String){

    var isCurrent: Boolean = false

    override fun toString(): String {
        return "Scheda(id=$id, data='$data', tipo='$tipo', schedeGiornaliere=$schedeGiornaliere, commento='$commento')"
    }
}