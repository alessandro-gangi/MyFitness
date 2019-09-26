package com.example.myfitness.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J&\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00182\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011J\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001c2\u0006\u0010\u000e\u001a\u00020\bJ\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001e0\u001c2\u0006\u0010\u000e\u001a\u00020\bJ\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001e0\u001c2\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bJ\u0016\u0010!\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\"\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/myfitness/model/SchedeRepository;", "", "schedeDao", "Lcom/example/myfitness/model/local/SchedeDao;", "webService", "Lcom/example/myfitness/model/webService/restService/CardRestService;", "(Lcom/example/myfitness/model/local/SchedeDao;Lcom/example/myfitness/model/webService/restService/CardRestService;)V", "TAG", "", "addScheda", "", "card", "Lcom/example/myfitness/model/dataClasses/Scheda;", "deleteAllUserSchede", "usernameId", "deleteScheda", "cardId", "", "fetchSchede", "getCardServer", "getScheda", "getSchedaGiornaliera", "Ljava/util/ArrayList;", "Lcom/example/myfitness/model/dataClasses/Esercizio;", "Lkotlin/collections/ArrayList;", "id", "numGiorno", "observeCurrentScheda", "Landroidx/lifecycle/LiveData;", "observeRichiesteCompletate", "", "observeSchede", "removeCurrentScheda", "setAsCurrentScheda", "updateScheda", "app_debug"})
public final class SchedeRepository {
    private final java.lang.String TAG = "SchedeRepository";
    private final com.example.myfitness.model.local.SchedeDao schedeDao = null;
    private final com.example.myfitness.model.webService.restService.CardRestService webService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Scheda>> observeSchede(@org.jetbrains.annotations.NotNull()
    java.lang.String usernameId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.myfitness.model.dataClasses.Scheda> observeCurrentScheda(@org.jetbrains.annotations.NotNull()
    java.lang.String usernameId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Scheda>> observeRichiesteCompletate(@org.jetbrains.annotations.NotNull()
    java.lang.String usernameId) {
        return null;
    }
    
    public final void addScheda(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Scheda card) {
    }
    
    public final void deleteScheda(int cardId) {
    }
    
    public final void updateScheda(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Scheda card) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Scheda getScheda(int cardId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.myfitness.model.dataClasses.Scheda getCardServer(int cardId) {
        return null;
    }
    
    public final void setAsCurrentScheda(int cardId, @org.jetbrains.annotations.NotNull()
    java.lang.String usernameId) {
    }
    
    public final void removeCurrentScheda(@org.jetbrains.annotations.NotNull()
    java.lang.String usernameId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> getSchedaGiornaliera(int id, int numGiorno) {
        return null;
    }
    
    public final void deleteAllUserSchede(@org.jetbrains.annotations.NotNull()
    java.lang.String usernameId) {
    }
    
    public final void fetchSchede(@org.jetbrains.annotations.NotNull()
    java.lang.String usernameId) {
    }
    
    public SchedeRepository(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.local.SchedeDao schedeDao, @org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.webService.restService.CardRestService webService) {
        super();
    }
}