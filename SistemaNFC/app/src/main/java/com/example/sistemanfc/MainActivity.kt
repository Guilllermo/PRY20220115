package com.example.sistemanfc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login =findViewById<Button>(R.id.button8)
        val registro =findViewById<Button>(R.id.button2)
        val olvido = findViewById<TextView>(R.id.textView3)
        login.setOnClickListener {
            val intent = Intent(this, PasajeroPage::class.java).apply {

            }
            startActivity(intent)
        }
        registro.setOnClickListener{
            val intent = Intent(this, Register::class.java).apply {

            }
            startActivity(intent)
        }
        olvido.setOnClickListener{
            val intent = Intent(this, RecuperarPassword::class.java).apply {

            }
            startActivity(intent)
        }
    }
}