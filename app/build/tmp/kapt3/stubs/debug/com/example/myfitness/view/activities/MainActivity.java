package com.example.myfitness.view.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/myfitness/view/activities/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "SCHEDA_ID_SEND_CODE", "", "TAG", "getTAG", "()Ljava/lang/String;", "USERNAME_KEY", "getUSERNAME_KEY", "USER_DATA_PREFERENCE", "menuToChoose", "", "navView", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "onNavigationItemSelectedListener", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;", "sharedPref", "Landroid/content/SharedPreferences;", "username", "utente", "Lcom/example/myfitness/model/dataClasses/Utente;", "utentiViewModel", "Lcom/example/myfitness/viewmodel/UtentiViewModel;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "MainActivity";
    private android.content.SharedPreferences sharedPref;
    private final java.lang.String USER_DATA_PREFERENCE = "USER_DATA_PREFERENCE";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String USERNAME_KEY = "USERNAME";
    private java.lang.String username;
    private final java.lang.String SCHEDA_ID_SEND_CODE = "SCHEDA_ID";
    private com.google.android.material.bottomnavigation.BottomNavigationView navView;
    private com.example.myfitness.viewmodel.UtentiViewModel utentiViewModel;
    private com.example.myfitness.model.dataClasses.Utente utente;
    private int menuToChoose;
    private final com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUSERNAME_KEY() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public MainActivity() {
        super();
    }
}