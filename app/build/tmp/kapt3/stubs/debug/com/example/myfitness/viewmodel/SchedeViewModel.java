package com.example.myfitness.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aJ\u0010\u0010 \u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020\u001aJ\u0006\u0010!\u001a\u00020\u001eJ\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001aJ\u000e\u0010$\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010%\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R)\u0010\t\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000b \f*\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R5\u0010\u0011\u001a&\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012 \f*\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012\u0018\u00010\n0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR5\u0010\u0014\u001a&\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012 \f*\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012\u0018\u00010\n0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/myfitness/viewmodel/SchedeViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "TAG", "", "TOKEN_KEY", "USER_DATA_PREFERENCE", "currentSchedaUtente", "Landroidx/lifecycle/LiveData;", "Lcom/example/myfitness/model/dataClasses/Scheda;", "kotlin.jvm.PlatformType", "getCurrentSchedaUtente", "()Landroidx/lifecycle/LiveData;", "repository", "Lcom/example/myfitness/model/SchedeRepository;", "richiesteCompletate", "", "getRichiesteCompletate", "schedeUtente", "getSchedeUtente", "token", "username", "Landroidx/lifecycle/MutableLiveData;", "addScheda", "", "scheda", "(Lcom/example/myfitness/model/dataClasses/Scheda;)Ljava/lang/Integer;", "deleteScheda", "", "id", "getScheda", "removeCurrentScheda", "setAsCurrentScheda", "idScheda", "setUsername", "updateScheda", "app_debug"})
public class SchedeViewModel extends androidx.lifecycle.AndroidViewModel {
    private final java.lang.String TAG = "SchedeViewModel";
    private final java.lang.String USER_DATA_PREFERENCE = "USER_DATA_PREFERENCE";
    private final java.lang.String TOKEN_KEY = "TOKEN";
    private final androidx.lifecycle.MutableLiveData<java.lang.String> username = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Scheda>> schedeUtente = null;
    private final androidx.lifecycle.LiveData<com.example.myfitness.model.dataClasses.Scheda> currentSchedaUtente = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Scheda>> richiesteCompletate = null;
    private final com.example.myfitness.model.SchedeRepository repository = null;
    private java.lang.String token;
    
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer addScheda(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Scheda scheda) {
        return null;
    }
    
    public final void updateScheda(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Scheda scheda) {
    }
    
    public final void deleteScheda(int id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.myfitness.model.dataClasses.Scheda getScheda(int id) {
        return null;
    }
    
    public final void setAsCurrentScheda(int idScheda) {
    }
    
    public final void removeCurrentScheda() {
    }
    
    public SchedeViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}