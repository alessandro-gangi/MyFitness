package com.example.myfitness.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.myfitness.data.*
import kotlinx.coroutines.launch


class SchedeGiornaliereViewModel (application: Application): AndroidViewModel(application){

    // The ViewModel maintains a reference to the repository to get data.
    private val repository: SchedeGiornaliereRepository
    // LiveData gives us updated words when they change.
    val allSchedeGiornaliere: LiveData<List<SchedaGiornaliera>>

    init {
        // Gets reference to WordDao from WordRoomDatabase to construct
        // the correct WordRepository.
        val schedeGiornaliereDao = MyDatabase.getDatabase(application).SchedeGiornaliereDao()
        repository = SchedeGiornaliereRepository(schedeGiornaliereDao)
        allSchedeGiornaliere = repository.allSchedeGiornaliere
    }



    fun addSchedaGiornaliera(schedaGiornaliera: SchedaGiornaliera) = viewModelScope.launch{repository.addSchedaGiornaliera(schedaGiornaliera)}

    fun deleteSchedaGiornaliera(scheda: Int, numGiorno: Int) = viewModelScope.launch {repository.deleteSchedaGiornaliera(scheda, numGiorno)}

    fun getSchedaGiornaliera(scheda: Int, numGiorno: Int) = repository.getSchedaGiornaliera(scheda, numGiorno)

    fun getSchedeGiornaliere() = repository.getSchedeGiornaliere()

}