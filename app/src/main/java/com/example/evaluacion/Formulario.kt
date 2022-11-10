package com.example.evaluacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_formulario.*
// import java.lang.NumberFormatException

class Formulario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        val btnCal = findViewById<Button>(R.id.btnCalcular)

        btnCal.setOnClickListener(){
            try {
                var peso:String=pesoForm.text.toString()
                var pesoPerro=Integer.parseInt(peso)
                var altura:String=alturaForm.text.toString()
                var alturaPerro=Integer.parseInt(altura)
                var occipucio:String=occipucioForm.text.toString()
                var occipucioPerro=Integer.parseInt(occipucio)
                var generoPerro:String=generoForm.text.toString()
                var nombrePerro:String=nombreForm.text.toString()
                var razaPerro:String=razaForm.text.toString()
                var tipoPerro:String=tipoForm.text.toString()

                val saltar:Intent=Intent(this, Presentacion::class.java)

                saltar.putExtra("Peso", pesoPerro)
                saltar.putExtra("Altura", alturaPerro)
                saltar.putExtra("Occipucio", occipucioPerro)
                saltar.putExtra("Genero", generoPerro)
                saltar.putExtra("Nombre", nombrePerro)
                saltar.putExtra("Raza", razaPerro)
                saltar.putExtra("Tipo", tipoPerro)
                startActivity(saltar)
            } catch (e:NumberFormatException){
                var peso = 0
                var altura = 0
                var occipucio = 0
                var genero = "Sin genero"
                var nombre = "Sin nombre"
                var raza = "Sin raza"
                var tipo = "Sin tipo"
                Toast.makeText(applicationContext, "Llene el formulario por completo",
                Toast.LENGTH_SHORT).show()
            }
        }
    }
}