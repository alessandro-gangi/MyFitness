package com.example.myfitness.model.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J6\u0010\t\u001a\u00020\n2,\u0010\u000b\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\fj\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e`\u000eH\u0007J8\u0010\u000f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\fj\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e`\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/example/myfitness/model/local/DataConverter;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "eserciziToString", "", "esercizi", "Ljava/util/ArrayList;", "Lcom/example/myfitness/model/dataClasses/Esercizio;", "Lkotlin/collections/ArrayList;", "stringToEsercizi", "data", "app_debug"})
public final class DataConverter {
    @org.jetbrains.annotations.NotNull()
    private com.google.gson.Gson gson;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final void setGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.ArrayList<java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio>> stringToEsercizi(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String eserciziToString(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio>> esercizi) {
        return null;
    }
    
    public DataConverter() {
        super();
    }
}