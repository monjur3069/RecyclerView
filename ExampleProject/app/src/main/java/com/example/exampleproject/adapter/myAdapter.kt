package com.example.exampleproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exampleproject.R


class myAdapter(private val arrayList: ArrayList<String>): RecyclerView.Adapter<myAdapter.MyViewHolder>(){

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val title: TextView =itemView.findViewById(R.id.title)
        val description: TextView =itemView.findViewById(R.id.description)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view_product, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myAdapter.MyViewHolder, position: Int) {
        holder.title.text=  arrayList[position]
        holder.description.text=  arrayList[position]
    }

    override fun getItemCount(): Int {

        return arrayList.size
    }
}