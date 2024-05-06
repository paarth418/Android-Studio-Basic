package com.example.customisedalertboxes

import android.annotation.SuppressLint
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var dialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.btn)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue)

        val buttonFeedback = dialog.findViewById<Button>(R.id.btnFeedback)
        val buttonGood = dialog.findViewById<Button>(R.id.btnGood)

        buttonGood.setOnClickListener {
            dialog.dismiss()
        }
        buttonFeedback.setOnClickListener {

        }
        myButton.setOnClickListener {
            dialog.show()

        }
    }
}