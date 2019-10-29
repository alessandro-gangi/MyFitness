package com.example.myfitness.model.webService.restService;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u000bH\'J*\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0004H\'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'J.\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\u0014\u001a\u00020\u0012H\'\u00a8\u0006\u0015"}, d2 = {"Lcom/example/myfitness/model/webService/restService/RequestRestService;", "", "addRequest", "Lretrofit2/Call;", "", "token", "request", "Lcom/example/myfitness/model/dataClasses/Richiesta;", "deleteAllRequests", "deleteRequestById", "cardId", "", "getRequestById", "requestId", "getTrainerRequests", "", "usernameId", "listRequests", "Lcom/example/myfitness/model/dataClasses/Scheda;", "updateRequestById", "newRequest", "app_debug"})
public abstract interface RequestRestService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "request/all")
    public abstract retrofit2.Call<java.util.List<com.example.myfitness.model.dataClasses.Scheda>> listRequests(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "request/insert")
    public abstract retrofit2.Call<java.lang.String> addRequest(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.myfitness.model.dataClasses.Richiesta request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "request/delete/{cardId}/")
    public abstract retrofit2.Call<java.lang.String> deleteRequestById(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @retrofit2.http.Path(value = "cardId")
    int cardId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "request/exists/{requestId}/")
    public abstract retrofit2.Call<com.example.myfitness.model.dataClasses.Richiesta> getRequestById(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @retrofit2.http.Path(value = "requestId")
    int requestId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "request/update/{requestId}/")
    public abstract retrofit2.Call<com.example.myfitness.model.dataClasses.Richiesta> updateRequestById(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @retrofit2.http.Path(value = "requestId")
    int requestId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.myfitness.model.dataClasses.Scheda newRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "request/delete/all")
    public abstract retrofit2.Call<java.lang.String> deleteAllRequests(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "request/trainerRequests/{usernameId}/")
    public abstract retrofit2.Call<java.util.List<com.example.myfitness.model.dataClasses.Richiesta>> getTrainerRequests(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "usernameId")
    java.lang.String usernameId);
}