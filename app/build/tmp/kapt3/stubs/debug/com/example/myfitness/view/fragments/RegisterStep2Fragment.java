package com.example.myfitness.view.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 L2\u00020\u0001:\u0001LB\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0004H\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0002J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\nH\u0002J\u0018\u0010\'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020*H\u0002J\"\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010/H\u0017J\u0012\u00100\u001a\u00020\u001e2\b\u00101\u001a\u0004\u0018\u000102H\u0016J&\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u00101\u001a\u0004\u0018\u000102H\u0017J\u000e\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u000204J\b\u0010;\u001a\u00020\u001eH\u0002J\b\u0010<\u001a\u00020\u001eH\u0002J\u0010\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020?H\u0002J0\u0010@\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020?2\u0006\u0010\u001a\u001a\u00020B2\u0006\u0010\u001b\u001a\u00020B2\u0006\u0010\u001c\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0003J\u0010\u0010E\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020*H\u0002J\u0018\u0010G\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020IH\u0002J\u0010\u0010K\u001a\u00020\u001e2\u0006\u0010:\u001a\u000204H\u0003R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006M"}, d2 = {"Lcom/example/myfitness/view/fragments/RegisterStep2Fragment;", "Landroidx/fragment/app/Fragment;", "()V", "IMAGE_PICK_CODE", "", "getIMAGE_PICK_CODE", "()I", "READ_EXTERNAL_STORAGE_CODE", "getREAD_EXTERNAL_STORAGE_CODE", "TAG", "", "getTAG", "()Ljava/lang/String;", "file", "Ljava/io/File;", "listaUtenti", "", "Lcom/example/myfitness/model/dataClasses/Utente;", "mail", "password", "serverImageUri", "username", "utentiViewModel", "Lcom/example/myfitness/viewmodel/UtentiViewModel;", "controllaCorrettezzaDati", "", "nome", "cognome", "eta", "explainPermissionRequest", "", "titolo", "messaggio", "getRealPathFromURI", "contentURI", "Landroid/net/Uri;", "goToSettings", "isPermissionGranted", "permission", "loadImageIntoImageView", "imageURI", "imageView", "Landroid/widget/ImageView;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onRadioButtonClicked", "view", "passaAlLogin", "preparePermissionForPickingImage", "setupBackButton", "back", "Landroid/widget/Button;", "setupCompletaRegistrazioneButton", "completaRegistrazione", "Landroid/widget/EditText;", "genereRadioGroup", "Landroid/widget/RadioGroup;", "setupImmagine", "image", "setupRadioButtons", "radioMaschio", "Landroid/widget/RadioButton;", "radioFemmina", "setupUI", "Companion", "app_debug"})
public final class RegisterStep2Fragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "RegisterFragment";
    private com.example.myfitness.viewmodel.UtentiViewModel utentiViewModel;
    private java.util.List<com.example.myfitness.model.dataClasses.Utente> listaUtenti;
    private final int IMAGE_PICK_CODE = 1;
    private final int READ_EXTERNAL_STORAGE_CODE = 2;
    private java.lang.String username;
    private java.lang.String mail;
    private java.lang.String password;
    private java.io.File file;
    private java.lang.String serverImageUri;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String USERNAME = "USERNAME";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MAIL = "MAIL";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PASSWORD = "PASSWORD";
    public static final com.example.myfitness.view.fragments.RegisterStep2Fragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final int getIMAGE_PICK_CODE() {
        return 0;
    }
    
    public final int getREAD_EXTERNAL_STORAGE_CODE() {
        return 0;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void setupUI(android.view.View view) {
    }
    
    private final void setupRadioButtons(android.widget.RadioButton radioMaschio, android.widget.RadioButton radioFemmina) {
    }
    
    private final void setupImmagine(android.widget.ImageView image) {
    }
    
    private final void setupBackButton(android.widget.Button back) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void setupCompletaRegistrazioneButton(android.widget.Button completaRegistrazione, android.widget.EditText nome, android.widget.EditText cognome, android.widget.EditText eta, android.widget.RadioGroup genereRadioGroup) {
    }
    
    public final void onRadioButtonClicked(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
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
    
    private final boolean controllaCorrettezzaDati(java.lang.String nome, java.lang.String cognome, int eta) {
        return false;
    }
    
    private final void passaAlLogin() {
    }
    
    private final java.lang.String getRealPathFromURI(android.net.Uri contentURI) {
        return null;
    }
    
    private final void loadImageIntoImageView(java.lang.String imageURI, android.widget.ImageView imageView) {
    }
    
    public RegisterStep2Fragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.myfitness.view.fragments.RegisterStep2Fragment newInstance(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String mail, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/myfitness/view/fragments/RegisterStep2Fragment$Companion;", "", "()V", "MAIL", "", "getMAIL", "()Ljava/lang/String;", "PASSWORD", "getPASSWORD", "USERNAME", "getUSERNAME", "newInstance", "Lcom/example/myfitness/view/fragments/RegisterStep2Fragment;", "username", "mail", "password", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUSERNAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMAIL() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPASSWORD() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myfitness.view.fragments.RegisterStep2Fragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String username, @org.jetbrains.annotations.NotNull()
        java.lang.String mail, @org.jetbrains.annotations.NotNull()
        java.lang.String password) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}