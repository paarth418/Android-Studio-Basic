package com.example.dialogboxes

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import com.example.dialogboxes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you sure?")
            builder1.setMessage("Do you want to close the app")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton(
                "Yes",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    finish()
                })
            builder1.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.show()

        }

        binding.btn2.setOnClickListener {
            val options = arrayOf("Gulab Jamun", "Rasmalai", "Kaju Katli")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite sweet?")
            builder2.setSingleChoiceItems(
                options,
                0,
                DialogInterface.OnClickListener { dialog, which ->

                    Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT)
                        .show()
                })
            builder2.setPositiveButton(
                "Submit",
                DialogInterface.OnClickListener { dialogInterface, i ->
                })
            builder2.setNegativeButton(
                "Decline",
                DialogInterface.OnClickListener { dialogInterface, i ->

                })
            builder2.show()
        }

        binding.btn3.setOnClickListener {
            val options = arrayOf("Gulab Jamun", "Rasmalai", "Kaju Katli")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite sweet?")
            builder2.setMultiChoiceItems(
                options,
                null,
                DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                    Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT)
                        .show()
                })
            builder2.setPositiveButton(
                "Submit",
                DialogInterface.OnClickListener { dialogInterface, i ->
                })
            builder2.setNegativeButton(
                "Decline",
                DialogInterface.OnClickListener { dialogInterface, i ->

                })
            builder2.show()


        }
    }
}