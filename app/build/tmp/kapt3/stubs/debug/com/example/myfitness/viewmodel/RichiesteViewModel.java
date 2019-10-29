package com.example.myfitness.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eJ\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\u000b\u001a&\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r \u000f*\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0018\u00010\f0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/myfitness/viewmodel/RichiesteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "TAG", "", "TOKEN_KEY", "USER_DATA_PREFERENCE", "repository", "Lcom/example/myfitness/model/RichiesteRepository;", "richieste", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/myfitness/model/dataClasses/Richiesta;", "kotlin.jvm.PlatformType", "getRichieste", "()Landroidx/lifecycle/LiveData;", "setRichieste", "(Landroidx/lifecycle/LiveData;)V", "token", "username", "Landroidx/lifecycle/MutableLiveData;", "addRichiesta", "", "richiesta", "deleteRichiesta", "getRichiesta", "id", "", "getRichiestaFromAtoB", "a", "Lcom/example/myfitness/model/dataClasses/Utente;", "b", "setUsername", "app_debug"})
public final class RichiesteViewModel extends androidx.lifecycle.AndroidViewModel {
    private final java.lang.String TAG = "RichiesteViewModel";
    private final java.lang.String USER_DATA_PREFERENCE = "USER_DATA_PREFERENCE";
    private final java.lang.String TOKEN_KEY = "TOKEN";
    private final androidx.lifecycle.MutableLiveData<java.lang.String> username = null;
    private androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Richiesta>> richieste;
    private final com.example.myfitness.model.RichiesteRepository repository = null;
    private java.lang.String token;
    
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Richiesta>> getRichieste() {
        return null;
    }
    
    public final void setRichieste(androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Richiesta>> p0) {
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    public final void addRichiesta(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Richiesta richiesta) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.myfitness.model.dataClasses.Richiesta getRichiesta(int id) {
        return null;
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
    
    public RichiesteViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}