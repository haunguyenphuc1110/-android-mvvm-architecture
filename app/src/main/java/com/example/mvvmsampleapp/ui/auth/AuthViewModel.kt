package com.example.mvvmsampleapp.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.mvvmsampleapp.data.repositories.UserRepository

/**
 * Created by Hau Nguyen Phuc on June 07 2020
 */
class AuthViewModel: ViewModel() {
    var email: String? = null
    var password: String? = null

    lateinit var authListener: AuthListener

    fun onLogin(view: View) {
        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure("Invalid email or password")
            return
        }

        val loginResponse = UserRepository().userLogin(email!!, password!!)
        authListener?.onSuccess(loginResponse)

    }
}