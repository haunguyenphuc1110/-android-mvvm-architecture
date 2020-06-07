package com.example.mvvmsampleapp.utils

import android.content.Context
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast

/**
 * Created by Hau Nguyen Phuc on June 07 2020
 */

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun ProgressBar.show() {
    visibility = View.VISIBLE
}

fun ProgressBar.hide() {
    visibility = View.GONE
}