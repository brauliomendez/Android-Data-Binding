package com.braulio.example.databinding.view.viewholder

import android.support.v7.widget.RecyclerView
import com.braulio.example.databinding.databinding.ItemPostBinding
import com.braulio.example.databinding.viewmodel.PostItemViewModel

class MainViewHolder(private val binding: ItemPostBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(postItemViewModel: PostItemViewModel) {
        binding.viewModel = postItemViewModel
        binding.executePendingBindings()
    }

}