package com.example.exampleproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exampleproject.databinding.ItemViewProductBinding
import com.example.exampleproject.model.ProductModel

class ProductAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>()  {
    private val dataList: MutableList<ProductModel> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding: ItemViewProductBinding = ItemViewProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewModel(binding)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ViewModel) {
            val model = dataList[position]
            val binding = holder.binding

            binding.title.text = model.title
            binding.description.text = model.description
        }
    }

    inner class ViewModel(val binding: ItemViewProductBinding) : RecyclerView.ViewHolder(binding.root) {

        /*init {
            binding.root.setOnClickListener {
            }
        }*/
    }

    fun initLoad(list: List<ProductModel>) {
        dataList.clear()
        dataList.addAll(list)
        notifyDataSetChanged()
    }
}