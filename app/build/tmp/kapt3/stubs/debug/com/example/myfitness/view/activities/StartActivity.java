package com.example.myfitness.view.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0013\u001a\u00020\u00122\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0015j\b\u0012\u0004\u0012\u00020\u0004`\u0016H\u0002J \u0010\u0017\u001a\u00020\u00122\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0015j\b\u0012\u0004\u0012\u00020\u0004`\u0016H\u0002J \u0010\u0019\u001a\u00020\u00122\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0015j\b\u0012\u0004\u0012\u00020\u0004`\u0016H\u0002J \u0010\u001b\u001a\u00020\u00122\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0015j\b\u0012\u0004\u0012\u00020\u0004`\u0016H\u0002J\"\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0012\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\u0012H\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/myfitness/view/activities/StartActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "USERNAME_KEY", "getUSERNAME_KEY", "USER_DATA_PREFERENCE", "richiesteViewModel", "Lcom/example/myfitness/viewmodel/RichiesteViewModel;", "schedeViewModel", "Lcom/example/myfitness/viewmodel/SchedeViewModel;", "sharedPref", "Landroid/content/SharedPreferences;", "username", "allineaDB", "", "allineaDbRichiesteInAttesaToDelete", "richiesteToDelete", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "allineaDbSchedeToAdd", "schedeToAdd", "allineaDbSchedeToDelete", "schedeToDelete", "allineaDbSchedeToUpdate", "schedeToUpdate", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "app_debug"})
public final class StartActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "StartActivity";
    private java.lang.String username;
    private android.content.SharedPreferences sharedPref;
    private final java.lang.String USER_DATA_PREFERENCE = "USER_DATA_PREFERENCE";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String USERNAME_KEY = "USERNAME";
    private com.example.myfitness.viewmodel.RichiesteViewModel richiesteViewModel;
    private com.example.myfitness.viewmodel.SchedeViewModel schedeViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUSERNAME_KEY() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void allineaDB() {
    }
    
    private final void allineaDbSchedeToAdd(java.util.ArrayList<java.lang.String> schedeToAdd) {
    }
    
    private final void allineaDbSchedeToUpdate(java.util.ArrayList<java.lang.String> schedeToUpdate) {
    }
    
    private final void allineaDbSchedeToDelete(java.util.ArrayList<java.lang.String> schedeToDelete) {
    }
    
    private final void allineaDbRichiesteInAttesaToDelete(java.util.ArrayList<java.lang.String> richiesteToDelete) {
    }
    
    public StartActivity() {
        super();
    }
}