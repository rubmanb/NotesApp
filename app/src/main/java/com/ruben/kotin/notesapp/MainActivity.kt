package com.ruben.kotin.notesapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import com.ruben.kotin.notesapp.presentation.login.Login
import com.ruben.kotin.notesapp.presentation.login.LoginScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Login()
            }
        }
    }
}

