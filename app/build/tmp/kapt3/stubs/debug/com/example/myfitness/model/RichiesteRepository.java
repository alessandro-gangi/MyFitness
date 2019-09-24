package com.example.myfitness.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0006R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/myfitness/model/RichiesteRepository;", "", "richiesteDao", "Lcom/example/myfitness/model/local/RichiesteDao;", "(Lcom/example/myfitness/model/local/RichiesteDao;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "addRichiesta", "", "richiesta", "Lcom/example/myfitness/model/dataClasses/Richiesta;", "deleteRichiesta", "fetchRichieste", "usernameId", "getRichiestaFromAtoB", "a", "Lcom/example/myfitness/model/dataClasses/Utente;", "b", "observeRichieste", "Landroidx/lifecycle/LiveData;", "", "username", "app_debug"})
public final class RichiesteRepository {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "RichiesteRepository";
    private final com.example.myfitness.model.local.RichiesteDao richiesteDao = null;
    
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
    com.example.myfitness.model.dataClasses.Richiesta richiesta) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.myfitness.model.dataClasses.Richiesta getRichiestaFromAtoB(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente a, @org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente b) {
        return null;
    }
    
    public final void deleteRichiesta(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Richiesta richiesta) {
    }
    
    public final void fetchRichieste(@org.jetbrains.annotations.NotNull()
    java.lang.String usernameId) {
    }
    
    public RichiesteRepository(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.local.RichiesteDao richiesteDao) {
        super();
    }
}