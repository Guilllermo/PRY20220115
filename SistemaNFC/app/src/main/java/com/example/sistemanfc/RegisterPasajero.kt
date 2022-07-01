package com.example.sistemanfc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterPasajero : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_pasajero)
        val registro = findViewById<Button>(R.id.button4)
        registro.setOnClickListener {
            val intent = Intent(this, PasajeroPage::class.java).apply {

            }
            startActivity(intent)
        }
    }
}