package com.example.taskapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val task = findViewById<TextView>(R.id.taskbar)
        val btn = findViewById<Button>(R.id.addtask)
        val btn1 = findViewById<Button>(R.id.btn1)
        val helper = helper()

        btn.setOnClickListener() {
            Toast.makeText(this@MainActivity, "Task Added", Toast.LENGTH_LONG).show()
            tasks.add(task.text.toString())
        }

        btn1.setOnClickListener() {
            helper.replaceTasks(tasks)
            startActivity(Intent(this, TaskActivity::class.java))

        }
    }
}