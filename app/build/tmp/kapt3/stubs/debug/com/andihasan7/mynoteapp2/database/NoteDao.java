package com.andihasan7.mynoteapp2.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/andihasan7/mynoteapp2/database/NoteDao;", "", "delete", "", "note", "Lcom/andihasan7/mynoteapp2/database/Note;", "getAllNotes", "Landroidx/lifecycle/LiveData;", "", "insert", "update", "app_debug"})
public abstract interface NoteDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.andihasan7.mynoteapp2.database.Note note);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.andihasan7.mynoteapp2.database.Note note);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.andihasan7.mynoteapp2.database.Note note);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from note ORDER BY id ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.andihasan7.mynoteapp2.database.Note>> getAllNotes();
}