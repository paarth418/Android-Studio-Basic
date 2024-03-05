package com.example.cafebasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Orders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders)

        val OrdersOfCustomers= intent.getStringExtra(MainActivity.KEY)
        val TVorder= findViewById<TextView>(R.id.tvOrder)

        TVorder.text = "Orders Placed: " + OrdersOfCustomers.toString()


    }
}