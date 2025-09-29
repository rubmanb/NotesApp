package com.ruben.kotin.notesapp.data.repository

interface LoginRepository {
    suspend fun login(email: String, password: String): Boolean
}