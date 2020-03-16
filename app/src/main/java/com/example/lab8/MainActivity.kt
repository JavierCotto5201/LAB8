package com.example.lab8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.VISIBLE
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
        if (editText.getText().toString().equals("JavierCotto5201")){
                im_Usuario.visibility = VISIBLE
                ir_btn.visibility = VISIBLE
                tv_Usuario.visibility = VISIBLE
        }else{
            Toast.makeText(applicationContext, "Usuario Incorrecto", Toast.LENGTH_SHORT).show()
        }
        }

        ir_btn.setOnClickListener{
            val ret = Intent(this, Repositorios::class.java)
            startActivity(ret)
        }
    }
}
