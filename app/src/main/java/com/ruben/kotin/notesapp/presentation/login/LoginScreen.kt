package com.ruben.kotin.notesapp.presentation.login


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


class LoginScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Login()
            }
            //Login()
        }
    }
}

@Composable
fun Login() {
    // UI para el login
    Column(modifier = Modifier.fillMaxSize()) {
        Text("Login", style = MaterialTheme.typography.headlineMedium)
        Row(){
            Text("Email")
            TextField(
                value = "",
                onValueChange = {},
                label = { Text("Email") }
            )
        }
        Row {
            Text("Password")
            TextField(
                value = "",
                onValueChange = {},
                label = { Text("Password") }
            )
        }
        Button(
            onClick = {
                /*navegación a la pantalla de notas*/
            }
        ) {
            Text("Iniciar Sesión")
        }
    }
}



