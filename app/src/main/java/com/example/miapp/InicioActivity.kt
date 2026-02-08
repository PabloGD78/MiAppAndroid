package com.example.miapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.miapp.databinding.ActivityInicioBinding

class InicioActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInicioBinding

    // 1. Creamos el lanzador para recibir datos de vuelta
    private val contactoLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == RESULT_OK) {
            // Aquí recibimos el String que enviamos desde ContactoActivity
            val datosRecibidos = result.data?.getStringExtra("DATA_RETURN")
            // Lo mostramos en el TextView adicional que pide el ejercicio
            binding.tvDatosContacto.text = datosRecibidos
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Uso de inflate solicitado
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Recuperar el nombre de usuario del Login
        val nombre = intent.getStringExtra("USER_NAME")
        binding.tvBienvenida.text = "Bienvenido, $nombre"

        // 2. Modificamos el botón de contacto para usar el Launcher
        binding.btnContacto.setOnClickListener {
            val intent = Intent(this, ContactoActivity::class.java)
            contactoLauncher.launch(intent)
        }

        // Estos se quedan igual porque son estáticos
        binding.btnSobreNosotros.setOnClickListener {
            startActivity(Intent(this, SobreNosotrosActivity::class.java))
        }

        binding.btnLocalizacion.setOnClickListener {
            startActivity(Intent(this, LocalizacionActivity::class.java))
        }
    }
}