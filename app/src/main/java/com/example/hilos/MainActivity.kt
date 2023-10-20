package com.example.hilos

import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


public lateinit var entrada: EditText
public lateinit var salida: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        entrada = findViewById(R.id.entrada)
        salida = findViewById(R.id.salida)
    }

    fun calcularOperacion(view: View) {
        val n = entrada.text.toString().toInt()
        salida.append("$n! = ")
        val res = factorial(n)
        salida.append("$res\n")
    }

    fun factorial(n: Int): Int {
        var res = 1
        for (i in 1..n) {
            res *= i
            SystemClock.sleep(1000)
        }
        return res
    }




}