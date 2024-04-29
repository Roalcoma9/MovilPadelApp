package com.example.aplicacionpadel.redesip.act.menu

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aplicacionpadel.redesip.MainActivity
import com.example.aplicacionpadel.redesip.R
import com.example.aplicacionpadel.redesip.act.menu.adapter.ProductosAdapter
import com.example.aplicacionpadel.redesip.act.menu.adapter.ProductosViewHolder
import com.google.android.material.floatingactionbutton.FloatingActionButton

class menuActivity : AppCompatActivity() {

    private var cantidadActual: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val botonRegreso = findViewById<Button>(R.id.btnRegresoMenu)
        botonRegreso.setOnClickListener { intentButtonMenu() }
        initRecyclerView()
    }

    fun intentButtonMenu() {
        val intentRegreso = Intent(this, MainActivity::class.java)
        startActivity(intentRegreso)
        finish()
    }

    fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ProductosAdapter(ProductosProvider.productosList)
    }
}