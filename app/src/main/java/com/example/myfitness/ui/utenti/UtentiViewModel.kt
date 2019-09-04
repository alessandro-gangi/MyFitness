package com.example.myfitness.ui.utenti

import androidx.lifecycle.ViewModel
import com.example.myfitness.data.UtenteRepository
import com.example.myfitness.data.Utente_new

// QuoteRepository dependency will again be passed in the
// constructor using dependency injection

class UtentiViewModel (private val utenteRepository: UtenteRepository): ViewModel(){

    fun addUtente(utente: Utente_new) = utenteRepository.addUtente(utente)

    fun getUtenti() = utenteRepository.getUtenti()

}