package com.andihasan7.mynoteapp2.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\r\u0010\u0006\u001a\u00020\u0007H\'\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/andihasan7/mynoteapp2/database/NoteDao;", "", "delete", "", "note", "Lcom/andihasan7/mynoteapp2/database/Note;", "getAllNotes", "error/NonExistentClass", "()Lerror/NonExistentClass;", "insert", "update", "app_debug"})
@Dao
public abstract interface NoteDao {
    
    @Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.andihasan7.mynoteapp2.database.Note note);
    
    @Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.andihasan7.mynoteapp2.database.Note note);
    
    @Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.andihasan7.mynoteapp2.database.Note note);
    
    @org.jetbrains.annotations.NotNull
    @Query
    public abstract LiveData<java.util.List<com.andihasan7.mynoteapp2.database.Note>> getAllNotes();
}