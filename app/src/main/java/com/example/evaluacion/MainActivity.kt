package com.example.evaluacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn01Layer1 = findViewById<Button>(R.id.btn01Layer1)
        btn01Layer1.setOnClickListener(){
            val saltar:Intent=Intent(this, Formulario::class.java)
            startActivity(saltar)

        }
    }
}