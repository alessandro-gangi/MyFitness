package com.example.myfitness.data

import kotlin.collections.ArrayList

class SchedaGiornaliera(var schedaId: Long, var numGiorno: Int, var esercizi: ArrayList<Esercizio>){

    override fun toString(): String {
        return "SchedaGiornaliera(schedaId=$schedaId, numGiorno=$numGiorno, esercizi=$esercizi)"
    }
}