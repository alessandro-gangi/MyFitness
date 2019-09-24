package com.example.myfitness.view.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\u0012\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0016\u0010%\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/myfitness/view/fragments/VisualizzazioneEserciziFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "adapter", "Lcom/example/myfitness/view/adapters/EserciziAdapter;", "listaEsercizi", "Ljava/util/ArrayList;", "Lcom/example/myfitness/model/dataClasses/Esercizio;", "Lkotlin/collections/ArrayList;", "numGiorno", "", "Ljava/lang/Integer;", "scheda", "Lcom/example/myfitness/model/dataClasses/Scheda;", "schedaId", "schedeViewModel", "Lcom/example/myfitness/viewmodel/SchedeViewModel;", "username", "aggiungiCommento", "", "numEsercizio", "eliminaEsercizio", "guardaVideo", "modificaEsercizio", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onMenuEsercizioItemClicked", "itemClicked", "Companion", "app_debug"})
public final class VisualizzazioneEserciziFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "VisualEserciziFragment";
    private com.example.myfitness.viewmodel.SchedeViewModel schedeViewModel;
    private com.example.myfitness.model.dataClasses.Scheda scheda;
    private java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> listaEsercizi;
    private java.lang.Integer schedaId;
    private java.lang.Integer numGiorno;
    private java.lang.String username;
    private com.example.myfitness.view.adapters.EserciziAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String USERNAME = "USERNAME";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SCHEDA_ID = "SCHEDA_ID";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SCHEDA_NUM_GIORNO = "SCHEDA_NUM_GIORNO";
    public static final com.example.myfitness.view.fragments.VisualizzazioneEserciziFragment.Companion Companion = null;
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
    
    public final void onMenuEsercizioItemClicked(int numEsercizio, int itemClicked) {
    }
    
    private final void aggiungiCommento(int numEsercizio) {
    }
    
    private final void modificaEsercizio(int numEsercizio) {
    }
    
    private final void eliminaEsercizio(int numEsercizio) {
    }
    
    private final void guardaVideo(int numEsercizio) {
    }
    
    public VisualizzazioneEserciziFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.myfitness.view.fragments.VisualizzazioneEserciziFragment newInstance(@org.jetbrains.annotations.NotNull()
    java.lang.String username, int scheda_id, int numGiorno) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/myfitness/view/fragments/VisualizzazioneEserciziFragment$Companion;", "", "()V", "SCHEDA_ID", "", "getSCHEDA_ID", "()Ljava/lang/String;", "SCHEDA_NUM_GIORNO", "getSCHEDA_NUM_GIORNO", "USERNAME", "getUSERNAME", "newInstance", "Lcom/example/myfitness/view/fragments/VisualizzazioneEserciziFragment;", "username", "scheda_id", "", "numGiorno", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUSERNAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSCHEDA_ID() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSCHEDA_NUM_GIORNO() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myfitness.view.fragments.VisualizzazioneEserciziFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String username, int scheda_id, int numGiorno) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}