package com.example.myfitness.webService

import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.webService.restService.UserRestService
import com.google.gson.*
import com.google.gson.reflect.TypeToken
import org.json.JSONObject
import android.content.ClipData.Item
import com.google.gson.JsonObject
import com.google.gson.JsonElement
import com.google.gson.JsonArray
import java.util.ArrayList
import com.google.gson.GsonBuilder
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ClientRetrofit {

    // PARTIAL_URL = "http://10.0.2.2:8080"

    val baseUrl = "http://myfitnessserver.herokuapp.com/api/"
    var gson = GsonBuilder()
        .setLenient()
        .create()
    val client = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    fun setService(typeClass: Any): UserRestService {

        return client.create(typeClass as Class<Any>?) as UserRestService
    }

}