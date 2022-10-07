package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ingresar: Button=findViewById(R.id.button)
        ingresar.setOnClickListener {
            val Intent: Intent=Intent(this,acceder::class.java)
            startActivity(Intent)
        }

        val crear: Button=findViewById(R.id.button2)
        crear.setOnClickListener {
            val Intent: Intent=Intent(this, registrar::class.java)
            startActivity(Intent)
        }

        val salir: Button=findViewById(R.id.salir)
        salir.setOnClickListener {
            finish()
        }
    }
}
