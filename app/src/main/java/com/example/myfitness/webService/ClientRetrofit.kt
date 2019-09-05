package com.example.myfitness.webService

import com.example.myfitness.webService.restService.UserRestService
import retrofit.GsonConverterFactory
import retrofit.Retrofit

object ClientRetrofit {

    // PARTIAL_URL = "http://10.0.2.2:8080"

    val baseUrl = "https://jsonplaceholder.typicode.com/"
    val client = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun setService(typeClass: Any): UserRestService {

        return client.create(typeClass as Class<Any>?) as UserRestService
    }

}