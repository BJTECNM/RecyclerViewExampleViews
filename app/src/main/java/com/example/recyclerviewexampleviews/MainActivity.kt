package com.example.recyclerviewexampleviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexampleviews.adapter.ElementoAdapter
import com.example.recyclerviewexampleviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val manager = LinearLayoutManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        iniciarRecyclerView()
    }

    private fun iniciarRecyclerView() {
        binding.recyclerViewContent.layoutManager = manager
        binding.recyclerViewContent.adapter = ElementoAdapter(ElementoProvider.Elemento)
    }
}