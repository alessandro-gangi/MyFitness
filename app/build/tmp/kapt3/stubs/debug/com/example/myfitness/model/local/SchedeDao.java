package com.example.myfitness.model.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\b\u0010\t\u001a\u00020\u0007H\'J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0011H\'J\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00112\u0006\u0010\u000b\u001a\u00020\fH\'J\u001e\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b0\u00112\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u001e\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b0\u00112\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\'J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u001a"}, d2 = {"Lcom/example/myfitness/model/local/SchedeDao;", "", "addScheda", "", "scheda", "Lcom/example/myfitness/model/dataClasses/Scheda;", "addSchede", "", "", "deleteAllSchede", "deleteAllUserSchede", "username", "", "deleteScheda", "schedaId", "", "getAllSchede", "Landroidx/lifecycle/LiveData;", "getCurrentScheda", "getRichiesteCompletate", "getScheda", "getUserSchede", "removeCurrentScheda", "setAsCurrentScheda", "idScheda", "updateScheda", "app_debug"})
public abstract interface SchedeDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from schede_table ORDER BY data ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Scheda>> getAllSchede();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM schede_table WHERE schedaId = :schedaId LIMIT 1")
    public abstract com.example.myfitness.model.dataClasses.Scheda getScheda(int schedaId);
    
    @androidx.room.Query(value = "UPDATE schede_table SET is_current = 1 WHERE possessore_usernameId = :username AND schedaId = :idScheda")
    public abstract void setAsCurrentScheda(int idScheda, @org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    @androidx.room.Query(value = "UPDATE schede_table SET is_current = 0 WHERE possessore_usernameId = :username")
    public abstract void removeCurrentScheda(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract long addScheda(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Scheda scheda);
    
    @androidx.room.Update()
    public abstract void updateScheda(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Scheda scheda);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void addSchede(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myfitness.model.dataClasses.Scheda> scheda);
    
    @androidx.room.Query(value = "DELETE FROM schede_table WHERE schedaId = :schedaId")
    public abstract void deleteScheda(int schedaId);
    
    @androidx.room.Query(value = "DELETE FROM schede_table WHERE possessore_usernameId = :username")
    public abstract void deleteAllUserSchede(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    @androidx.room.Query(value = "DELETE FROM schede_table WHERE 1 = 1")
    public abstract void deleteAllSchede();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM schede_table WHERE possessore_usernameId = :username")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Scheda>> getUserSchede(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM schede_table WHERE is_current = 1 AND possessore_usernameId = :username LIMIT 1")
    public abstract androidx.lifecycle.LiveData<com.example.myfitness.model.dataClasses.Scheda> getCurrentScheda(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM schede_table WHERE autore_usernameId = :username AND possessore_usernameId != :username")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Scheda>> getRichiesteCompletate(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
}