package com.example.myfitness.view.activities


import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.myfitness.R
import com.example.myfitness.model.dataClasses.Richiesta
import com.example.myfitness.utilis.AllineaDB
import com.example.myfitness.utilis.ConnectionChecker
import com.example.myfitness.view.fragments.LoginFragment
import com.example.myfitness.view.fragments.RegisterFragment
import com.example.myfitness.viewmodel.RichiesteViewModel
import com.example.myfitness.viewmodel.SchedeViewModel
import com.example.myfitness.viewmodel.UtentiViewModel

class StartActivity : AppCompatActivity() {
    val TAG = "StartActivity"

    // SharedPref
    private lateinit var username: String
    private lateinit var sharedPref: SharedPreferences
    private val USER_DATA_PREFERENCE: String = "USER_DATA_PREFERENCE"
    val USERNAME_KEY = "USERNAME"

    // ViewModel
    private lateinit var richiesteViewModel: RichiesteViewModel
    private lateinit var schedeViewModel: SchedeViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        sharedPref = getSharedPreferences(USER_DATA_PREFERENCE, Context.MODE_PRIVATE)
        username = sharedPref.getString(USERNAME_KEY, "") ?: ""

        richiesteViewModel = ViewModelProvider(this).get(RichiesteViewModel::class.java)
        schedeViewModel = ViewModelProvider(this).get(SchedeViewModel::class.java)

        //TODO:TEST -> allinea db esterno con quello locale
        if(ConnectionChecker.isConnectionAvailable(this))
            allineaDB()

        if(username.isNotEmpty()){
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        }
        else
            supportFragmentManager.beginTransaction().replace(
                R.id.container_start,
                LoginFragment()).commit()

    }


    private fun allineaDB(){
        AllineaDB.initialize(this)
        Log.d(TAG, "Schede to add -> ${AllineaDB.getSchedeToAdd()}")

        val schedeToAdd: ArrayList<String> = AllineaDB.getSchedeToAdd()
        val schedeToUpdate: ArrayList<String> = AllineaDB.getSchedeToUpdate()
        val schedeToDelete: ArrayList<String> = AllineaDB.getSchedeToDelete()
        val richiesteInAttesaToDelete: ArrayList<String> = AllineaDB.getRichiesteInAttesaToDelete()

        allineaDbSchedeToAdd(schedeToAdd)
        allineaDbSchedeToUpdate(schedeToUpdate)
        allineaDbSchedeToDelete(schedeToDelete)
        allineaDbRichiesteInAttesaToDelete(richiesteInAttesaToDelete)
    }

    private fun allineaDbSchedeToAdd(schedeToAdd: ArrayList<String>){
        for (schedaID in schedeToAdd){
            var scheda = schedeViewModel.getScheda(schedaID.toInt())
            if(scheda != null)
                schedeViewModel.addScheda(scheda)
        }
        AllineaDB.clearSchedeToAdd()
    }

    private fun allineaDbSchedeToUpdate(schedeToUpdate: ArrayList<String>){
        for (schedaID in schedeToUpdate){
            var scheda = schedeViewModel.getScheda(schedaID.toInt())
            if(scheda != null)
                schedeViewModel.updateScheda(scheda)
        }
        AllineaDB.clearSchedeToUpdate()
    }

    private fun allineaDbSchedeToDelete(schedeToDelete: ArrayList<String>){
        for (schedaID in schedeToDelete){
            schedeViewModel.deleteScheda(schedaID.toInt())
        }
        AllineaDB.clearSchedeToDelete()
    }

    private fun allineaDbRichiesteInAttesaToDelete(richiesteToDelete: ArrayList<String>){
        for (richiestaID in richiesteToDelete){
            var richiesta: Richiesta? = richiesteViewModel.getRichiesta(richiestaID.toInt())
            if(richiesta != null)
                richiesteViewModel.deleteRichiesta(richiesta)
        }
        AllineaDB.clearRichiesteInAttesaToDelete()
    }
}

