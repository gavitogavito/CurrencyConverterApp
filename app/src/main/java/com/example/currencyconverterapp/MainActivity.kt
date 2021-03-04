package com.example.currencyconverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.currencyconverterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Seteo el binding en la activity
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}