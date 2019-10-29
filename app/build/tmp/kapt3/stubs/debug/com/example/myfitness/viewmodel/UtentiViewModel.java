package com.example.myfitness.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010$\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\fJ\u0016\u0010&\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006J\b\u0010\'\u001a\u0004\u0018\u00010\u0006J\u0010\u0010 \u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u0006J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020)J\u0018\u0010+\u001a\u0004\u0018\u00010\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006J\u000e\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\u0006J\u000e\u00100\u001a\u00020)2\u0006\u0010/\u001a\u00020\u0006J\u000e\u00101\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u0006J\u000e\u00102\u001a\u00020)2\u0006\u0010\u001d\u001a\u00020\u0006J\u000e\u00103\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\fJ\u0018\u00104\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u00105\u001a\u000206R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000RV\u0010\t\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \r*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u000b \r*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \r*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u000b\u0018\u00010\n0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R)\u0010\u0012\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f \r*\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\n0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u001f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f \r*\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\n0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u000fR\u001c\u0010!\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019\u00a8\u00067"}, d2 = {"Lcom/example/myfitness/viewmodel/UtentiViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "TAG", "", "TOKEN_KEY", "USER_DATA_PREFERENCE", "allAllenatori", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/myfitness/model/dataClasses/Utente;", "kotlin.jvm.PlatformType", "getAllAllenatori", "()Landroidx/lifecycle/LiveData;", "setAllAllenatori", "(Landroidx/lifecycle/LiveData;)V", "allenatore", "getAllenatore", "allenatoreImage", "Landroid/graphics/drawable/Drawable;", "getAllenatoreImage", "()Landroid/graphics/drawable/Drawable;", "setAllenatoreImage", "(Landroid/graphics/drawable/Drawable;)V", "repository", "Lcom/example/myfitness/model/UtentiRepository;", "token", "username", "Landroidx/lifecycle/MutableLiveData;", "utente", "getUtente", "utenteImage", "getUtenteImage", "setUtenteImage", "addUtente", "Lkotlinx/coroutines/Job;", "deleteUtente", "getToken", "initImageAllenatore", "", "initImageUtente", "login", "usr", "pwd", "setImageAllenatore", "imageURL", "setImageUtente", "setToken", "setUsername", "updateUtente", "uploadImage", "image", "Ljava/io/File;", "app_debug"})
public final class UtentiViewModel extends androidx.lifecycle.AndroidViewModel {
    private final java.lang.String TAG = "UtentiViewModel";
    private final java.lang.String USER_DATA_PREFERENCE = "USER_DATA_PREFERENCE";
    private final java.lang.String TOKEN_KEY = "TOKEN";
    private final androidx.lifecycle.MutableLiveData<java.lang.String> username = null;
    private final androidx.lifecycle.LiveData<com.example.myfitness.model.dataClasses.Utente> utente = null;
    private final androidx.lifecycle.LiveData<com.example.myfitness.model.dataClasses.Utente> allenatore = null;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.drawable.Drawable utenteImage;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.drawable.Drawable allenatoreImage;
    private androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Utente>> allAllenatori;
    private java.lang.String token;
    private final com.example.myfitness.model.UtentiRepository repository = null;
    
    public final androidx.lifecycle.LiveData<com.example.myfitness.model.dataClasses.Utente> getUtente() {
        return null;
    }
    
    public final androidx.lifecycle.LiveData<com.example.myfitness.model.dataClasses.Utente> getAllenatore() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.drawable.Drawable getUtenteImage() {
        return null;
    }
    
    public final void setUtenteImage(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.drawable.Drawable getAllenatoreImage() {
        return null;
    }
    
    public final void setAllenatoreImage(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable p0) {
    }
    
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Utente>> getAllAllenatori() {
        return null;
    }
    
    public final void setAllAllenatori(androidx.lifecycle.LiveData<java.util.List<com.example.myfitness.model.dataClasses.Utente>> p0) {
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    public final void initImageUtente() {
    }
    
    public final void initImageAllenatore() {
    }
    
    public final void setImageUtente(@org.jetbrains.annotations.NotNull()
    java.lang.String imageURL) {
    }
    
    public final void setImageAllenatore(@org.jetbrains.annotations.NotNull()
    java.lang.String imageURL) {
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateUtente(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente utente) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addUtente(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Utente utente) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String uploadImage(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.io.File image) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.myfitness.model.dataClasses.Utente getUtente(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String login(@org.jetbrains.annotations.NotNull()
    java.lang.String usr, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteUtente(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    public UtentiViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}