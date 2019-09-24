package com.example.myfitness.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nJ\u0018\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\u0007\u001a&\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t \u000b*\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0018\u00010\b0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/myfitness/viewmodel/RichiesteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "repository", "Lcom/example/myfitness/model/RichiesteRepository;", "richieste", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/myfitness/model/dataClasses/Richiesta;", "kotlin.jvm.PlatformType", "getRichieste", "()Landroidx/lifecycle/LiveData;", "setRichieste", "(Landroidx/lifecycle/LiveData;)V", "username", "Landroidx/lifecycle/MutableLiveData;", "", "addRichiesta", "Lkotlinx/coroutines/Job;", "richiesta", "deleteRichiesta", "getRichiestaFromAtoB", "a", "Lcom/example/myfitness/model/dataClasses/Utente;", "b", "setUsername", "", "app_debug"})
public final class RichiesteViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> username = null;
    private androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Richiesta>> richieste;
    private final com.example.myfitness.model.RichiesteRepository repository = null;
    
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Richiesta>> getRichieste() {
        return null;
    }
    
    public final void setRichieste(androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Richiesta>> p0) {
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addRichiesta(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Richiesta richiesta) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.myfitness.model.dataClasses.Richiesta getRichiestaFromAtoB(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente a, @org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente b) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteRichiesta(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Richiesta richiesta) {
        return null;
    }
    
    public RichiesteViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}