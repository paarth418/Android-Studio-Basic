package com.example.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val name = intent.getStringExtra(SignIn.KEY2)
        val email = intent.getStringExtra(SignIn.KEY1)
        val username = intent.getStringExtra(SignIn.KEY3)

        val welcomeText = findViewById<TextView>(R.id.textView)
        val mailText = findViewById<TextView>(R.id.textView2)
        val usernameText = findViewById<TextView>(R.id.textView3)

        welcomeText.text = "WELCOME $name"
        mailText.text = "Email : $email"
        usernameText.text = "Username : $username"


    }
}