package com.example.myfitness.model.local

import androidx.room.TypeConverter
import com.example.myfitness.model.dataClasses.Esercizio
import com.google.gson.reflect.TypeToken
import com.google.gson.Gson
import kotlin.collections.ArrayList


class DataConverter {

    var gson = Gson()

    @TypeConverter
    fun stringToEsercizi(data: String?): ArrayList<ArrayList<Esercizio>> {
        if (data == null) {
            return ArrayList()
        }

        val listType = object :TypeToken<ArrayList<ArrayList<Esercizio>>>() {

        }.type

        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun eserciziToString(esercizi: ArrayList<ArrayList<Esercizio>>): String {
        return gson.toJson(esercizi)
    }
}