package com.braulio.example.databinding.view.adapter

import android.databinding.DataBindingUtil
import android.databinding.ObservableList
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.braulio.example.databinding.R
import com.braulio.example.databinding.databinding.ItemPostBinding
import com.braulio.example.databinding.model.Post
import com.braulio.example.databinding.view.viewholder.ViewHolder

class Adapter<T>(var items: ObservableList<T>) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = DataBindingUtil.inflate<ItemPostBinding>(LayoutInflater.from(parent.context), R.layout.item_post, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) = viewHolder.bind(items[position])

}