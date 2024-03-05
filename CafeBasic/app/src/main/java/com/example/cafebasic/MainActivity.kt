package com.example.cafebasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    companion object{
        const val KEY = "com.example.cafebasic.MainActivity.KEY"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOrder= findViewById<Button>(R.id.btnOrder)
        val et1= findViewById<EditText>(R.id.eT1)
        val et2= findViewById<EditText>(R.id.eT2)
        val et3= findViewById<EditText>(R.id.eT3)
        val et4= findViewById<EditText>(R.id.eT4)

        btnOrder.setOnClickListener {
            val ordersList= et1.text.toString() + " " + et2.text.toString() + " " + et3.text.toString() + " " + et4.text.toString()

            intent= Intent(this, Orders::class.java)
            intent.putExtra(KEY, ordersList)
            startActivity(intent)

        }
    }
}