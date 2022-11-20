package com.andihasan7.mynoteapp2.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/andihasan7/mynoteapp2/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "mNoteRepository", "Lcom/andihasan7/mynoteapp2/repository/NoteRepository;", "getAllNotes", "Landroidx/lifecycle/LiveData;", "", "Lcom/andihasan7/mynoteapp2/database/Note;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.andihasan7.mynoteapp2.repository.NoteRepository mNoteRepository = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.andihasan7.mynoteapp2.database.Note>> getAllNotes() {
        return null;
    }
}