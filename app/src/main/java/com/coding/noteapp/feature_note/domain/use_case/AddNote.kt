package com.coding.noteapp.feature_note.domain.use_case

import com.coding.noteapp.feature_note.domain.model.InvalidNoteException
import com.coding.noteapp.feature_note.domain.model.Note
import com.coding.noteapp.feature_note.domain.repository.NoteRepository

class AddNote (private val repository: NoteRepository){

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if(note.title.isBlank()){
            throw InvalidNoteException("The title of this note cannot be empty.")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("The content of this note cannot be empty.")
        }
        repository.insertNote(note)
    }
}