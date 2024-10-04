package com.projeto.placarfacil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var botaoPlacar = findViewById<Button>(R.id.botaoPlacar)
        var botaoTemp = findViewById<Button>(R.id.botaoTemp)

        botaoPlacar.setOnClickListener{

            val intent = Intent(applicationContext, TelaDefinicaoPlacar::class.java)

            startActivity(intent)
        }

        botaoTemp.setOnClickListener{

            val intent = Intent(applicationContext, TelaDefinicaoTemp::class.java)

            startActivity(intent)
        }
    }
}