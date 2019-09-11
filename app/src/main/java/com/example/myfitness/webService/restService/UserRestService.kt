package com.example.myfitness.webService.restService

import com.example.myfitness.model.dataClasses.Utente
import com.example.myfitness.webService.User
import retrofit2.Call
import retrofit2.http.*

interface UserRestService {
    @GET("users")
    fun listUsers(): Call<List<Utente>>

    @POST("insert/user")
    fun addUser(@Body user: Utente): Call<String>

    @DELETE("delete/user/{username}/")
    fun deleteUser(@Path("username") username: String): Call<String>

    @GET("exists/user/{username}/")
    fun getUserById(@Path("username") username: String): Call<Utente>

    @PUT("update/user/{username}/")
    fun updateUserById(@Path("username") username: String, @Body newUser: Utente): Call<Utente>
}
