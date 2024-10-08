package com.example.appactividad1084866242

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class contrasenia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contrasenia)
    }

    fun abrirActualizar(view: View) {
        val intent=Intent(this,actualizar::class.java).apply {  }
        startActivity(intent)
    }
    fun abrirActividades(view: View) {
        val intent=Intent(this,actividades::class.java).apply {  }
        startActivity(intent)
    }
}