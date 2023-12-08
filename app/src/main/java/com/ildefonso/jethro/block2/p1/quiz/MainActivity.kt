package com.ildefonso.jethro.block2.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber: EditText = findViewById(R.id.First_number)
        val secondNumber: EditText = findViewById(R.id.Second_number)
        val btnSubtract: Button = findViewById(R.id.btn_Subtract)
        val txtNumber: TextView = findViewById(R.id.txt_Number)

        txtNumber.text = ("Hello g").toString()

        btnSubtract.setOnClickListener {
            txtNumber.text = (firstNumber.text.toString().toInt()-secondNumber.text.toString().toInt()).toString()
        }


    }
}