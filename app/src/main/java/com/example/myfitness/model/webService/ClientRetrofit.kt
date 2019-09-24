package com.example.myfitness.model.webService

import com.example.myfitness.model.webService.restService.UserRestService
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient



object ClientRetrofit {

    // PARTIAL_URL = "http://10.0.2.2:8080"

    val baseUrl = "https://myfitnessserver.herokuapp.com/api/"
    var gson = GsonBuilder().setLenient().create()
    var okHttpClient = OkHttpClient.Builder().build()

    val client = Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create(gson)) //Here we are using the GsonConverterFactory to directly convert json data to object
        .build()

    fun setService(typeClass: Any): Any {

        return client.create(typeClass as Class<Any>?)
    }

}