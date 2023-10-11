package com.example.recyclerviewexampleviews.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexampleviews.Elementos
import com.example.recyclerviewexampleviews.R

class ElementoAdapter(private val elementosList: List<Elementos>) : RecyclerView.Adapter<ElementoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ElementoViewHolder(layoutInflater.inflate(R.layout.elemento, parent, false))
    }

    override fun getItemCount(): Int = elementosList.size

    override fun onBindViewHolder(holder: ElementoViewHolder, position: Int) {
        val item = elementosList[position]
        holder.personalizar(item)
    }
}