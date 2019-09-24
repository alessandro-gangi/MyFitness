package com.example.myfitness.view.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u00126\u0010\u0003\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016J\u0014\u0010\u001f\u001a\u00020\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050!J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002R\u0014\u0010\r\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010RA\u0010\u0003\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0014j\b\u0012\u0004\u0012\u00020\u0005`\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/myfitness/view/adapters/RichiesteInAttesaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myfitness/view/adapters/RichiestaInAttesaViewHolder;", "clickListener", "Lkotlin/Function2;", "Lcom/example/myfitness/model/dataClasses/Richiesta;", "Lkotlin/ParameterName;", "name", "richiesta", "", "command", "", "(Lkotlin/jvm/functions/Function2;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getClickListener", "()Lkotlin/jvm/functions/Function2;", "listaRichieste", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setListaRichieste", "nuovaListaRichieste", "", "showPopupMenu", "view", "Landroid/view/View;", "app_debug"})
public final class RichiesteInAttesaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myfitness.view.adapters.RichiestaInAttesaViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "RichiesteInAttAdapt";
    private java.util.ArrayList<com.example.myfitness.model.dataClasses.Richiesta> listaRichieste;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<com.example.myfitness.model.dataClasses.Richiesta, java.lang.Character, kotlin.Unit> clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final void setListaRichieste(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myfitness.model.dataClasses.Richiesta> nuovaListaRichieste) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myfitness.view.adapters.RichiestaInAttesaViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.view.adapters.RichiestaInAttesaViewHolder holder, int position) {
    }
    
    private final void showPopupMenu(android.view.View view, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<com.example.myfitness.model.dataClasses.Richiesta, java.lang.Character, kotlin.Unit> getClickListener() {
        return null;
    }
    
    public RichiesteInAttesaAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.myfitness.model.dataClasses.Richiesta, ? super java.lang.Character, kotlin.Unit> clickListener) {
        super();
    }
}