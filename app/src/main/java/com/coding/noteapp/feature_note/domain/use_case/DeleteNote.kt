package com.coding.noteapp.feature_note.domain.use_case

import android.provider.ContactsContract
import com.coding.noteapp.feature_note.domain.repository.NoteRepository

class DeleteNote(private val repository: NoteRepository) {
    suspend operator fun invoke(note: ContactsContract.CommonDataKinds.Note){
        repository.deleteNote(note)
    }
}