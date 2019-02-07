package com.braulio.example.databinding.viewmodel

import android.databinding.ObservableField
import com.braulio.example.databinding.model.User

class UserViewModel(user: User) {

    val profilePicture: ObservableField<String> = ObservableField("")
    val name: ObservableField<String> = ObservableField("")
    val email: ObservableField<String> = ObservableField("")

    init {
        profilePicture.set("https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png")
        name.set(user.name)
        email.set(user.email)
    }

}