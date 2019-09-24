package com.example.myfitness.view.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0016\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'J\u0016\u0010(\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'J \u0010)\u001a\u00020\u00172\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020%0+j\b\u0012\u0004\u0012\u00020%`,H\u0002J \u0010-\u001a\u00020\u00172\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00190+j\b\u0012\u0004\u0012\u00020\u0019`,H\u0002J\u0018\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/example/myfitness/view/fragments/RichiesteFragment;", "Landroidx/fragment/app/Fragment;", "()V", "RICHIESTE_COMPLETATE_INDEX", "", "RICHIESTE_IN_ATTESA_INDEX", "TAG", "", "getTAG", "()Ljava/lang/String;", "USERNAME_KEY", "getUSERNAME_KEY", "USER_DATA_PREFERENCE", "adapter", "Lcom/example/myfitness/view/adapters/RichiestePagerAdapter;", "richiesteViewModel", "Lcom/example/myfitness/viewmodel/RichiesteViewModel;", "schedeViewModel", "Lcom/example/myfitness/viewmodel/SchedeViewModel;", "sharedPref", "Landroid/content/SharedPreferences;", "username", "inviaScheda", "", "richiesta", "Lcom/example/myfitness/model/dataClasses/Richiesta;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onRichiestaCompletataClicked", "scheda", "Lcom/example/myfitness/model/dataClasses/Scheda;", "command", "", "onRichiestaInAttesaClicked", "setListaRichiesteCompletate", "listaRichieste", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setListaRichiesteInAttesa", "setupViewPager", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "app_debug"})
public final class RichiesteFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "RichiesteFragment";
    private android.content.SharedPreferences sharedPref;
    private final java.lang.String USER_DATA_PREFERENCE = "USER_DATA_PREFERENCE";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String USERNAME_KEY = "USERNAME";
    private java.lang.String username;
    private com.example.myfitness.viewmodel.RichiesteViewModel richiesteViewModel;
    private com.example.myfitness.viewmodel.SchedeViewModel schedeViewModel;
    private com.example.myfitness.view.adapters.RichiestePagerAdapter adapter;
    private final int RICHIESTE_IN_ATTESA_INDEX = 0;
    private final int RICHIESTE_COMPLETATE_INDEX = 1;
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
    
    private final void setupViewPager(androidx.viewpager.widget.ViewPager viewPager, com.google.android.material.tabs.TabLayout tabLayout) {
    }
    
    private final void setListaRichiesteInAttesa(java.util.ArrayList<com.example.myfitness.model.dataClasses.Richiesta> listaRichieste) {
    }
    
    private final void setListaRichiesteCompletate(java.util.ArrayList<com.example.myfitness.model.dataClasses.Scheda> listaRichieste) {
    }
    
    public final void onRichiestaInAttesaClicked(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Richiesta richiesta, char command) {
    }
    
    public final void onRichiestaCompletataClicked(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.model.dataClasses.Scheda scheda, char command) {
    }
    
    private final void inviaScheda(com.example.myfitness.model.dataClasses.Richiesta richiesta) {
    }
    
    public RichiesteFragment() {
        super();
    }
}