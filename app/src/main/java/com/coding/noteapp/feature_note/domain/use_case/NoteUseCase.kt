package com.coding.noteapp.feature_note.domain.use_case

data class NoteUseCase(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote
)
