package com.example.myfitness.model.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001e\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\'\u00a8\u0006\u0013"}, d2 = {"Lcom/example/myfitness/model/local/RichiesteDao;", "", "addRichiesta", "", "richiesta", "Lcom/example/myfitness/model/dataClasses/Richiesta;", "deleteRichiesta", "", "getObservableRichieste", "Landroidx/lifecycle/LiveData;", "", "username", "", "getRichiesta", "richiestaID", "", "getRichiestaFromAtoB", "utenteUsername", "allenatoreUsername", "app_debug"})
public abstract interface RichiesteDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM richieste_table WHERE allenatore_usernameId = :username")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Richiesta>> getObservableRichieste(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract long addRichiesta(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Richiesta richiesta);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM richieste_table WHERE richiestaId = :richiestaID LIMIT 1")
    public abstract com.example.myfitness.model.dataClasses.Richiesta getRichiesta(int richiestaID);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM richieste_table WHERE utente_usernameId = :utenteUsername AND allenatore_usernameId = :allenatoreUsername LIMIT 1")
    public abstract com.example.myfitness.model.dataClasses.Richiesta getRichiestaFromAtoB(@org.jetbrains.annotations.NotNull()
    java.lang.String utenteUsername, @org.jetbrains.annotations.NotNull()
    java.lang.String allenatoreUsername);
    
    @androidx.room.Delete()
    public abstract void deleteRichiesta(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Richiesta richiesta);
}