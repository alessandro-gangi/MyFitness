package com.example.myfitness.utilities

import com.example.myfitness.data.FakeDatabase
import com.example.myfitness.data.UtenteRepository
import com.example.myfitness.ui.utenti.UtentiViewModelFactory

// Finally a singleton which doesn't need anything passed to the constructor
object InjectorUtils {

    // This will be called from UtentiActivity
    fun provideUtentiViewModelFactory(): UtentiViewModelFactory {

        // ViewModelFactory needs a repository, which in turn needs a DAO from a database
        // The whole dependency tree is constructed right here, in one place
        val utenteRepository = UtenteRepository.getInstance(FakeDatabase.getInstance().utenteDAO)
        return UtentiViewModelFactory(utenteRepository)
    }

}