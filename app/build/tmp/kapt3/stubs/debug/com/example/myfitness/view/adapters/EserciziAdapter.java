package com.example.myfitness.view.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u00126\u0010\u0003\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u001a\u001a\u00020\u0005H\u0016J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005H\u0016J\u0014\u0010\u0016\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120#J\u0018\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0005H\u0002R\u0014\u0010\f\u001a\u00020\rX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017RA\u0010\u0003\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\'"}, d2 = {"Lcom/example/myfitness/view/adapters/EserciziAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myfitness/view/adapters/EsercizioViewHolder;", "menuClickListener", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "numEsercizio", "itemClicked", "", "(Lkotlin/jvm/functions/Function2;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "listaEsercizi", "Ljava/util/ArrayList;", "Lcom/example/myfitness/model/dataClasses/Esercizio;", "Lkotlin/collections/ArrayList;", "getListaEsercizi", "()Ljava/util/ArrayList;", "setListaEsercizi", "(Ljava/util/ArrayList;)V", "getMenuClickListener", "()Lkotlin/jvm/functions/Function2;", "getItemCount", "onBindViewHolder", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "nuovaListaEsercizi", "", "showEsercizioPopupMenu", "view", "Landroid/view/View;", "app_debug"})
public final class EserciziAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myfitness.view.adapters.EsercizioViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "EserciziAdapter";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> listaEsercizi;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, kotlin.Unit> menuClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> getListaEsercizi() {
        return null;
    }
    
    public final void setListaEsercizi(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myfitness.model.dataClasses.Esercizio> p0) {
    }
    
    public final void setListaEsercizi(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myfitness.model.dataClasses.Esercizio> nuovaListaEsercizi) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myfitness.view.adapters.EsercizioViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.view.adapters.EsercizioViewHolder viewHolder, int position) {
    }
    
    private final void showEsercizioPopupMenu(android.view.View view, int numEsercizio) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, kotlin.Unit> getMenuClickListener() {
        return null;
    }
    
    public EserciziAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> menuClickListener) {
        super();
    }
}