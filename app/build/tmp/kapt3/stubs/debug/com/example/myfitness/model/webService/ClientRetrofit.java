package com.example.myfitness.model.webService;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n \t*\u0004\u0018\u00010\r0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n \t*\u0004\u0018\u00010\u00130\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001a"}, d2 = {"Lcom/example/myfitness/model/webService/ClientRetrofit;", "", "()V", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "client", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "getClient", "()Lretrofit2/Retrofit;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "setOkHttpClient", "(Lokhttp3/OkHttpClient;)V", "setService", "typeClass", "app_debug"})
public final class ClientRetrofit {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String baseUrl = "https://myfitnessserver.herokuapp.com/api/";
    private static com.google.gson.Gson gson;
    private static okhttp3.OkHttpClient okHttpClient;
    private static final retrofit2.Retrofit client = null;
    public static final com.example.myfitness.model.webService.ClientRetrofit INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaseUrl() {
        return null;
    }
    
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final void setGson(com.google.gson.Gson p0) {
    }
    
    public final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    public final void setOkHttpClient(okhttp3.OkHttpClient p0) {
    }
    
    public final retrofit2.Retrofit getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object setService(@org.jetbrains.annotations.NotNull()
    java.lang.Object typeClass) {
        return null;
    }
    
    private ClientRetrofit() {
        super();
    }
}