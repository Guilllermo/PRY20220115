package com.example.sistemanfc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterAdministrador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_administrador)
        val registro = findViewById<Button>(R.id.button3)
        registro.setOnClickListener {
            val intent = Intent(this, AdministradorPage::class.java).apply {

            }
            startActivity(intent)
        }
    }
}