package com.example.myfitness.view.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010\'\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010(\u001a\u00020\u001dH\u0002J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0002J\b\u0010-\u001a\u00020\u001dH\u0002J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010/\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u00100\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u00101\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u0006H\u0002J\b\u00104\u001a\u00020\u001dH\u0002J\u0010\u00105\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0002J\"\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\u0012\u0010;\u001a\u00020\u001d2\b\u0010<\u001a\u0004\u0018\u00010=H\u0017J&\u0010>\u001a\u0004\u0018\u00010\"2\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010B2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010C\u001a\u00020\u001dH\u0002J\b\u0010D\u001a\u00020\u001dH\u0002J\u001a\u0010E\u001a\u00020\u001d2\b\u0010F\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010G\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010H\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010I\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010J\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u000e\u0010\r\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"}, d2 = {"Lcom/example/myfitness/view/fragments/ProfileFragment;", "Landroidx/fragment/app/Fragment;", "()V", "IMAGE_PICK_CODE", "", "MY_PACKAGE_NAME", "", "READ_EXTERNAL_STORAGE_CODE", "TAG", "getTAG", "()Ljava/lang/String;", "USERNAME_KEY", "getUSERNAME_KEY", "USER_DATA_PREFERENCE", "allenatore", "Lcom/example/myfitness/model/dataClasses/Utente;", "currentScheda", "Lcom/example/myfitness/model/dataClasses/Scheda;", "isUserModifyingData", "", "schedeViewModel", "Lcom/example/myfitness/viewmodel/SchedeViewModel;", "sharedPref", "Landroid/content/SharedPreferences;", "username", "utente", "utentiViewModel", "Lcom/example/myfitness/viewmodel/UtentiViewModel;", "apriScheda", "", "cambiaAllenatore", "cambiaScheda", "confirmChanges", "view", "Landroid/view/View;", "convertImageForDb", "", "imageView", "Landroid/widget/ImageView;", "diventaAllenatoreOUtenteSemplice", "eliminaAllenatore", "eliminaSchedaAttuale", "explainPermissionRequest", "titolo", "messaggio", "goToSettings", "impostaAllenatoreCorrente", "impostaBottoneDiventaAllenatore", "impostaDatiUtente", "impostaSchedaCorrente", "isPermissionGranted", "permission", "logout", "modify_profile_data", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "preparePermissionForPickingImage", "selezionaImmagine", "setByteArrayImgToImageView", "byteArrayImage", "setupUI", "showEditAllenatorePopupMenu", "showEditSchedaAttualePopupMenu", "showHeaderProfilePopupMenu", "app_debug"})
public final class ProfileFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "ProfileFragment";
    private android.content.SharedPreferences sharedPref;
    private final java.lang.String USER_DATA_PREFERENCE = "USER_DATA_PREFERENCE";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String USERNAME_KEY = "USERNAME";
    private java.lang.String username;
    private final java.lang.String MY_PACKAGE_NAME = "com.example.myfitness";
    private final int READ_EXTERNAL_STORAGE_CODE = 1;
    private final int IMAGE_PICK_CODE = 2;
    private boolean isUserModifyingData;
    private com.example.myfitness.viewmodel.UtentiViewModel utentiViewModel;
    private com.example.myfitness.viewmodel.SchedeViewModel schedeViewModel;
    private com.example.myfitness.model.dataClasses.Utente utente;
    private com.example.myfitness.model.dataClasses.Utente allenatore;
    private com.example.myfitness.model.dataClasses.Scheda currentScheda;
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
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupUI(android.view.View view) {
    }
    
    private final void impostaDatiUtente(android.view.View view) {
    }
    
    private final void diventaAllenatoreOUtenteSemplice(android.view.View view) {
    }
    
    private final void impostaBottoneDiventaAllenatore(android.view.View view) {
    }
    
    private final void showEditAllenatorePopupMenu(android.view.View view) {
    }
    
    private final void showEditSchedaAttualePopupMenu(android.view.View view) {
    }
    
    private final void showHeaderProfilePopupMenu(android.view.View view) {
    }
    
    private final void logout() {
    }
    
    private final void modify_profile_data(android.view.View view) {
    }
    
    private final void confirmChanges(android.view.View view) {
    }
    
    private final void selezionaImmagine() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void preparePermissionForPickingImage() {
    }
    
    private final boolean isPermissionGranted(java.lang.String permission) {
        return false;
    }
    
    private final void explainPermissionRequest(java.lang.String titolo, java.lang.String messaggio) {
    }
    
    private final void goToSettings() {
    }
    
    private final void cambiaAllenatore() {
    }
    
    private final void cambiaScheda() {
    }
    
    private final void impostaSchedaCorrente(android.view.View view) {
    }
    
    private final void impostaAllenatoreCorrente(android.view.View view) {
    }
    
    private final void eliminaSchedaAttuale(android.view.View view) {
    }
    
    private final void eliminaAllenatore() {
    }
    
    private final void apriScheda() {
    }
    
    private final byte[] convertImageForDb(android.widget.ImageView imageView) {
        return null;
    }
    
    private final void setByteArrayImgToImageView(byte[] byteArrayImage, android.widget.ImageView imageView) {
    }
    
    public ProfileFragment() {
        super();
    }
}