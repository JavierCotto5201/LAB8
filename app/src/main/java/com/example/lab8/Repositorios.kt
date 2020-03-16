package com.example.lab8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


class Repositorios : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repositorios)
        Toast.makeText(applicationContext, "No me dejaba mostrar mis repositorios", Toast.LENGTH_SHORT).show()
    }
}
