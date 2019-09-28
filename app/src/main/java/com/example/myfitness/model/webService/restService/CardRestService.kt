package com.example.myfitness.model.webService.restService

import com.example.myfitness.model.dataClasses.Esercizio
import com.example.myfitness.model.dataClasses.Scheda
import com.example.myfitness.model.dataClasses.Utente
import retrofit2.Call
import retrofit2.http.*
import okhttp3.MultipartBody
import retrofit2.http.POST
import retrofit2.http.Multipart
import java.net.URI


interface CardRestService {

    @GET("card/all")
    fun listCards(): Call<List<Scheda>>

    @POST("card/insert")
    fun addCard(@Body card: Scheda): Call<String>

    @DELETE("card/delete/{cardId}/")
    fun deleteCard(@Path("cardId") cardId: Int): Call<String>

    @GET("card/exists/{cardId}/")
    fun getCardById(@Path("cardId") cardId: Int): Call<Scheda>

    @PUT("card/update/{cardId}/")
    fun updateCardById(@Path("cardId") cardId: Int, @Body newCard: Scheda): Call<Scheda?>

    @DELETE("card/delete/all")
    fun deleteAllCards(): Call<String>

    @DELETE("card/deleteAllUserCards/{usernameId}/")
    fun deleteAllUserCards(@Path("usernameId") username: String): Call<String>

    @PUT("/setAsCurrentCard/{usernameId}/{cardId}/")
    fun setAsCurrentCard(@Path("usernameId") usernameId: String, @Path("cardId") cardId: Int): Call<String>

    @DELETE("card/removeCurrentCard/{usernameId}/")
    fun removeCurrentCard(@Path("usernameId") usernameId: String): Call<String>

    @GET("card/getUserCards/{usernameId}/")
    fun getUserCards(@Path("usernameId") usernameId: String): Call<List<Scheda>?>

    @GET("card/getCurrentCard/{usernameId}/")
    fun getCurrentCard(@Path("usernameId") usernameId: String): Call<Scheda?>

    @GET("card/getCompletedRequest/{usernameId}/")
    fun getCompletedRequest(@Path("usernameId") usernameId: String): Call<List<Scheda>?>

}


