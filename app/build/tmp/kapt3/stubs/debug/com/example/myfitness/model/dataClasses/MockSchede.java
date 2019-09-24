package com.example.myfitness.model.dataClasses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b>\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001a\u0010 \u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001a\u0010#\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u001a\u0010&\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0014\"\u0004\b(\u0010\u0016R\u001a\u0010)\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001a\u00101\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R(\u00104\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00120\u00120\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\b\"\u0004\b7\u0010\nR(\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00120\u00120\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\b\"\u0004\b:\u0010\nR(\u0010;\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00120\u00120\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\b\"\u0004\b=\u0010\nR(\u0010>\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00120\u00120\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\b\"\u0004\b@\u0010\nR(\u0010A\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00120\u00120\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\b\"\u0004\bC\u0010\nR(\u0010D\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00120\u00120\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\b\"\u0004\bF\u0010\nR(\u0010G\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00120\u00120\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\b\"\u0004\bI\u0010\nR(\u0010J\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00120\u00120\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\b\"\u0004\bL\u0010\nR(\u0010M\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00120\u00120\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\b\"\u0004\bO\u0010\n\u00a8\u0006P"}, d2 = {"Lcom/example/myfitness/model/dataClasses/MockSchede;", "", "()V", "allMockSchede", "Ljava/util/ArrayList;", "Lcom/example/myfitness/model/dataClasses/Scheda;", "Lkotlin/collections/ArrayList;", "getAllMockSchede", "()Ljava/util/ArrayList;", "setAllMockSchede", "(Ljava/util/ArrayList;)V", "commento1", "", "getCommento1", "()Ljava/lang/String;", "setCommento1", "(Ljava/lang/String;)V", "es1", "Lcom/example/myfitness/model/dataClasses/Esercizio;", "getEs1", "()Lcom/example/myfitness/model/dataClasses/Esercizio;", "setEs1", "(Lcom/example/myfitness/model/dataClasses/Esercizio;)V", "es2", "getEs2", "setEs2", "es3", "getEs3", "setEs3", "es4", "getEs4", "setEs4", "es5", "getEs5", "setEs5", "es6", "getEs6", "setEs6", "es7", "getEs7", "setEs7", "mockScheda1", "getMockScheda1", "()Lcom/example/myfitness/model/dataClasses/Scheda;", "setMockScheda1", "(Lcom/example/myfitness/model/dataClasses/Scheda;)V", "mockScheda2", "getMockScheda2", "setMockScheda2", "mockScheda3", "getMockScheda3", "setMockScheda3", "schedaGiornaliera1a", "kotlin.jvm.PlatformType", "getSchedaGiornaliera1a", "setSchedaGiornaliera1a", "schedaGiornaliera1b", "getSchedaGiornaliera1b", "setSchedaGiornaliera1b", "schedaGiornaliera1c", "getSchedaGiornaliera1c", "setSchedaGiornaliera1c", "schedaGiornaliera2a", "getSchedaGiornaliera2a", "setSchedaGiornaliera2a", "schedaGiornaliera2b", "getSchedaGiornaliera2b", "setSchedaGiornaliera2b", "schedaGiornaliera2c", "getSchedaGiornaliera2c", "setSchedaGiornaliera2c", "schedaGiornaliera2d", "getSchedaGiornaliera2d", "setSchedaGiornaliera2d", "schedaGiornaliera3a", "getSchedaGiornaliera3a", "setSchedaGiornaliera3a", "schedaGiornaliera3b", "getSchedaGiornaliera3b", "setSchedaGiornaliera3b", "app_debug"})
public final class MockSchede {
    @org.jetbrains.annotations.NotNull()
    private static com.example.myfitness.model.dataClasses.Esercizio es1;
    @org.jetbrains.annotations.NotNull()
    private static com.example.myfitness.model.dataClasses.Esercizio es2;
    @org.jetbrains.annotations.NotNull()
    private static com.example.myfitness.model.dataClasses.Esercizio es3;
    @org.jetbrains.annotations.NotNull()
    private static com.example.myfitness.model.dataClasses.Esercizio es4;
    @org.jetbrains.annotations.NotNull()
    private static com.example.myfitness.model.dataClasses.Esercizio es5;
    @org.jetbrains.annotations.NotNull()
    private static com.example.myfitness.model.dataClasses.Esercizio es6;
    @org.jetbrains.annotations.NotNull()
    private static com.example.myfitness.model.dataClasses.Esercizio es7;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> schedaGiornaliera1a;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> schedaGiornaliera1b;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> schedaGiornaliera1c;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> schedaGiornaliera2a;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> schedaGiornaliera2b;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> schedaGiornaliera2c;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> schedaGiornaliera2d;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> schedaGiornaliera3a;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> schedaGiornaliera3b;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String commento1;
    @org.jetbrains.annotations.NotNull()
    private static com.example.myfitness.model.dataClasses.Scheda mockScheda1;
    @org.jetbrains.annotations.NotNull()
    private static com.example.myfitness.model.dataClasses.Scheda mockScheda2;
    @org.jetbrains.annotations.NotNull()
    private static com.example.myfitness.model.dataClasses.Scheda mockScheda3;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.example.myfitness.model.dataClasses.Scheda> allMockSchede;
    public static final com.example.myfitness.model.dataClasses.MockSchede INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Esercizio getEs1() {
        return null;
    }
    
    public final void setEs1(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Esercizio p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Esercizio getEs2() {
        return null;
    }
    
    public final void setEs2(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Esercizio p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Esercizio getEs3() {
        return null;
    }
    
    public final void setEs3(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Esercizio p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Esercizio getEs4() {
        return null;
    }
    
    public final void setEs4(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Esercizio p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Esercizio getEs5() {
        return null;
    }
    
    public final void setEs5(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Esercizio p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Esercizio getEs6() {
        return null;
    }
    
    public final void setEs6(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Esercizio p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Esercizio getEs7() {
        return null;
    }
    
    public final void setEs7(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Esercizio p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> getSchedaGiornaliera1a() {
        return null;
    }
    
    public final void setSchedaGiornaliera1a(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> getSchedaGiornaliera1b() {
        return null;
    }
    
    public final void setSchedaGiornaliera1b(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> getSchedaGiornaliera1c() {
        return null;
    }
    
    public final void setSchedaGiornaliera1c(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> getSchedaGiornaliera2a() {
        return null;
    }
    
    public final void setSchedaGiornaliera2a(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> getSchedaGiornaliera2b() {
        return null;
    }
    
    public final void setSchedaGiornaliera2b(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> getSchedaGiornaliera2c() {
        return null;
    }
    
    public final void setSchedaGiornaliera2c(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> getSchedaGiornaliera2d() {
        return null;
    }
    
    public final void setSchedaGiornaliera2d(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> getSchedaGiornaliera3a() {
        return null;
    }
    
    public final void setSchedaGiornaliera3a(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> getSchedaGiornaliera3b() {
        return null;
    }
    
    public final void setSchedaGiornaliera3b(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCommento1() {
        return null;
    }
    
    public final void setCommento1(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Scheda getMockScheda1() {
        return null;
    }
    
    public final void setMockScheda1(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Scheda p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Scheda getMockScheda2() {
        return null;
    }
    
    public final void setMockScheda2(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Scheda p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.model.dataClasses.Scheda getMockScheda3() {
        return null;
    }
    
    public final void setMockScheda3(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Scheda p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myfitness.model.dataClasses.Scheda> getAllMockSchede() {
        return null;
    }
    
    public final void setAllMockSchede(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myfitness.model.dataClasses.Scheda> p0) {
    }
    
    private MockSchede() {
        super();
    }
}