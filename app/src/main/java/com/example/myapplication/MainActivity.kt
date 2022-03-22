package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var position: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.testTextView)

        val button: Button = findViewById(R.id.testButton);
        button.setOnClickListener {

            if (position) {
                textView.text = "Добро пожаловать в Котлин"
                position = false

            } else {
                textView.text = "Отвали, я уже все сказал"
            }

        }
    }
}

