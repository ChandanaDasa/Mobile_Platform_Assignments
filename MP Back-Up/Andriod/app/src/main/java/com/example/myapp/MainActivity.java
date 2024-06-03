package com.example.myapp;


import static com.example.myapp.R.layout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn, btnR;
    EditText name, pass;
    private android.widget.Toast Toast;

    @SuppressLint({"MissingInflatedId", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(layout.activity_main);

        btn = findViewById(R.id.butn1);
        btnR = findViewById(R.id.butn2);
        btn.setOnClickListener(this);
        btnR.setOnClickListener(this);
        btnR.setOnClickListener(e ->startActivity(new Intent(MainActivity.this, register.class)));
        name = findViewById(R.id.email);
        pass = findViewById(R.id.pass);

    }
    //    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {
        if(view == btn) {
            String nt = name.getText().toString();
            String pt = pass.getText().toString();

            if(nt.equals("chandana") && pt.equals("123")) {
                // logged in successfully
                Toast.makeText(MainActivity.this, "Logged in Successfully", Toast.LENGTH_LONG).show();

                startActivity(new Intent(MainActivity.this, Request.class));
            } else {
                Toast.makeText(MainActivity.this, "Incorrect Credentials", Toast.LENGTH_LONG).show();
            }
        }
    }
}