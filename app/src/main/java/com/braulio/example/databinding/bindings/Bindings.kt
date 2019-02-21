package com.braulio.example.databinding.bindings

import android.databinding.BindingAdapter
import android.graphics.drawable.Drawable
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import com.braulio.example.databinding.view.adapter.MainAdapter
import com.braulio.example.databinding.viewmodel.PostItemViewModel
import com.bumptech.glide.Glide

object Bindings {

    @BindingAdapter("set_image")
    @JvmStatic
    fun setImage(imageView: ImageView, drawable: Drawable) {
        Glide.with(imageView.context)
            .load(drawable)
            .into(imageView)
    }

    @BindingAdapter("set_adapter_recycler_view")
    @JvmStatic
    fun configRecyclerView(recyclerView: RecyclerView, list: List<PostItemViewModel>) {
        val adapter = MainAdapter(list)
        recyclerView.layoutManager = LinearLayoutManager(recyclerView.context)
        recyclerView.adapter = adapter
    }

}