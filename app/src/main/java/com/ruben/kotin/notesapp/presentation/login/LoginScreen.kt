package com.ruben.kotin.notesapp.presentation.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class LoginScreen(onLoginSuccess: () -> Unit, onNavigateToRegister: () -> Unit) :
    ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Login()
            }
        }
    }
}

@Preview
@Composable
fun Login() {
    // UI para el login
    Column(
        modifier = Modifier.fillMaxSize().background(Color.DarkGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Text(
            text = "Login",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp),
            fontSize = 50.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center
        )
        Row() {
            Spacer(modifier = Modifier.width(8.dp))
            TextField(value = "Email", onValueChange = {})
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Spacer(modifier = Modifier.width(8.dp))
            TextField(value = "Password", onValueChange = {})
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                /*navegación a la pantalla de notas*/
            }) {
            Text("Iniciar Sesión")
        }
    }
}



