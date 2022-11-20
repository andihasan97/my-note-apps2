package com.andihasan7.mynoteapp2.ui.main

class MainViewModel(application: Application) : ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)
    
    fun getAllNotes(): LiveData<List<Note>> = mNoteRepository.getAllNotes()
}