package com.paulo.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var num : Float = 0F
        var imc = intent.getFloatExtra("IMC", num)
        if (imc < 18.5){
            tv_imc1.text = "Seu Imc é " +imc
            tv_imc.text = "Voçê está abaixo do Peso"
        }else if ((imc > 18.5) && (imc < 24.9)){
            tv_imc1.text = "Seu Imc é " +imc
            tv_imc.text = "Voçê está com Peso normal"
        }else if ((imc > 25) && (imc < 29.9)){
            tv_imc1.text = "Seu Imc é " +imc
            tv_imc.text = "Voçê está com Sobrepeso"
        }else if ((imc > 30) && (imc < 34.9)){
            tv_imc1.text = "Seu Imc é " +imc
            tv_imc.text = "Voçê está com Obesidade Grau 1"
        }else if ((imc > 35) && (imc < 39.9)){
            tv_imc1.text = "Seu Imc é " +imc
            tv_imc.text = "Voçê está com Obesidade Grau 2"
        }else if(imc >= 40){
            tv_imc1.text = "Seu Imc é " +imc
            tv_imc.text = "Voçê está com Obesidade Grau 3"
        }
    }
}
