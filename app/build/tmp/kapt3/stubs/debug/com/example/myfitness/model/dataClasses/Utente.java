package com.example.myfitness.model.dataClasses;

import java.lang.System;

@androidx.room.Entity(tableName = "utenti_table")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0014J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010<\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\t\u0010=\u001a\u00020\u0012H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0007H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u009c\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00072\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010K\u001a\u00020\u000bH\u00d6\u0001J\b\u0010L\u001a\u00020\u0003H\u0016R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0016\"\u0004\b-\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0016\"\u0004\b/\u0010\u0018R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0016\"\u0004\b1\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\u0018R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0016\u00a8\u0006M"}, d2 = {"Lcom/example/myfitness/model/dataClasses/Utente;", "", "usernameId", "", "mail", "password", "flagAllenatore", "", "nome", "cognome", "eta", "", "descrizione", "imageURI", "peso", "", "altezza", "genere", "", "allenatore", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;CLjava/lang/String;)V", "getAllenatore", "()Ljava/lang/String;", "setAllenatore", "(Ljava/lang/String;)V", "getAltezza", "()Ljava/lang/Integer;", "setAltezza", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCognome", "setCognome", "getDescrizione", "setDescrizione", "getEta", "setEta", "getFlagAllenatore", "()Z", "setFlagAllenatore", "(Z)V", "getGenere", "()C", "setGenere", "(C)V", "getImageURI", "setImageURI", "getMail", "setMail", "getNome", "setNome", "getPassword", "setPassword", "getPeso", "()Ljava/lang/Double;", "setPeso", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getUsernameId", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;CLjava/lang/String;)Lcom/example/myfitness/model/dataClasses/Utente;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Utente {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private final java.lang.String usernameId = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mail;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String password;
    private boolean flagAllenatore;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nome;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cognome;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer eta;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String descrizione;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String imageURI;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double peso;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer altezza;
    private char genere;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String allenatore;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsernameId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMail() {
        return null;
    }
    
    public final void setMail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getFlagAllenatore() {
        return false;
    }
    
    public final void setFlagAllenatore(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNome() {
        return null;
    }
    
    public final void setNome(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCognome() {
        return null;
    }
    
    public final void setCognome(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEta() {
        return null;
    }
    
    public final void setEta(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescrizione() {
        return null;
    }
    
    public final void setDescrizione(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageURI() {
        return null;
    }
    
    public final void setImageURI(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPeso() {
        return null;
    }
    
    public final void setPeso(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAltezza() {
        return null;
    }
    
    public final void setAltezza(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final char getGenere() {
        return '\u0000';
    }
    
    public final void setGenere(char p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAllenatore() {
        return null;
    }
    
    public final void setAllenatore(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public Utente(@org.jetbrains.annotations.NotNull()
    java.lang.String usernameId, @org.jetbrains.annotations.NotNull()
    java.lang.String mail, @org.jetbrains.annotations.NotNull()
    java.lang.String password, boolean flagAllenatore, @org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    java.lang.String cognome, @org.jetbrains.annotations.Nullable()
    java.lang.Integer eta, @org.jetbrains.annotations.Nullable()
    java.lang.String descrizione, @org.jetbrains.annotations.Nullable()
    java.lang.String imageURI, @org.jetbrains.annotations.Nullable()
    java.lang.Double peso, @org.jetbrains.annotations.Nullable()
    java.lang.Integer altezza, char genere, @org.jetbrains.annotations.Nullable()
    java.lang.String allenatore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    public final char component12() {
        return '\u0000';
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Utente copy(@org.jetbrains.annotations.NotNull()
    java.lang.String usernameId, @org.jetbrains.annotations.NotNull()
    java.lang.String mail, @org.jetbrains.annotations.NotNull()
    java.lang.String password, boolean flagAllenatore, @org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    java.lang.String cognome, @org.jetbrains.annotations.Nullable()
    java.lang.Integer eta, @org.jetbrains.annotations.Nullable()
    java.lang.String descrizione, @org.jetbrains.annotations.Nullable()
    java.lang.String imageURI, @org.jetbrains.annotations.Nullable()
    java.lang.Double peso, @org.jetbrains.annotations.Nullable()
    java.lang.Integer altezza, char genere, @org.jetbrains.annotations.Nullable()
    java.lang.String allenatore) {
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