package com.example.myfitness.viewmodel;

import java.lang.System;

@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\bJ\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0018J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u0018J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0018J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u0018J\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\bRV\u0010\u0005\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007 \t*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR)\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \t*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0004R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0019\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \t*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000b\u00a8\u0006%"}, d2 = {"Lcom/example/myfitness/viewmodel/UtentiViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allAllenatori", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/myfitness/model/dataClasses/Utente;", "kotlin.jvm.PlatformType", "getAllAllenatori", "()Landroidx/lifecycle/LiveData;", "setAllAllenatori", "(Landroidx/lifecycle/LiveData;)V", "allenatore", "getAllenatore", "app", "getApp", "()Landroid/app/Application;", "setApp", "repository", "Lcom/example/myfitness/model/UtentiRepository;", "username", "Landroidx/lifecycle/MutableLiveData;", "", "utente", "getUtente", "addUtente", "Lkotlinx/coroutines/Job;", "deleteUtente", "login", "", "usr", "pwd", "setUsername", "", "updateUtente", "app_debug"})
public final class UtentiViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> username = null;
    private final androidx.lifecycle.LiveData<com.example.myfitness.model.dataClasses.Utente> utente = null;
    private final androidx.lifecycle.LiveData<com.example.myfitness.model.dataClasses.Utente> allenatore = null;
    private androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Utente>> allAllenatori;
    @org.jetbrains.annotations.NotNull()
    private android.app.Application app;
    private final com.example.myfitness.model.UtentiRepository repository = null;
    
    public final androidx.lifecycle.LiveData<com.example.myfitness.model.dataClasses.Utente> getUtente() {
        return null;
    }
    
    public final androidx.lifecycle.LiveData<com.example.myfitness.model.dataClasses.Utente> getAllenatore() {
        return null;
    }
    
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Utente>> getAllAllenatori() {
        return null;
    }
    
    public final void setAllAllenatori(androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Utente>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApp() {
        return null;
    }
    
    public final void setApp(@org.jetbrains.annotations.NotNull()
    android.app.Application p0) {
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateUtente(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente utente) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addUtente(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente utente) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteUtente(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.myfitness.model.dataClasses.Utente getUtente(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    public final boolean login(@org.jetbrains.annotations.NotNull()
    java.lang.String usr, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
        return false;
    }
    
    public UtentiViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}