package com.example.myfitness.model.webService.restService

import com.example.myfitness.model.dataClasses.Utente
import retrofit2.Call
import retrofit2.http.*
import okhttp3.MultipartBody
import retrofit2.http.POST
import retrofit2.http.Multipart
import java.net.URI


interface UserRestService {

    @GET("user/all")
    fun listUsers(): Call<List<Utente>>

    @POST("user/insert")
    fun addUser(@Body user: Utente): Call<String>

    @DELETE("user/delete/{username}/")
    fun deleteUser(@Path("username") username: String): Call<String>

    @GET("user/exists/{username}/")
    fun getUserById(@Path("username") username: String): Call<Utente>

    @PUT("user/update/{username}/")
    fun updateUserById(@Path("username") username: String, @Body newUser: Utente): Call<Utente>

    @Multipart
    @POST("user/save/image")
    fun retrieveUri(@Part profileImage: MultipartBody.Part): Call<URI>

}


