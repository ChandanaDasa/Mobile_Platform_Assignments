package com.example.vehiclehealthdashboard

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class VehicleStatus : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.vehiclestatus)
        val btn1 = findViewById<Button>(R.id.backButton)
        btn1.setOnClickListener{
            startActivity(Intent(this, Dashboard::class.java))

        }

    }

}