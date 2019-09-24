package com.example.myfitness.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tJ\u0006\u0010\u0019\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cJ&\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001cJ\u0006\u0010#\u001a\u00020\u0017J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001cJ\u000e\u0010&\u001a\u00020\'2\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010(\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R)\u0010\u0007\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t \n*\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R5\u0010\u000f\u001a&\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010 \n*\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010\u0018\u00010\b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR5\u0010\u0012\u001a&\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010 \n*\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010\u0018\u00010\b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/example/myfitness/viewmodel/SchedeViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "TAG", "", "currentSchedaUtente", "Landroidx/lifecycle/LiveData;", "Lcom/example/myfitness/model/dataClasses/Scheda;", "kotlin.jvm.PlatformType", "getCurrentSchedaUtente", "()Landroidx/lifecycle/LiveData;", "repository", "Lcom/example/myfitness/model/SchedeRepository;", "richiesteCompletate", "", "getRichiesteCompletate", "schedeUtente", "getSchedeUtente", "username", "Landroidx/lifecycle/MutableLiveData;", "addScheda", "Lkotlinx/coroutines/Job;", "scheda", "deleteAllUserSchede", "deleteScheda", "id", "", "getScheda", "getSchedaGiornaliera", "Ljava/util/ArrayList;", "Lcom/example/myfitness/model/dataClasses/Esercizio;", "Lkotlin/collections/ArrayList;", "numGiorno", "removeCurrentScheda", "setAsCurrentScheda", "idScheda", "setUsername", "", "updateScheda", "app_debug"})
public class SchedeViewModel extends androidx.lifecycle.AndroidViewModel {
    private final java.lang.String TAG = "SchedeViewModel";
    private final androidx.lifecycle.MutableLiveData<java.lang.String> username = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Scheda>> schedeUtente = null;
    private final androidx.lifecycle.LiveData<com.example.myfitness.model.dataClasses.Scheda> currentSchedaUtente = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Scheda>> richiesteCompletate = null;
    private final com.example.myfitness.model.SchedeRepository repository = null;
    
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Scheda>> getSchedeUtente() {
        return null;
    }
    
    public final androidx.lifecycle.LiveData<com.example.myfitness.model.dataClasses.Scheda> getCurrentSchedaUtente() {
        return null;
    }
    
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Scheda>> getRichiesteCompletate() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addScheda(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Scheda scheda) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateScheda(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Scheda scheda) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteScheda(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Scheda getScheda(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job setAsCurrentScheda(int idScheda) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job removeCurrentScheda() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> getSchedaGiornaliera(int id, int numGiorno) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteAllUserSchede() {
        return null;
    }
    
    public SchedeViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}