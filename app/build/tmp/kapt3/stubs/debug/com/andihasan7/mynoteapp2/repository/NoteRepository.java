package com.andihasan7.mynoteapp2.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u000eJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/andihasan7/mynoteapp2/repository/NoteRepository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "executorService", "Ljava/util/concurrent/ExecutorService;", "mNotesDao", "Lcom/andihasan7/mynoteapp2/database/NoteDao;", "delete", "", "note", "Lcom/andihasan7/mynoteapp2/database/Note;", "getAllNotes", "Landroidx/lifecycle/LiveData;", "", "insert", "update", "app_debug"})
public final class NoteRepository {
    private final com.andihasan7.mynoteapp2.database.NoteDao mNotesDao = null;
    private final java.util.concurrent.ExecutorService executorService = null;
    
    public NoteRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.andihasan7.mynoteapp2.database.Note>> getAllNotes() {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.andihasan7.mynoteapp2.database.Note note) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.andihasan7.mynoteapp2.database.Note note) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    com.andihasan7.mynoteapp2.database.Note note) {
    }
}