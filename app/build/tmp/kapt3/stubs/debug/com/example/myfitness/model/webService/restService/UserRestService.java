package com.example.myfitness.model.webService.restService;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u0004H\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\b\u001a\u00020\u0004H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\u0003H\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\'J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0006H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/example/myfitness/model/webService/restService/UserRestService;", "", "addUser", "Lretrofit2/Call;", "", "user", "Lcom/example/myfitness/model/dataClasses/Utente;", "deleteUser", "usernameId", "getUserById", "listUsers", "", "retrieveUri", "Ljava/net/URI;", "profileImage", "Lokhttp3/MultipartBody$Part;", "updateUserById", "newUser", "app_debug"})
public abstract interface UserRestService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "user/all")
    public abstract retrofit2.Call<java.util.List<com.example.myfitness.model.dataClasses.Utente>> listUsers();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/insert")
    public abstract retrofit2.Call<java.lang.String> addUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.myfitness.model.dataClasses.Utente user);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "user/delete/{usernameId}/")
    public abstract retrofit2.Call<java.lang.String> deleteUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "usernameId")
    java.lang.String usernameId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "user/exists/{usernameId}/")
    public abstract retrofit2.Call<com.example.myfitness.model.dataClasses.Utente> getUserById(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "usernameId")
    java.lang.String usernameId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "user/update/{usernameId}/")
    public abstract retrofit2.Call<com.example.myfitness.model.dataClasses.Utente> updateUserById(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "usernameId")
    java.lang.String usernameId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.myfitness.model.dataClasses.Utente newUser);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/save/image")
    @retrofit2.http.Multipart()
    public abstract retrofit2.Call<java.net.URI> retrieveUri(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part profileImage);
}