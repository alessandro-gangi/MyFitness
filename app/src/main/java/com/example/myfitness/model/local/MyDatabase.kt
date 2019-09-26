package com.example.myfitness.model.local


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.myfitness.model.dataClasses.Richiesta
import com.example.myfitness.model.dataClasses.Scheda
import com.example.myfitness.model.dataClasses.Utente

// Annotates class to be a Room Database with a table (entity) of the Word class
@Database(entities = arrayOf(Utente::class, Scheda::class, Richiesta::class), version = 17)
@TypeConverters(DataConverter::class)
abstract class MyDatabase : RoomDatabase() {

    abstract fun UtentiDao(): UtentiDao
    abstract fun SchedeDao(): SchedeDao
    abstract fun RichiesteDao(): RichiesteDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: MyDatabase? = null

        fun getDatabase(context: Context): MyDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MyDatabase::class.java,
                    "my_database"
                ).fallbackToDestructiveMigration().allowMainThreadQueries().build()
                INSTANCE = instance
                return instance
            }
        }
    }
}