package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.security.Principal

class registrar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar2)

        val volver: Button=findViewById(R.id.atras)
        volver.setOnClickListener {
            val Intent: Intent= Intent(this, Principal::class.java)
            startActivity(Intent)
        }

    }
}