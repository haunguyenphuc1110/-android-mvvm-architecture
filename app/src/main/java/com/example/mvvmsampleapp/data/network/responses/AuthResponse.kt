package com.example.mvvmsampleapp.data.network.responses

import com.example.mvvmsampleapp.data.db.entities.User

/**
 * Created by Hau Nguyen Phuc on June 07 2020
 */
data class AuthResponse(
    val isSuccessful: Boolean?,
    val message: String?,
    val user: User?
)