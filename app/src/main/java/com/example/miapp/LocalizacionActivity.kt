package com.example.miapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miapp.databinding.ActivityLocalizacionBinding

class LocalizacionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLocalizacionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate solicitado
        binding = ActivityLocalizacionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}