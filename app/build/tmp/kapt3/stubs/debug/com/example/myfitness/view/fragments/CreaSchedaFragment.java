package com.example.myfitness.view.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 12\u00020\u0001:\u00011B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020%H\u0002J\u0018\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/example/myfitness/view/fragments/CreaSchedaFragment;", "Landroidx/fragment/app/Fragment;", "richiesta", "Lcom/example/myfitness/model/dataClasses/Richiesta;", "(Lcom/example/myfitness/model/dataClasses/Richiesta;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "adapter", "Lcom/example/myfitness/view/adapters/CreaSchedaPagerAdapter;", "commento", "data", "numGiorni", "", "getRichiesta", "()Lcom/example/myfitness/model/dataClasses/Richiesta;", "richiesteViewModel", "Lcom/example/myfitness/viewmodel/RichiesteViewModel;", "schedeViewModel", "Lcom/example/myfitness/viewmodel/SchedeViewModel;", "tipologia", "username", "utente", "Lcom/example/myfitness/model/dataClasses/Utente;", "utentiViewModel", "Lcom/example/myfitness/viewmodel/UtentiViewModel;", "controllaScheda", "", "scheda", "Lcom/example/myfitness/model/dataClasses/Scheda;", "finisciScheda", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setupUI", "view", "setupViewPager", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "Companion", "app_debug"})
public final class CreaSchedaFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "CreaSchedaFragment";
    private com.example.myfitness.viewmodel.RichiesteViewModel richiesteViewModel;
    private com.example.myfitness.viewmodel.SchedeViewModel schedeViewModel;
    private com.example.myfitness.viewmodel.UtentiViewModel utentiViewModel;
    private com.example.myfitness.model.dataClasses.Utente utente;
    private com.example.myfitness.view.adapters.CreaSchedaPagerAdapter adapter;
    private java.lang.String username;
    private java.lang.String data;
    private java.lang.String tipologia;
    private int numGiorni;
    private java.lang.String commento;
    @org.jetbrains.annotations.Nullable()
    private final com.example.myfitness.model.dataClasses.Richiesta richiesta = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String USERNAME = "USERNAME";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DATA = "DATA";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TIPOLOGIA = "TIPOLOGIA";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String NUM_GIORNI = "NUM_GIORNI";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COMMENTO = "COMMENTO";
    public static final com.example.myfitness.view.fragments.CreaSchedaFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
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
    
    private final void setupUI(android.view.View view) {
    }
    
    private final void setupViewPager(androidx.viewpager.widget.ViewPager viewPager, com.google.android.material.tabs.TabLayout tabLayout) {
    }
    
    private final void finisciScheda() {
    }
    
    private final boolean controllaScheda(com.example.myfitness.model.dataClasses.Scheda scheda) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.myfitness.model.dataClasses.Richiesta getRichiesta() {
        return null;
    }
    
    public CreaSchedaFragment(@org.jetbrains.annotations.Nullable()
    com.example.myfitness.model.dataClasses.Richiesta richiesta) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.myfitness.view.fragments.CreaSchedaFragment newInstance(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String tipologia, int numGiorni, @org.jetbrains.annotations.NotNull()
    java.lang.String commento, @org.jetbrains.annotations.Nullable()
    com.example.myfitness.model.dataClasses.Richiesta richiesta) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J:\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/example/myfitness/view/fragments/CreaSchedaFragment$Companion;", "", "()V", "COMMENTO", "", "getCOMMENTO", "()Ljava/lang/String;", "DATA", "getDATA", "NUM_GIORNI", "getNUM_GIORNI", "TIPOLOGIA", "getTIPOLOGIA", "USERNAME", "getUSERNAME", "newInstance", "Lcom/example/myfitness/view/fragments/CreaSchedaFragment;", "username", "data", "tipologia", "numGiorni", "", "commento", "richiesta", "Lcom/example/myfitness/model/dataClasses/Richiesta;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUSERNAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDATA() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTIPOLOGIA() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNUM_GIORNI() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOMMENTO() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myfitness.view.fragments.CreaSchedaFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String username, @org.jetbrains.annotations.NotNull()
        java.lang.String data, @org.jetbrains.annotations.NotNull()
        java.lang.String tipologia, int numGiorni, @org.jetbrains.annotations.NotNull()
        java.lang.String commento, @org.jetbrains.annotations.Nullable()
        com.example.myfitness.model.dataClasses.Richiesta richiesta) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}