package com.example.myfitness.model.dataClasses;

import java.lang.System;

@androidx.room.Entity(tableName = "richieste_table")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u00a2\u0006\u0002\u0010\fJ\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\bH\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\bH\u00c6\u0003J\t\u0010&\u001a\u00020\bH\u00c6\u0003JO\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bH\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001J\t\u0010,\u001a\u00020\bH\u00d6\u0001R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u001e\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010\u00a8\u0006-"}, d2 = {"Lcom/example/myfitness/model/dataClasses/Richiesta;", "", "richiestaId", "", "utente", "Lcom/example/myfitness/model/dataClasses/Utente;", "allenatore", "data", "", "numGiorni", "tipologia", "commento", "(ILcom/example/myfitness/model/dataClasses/Utente;Lcom/example/myfitness/model/dataClasses/Utente;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAllenatore", "()Lcom/example/myfitness/model/dataClasses/Utente;", "setAllenatore", "(Lcom/example/myfitness/model/dataClasses/Utente;)V", "getCommento", "()Ljava/lang/String;", "setCommento", "(Ljava/lang/String;)V", "getData", "setData", "getNumGiorni", "()I", "setNumGiorni", "(I)V", "getRichiestaId", "getTipologia", "setTipologia", "getUtente", "setUtente", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Richiesta {
    @androidx.room.ColumnInfo(name = "richiestaId")
    @androidx.room.PrimaryKey()
    private final int richiestaId = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "utente_")
    private com.example.myfitness.model.dataClasses.Utente utente;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "allenatore_")
    private com.example.myfitness.model.dataClasses.Utente allenatore;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "data")
    private java.lang.String data;
    @androidx.room.ColumnInfo(name = "numGiorni")
    private int numGiorni;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "tipologia")
    private java.lang.String tipologia;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "commento")
    private java.lang.String commento;
    
    public final int getRichiestaId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Utente getUtente() {
        return null;
    }
    
    public final void setUtente(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Utente getAllenatore() {
        return null;
    }
    
    public final void setAllenatore(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getNumGiorni() {
        return 0;
    }
    
    public final void setNumGiorni(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTipologia() {
        return null;
    }
    
    public final void setTipologia(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCommento() {
        return null;
    }
    
    public final void setCommento(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Richiesta(int richiestaId, @org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente utente, @org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente allenatore, @org.jetbrains.annotations.NotNull()
    java.lang.String data, int numGiorni, @org.jetbrains.annotations.NotNull()
    java.lang.String tipologia, @org.jetbrains.annotations.NotNull()
    java.lang.String commento) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Utente component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Utente component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Richiesta copy(int richiestaId, @org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente utente, @org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente allenatore, @org.jetbrains.annotations.NotNull()
    java.lang.String data, int numGiorni, @org.jetbrains.annotations.NotNull()
    java.lang.String tipologia, @org.jetbrains.annotations.NotNull()
    java.lang.String commento) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}