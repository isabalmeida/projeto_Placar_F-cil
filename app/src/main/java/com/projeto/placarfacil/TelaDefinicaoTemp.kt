package com.projeto.placarfacil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaDefinicaoTemp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_definicao_temp)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    val qtdeSets = findViewById<EditText>(R.id.qtdeSets)
    val pontoMax = findViewById<EditText>(R.id.pontoMax)
    val tempLimit = findViewById<EditText>(R.id.tempLimit)
    val botaoVoltar = findViewById<Button>(R.id.botaoVoltar)
    val botaoAvancar = findViewById<Button>(R.id.botaoAvancar)

        botaoAvancar.setOnClickListener{

            val qtdeSets = qtdeSets.text.toString().toDoubleOrNull()
            val pontoMax = pontoMax.text.toString().toDoubleOrNull()
            val tempLimit = tempLimit.text.toString().toDoubleOrNull()

        }

        botaoVoltar.setOnClickListener{

            val intent = Intent(applicationContext, MainActivity::class.java)

            startActivity(intent)

        }

        }

}