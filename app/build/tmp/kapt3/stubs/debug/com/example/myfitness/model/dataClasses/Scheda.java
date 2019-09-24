package com.example.myfitness.model.dataClasses;

import java.lang.System;

@androidx.room.Entity(tableName = "schede_table")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012.\b\u0002\u0010\f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\rj\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f`\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\t\u00101\u001a\u00020\u0006H\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\t\u00103\u001a\u00020\nH\u00c6\u0003J\t\u00104\u001a\u00020\nH\u00c6\u0003J/\u00105\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\rj\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f`\u000fH\u00c6\u0003J\t\u00106\u001a\u00020\u0011H\u00c6\u0003J\u0089\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2.\b\u0002\u0010\f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\rj\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f`\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u00108\u001a\u00020\u00112\b\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020\u0003H\u00d6\u0001J\b\u0010;\u001a\u00020\u0006H\u0016R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR@\u0010\f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\rj\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f`\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001e\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010\'R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010\u001a\u00a8\u0006<"}, d2 = {"Lcom/example/myfitness/model/dataClasses/Scheda;", "", "schedaId", "", "num_giorni", "data", "", "tipo", "commento", "autore", "Lcom/example/myfitness/model/dataClasses/Utente;", "possessore", "esercizi", "Ljava/util/ArrayList;", "Lcom/example/myfitness/model/dataClasses/Esercizio;", "Lkotlin/collections/ArrayList;", "is_current", "", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/myfitness/model/dataClasses/Utente;Lcom/example/myfitness/model/dataClasses/Utente;Ljava/util/ArrayList;Z)V", "getAutore", "()Lcom/example/myfitness/model/dataClasses/Utente;", "setAutore", "(Lcom/example/myfitness/model/dataClasses/Utente;)V", "getCommento", "()Ljava/lang/String;", "setCommento", "(Ljava/lang/String;)V", "getData", "setData", "getEsercizi", "()Ljava/util/ArrayList;", "setEsercizi", "(Ljava/util/ArrayList;)V", "()Z", "set_current", "(Z)V", "getNum_giorni", "()I", "setNum_giorni", "(I)V", "getPossessore", "setPossessore", "getSchedaId", "setSchedaId", "getTipo", "setTipo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Scheda {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int schedaId;
    private int num_giorni;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String data;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String tipo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String commento;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "autore_")
    private com.example.myfitness.model.dataClasses.Utente autore;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "possessore_")
    private com.example.myfitness.model.dataClasses.Utente possessore;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio>> esercizi;
    private boolean is_current;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public final int getSchedaId() {
        return 0;
    }
    
    public final void setSchedaId(int p0) {
    }
    
    public final int getNum_giorni() {
        return 0;
    }
    
    public final void setNum_giorni(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTipo() {
        return null;
    }
    
    public final void setTipo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCommento() {
        return null;
    }
    
    public final void setCommento(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Utente getAutore() {
        return null;
    }
    
    public final void setAutore(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Utente getPossessore() {
        return null;
    }
    
    public final void setPossessore(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio>> getEsercizi() {
        return null;
    }
    
    public final void setEsercizi(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio>> p0) {
    }
    
    public final boolean is_current() {
        return false;
    }
    
    public final void set_current(boolean p0) {
    }
    
    public Scheda(int schedaId, int num_giorni, @org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String tipo, @org.jetbrains.annotations.NotNull()
    java.lang.String commento, @org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente autore, @org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente possessore, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio>> esercizi, boolean is_current) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Utente component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Utente component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio>> component8() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Scheda copy(int schedaId, int num_giorni, @org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String tipo, @org.jetbrains.annotations.NotNull()
    java.lang.String commento, @org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente autore, @org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente possessore, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio>> esercizi, boolean is_current) {
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