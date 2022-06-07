package com.example.wear3

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.example.wear3.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //var leyenda=findViewById<TextView>(R.id.text)
       // leyenda.text="Saludos Ambrosio"


    }
}