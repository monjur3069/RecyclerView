package com.example.exampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.exampleproject.adapter.myAdapter

class MainActivity2 : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var myList: ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        recyclerView=findViewById(R.id.rcv)
        myList = arrayListOf<String>()
        myList.add("Sakib")
        myList.add("Akash")
        myList.add("Arifur")

        recyclerView.setHasFixedSize(true)
        recyclerView.adapter=myAdapter(myList)
    }
}