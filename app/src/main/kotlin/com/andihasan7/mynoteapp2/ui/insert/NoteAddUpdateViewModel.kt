package com.andihasan7.mynoteapp2.ui.insert

class NoteAddUpdateViewModel(application: Application) : ViewModel() {
    
    private val mNoteRepository: NoteRepository = NoteRepository(application)
    
    fun insert(note: Note) {
        mNoteRepository.insert(note)
    }
    fun update(note: Note) {
        mNoteRepository.update(note)
    }
    fun delete(note: Note) {
        mNoteRepository.delete(note)
    }
}