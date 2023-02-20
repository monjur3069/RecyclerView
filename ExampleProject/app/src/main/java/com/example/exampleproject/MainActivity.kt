package com.example.exampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exampleproject.adapter.ProductAdapter
import com.example.exampleproject.databinding.ActivityMainBinding
import com.example.exampleproject.model.ProductModel

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var binding: ActivityMainBinding? = null
    private var list: MutableList<ProductModel> = arrayListOf()
    private lateinit var productAdapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        list.add(ProductModel("Car", "Nice Car"))
        list.add(ProductModel("Toy", "Nice Toy"))
        list.add(ProductModel("Cycle", "Nice Cycle"))
        list.add(ProductModel("Bike", "Nice Bike"))
        list.add(ProductModel("Food", "Nice Food"))
        list.add(ProductModel("Map", "Nice Map"))

        recyclerView=findViewById(R.id.recyclerview)
        productAdapter = ProductAdapter()
        with(binding?.recyclerview!!) {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = productAdapter
        }

        recyclerView.setAdapter(productAdapter);
        productAdapter.initLoad(list)
    }
}