package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SignUp : AppCompatActivity() {

    private lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signButton= findViewById<Button>(R.id.button)
        val name= findViewById<TextInputEditText>(R.id.name)
        val email= findViewById<TextInputEditText>(R.id.email)
        val password= findViewById<TextInputEditText>(R.id.password)
        val username= findViewById<TextInputEditText>(R.id.username)
        val signInText = findViewById<TextView>(R.id.textView4)


        signButton.setOnClickListener {

            val name = name.text.toString()
            val email = email.text.toString()
            val password = password.text.toString()
            val username = username.text.toString()


            val user= User(name, email, password, username)
            database = FirebaseDatabase.getInstance().getReference("Users")
            database.child(username).setValue(user).addOnSuccessListener {
                Toast.makeText(this, "User Registered", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }
        }

        signInText.setOnClickListener {
            intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }
    }
}