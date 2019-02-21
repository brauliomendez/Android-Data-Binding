package com.braulio.example.databinding.viewmodel

import android.databinding.ObservableField
import com.braulio.example.databinding.model.Post

class PostItemViewModel(post: Post) {

    val title: ObservableField<String> = ObservableField("")
    val category: ObservableField<String> = ObservableField("")
    val information: ObservableField<String> = ObservableField("")

    init {
        title.set(post.title)
        category.set(post.category)
        information.set(post.information)
    }

}