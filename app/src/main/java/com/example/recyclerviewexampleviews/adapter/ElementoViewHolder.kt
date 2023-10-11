package com.example.recyclerviewexampleviews.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewexampleviews.Elementos
import com.example.recyclerviewexampleviews.R

class ElementoViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    val nombreElemento = view.findViewById<TextView>(R.id.nombreElemento)
    val imagenElemento = view.findViewById<ImageView>(R.id.imagenElemento)
    val numeroElemento = view.findViewById<TextView>(R.id.numeroElemento)

    fun personalizar(elemento : Elementos) {
        nombreElemento.text = elemento.nombre
        numeroElemento.text = elemento.numero
        Glide.with(imagenElemento.context).load(elemento.imagen).into(imagenElemento)
    }
}