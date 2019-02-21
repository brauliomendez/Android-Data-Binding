package com.braulio.example.databinding.view.activity

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.braulio.example.databinding.R
import com.braulio.example.databinding.databinding.ActivityMainBinding
import com.braulio.example.databinding.viewmodel.UserViewModel

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewModel = UserViewModel()
    }

}
