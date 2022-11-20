package com.andihasan7.mynoteapp2.database

@Dao
interface NoteDao {
    
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(note: Note)
    
    @Update
    fun update(note: Note)
    
    @Delete
    fun delete(note: Note)
    
    @Query("SELECT * from note ORDER BY id ASC")
    fun getAllNotes(): LiveData<List<Note>>
}