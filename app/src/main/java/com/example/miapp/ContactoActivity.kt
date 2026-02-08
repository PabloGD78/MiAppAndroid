package com.example.miapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miapp.databinding.ActivityContactoBinding

class ContactoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContactoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate solicitado
        binding = ActivityContactoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnviar.setOnClickListener {
            val nombre = binding.etNombre.text.toString()
            val email = binding.etEmail.text.toString()
            val mensaje = binding.etMensaje.text.toString()

            // Preparamos el string con los datos
            val datosRetorno = "Contacto de: $nombre ($email). Mensaje: $mensaje"

            // Creamos un intent para devolver los datos
            val resultIntent = Intent()
            resultIntent.putExtra("DATA_RETURN", datosRetorno)

            // Enviamos el resultado y cerramos la pantalla
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}