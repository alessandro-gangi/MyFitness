package com.example.myfitness.webService.restService

import com.example.myfitness.webService.UserRetrofit
import retrofit.Call
import retrofit.http.GET

interface UserRestService {

    @GET("users")
    fun listUsers(): Call<List<UserRetrofit>>
}
