package com.example.myapplication

import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TEXT1 = findViewById<EditText>(R.id.edit_valor1)

        val TEXT2= findViewById<EditText>(R.id.edit_valor2)

        val TEXT3 = findViewById<EditText>(R.id.edit_valor3)

        val btn4 = findViewById<Button>(R.id.button3)

       /* Para calcular a tensão (V):

        V = R * I
        Para calcular a corrente (I):

        I = V / R
        Para calcular a resistência (R):

        R = V / I
        */

        btn4.setOnClickListener {
            val resistecia = TEXT1.text.toString().toInt()
            val corrente = TEXT2.text.toString().toInt()
            val tensao =  resistecia * corrente
            Toast.makeText( this,"A tensão é ${tensao}", Toast.LENGTH_SHORT).show()
        }/*

        btn4.setOnClickListener{
            val tensao = TEXT3.text.toString().toInt()
            val corrente = TEXT2.text.toString().toInt()
            val resistencia =  tensao / corrente
            Toast.makeText( this,"A tensão é ${resistencia}", Toast.LENGTH_SHORT).show()
        }
        btn4.setOnClickListener{
            val resistencia = TEXT1.text.toString().toInt()
            val tensao = TEXT3.text.toString().toInt()
            val corrente =  tensao / resistencia
            Toast.makeText( this,"A tensão é ${corrente}", Toast.LENGTH_SHORT).show()
        }

*/
    }

}