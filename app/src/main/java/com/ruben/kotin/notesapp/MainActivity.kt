package com.ruben.kotin.notesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ruben.kotin.notesapp.presentation.login.LoginScreen
import com.ruben.kotin.notesapp.presentation.navegation.NavGraph
import com.ruben.kotin.notesapp.presentation.navegation.Screen
import com.ruben.kotin.notesapp.ui.theme.NotesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // si tienes SessionManager, decide startDestination dinámicamente
            val startDest = if (/* sessionManager.isLoggedIn() */ false) {
                Screen.NotesList.route
            } else {
                Screen.Login.route
            }

            NavGraph(startDestination = startDest)
        }
    }
}