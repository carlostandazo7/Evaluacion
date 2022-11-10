package com.example.evaluacion


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_presentacion.*

class Presentacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presentacion)

        val extras = intent.extras
        val peso = extras?.getInt("pesoPerro")?:-1
        val altura = extras?.getInt("alturaPerro")?:-1
        val occipucio = extras?.getInt("occipucioPerro")?:-1
        val genero = extras?.getString("generoPerro")?:"Sin genero"
        val nombre = extras?.getString("nombrePerro")?:"Sin nombre"
        val raza = extras?.getString("razaPerro")?:"Sin raza"
        val tipo = extras?.getString("tipoPerro")?:"Sin tipo"

        val imc = peso / (altura * occipucio)

        tv_nombre.setText("El IMC de " + nombre + "es:" + imc)

        btn_home.setOnClickListener(){
            val saltar:Intent=Intent(this, MainActivity::class.java)
            startActivity(saltar)
        }

    }
}