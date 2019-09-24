package com.example.myfitness.model.webService.restService;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\b\u001a\u00020\u0004H\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u0003H\'J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u000e\u001a\u00020\u0006H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/myfitness/model/webService/restService/CardRestService;", "", "addCard", "Lretrofit2/Call;", "", "card", "Lcom/example/myfitness/model/dataClasses/Scheda;", "deleteCard", "cardId", "", "getCardById", "listCards", "", "updateCardById", "newCard", "app_debug"})
public abstract interface CardRestService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "card/all")
    public abstract retrofit2.Call<java.util.List<com.example.myfitness.model.dataClasses.Scheda>> listCards();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "card/insert")
    public abstract retrofit2.Call<java.lang.String> addCard(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.myfitness.model.dataClasses.Scheda card);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "card/delete/user/{username}/")
    public abstract retrofit2.Call<java.lang.String> deleteCard(@retrofit2.http.Path(value = "cardId")
    int cardId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "card/exists/{cardId}/")
    public abstract retrofit2.Call<com.example.myfitness.model.dataClasses.Scheda> getCardById(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "cardId")
    java.lang.String cardId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "card/update/{cardId}/")
    public abstract retrofit2.Call<com.example.myfitness.model.dataClasses.Scheda> updateCardById(@retrofit2.http.Path(value = "cardId")
    int cardId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.myfitness.model.dataClasses.Scheda newCard);
}