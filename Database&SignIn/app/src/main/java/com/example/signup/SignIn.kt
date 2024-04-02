package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.LoginFilter.UsernameFilterGMail
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SignIn : AppCompatActivity() {
    lateinit var databaseReference: DatabaseReference
    companion object{
        const val KEY1 = "com.example.signup.SignInActivity.email"
        const val KEY2 = "com.example.signup.SignInActivity.name"
        const val KEY3 = "com.example.signup.SignInActivity.username"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val signInButton= findViewById<Button>(R.id.btnsignin)
        val username= findViewById<TextInputEditText>(R.id.textusername)


        signInButton.setOnClickListener {

            val username = username.text.toString()
            if(username.isNotEmpty()){
                readData(username)
            }else{
                Toast.makeText(this, "Please enter username", Toast.LENGTH_SHORT).show()
            }

        }


    }

    private fun readData(username : String){

        databaseReference = FirebaseDatabase.getInstance().getReference("Users")

        databaseReference.child(username).get().addOnSuccessListener {

            if(it.exists()){

                val email = it.child("email").value
                val name = it.child("name").value
                val username = it.child("username").value

                intent = Intent(this, Welcome::class.java)

                intent.putExtra(KEY1,email.toString())
                intent.putExtra(KEY2,name.toString())
                intent.putExtra(KEY3,username.toString())

                startActivity(intent)

            }else{
                Toast.makeText(this, "User does not exist", Toast.LENGTH_SHORT).show()
            }

        }.addOnFailureListener {
            Toast.makeText(this, "Error 404", Toast.LENGTH_SHORT).show()
        }
    }
}