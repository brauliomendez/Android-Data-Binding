package com.braulio.example.databinding.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.braulio.example.databinding.R
import com.braulio.example.databinding.databinding.ActivityMainBinding
import com.braulio.example.databinding.model.User
import com.braulio.example.databinding.viewmodel.UserViewModel

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    private val viewModel: UserViewModel = UserViewModel(User())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewModel = viewModel
    }

}
