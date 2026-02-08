package com.example.miapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miapp.databinding.ActivitySobreNosotrosBinding

class SobreNosotrosActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySobreNosotrosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate solicitado
        binding = ActivitySobreNosotrosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Aquí no hace falta lógica extra a menos que quieras un botón para volver
    }
}