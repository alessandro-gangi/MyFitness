package com.example.myfitness.interfaces

interface SchedeInteractionListener{
    fun onSchedaSelected(schedaId: Long)

    fun onEsercizioSelected(schedaId: Long, numGiorno: Int)
}