package com.example.myfitness.view.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0018H\u0002J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/myfitness/view/fragments/VisualizzazioneSchedaFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "scheda", "Lcom/example/myfitness/model/dataClasses/Scheda;", "schedaID", "", "Ljava/lang/Integer;", "schedeViewModel", "Lcom/example/myfitness/viewmodel/SchedeViewModel;", "username", "imposta_immagine", "", "imageView", "Landroid/widget/ImageView;", "tipologia", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setupUI", "view", "setupViewPager", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "Companion", "app_debug"})
public final class VisualizzazioneSchedaFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "VisualSchedaFragment";
    private com.example.myfitness.viewmodel.SchedeViewModel schedeViewModel;
    private com.example.myfitness.model.dataClasses.Scheda scheda;
    private java.lang.String username;
    private java.lang.Integer schedaID;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SCHEDA_ID = "SCHEDA_ID";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String USERNAME = "USERNAME";
    public static final com.example.myfitness.view.fragments.VisualizzazioneSchedaFragment.Companion Companion = null;
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
    
    public final void imposta_immagine(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    java.lang.String tipologia) {
    }
    
    public VisualizzazioneSchedaFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.myfitness.view.fragments.VisualizzazioneSchedaFragment newInstance(@org.jetbrains.annotations.NotNull()
    java.lang.String username, int schedaId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/example/myfitness/view/fragments/VisualizzazioneSchedaFragment$Companion;", "", "()V", "SCHEDA_ID", "", "getSCHEDA_ID", "()Ljava/lang/String;", "USERNAME", "getUSERNAME", "newInstance", "Lcom/example/myfitness/view/fragments/VisualizzazioneSchedaFragment;", "username", "schedaId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSCHEDA_ID() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUSERNAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myfitness.view.fragments.VisualizzazioneSchedaFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String username, int schedaId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}