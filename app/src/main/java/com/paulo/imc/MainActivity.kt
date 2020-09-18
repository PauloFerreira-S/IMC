package com.paulo.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_limpar.setOnClickListener(){
            ed_tx_altura.text = null
            ed_tx_peso.text = null
        }
        btn_calcular.setOnClickListener(){
            calcular()
        }
    }
    fun calcular(){
        var peso = ed_tx_peso.text.toString().toFloat()
        var altura = ed_tx_altura.text.toString().toFloat()

        var num = peso/(altura*altura)
        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        intent.putExtra("IMC",num)
        startActivity(intent)
    }
}