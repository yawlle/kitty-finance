package com.yawlle.kittyfinance.presentation.main_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yawlle.kittyfinance.R
import com.yawlle.kittyfinance.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViews()
    }

    private fun setupViews() {

    }
}