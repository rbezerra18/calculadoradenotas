package com.example.calculadoradenotas

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular: Button = calcular
        val resultado: TextView = resultado

        btCalcular.setOnClickListener {
            val nota1: Int = Integer.parseInt(nota1.text.toString())
            val nota2: Int = Integer.parseInt(nota2.text.toString())
            val media : Int = (nota1 + nota2) / 2
            val faltas : Int = Integer.parseInt(faltas.text.toString())

            if(media >= 6 && faltas <= 10){
                resultado.setText("Alunx aprovadx!" + "\n" + "Média final: " + media + "\n" + "Faltas: " + faltas)
                resultado.setTextColor(Color.GREEN)
            } else{
                resultado.setText("Alunx reprovadx!" + "\n" + "Média final: " + media + "\n" + "Faltas: " + faltas)
                resultado.setTextColor(Color.RED)
            }
        }


    }
}