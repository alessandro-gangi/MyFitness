package com.example.myfitness.view.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J&\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010%\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0016\u0010,\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006."}, d2 = {"Lcom/example/myfitness/view/fragments/AllenatoriFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "USER_DATA_PREFERENCE", "adapter", "Lcom/example/myfitness/view/adapters/AllenatoriAdapter;", "listaAllenatori", "Ljava/util/ArrayList;", "Lcom/example/myfitness/model/dataClasses/Utente;", "getListaAllenatori", "()Ljava/util/ArrayList;", "setListaAllenatori", "(Ljava/util/ArrayList;)V", "sharedPref", "Landroid/content/SharedPreferences;", "username", "utente", "utentiViewModel", "Lcom/example/myfitness/viewmodel/UtentiViewModel;", "getUtentiViewModel", "()Lcom/example/myfitness/viewmodel/UtentiViewModel;", "setUtentiViewModel", "(Lcom/example/myfitness/viewmodel/UtentiViewModel;)V", "impostaAllenatoreCorrente", "", "numAllenatore", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onMenuAllenatoreItemClicked", "itemClicked", "app_debug"})
public final class AllenatoriFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "AllenatoriFragment";
    private android.content.SharedPreferences sharedPref;
    private final java.lang.String USER_DATA_PREFERENCE = "USER_DATA_PREFERENCE";
    private java.lang.String username;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.myfitness.model.dataClasses.Utente> listaAllenatori;
    private com.example.myfitness.model.dataClasses.Utente utente;
    private com.example.myfitness.view.adapters.AllenatoriAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    public com.example.myfitness.viewmodel.UtentiViewModel utentiViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myfitness.model.dataClasses.Utente> getListaAllenatori() {
        return null;
    }
    
    public final void setListaAllenatori(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myfitness.model.dataClasses.Utente> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfitness.viewmodel.UtentiViewModel getUtentiViewModel() {
        return null;
    }
    
    public final void setUtentiViewModel(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.viewmodel.UtentiViewModel p0) {
    }
    
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
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    public final void onMenuAllenatoreItemClicked(int numAllenatore, int itemClicked) {
    }
    
    private final void impostaAllenatoreCorrente(int numAllenatore) {
    }
    
    public AllenatoriFragment() {
        super();
    }
}