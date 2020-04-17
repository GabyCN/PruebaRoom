package com.example.misnotas;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B;\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/example/misnotas/TasksAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/misnotas/TasksAdapter$ViewHolder;", "tasks", "", "Ldatabase/TaskEntity;", "checkTask", "Lkotlin/Function1;", "", "deleteTask", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getCheckTask", "()Lkotlin/jvm/functions/Function1;", "getDeleteTask", "getTasks", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class TasksAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.misnotas.TasksAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<database.TaskEntity> tasks = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<database.TaskEntity, kotlin.Unit> checkTask = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<database.TaskEntity, kotlin.Unit> deleteTask = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.misnotas.TasksAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.misnotas.TasksAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<database.TaskEntity> getTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<database.TaskEntity, kotlin.Unit> getCheckTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<database.TaskEntity, kotlin.Unit> getDeleteTask() {
        return null;
    }
    
    public TasksAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<database.TaskEntity> tasks, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super database.TaskEntity, kotlin.Unit> checkTask, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super database.TaskEntity, kotlin.Unit> deleteTask) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J6\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u0013R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/example/misnotas/TasksAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "cbIsDone", "Landroid/widget/CheckBox;", "kotlin.jvm.PlatformType", "getCbIsDone", "()Landroid/widget/CheckBox;", "tvTask", "Landroid/widget/TextView;", "getTvTask", "()Landroid/widget/TextView;", "bind", "", "task", "Ldatabase/TaskEntity;", "checkTask", "Lkotlin/Function1;", "deleteTask", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView tvTask = null;
        private final android.widget.CheckBox cbIsDone = null;
        
        public final android.widget.TextView getTvTask() {
            return null;
        }
        
        public final android.widget.CheckBox getCbIsDone() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        database.TaskEntity task, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super database.TaskEntity, kotlin.Unit> checkTask, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super database.TaskEntity, kotlin.Unit> deleteTask) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}