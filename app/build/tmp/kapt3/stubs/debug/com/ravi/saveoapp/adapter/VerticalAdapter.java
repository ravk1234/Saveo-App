package com.ravi.saveoapp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/ravi/saveoapp/adapter/VerticalAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ravi/saveoapp/viewHolder/VerticalHolder;", "showList", "", "Lcom/ravi/saveoapp/modelhorizontal/HorizonalClass;", "clickListener", "Lcom/ravi/saveoapp/interfaces/ClickListener;", "(Ljava/util/List;Lcom/ravi/saveoapp/interfaces/ClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "app_debug"})
public final class VerticalAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ravi.saveoapp.viewHolder.VerticalHolder> {
    private java.util.List<com.ravi.saveoapp.modelhorizontal.HorizonalClass> showList;
    private final com.ravi.saveoapp.interfaces.ClickListener clickListener = null;
    
    public VerticalAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ravi.saveoapp.modelhorizontal.HorizonalClass> showList, @org.jetbrains.annotations.NotNull()
    com.ravi.saveoapp.interfaces.ClickListener clickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ravi.saveoapp.viewHolder.VerticalHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ravi.saveoapp.viewHolder.VerticalHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ravi.saveoapp.modelhorizontal.HorizonalClass> showList) {
    }
}