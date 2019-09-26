package com.example.myfitness.model.local;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.myfitness.model.local.DataConverter.class})
@androidx.room.Database(entities = {com.example.myfitness.model.dataClasses.Utente.class, com.example.myfitness.model.dataClasses.Scheda.class, com.example.myfitness.model.dataClasses.Richiesta.class}, version = 17)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/example/myfitness/model/local/MyDatabase;", "Landroidx/room/RoomDatabase;", "()V", "RichiesteDao", "Lcom/example/myfitness/model/local/RichiesteDao;", "SchedeDao", "Lcom/example/myfitness/model/local/SchedeDao;", "UtentiDao", "Lcom/example/myfitness/model/local/UtentiDao;", "Companion", "app_debug"})
public abstract class MyDatabase extends androidx.room.RoomDatabase {
    private static volatile com.example.myfitness.model.local.MyDatabase INSTANCE;
    public static final com.example.myfitness.model.local.MyDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.myfitness.model.local.UtentiDao UtentiDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.myfitness.model.local.SchedeDao SchedeDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.myfitness.model.local.RichiesteDao RichiesteDao();
    
    public MyDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/myfitness/model/local/MyDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/myfitness/model/local/MyDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myfitness.model.local.MyDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}