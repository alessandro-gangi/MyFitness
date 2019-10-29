package com.example.myfitness.model.webService.restService

import com.example.myfitness.model.dataClasses.Richiesta
import com.example.myfitness.model.dataClasses.Scheda
import retrofit2.Call
import retrofit2.http.*

interface RequestRestService {

    @GET("request/all")
    fun listRequests(@Header("Authorization")token: String): Call<List<Scheda>>

    @POST("request/insert")
    fun addRequest(@Header("Authorization")token: String, @Body request: Richiesta): Call<String>

    @DELETE("request/delete/{cardId}/")
    fun deleteRequestById(@Header("Authorization")token: String, @Path("cardId") cardId: Int): Call<String>

    @GET("request/exists/{requestId}/")
    fun getRequestById(@Header("Authorization")token: String, @Path("requestId") requestId: Int): Call<Richiesta>

    @PUT("request/update/{requestId}/")
    fun updateRequestById(@Header("Authorization")token: String, @Path("requestId") requestId: Int, @Body newRequest: Scheda): Call<Richiesta?>

    @DELETE("request/delete/all")
    fun deleteAllRequests(@Header("Authorization")token: String): Call<String>

    @GET("request/trainerRequests/{usernameId}/")
    fun getTrainerRequests(@Header("Authorization")token: String, @Path("usernameId") usernameId: String): Call<List<Richiesta?>>

}