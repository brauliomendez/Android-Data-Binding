package com.braulio.example.databinding.view.adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.braulio.example.databinding.R
import com.braulio.example.databinding.databinding.ItemPostBinding
import com.braulio.example.databinding.view.viewholder.MainViewHolder
import com.braulio.example.databinding.viewmodel.PostItemViewModel

class MainAdapter(var items: List<PostItemViewModel>) : RecyclerView.Adapter<MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val binding = DataBindingUtil.inflate<ItemPostBinding>(LayoutInflater.from(parent.context), R.layout.item_post, parent, false)
        return MainViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(mainViewHolder: MainViewHolder, position: Int) = mainViewHolder.bind(items[position])

}