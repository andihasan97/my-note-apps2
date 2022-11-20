package com.andihasan7.mynoteapp2.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/andihasan7/mynoteapp2/database/NoteRoomDatabase;", "", "()V", "noteDao", "Lcom/andihasan7/mynoteapp2/database/NoteDao;", "Companion", "app_debug"})
@Database
public abstract class NoteRoomDatabase extends RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.andihasan7.mynoteapp2.database.NoteRoomDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.andihasan7.mynoteapp2.database.NoteRoomDatabase INSTANCE;
    
    public NoteRoomDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.andihasan7.mynoteapp2.database.NoteDao noteDao();
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    public static final com.andihasan7.mynoteapp2.database.NoteRoomDatabase getDatabase(@org.jetbrains.annotations.NotNull
    Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/andihasan7/mynoteapp2/database/NoteRoomDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/andihasan7/mynoteapp2/database/NoteRoomDatabase;", "getDatabase", "context", "error/NonExistentClass", "(Lerror/NonExistentClass;)Lcom/andihasan7/mynoteapp2/database/NoteRoomDatabase;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmStatic
        public final com.andihasan7.mynoteapp2.database.NoteRoomDatabase getDatabase(@org.jetbrains.annotations.NotNull
        Context context) {
            return null;
        }
    }
}