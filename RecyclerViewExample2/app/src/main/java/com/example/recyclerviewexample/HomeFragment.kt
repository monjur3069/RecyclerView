package com.example.recyclerviewexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexample.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        val adapter = EmployeeAdapter({
            Toast.makeText(activity, "${it.name}", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_homeFragment_to_detailsFragment)
        })
        binding.employeeRecyclerView.layoutManager = LinearLayoutManager(activity)
        binding.employeeRecyclerView.adapter = adapter
        adapter.submitList(employeeList)
        return binding.root
    }


}