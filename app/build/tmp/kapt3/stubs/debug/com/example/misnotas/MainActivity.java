package com.example.misnotas;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011J\u0006\u0010\u0019\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0017J\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0014\u0010\u001e\u001a\u00020\u00172\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u001fJ\u000e\u0010 \u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011J\n\u0010!\u001a\u00020\u0017*\u00020\"R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006#"}, d2 = {"Lcom/example/misnotas/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/misnotas/TasksAdapter;", "getAdapter", "()Lcom/example/misnotas/TasksAdapter;", "setAdapter", "(Lcom/example/misnotas/TasksAdapter;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "tasks", "", "Ldatabase/TaskEntity;", "getTasks", "()Ljava/util/List;", "setTasks", "(Ljava/util/List;)V", "addTask", "", "task", "clearFocus", "deleteTask", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpRecyclerView", "", "updateTask", "hideKeyboard", "Landroid/content/Context;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView recyclerView;
    @org.jetbrains.annotations.NotNull()
    public com.example.misnotas.TasksAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<database.TaskEntity> tasks;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.misnotas.TasksAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.example.misnotas.TasksAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<database.TaskEntity> getTasks() {
        return null;
    }
    
    public final void setTasks(@org.jetbrains.annotations.NotNull()
    java.util.List<database.TaskEntity> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void deleteTask(@org.jetbrains.annotations.NotNull()
    database.TaskEntity task) {
    }
    
    public final void updateTask(@org.jetbrains.annotations.NotNull()
    database.TaskEntity task) {
    }
    
    public final void addTask(@org.jetbrains.annotations.NotNull()
    database.TaskEntity task) {
    }
    
    public final void clearFocus() {
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$hideKeyboard) {
    }
    
    public final void getTasks() {
    }
    
    public final void setUpRecyclerView(@org.jetbrains.annotations.NotNull()
    java.util.List<database.TaskEntity> tasks) {
    }
    
    public MainActivity() {
        super();
    }
}