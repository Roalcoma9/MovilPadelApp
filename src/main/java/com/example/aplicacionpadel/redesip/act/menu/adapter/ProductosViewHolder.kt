package com.example.aplicacionpadel.redesip.act.menu.adapter

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aplicacionpadel.redesip.R
import com.example.aplicacionpadel.redesip.act.carrito.ItemCompra
import com.example.aplicacionpadel.redesip.act.menu.Productos
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProductosViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val btnSuma = view.findViewById<FloatingActionButton>(R.id.btnSuma)
    val btnResta = view.findViewById<FloatingActionButton>(R.id.btnResta)
    val contador = view.findViewById<TextView>(R.id.contador)
    var cantidadActual: Int = 0
    val btnSave = view.findViewById<FloatingActionButton>(R.id.btnActionCompra)


    val name = view.findViewById<TextView>(R.id.nameProducto)
    val publisher = view.findViewById<TextView>(R.id.publisher)
    val precios = view.findViewById<TextView>(R.id.tvPrecios)

    @SuppressLint("SetTextI18n")
    fun render(productosModel: Productos) {

        name.text = productosModel.name
        publisher.text = productosModel.publisher
        precios.text = productosModel.precio.toString() + "$"
    }


}