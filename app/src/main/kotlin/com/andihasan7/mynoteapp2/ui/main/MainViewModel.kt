package com.andihasan7.mynoteapp2.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.andihasan7.mynoteapp2.database.Note
import com.andihasan7.mynoteapp2.repository.NoteRepository

class MainViewModel(application: Application) : ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)
    
    fun getAllNotes(): LiveData<List<Note>> = mNoteRepository.getAllNotes()
}