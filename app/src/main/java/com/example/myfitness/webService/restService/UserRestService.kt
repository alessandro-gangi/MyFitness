package com.example.myfitness.webService.restService

import com.example.myfitness.webService.User
import retrofit2.Call
import retrofit2.http.*

interface UserRestService {
    @GET("users")
    fun listUsers(): Call<List<User>>

    @POST("insert/user")
    fun addUser(@Body user: User): Call<String>

    @DELETE("delete/user/{username}/")
    fun deleteUser(@Path("username") username: String): Call<String>

    @GET("exists/user/{username}/")
    fun getUserById(@Path("username") username: String): Call<User>

    @PUT("update/user/{username}/")
    fun updateUserById(@Path("username") username: String, @Body newUser: User): Call<User>
}
