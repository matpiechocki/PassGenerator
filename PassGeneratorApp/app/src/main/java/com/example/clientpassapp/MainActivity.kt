package com.example.clientpassapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generatorPass = GeneratorPass()
        val button_gp = findViewById<Button>(R.id.button_gp)
        val TextView_gp = findViewById<TextView>(R.id.TextView_gp)

        button_gp.setOnClickListener{
            val pass = generatorPass.PassGenerator((8..12).shuffled().last())
            TextView_gp.text = pass
        }

    }
}