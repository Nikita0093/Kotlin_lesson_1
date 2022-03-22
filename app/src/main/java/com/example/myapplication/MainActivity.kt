package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.WorkSource
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    var position: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonTest()
        dataTest()
        objectTest()
        getList()
    }


    private fun objectTest() {
        val textView03: TextView = findViewById(R.id.testTextViewObject)
        val objectText: Int
        objectText = ObjectTest.getName()
        textView03.text = objectText.toString()
    }


    private fun dataTest() {
        val weather = Weather("Москва", 10)
        val weather02 = weather.copy()
        val textViewWeather: TextView = findViewById(R.id.testTextView)
        textViewWeather.setText("${weather02.townName}" + " + " + "${weather02.temperature}")
    }


    private fun buttonTest() {
        val textView: TextView = findViewById(R.id.testTextViewButton)

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

    fun getList() {
        val list = listOf("1", "2", "3", "4", "5", "6", "7")
        /* for (a in list) {
             Log.d("myLogs", "$a")
             val textView04: TextView = findViewById(R.id.testTextViewCircle)
             textView04.append(a + " ")

         */
        val textView04: TextView = findViewById(R.id.testTextViewCircle)
        list.forEach { textView04.append(it + " ") }


    }

}





