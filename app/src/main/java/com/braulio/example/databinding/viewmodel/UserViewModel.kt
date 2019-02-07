package com.braulio.example.databinding.viewmodel

import android.databinding.ObservableField
import com.braulio.example.databinding.model.User

class UserViewModel(user: User) {

    val name: ObservableField<String> = ObservableField("")
    val email: ObservableField<String> = ObservableField("")

    init {
        name.set(user.name)
        email.set(user.email)
    }

}