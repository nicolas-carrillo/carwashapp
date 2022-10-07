package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.security.Principal

class acceder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acceder)

        val volver: Button=findViewById(R.id.button3)
        volver.setOnClickListener {
            val Intent: Intent= Intent(this, Principal::class.java)
            startActivity(Intent)
        }
    }
}