package com.example.recyclerviewexampleviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexampleviews.adapter.ElementoAdapter
import com.example.recyclerviewexampleviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        iniciarRecyclerView()
    }

    fun iniciarRecyclerView() {
        val recyclerView = binding.recyclerViewContent
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ElementoAdapter(ElementoProvider.Elemento)
    }
}