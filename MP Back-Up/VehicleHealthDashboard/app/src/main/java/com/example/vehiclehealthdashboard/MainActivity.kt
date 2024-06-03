package com.example.vehiclehealthdashboard

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val email = findViewById<EditText>(R.id.editTextEmail)
        val pass = findViewById<EditText>(R.id.editTextPassword)
        val btn = findViewById<Button>(R.id.loginbtn)
        val btn1 = findViewById<Button>(R.id.button2)
        btn1.setOnClickListener() {
            val user = email.text.toString()
            val pin = pass.text.toString()
            if (user == "Chandana" && pin == "123") {
                Toast.makeText(this@MainActivity, "Login Successful", Toast.LENGTH_LONG).show()
                startActivity(Intent(this, Dashboard::class.java))
                finish()
            } else {
                Toast.makeText(this@MainActivity, "Invalid Credentials..!!", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}
