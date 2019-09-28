package com.example.myfitness.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\bJ\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00180\u00172\u0006\u0010\u0019\u001a\u00020\bR\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/myfitness/model/RichiesteRepository;", "", "richiesteDao", "Lcom/example/myfitness/model/local/RichiesteDao;", "webService", "Lcom/example/myfitness/model/webService/restService/RequestRestService;", "(Lcom/example/myfitness/model/local/RichiesteDao;Lcom/example/myfitness/model/webService/restService/RequestRestService;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "addRichiesta", "", "request", "Lcom/example/myfitness/model/dataClasses/Richiesta;", "deleteRichiesta", "fetchRichieste", "usernameId", "getRichiestaFromAtoB", "a", "Lcom/example/myfitness/model/dataClasses/Utente;", "b", "observeRichieste", "Landroidx/lifecycle/LiveData;", "", "username", "app_debug"})
public final class RichiesteRepository {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "RichiesteRepository";
    private final com.example.myfitness.model.local.RichiesteDao richiesteDao = null;
    private final com.example.myfitness.model.webService.restService.RequestRestService webService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Richiesta>> observeRichieste(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    public final void addRichiesta(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Richiesta request) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.myfitness.model.dataClasses.Richiesta getRichiestaFromAtoB(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente a, @org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente b) {
        return null;
    }
    
    public final void deleteRichiesta(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Richiesta request) {
    }
    
    public final void fetchRichieste(@org.jetbrains.annotations.NotNull()
    java.lang.String usernameId) {
    }
    
    public RichiesteRepository(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.local.RichiesteDao richiesteDao, @org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.webService.restService.RequestRestService webService) {
        super();
    }
}