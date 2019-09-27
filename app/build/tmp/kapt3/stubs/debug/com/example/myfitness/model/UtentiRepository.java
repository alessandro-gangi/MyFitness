package com.example.myfitness.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\bJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\bH\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\bH\u0007J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001b0\u001aJ\u0010\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001bH\u0007J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0007J\u0016\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001a2\u0006\u0010\u0013\u001a\u00020\fJ\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001b0\u001a2\u0006\u0010\u0013\u001a\u00020\fJ\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001a2\u0006\u0010\u0015\u001a\u00020\bJ\u000e\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fJ\u001a\u0010%\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010&\u001a\u00020\'H\u0007R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/myfitness/model/UtentiRepository;", "", "utentiDao", "Lcom/example/myfitness/model/local/UtentiDao;", "webService", "Lcom/example/myfitness/model/webService/restService/UserRestService;", "(Lcom/example/myfitness/model/local/UtentiDao;Lcom/example/myfitness/model/webService/restService/UserRestService;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "utenteTmp", "Lcom/example/myfitness/model/dataClasses/Utente;", "getUtenteTmp", "()Lcom/example/myfitness/model/dataClasses/Utente;", "setUtenteTmp", "(Lcom/example/myfitness/model/dataClasses/Utente;)V", "addUtente", "", "utente", "deleteUtente", "username", "fetchUtente", "usernameId", "getUtente", "getUtenti", "Landroidx/lifecycle/LiveData;", "", "getUtentiServer", "login", "", "usr", "pwd", "observeAllenatore", "observeAllenatori", "observeUtente", "updateUtente", "uploadImage", "image", "Ljava/io/File;", "app_debug"})
public final class UtentiRepository {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "UtentiRepository";
    @org.jetbrains.annotations.Nullable()
    private com.example.myfitness.model.dataClasses.Utente utenteTmp;
    private final com.example.myfitness.model.local.UtentiDao utentiDao = null;
    private final com.example.myfitness.model.webService.restService.UserRestService webService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.myfitness.model.dataClasses.Utente getUtenteTmp() {
        return null;
    }
    
    public final void setUtenteTmp(@org.jetbrains.annotations.Nullable()
    com.example.myfitness.model.dataClasses.Utente p0) {
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
    java.lang.String username) {
    }
    
    public final void updateUtente(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente utente) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.GINGERBREAD)
    public final com.example.myfitness.model.dataClasses.Utente getUtente(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Utente>> getUtenti() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.GINGERBREAD)
    public final java.util.List<com.example.myfitness.model.dataClasses.Utente> getUtentiServer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.GINGERBREAD)
    public final com.example.myfitness.model.dataClasses.Utente fetchUtente(@org.jetbrains.annotations.NotNull()
    java.lang.String usernameId) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.GINGERBREAD)
    public final boolean login(@org.jetbrains.annotations.NotNull()
    java.lang.String usr, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.GINGERBREAD)
    public final java.lang.String uploadImage(@org.jetbrains.annotations.NotNull()
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