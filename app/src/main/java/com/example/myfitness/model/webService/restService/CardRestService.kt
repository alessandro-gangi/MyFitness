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

    @DELETE("card/delete/user/{username}/")
    fun deleteCard(@Path("cardId") cardId: Int): Call<String>

    @GET("card/exists/{cardId}/")
    fun getCardById(@Path("cardId") cardId: String): Call<Scheda>

    @PUT("card/update/{cardId}/")
    fun updateCardById(@Path("cardId") cardId: Int, @Body newCard: Scheda): Call<Scheda>

}


