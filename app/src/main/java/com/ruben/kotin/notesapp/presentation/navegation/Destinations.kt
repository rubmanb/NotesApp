package com.ruben.kotin.notesapp.presentation.navegation

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Register : Screen("register")
    object NotesList : Screen("notes_list")
    object NoteDetail : Screen("note_detail/{noteId}") {
        fun createRoute(noteId: Long) = "note_detail/$noteId"
    }
}
