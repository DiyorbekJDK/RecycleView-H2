package com.diyorbek.recycleviewhome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.recycleviewhome.adapter.PeopleAdapter
import com.diyorbek.recycleviewhome.mode.PeopleData

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var peopleAdapter: PeopleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycleView)
        supportActionBar?.hide()
        peopleAdapter = PeopleAdapter(peopleList())
//        recyclerView.adapter = peopleAdapter
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = peopleAdapter
        }

    }

    private fun peopleList(): ArrayList<PeopleData> {
        return arrayListOf(
            PeopleData(R.drawable.kotlinjon, "Kotlinjon", "Language made by using Java"),
            PeopleData(R.drawable.java, "Java", "Very useful language for every thing"),
            PeopleData(R.drawable.python, "Pythonbek", "Simply language"),
            PeopleData(R.drawable.cplus, "C++ aka", "Owner is Microsoft!"),
            PeopleData(R.drawable.html, "Html/Css/JavaScript", "Using to web-sites"),
            PeopleData(R.drawable.csharp, "C#", "Used to make series and famous games"),
            PeopleData(R.drawable.c, "C", "I don't know"),
            PeopleData(R.drawable.php, "PHP", "50% Persont used to make Telegram Bots"),
        )
    }
}