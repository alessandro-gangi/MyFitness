package com.example.myfitness.data

// FakeQuoteDao must be passed in - it is a dependency
// You could also instantiate the DAO right inside the class without all the fuss, right?
// No. This would break testability - you need to be able to pass a mock version of a DAO
// to the repository (e.g. one that upon calling getQuotes() returns a dummy list of quotes for testing)
// This is the core idea behind DEPENDENCY INJECTION - making things completely modular and independent.

class UtenteRepository private constructor(private val utenteDAO: UtenteDAO ){

    // This may seem redundant.
    // Imagine a code which also updates and checks the backend.
    fun addUtente(utente: Utente_new) {
        utenteDAO.addUtente(utente)

        //aggiungere anche su database esterno
        //HTTPHandler().postCall("/api/insert/member", registration)
    }

    fun getUtenti() = utenteDAO.getUtenti()

    companion object {
        // Singleton instantiation you already know and love
        @Volatile private var instance: UtenteRepository? = null

        fun getInstance(utenteDao: UtenteDAO) =
            instance ?: synchronized(this) {
                instance ?: UtenteRepository(utenteDao).also { instance = it }
            }
    }
}