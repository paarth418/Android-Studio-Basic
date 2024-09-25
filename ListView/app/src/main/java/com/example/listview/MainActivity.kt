package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val taskList = arrayListOf<String>()
        taskList.add("Visit Temple")
        taskList.add("Attend Exam")
        taskList.add("Complete the App Dev Project")
        taskList.add("Listen to music")
        taskList.add("Make new Resume")
        taskList.add("Improve Linkdin")

        val adapterForListView = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList )
        binding.listView.adapter = adapterForListView

        binding.listView.setOnItemClickListener { parent, view, position, id ->

            val text = "Clicked on item: " + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

        }

    }
}