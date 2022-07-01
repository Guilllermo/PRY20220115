package com.example.sistemanfc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NuevaPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva_password)
        val nueva = findViewById<Button>(R.id.button7)
        nueva.setOnClickListener{
            val intent = Intent(this, AdministradorPage::class.java).apply {

            }
            startActivity(intent)
        }
    }
}