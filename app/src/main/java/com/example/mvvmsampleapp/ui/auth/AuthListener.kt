package com.example.mvvmsampleapp.ui.auth

import androidx.lifecycle.LiveData

/**
 * Created by Hau Nguyen Phuc on June 07 2020
 */
interface AuthListener {
    fun onStarted()
    fun onSuccess(loginResponse: LiveData<String>)
    fun onFailure(message: String)
}