package com.example.myfitness.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bJ\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bJ\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bJ\u0018\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bJ\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00192\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001b0\u00192\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00192\u0006\u0010\u0011\u001a\u00020\bJ\u0016\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/myfitness/model/UtentiRepository;", "", "utentiDao", "Lcom/example/myfitness/model/local/UtentiDao;", "webService", "Lcom/example/myfitness/model/webService/restService/UserRestService;", "(Lcom/example/myfitness/model/local/UtentiDao;Lcom/example/myfitness/model/webService/restService/UserRestService;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "addUtente", "", "utente", "Lcom/example/myfitness/model/dataClasses/Utente;", "deleteUtente", "token", "username", "fetchUtente", "usernameId", "getUtente", "login", "usr", "pwd", "observeAllenatore", "Landroidx/lifecycle/LiveData;", "observeAllenatori", "", "observeUtente", "updateUtente", "uploadImage", "image", "Ljava/io/File;", "app_debug"})
public final class UtentiRepository {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "UtentiRepository";
    private final com.example.myfitness.model.local.UtentiDao utentiDao = null;
    private final com.example.myfitness.model.webService.restService.UserRestService webService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Utente>> observeAllenatori(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente utente) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.myfitness.model.dataClasses.Utente> observeUtente(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.myfitness.model.dataClasses.Utente> observeAllenatore(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente utente) {
        return null;
    }
    
    public final void addUtente(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente utente) {
    }
    
    public final void deleteUtente(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    public final void updateUtente(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente utente) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.myfitness.model.dataClasses.Utente getUtente(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.myfitness.model.dataClasses.Utente fetchUtente(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String usernameId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String login(@org.jetbrains.annotations.NotNull()
    java.lang.String usr, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String uploadImage(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.io.File image) {
        return null;
    }
    
    public UtentiRepository(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.local.UtentiDao utentiDao, @org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.webService.restService.UserRestService webService) {
        super();
    }
}