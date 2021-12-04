package com.example.guessinggametask2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val getMessage = intent.getStringExtra("result")
        val getNumber = intent.getStringExtra("number")
        if(getMessage=="False")
        {
            findViewById<TextView>(R.id.getResult).setTextColor(Color.RED)
            findViewById<TextView>(R.id.getResult).text = "$getNumber"
            findViewById<TextView>(R.id.getMessage).text = "You Lost After 12 attempts. \n          The number is"
        }
        else if(getMessage=="True")
        {
            findViewById<TextView>(R.id.getResult).setTextColor(Color.GREEN)
            findViewById<TextView>(R.id.getResult).text = "$getNumber"
            findViewById<TextView>(R.id.getMessage).text = "You Won! The Number is"
        }

    }
}