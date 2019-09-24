package com.example.myfitness.view.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u00126\u0010\u0003\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001b\u001a\u00020\u0005H\u0016J\u0016\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eJ\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0005H\u0016J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005H\u0016J\u0014\u0010\u0019\u001a\u00020\u000b2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00150(J\u0018\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+2\u0006\u0010\"\u001a\u00020\u0005H\u0002R\u0014\u0010\r\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010RA\u0010\u0003\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R*\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006,"}, d2 = {"Lcom/example/myfitness/view/adapters/SchedeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myfitness/view/adapters/SchedaViewHolder;", "clickListener", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "schedaId", "", "command", "", "(Lkotlin/jvm/functions/Function2;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getClickListener", "()Lkotlin/jvm/functions/Function2;", "listaSchede", "Ljava/util/ArrayList;", "Lcom/example/myfitness/model/dataClasses/Scheda;", "Lkotlin/collections/ArrayList;", "getListaSchede", "()Ljava/util/ArrayList;", "setListaSchede", "(Ljava/util/ArrayList;)V", "getItemCount", "impostaImmagine", "imageView", "Landroid/widget/ImageView;", "tipologia", "onBindViewHolder", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "nuovaListaSchede", "", "showPopupMenu", "view", "Landroid/view/View;", "app_debug"})
public final class SchedeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myfitness.view.adapters.SchedaViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "SchedeAdapter";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.myfitness.model.dataClasses.Scheda> listaSchede;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Character, kotlin.Unit> clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myfitness.model.dataClasses.Scheda> getListaSchede() {
        return null;
    }
    
    public final void setListaSchede(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myfitness.model.dataClasses.Scheda> p0) {
    }
    
    public final void setListaSchede(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myfitness.model.dataClasses.Scheda> nuovaListaSchede) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myfitness.view.adapters.SchedaViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.view.adapters.SchedaViewHolder viewHolder, int position) {
    }
    
    private final void showPopupMenu(android.view.View view, int position) {
    }
    
    public final void impostaImmagine(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    java.lang.String tipologia) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Character, kotlin.Unit> getClickListener() {
        return null;
    }
    
    public SchedeAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Character, kotlin.Unit> clickListener) {
        super();
    }
}