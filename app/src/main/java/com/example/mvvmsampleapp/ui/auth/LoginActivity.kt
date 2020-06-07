package com.example.mvvmsampleapp.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmsampleapp.R
import com.example.mvvmsampleapp.databinding.ActivityLoginBinding
import com.example.mvvmsampleapp.utils.hide
import com.example.mvvmsampleapp.utils.show
import com.example.mvvmsampleapp.utils.toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)

        binding.viewmodel = viewModel

        viewModel.authListener = this
    }

    override fun onStarted() {
        progressBarLogin.show()
    }

    override fun onSuccess(loginResponse: LiveData<String>) {
        loginResponse.observe(this, Observer {
            progressBarLogin.hide()
            toast(it)
        })
    }

    override fun onFailure(message: String) {
        progressBarLogin.hide()
        toast(message)
    }
}
