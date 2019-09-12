package com.example.myfitness.model.webService

import com.example.myfitness.model.webService.restService.UserRestService
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientRetrofit {

    // PARTIAL_URL = "http://10.0.2.2:8080"

    val baseUrl = "https://myfitnessserver.herokuapp.com/api/"
    var gson = GsonBuilder()
        .setLenient()
        .create()
    val client = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create(gson)) //Here we are using the GsonConverterFactory to directly convert json data to object
        .build()

    fun setService(typeClass: Any): UserRestService {

        return client.create(typeClass as Class<Any>?) as UserRestService
    }

}