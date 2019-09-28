package com.example.myfitness.model.webService.restService

import com.example.myfitness.model.dataClasses.Richiesta
import com.example.myfitness.model.dataClasses.Scheda
import retrofit2.Call
import retrofit2.http.*

interface RequestRestService {

    @GET("request/all")
    fun listRequests(): Call<List<Scheda>>

    @POST("request/insert")
    fun addRequest(@Body request: Richiesta): Call<String>

    @DELETE("request/delete/{cardId}/")
    fun deleteRequestById(@Path("cardId") cardId: Int): Call<String>

    @GET("request/exists/{requestId}/")
    fun getRequestById(@Path("requestId") requestId: Int): Call<Richiesta>

    @PUT("request/update/{requestId}/")
    fun updateRequestById(@Path("requestId") requestId: Int, @Body newRequest: Scheda): Call<Richiesta?>

    @DELETE("request/delete/all")
    fun deleteAllRequests(): Call<String>

    @GET("request/trainerRequests/{usernameId}/")
    fun getTrainerRequests(@Path("usernameId") usernameId: String): Call<List<Richiesta?>>

}