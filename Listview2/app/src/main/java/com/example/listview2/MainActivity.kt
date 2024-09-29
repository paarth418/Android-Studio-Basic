package com.example.listview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var userArrayList: ArrayList<user>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = arrayOf("Paarth", "Rahul", "Raman", "Mukesh")

        val lastMsg = arrayOf("Hey wssap", "Danish bhai zinda rehte na", "kyu chalai tune tej apni gadi", "Tiktokiya")

        val lastMsgTime = arrayOf("9:45 PM", "8:00 PM", "7:30 PM", "11:55 PM", )

        val phnNumber = arrayOf("8239758693", "8184848582", "9625875395", "9712584568")

        val imageId = intArrayOf(R.drawable.pic0, R.drawable.pic1, R.drawable.pic3, R.drawable.pic4,)

        userArrayList = ArrayList()

        for (eachIndex in name.indices){
            val user = user(name[eachIndex], lastMsg[eachIndex], lastMsgTime[eachIndex], phnNumber[eachIndex],
                imageId[eachIndex])

            userArrayList.add(user)
        }

        binding.listView.isClickable = true
        binding.listView.adapter = MyAdapter(this, userArrayList)
    }
}