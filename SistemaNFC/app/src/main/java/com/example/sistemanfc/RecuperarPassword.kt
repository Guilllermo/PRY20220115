package com.example.sistemanfc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RecuperarPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_password)
        var nueva = findViewById<Button>(R.id.button5)
        nueva.setOnClickListener {
            val intent = Intent(this, NuevaPassword::class.java).apply {

            }
            startActivity(intent)
        }
        val registro =findViewById<Button>(R.id.button6)
        registro.setOnClickListener{
            val intent = Intent(this, Register::class.java).apply {

            }
            startActivity(intent)
        }
    }
}