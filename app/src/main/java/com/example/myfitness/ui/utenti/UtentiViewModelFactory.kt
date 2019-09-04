package com.example.myfitness.ui.utenti

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myfitness.data.UtenteRepository

// The same repository that's needed for UtentiViewModel
// is also passed to the factory
class UtentiViewModelFactory(private val utenteRepository: UtenteRepository): ViewModelProvider.NewInstanceFactory() {


    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return UtentiViewModel(utenteRepository) as T

    }

}