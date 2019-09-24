package com.example.myfitness.model.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\'J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b2\u0006\u0010\b\u001a\u00020\tH\'J\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000b2\u0006\u0010\b\u001a\u00020\tH\'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH\'J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/example/myfitness/model/local/UtentiDao;", "", "addUtente", "", "utente", "Lcom/example/myfitness/model/dataClasses/Utente;", "deleteAllUtenti", "deleteUtente", "username", "", "getObservableAllenatori", "Landroidx/lifecycle/LiveData;", "", "getObservableUtente", "getObservableUtenti", "getUtente", "updateUtente", "app_debug"})
public abstract interface UtentiDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from utenti_table ORDER BY usernameId ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Utente>> getObservableUtenti();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from utenti_table WHERE flagAllenatore = 1 AND usernameId != :username ORDER BY usernameId ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Utente>> getObservableAllenatori(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * from utenti_table WHERE usernameId = :username LIMIT 1")
    public abstract com.example.myfitness.model.dataClasses.Utente getUtente(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from utenti_table WHERE usernameId = :username LIMIT 1")
    public abstract androidx.lifecycle.LiveData<com.example.myfitness.model.dataClasses.Utente> getObservableUtente(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void addUtente(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente utente);
    
    @androidx.room.Update()
    public abstract void updateUtente(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente utente);
    
    @androidx.room.Query(value = "DELETE FROM utenti_table WHERE usernameId = :username")
    public abstract void deleteUtente(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    @androidx.room.Query(value = "DELETE FROM utenti_table")
    public abstract void deleteAllUtenti();
}