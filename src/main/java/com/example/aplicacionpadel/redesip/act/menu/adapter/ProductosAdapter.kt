package com.example.aplicacionpadel.redesip.act.menu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aplicacionpadel.redesip.R
import com.example.aplicacionpadel.redesip.act.carrito.ItemCompra
import com.example.aplicacionpadel.redesip.act.menu.Productos

class ProductosAdapter(private val productosList: List<Productos>) : RecyclerView.Adapter<ProductosViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ProductosViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        return ProductosViewHolder(layoutInflater.inflate(R.layout.item_list, p0, false))
    }

    override fun getItemCount(): Int = productosList.size

    override fun onBindViewHolder(holder: ProductosViewHolder, position: Int) {
        val item = productosList[position]
        holder.contador.text = holder.cantidadActual.toString()
        holder.render(item)

        holder.btnSuma.setOnClickListener{
            holder.cantidadActual += 1
            cambioCantidad(holder)
        }

        holder.btnResta.setOnClickListener{
            if (holder.cantidadActual > 0){
                holder.cantidadActual -= 1
                cambioCantidad(holder)
            }
        }


    }

    private fun cambioCantidad(holder: ProductosViewHolder){
        holder.contador.text = holder.cantidadActual.toString()
    }



}