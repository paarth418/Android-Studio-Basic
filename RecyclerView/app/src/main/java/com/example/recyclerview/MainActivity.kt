package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView : RecyclerView
    lateinit var newsArrayList : ArrayList<News>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.recyclerView)

        val newsImageArray = arrayOf(
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6

        )

         val newsHeadingArray = arrayOf(
             "MCD standing committee poll: Delhi CM Atishi says election ‘illegal’, BJP calls claims ridiculous",
             "Delhi ISBTs see reduced turnaround time due to equal parking rates, FASTag: L-G office",
             "UP trade show a symbol of India’s growing strength, global presence: Minister Piyush Goyal",
             "Deadline ends, Parivesh 2.0 portal to register exotic species gets 32 applications",
             "Row over Rani of Jhansi statue: Barricades near Shahi Idgah park, police deployed to maintain calm",
             "Man, 4 daughters found dead at Delhi’s Vasant Kunj, police suspect suicide"
         )

        myRecyclerView.layoutManager = LinearLayoutManager(this)
        newsArrayList = arrayListOf<News>()

        for( index in newsImageArray.indices){
            val news = News(newsHeadingArray[index], newsImageArray[index])
            newsArrayList.add(news)
        }

        myRecyclerView.adapter = MyAdapter(newsArrayList, this)


    }
}