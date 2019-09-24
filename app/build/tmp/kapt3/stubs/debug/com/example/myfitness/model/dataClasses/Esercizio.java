package com.example.myfitness.model.dataClasses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010 \u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003JF\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001J\b\u0010(\u001a\u00020\u0003H\u0016R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019\u00a8\u0006)"}, d2 = {"Lcom/example/myfitness/model/dataClasses/Esercizio;", "", "nome", "", "serie", "", "ripetizioni", "recupero", "", "commento", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;)V", "getCommento", "()Ljava/lang/String;", "setCommento", "(Ljava/lang/String;)V", "getNome", "setNome", "getRecupero", "()Ljava/lang/Double;", "setRecupero", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getRipetizioni", "()Ljava/lang/Integer;", "setRipetizioni", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSerie", "setSerie", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;)Lcom/example/myfitness/model/dataClasses/Esercizio;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Esercizio {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nome;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer serie;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer ripetizioni;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double recupero;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String commento;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNome() {
        return null;
    }
    
    public final void setNome(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSerie() {
        return null;
    }
    
    public final void setSerie(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRipetizioni() {
        return null;
    }
    
    public final void setRipetizioni(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getRecupero() {
        return null;
    }
    
    public final void setRecupero(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCommento() {
        return null;
    }
    
    public final void setCommento(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Esercizio(@org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.Nullable()
    java.lang.Integer serie, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ripetizioni, @org.jetbrains.annotations.Nullable()
    java.lang.Double recupero, @org.jetbrains.annotations.NotNull()
    java.lang.String commento) {
        super();
    }
    
    public Esercizio() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Esercizio copy(@org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.Nullable()
    java.lang.Integer serie, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ripetizioni, @org.jetbrains.annotations.Nullable()
    java.lang.Double recupero, @org.jetbrains.annotations.NotNull()
    java.lang.String commento) {
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