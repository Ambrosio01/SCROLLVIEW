package com.example.wear3

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.wear3.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       //crear una variable leyenda la cual asiganara un texto al TextView
        //mediante la id

        //var leyenda=findViewById<TextView>(R.id.text)
       // leyenda.text="Saludos Ambrosio"
         //binding.text.text"UTSelva"
        binding.btnOK.setOnClickListener {
           Toast.makeText(this, "Aceptar",Toast.LENGTH_SHORT).show()
        }
        binding.btnCANCELAR.setOnClickListener {   //onclicl
            Toast.makeText(this, "Adios",Toast.LENGTH_SHORT).show()//mensaje tipo toast

        }



    }
}