package com.example.myfitness.view.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00126\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001e\u0010\u001e\u001a\u00020\f2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00060 j\b\u0012\u0004\u0012\u00020\u0006`!R\u0014\u0010\u000e\u001a\u00020\u000fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/myfitness/view/fragments/RichiesteInAttesaTabFragment;", "Landroidx/fragment/app/Fragment;", "activity", "Landroid/content/Context;", "clickListener", "Lkotlin/Function2;", "Lcom/example/myfitness/model/dataClasses/Richiesta;", "Lkotlin/ParameterName;", "name", "richiesta", "", "command", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "adapter", "Lcom/example/myfitness/view/adapters/RichiesteInAttesaAdapter;", "username", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setRichiesteInAttesa", "listaRichieste", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Companion", "app_debug"})
public final class RichiesteInAttesaTabFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "RichiesteInAttTabFrag";
    private java.lang.String username;
    private final com.example.myfitness.view.adapters.RichiesteInAttesaAdapter adapter = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String USERNAME = "USERNAME";
    public static final com.example.myfitness.view.fragments.RichiesteInAttesaTabFragment.Companion Companion = null;
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
    
    public final void setRichiesteInAttesa(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myfitness.model.dataClasses.Richiesta> listaRichieste) {
    }
    
    public RichiesteInAttesaTabFragment(@org.jetbrains.annotations.NotNull()
    android.content.Context activity, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.myfitness.model.dataClasses.Richiesta, ? super java.lang.Character, kotlin.Unit> clickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.myfitness.view.fragments.RichiesteInAttesaTabFragment newInstance(@org.jetbrains.annotations.NotNull()
    android.content.Context activity, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.myfitness.model.dataClasses.Richiesta, ? super java.lang.Character, kotlin.Unit> clickListener) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JP\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rH\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/example/myfitness/view/fragments/RichiesteInAttesaTabFragment$Companion;", "", "()V", "USERNAME", "", "getUSERNAME", "()Ljava/lang/String;", "newInstance", "Lcom/example/myfitness/view/fragments/RichiesteInAttesaTabFragment;", "activity", "Landroid/content/Context;", "username", "clickListener", "Lkotlin/Function2;", "Lcom/example/myfitness/model/dataClasses/Richiesta;", "Lkotlin/ParameterName;", "name", "richiesta", "", "command", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUSERNAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myfitness.view.fragments.RichiesteInAttesaTabFragment newInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context activity, @org.jetbrains.annotations.NotNull()
        java.lang.String username, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super com.example.myfitness.model.dataClasses.Richiesta, ? super java.lang.Character, kotlin.Unit> clickListener) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}