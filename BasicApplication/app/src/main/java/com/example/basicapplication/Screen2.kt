package com.example.basicapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val btnCall= findViewById<Button>(R.id.button2)
        val cardView= findViewById<CardView>(R.id.cardView4)

        btnCall.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.setData(Uri.parse("tel:" + 8239758693))

            startActivity(callIntent)
        }

        cardView.setOnClickListener {
            intent= Intent(applicationContext, AppDev::class.java)
            startActivity(intent)
        }
    }
}
