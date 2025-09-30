package com.ruben.kotin.notesapp.presentation.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.*
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.ruben.kotin.notesapp.presentation.login.LoginScreen
import com.ruben.kotin.notesapp.presentation.notes.NoteDetailScreen
import com.ruben.kotin.notesapp.presentation.notes.NotesScreen
import com.ruben.kotin.notesapp.presentation.register.RegisterScreen

@Composable
fun NavGraph(
    startDestination: String = Screen.Login.route
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {

        composable(Screen.Login.route) {
            // Pasar callbacks para navegar en lugar de usar navController dentro del ViewModel
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate(Screen.NotesList.route) {
                        popUpTo(Screen.Login.route) { inclusive = true } // evitar volver al login
                        launchSingleTop = true
                    }
                },
                onNavigateToRegister = {
                    navController.navigate(Screen.Register.route)
                }
            )
        }

        composable(Screen.Register.route) {
            RegisterScreen(
                onRegisterSuccess = {
                    // tras registrarse, vamos al listado y limpiamos backstack del login/register
                    navController.navigate(Screen.NotesList.route) {
                        popUpTo(Screen.Login.route) { inclusive = true }
                        launchSingleTop = true
                    }
                },
                onBack = { navController.popBackStack() }
            )
        }

        composable(Screen.NotesList.route) {
            NotesScreen(
                onAddNote = {
                    navController.navigate(Screen.NoteDetail.createRoute(0L))
                },
                onOpenNote = { noteId ->
                    navController.navigate(Screen.NoteDetail.createRoute(noteId))
                },
                onLogout = {
                    // limpiar backstack y volver al login
                    navController.navigate(Screen.Login.route) {
                        popUpTo(Screen.NotesList.route) { inclusive = true }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable(
            route = Screen.NoteDetail.route,
            arguments = listOf(navArgument("noteId") { type = NavType.LongType })
        ) { backStackEntry ->
            val noteId = backStackEntry.arguments?.getLong("noteId") ?: 0L
            NoteDetailScreen(
                noteId = noteId,
                onSaved = { navController.popBackStack() },
                onCancel = { navController.popBackStack() }
            )
        }
    }
}
