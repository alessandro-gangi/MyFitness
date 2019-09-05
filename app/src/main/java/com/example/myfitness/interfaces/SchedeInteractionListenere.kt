package com.example.myfitness.interfaces

interface SchedeInteractionListener{
    fun onSchedaSelected(schedaId: Int)

    fun onEsercizioSelected(schedaId: Int, numGiorno: Int)
}