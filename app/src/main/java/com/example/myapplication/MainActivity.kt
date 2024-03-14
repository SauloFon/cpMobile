package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var altura = findViewById<EditText>(R.id.editTextText)
        var calculaImc = findViewById<Button>(R.id.button)
        var mulher = findViewById<RadioButton>(R.id.radioButton2)
        var homem = findViewById<RadioButton>(R.id.radioButton)

        calculaImc.setOnClickListener { view: View? ->
            var altura = altura.text.toString().toDouble()

             if(mulher.isChecked){
                 var alturaIdeal = ((62.1 * altura) - 58)
                 Toast.makeText(this, "$alturaIdeal", Toast.LENGTH_LONG).show()

            }
            if(homem.isChecked) {
                var alturaIdeal = ((72.7 * altura) - 44.7)
                Toast.makeText(this, "$alturaIdeal", Toast.LENGTH_LONG).show()

            }
        }
    }}