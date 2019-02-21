package com.braulio.example.databinding.viewmodel

import android.databinding.ObservableField
import com.braulio.example.databinding.model.Post
import com.braulio.example.databinding.model.User
import com.braulio.example.databinding.view.adapter.MainAdapter

class UserViewModel {

    val name: ObservableField<String> = ObservableField("")
    val email: ObservableField<String> = ObservableField("")

    val items: List<PostItemViewModel>

    private val user: User = User()

    init {
        name.set(user.name)
        email.set(user.email)
        items = setPosts().map { PostItemViewModel(it) }
    }

    private fun setPosts(): MutableList<Post> {
        val items: MutableList<Post> = ArrayList()
        for (i in 0..10) {
            items.add(Post("Alan Turing", "Computer Science", "Learn more about Alan Turing..."))
        }
        return items
    }

}