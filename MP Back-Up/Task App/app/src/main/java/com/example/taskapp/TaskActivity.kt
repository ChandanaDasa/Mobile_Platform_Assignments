package com.example.taskapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class TaskActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.task_activity)

        val arrayAdapter: ArrayAdapter<*>
        val tasks = helper().getAllTask()

        val listView = findViewById<ListView>(R.id.tasklist)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, tasks)

        listView.adapter = arrayAdapter
    }
}