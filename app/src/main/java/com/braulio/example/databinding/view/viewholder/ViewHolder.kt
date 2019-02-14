package com.braulio.example.databinding.view.viewholder

import android.support.v7.widget.RecyclerView
import com.braulio.example.databinding.databinding.ItemPostBinding
import com.braulio.example.databinding.model.Post

class ViewHolder(private val binding: ItemPostBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(post: Post) {
        binding.post = post
        binding.executePendingBindings()
    }
}