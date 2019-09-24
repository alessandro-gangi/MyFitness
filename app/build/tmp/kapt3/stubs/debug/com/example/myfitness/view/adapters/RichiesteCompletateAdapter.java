package com.example.myfitness.view.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u00126\u0010\u0003\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001bH\u0016J\u0014\u0010#\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050%R\u0014\u0010\r\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010RA\u0010\u0003\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R*\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0014j\b\u0012\u0004\u0012\u00020\u0005`\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006&"}, d2 = {"Lcom/example/myfitness/view/adapters/RichiesteCompletateAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myfitness/view/adapters/RichiestaCompletataViewHolder;", "clickListener", "Lkotlin/Function2;", "Lcom/example/myfitness/model/dataClasses/Scheda;", "Lkotlin/ParameterName;", "name", "scheda", "", "command", "", "(Lkotlin/jvm/functions/Function2;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getClickListener", "()Lkotlin/jvm/functions/Function2;", "listaRichiesteCompletate", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getListaRichiesteCompletate", "()Ljava/util/ArrayList;", "setListaRichiesteCompletate", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setListaRichieste", "nuovaListaRichiesteCompletate", "", "app_debug"})
public final class RichiesteCompletateAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myfitness.view.adapters.RichiestaCompletataViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "RichiesteCompletateAdapter";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.myfitness.model.dataClasses.Scheda> listaRichiesteCompletate;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<com.example.myfitness.model.dataClasses.Scheda, java.lang.Character, kotlin.Unit> clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.myfitness.model.dataClasses.Scheda> getListaRichiesteCompletate() {
        return null;
    }
    
    public final void setListaRichiesteCompletate(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.myfitness.model.dataClasses.Scheda> p0) {
    }
    
    public final void setListaRichieste(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myfitness.model.dataClasses.Scheda> nuovaListaRichiesteCompletate) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myfitness.view.adapters.RichiestaCompletataViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myfitness.view.adapters.RichiestaCompletataViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<com.example.myfitness.model.dataClasses.Scheda, java.lang.Character, kotlin.Unit> getClickListener() {
        return null;
    }
    
    public RichiesteCompletateAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.myfitness.model.dataClasses.Scheda, ? super java.lang.Character, kotlin.Unit> clickListener) {
        super();
    }
}