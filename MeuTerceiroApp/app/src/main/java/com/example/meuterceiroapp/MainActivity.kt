package com.example.meuterceiroapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textoPrincipal: TextView = findViewById(R.id.TextViewHello)
        val editText: EditText = findViewById(R.id.editTextText)
        val imageView: ImageView = findViewById(R.id.imageView)


        val meubotao: Button = findViewById(R.id.buttonClique)

        imageView.visibility = View.INVISIBLE

        meubotao.setOnClickListener{
            val nome = editText.text.toString()
            textoPrincipal.text="Bem vindo, ${nome}!"
            imageView.setImageResource(R.drawable.sla)
            imageView.visibility = View.VISIBLE
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}