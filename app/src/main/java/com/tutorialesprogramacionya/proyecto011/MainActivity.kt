package com.tutorialesprogramacionya.proyecto011

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et1=findViewById<EditText>(R.id.et1)
        val boton1=findViewById<Button>(R.id.button)
        boton1.setOnClickListener {
            if (et1.text.toString() == "abc123") {
                val intento1 = Intent(this, Actividad2::class.java)
                startActivity(intento1)
            } else
                Toast.makeText(this, "Clave incorrecta", Toast.LENGTH_LONG).show()
        }
    }
}