package com.example.mvvmsampleapp.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Hau Nguyen Phuc on June 07 2020
 */

const val CURRENT_USER_ID = 0

@Entity
data class User(
    var id: Int? = null,
    var name: String = "",
    var email: String = "",
    var email_verified_at: String = "",
    var created_at: String = "",
    var updated_at: String = ""
) {
    @PrimaryKey(autoGenerate = false)
    var uid: Int = CURRENT_USER_ID
}