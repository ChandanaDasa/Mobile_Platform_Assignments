package com.example.vehiclehealthdashboard

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Dashboard : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.dashboard)
        val btn1 = findViewById<Button>(R.id.vehiclestatus)
        btn1.setOnClickListener{
            startActivity(Intent(this, VehicleStatus::class.java))
            val btn2=findViewById<Button>(R.id.profile)
            startActivity(Intent(this, Profile::class.java))
        }
    }
}