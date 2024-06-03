package com.example.homecontrollerapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class HomeRegister : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.homeregister)
        val btn1 = findViewById<Button>(R.id.btnlogin)
        btn1.setOnClickListener(){
            startActivities(arrayOf(Intent(this, MainActivity::class.java)))
        }

    }
}
