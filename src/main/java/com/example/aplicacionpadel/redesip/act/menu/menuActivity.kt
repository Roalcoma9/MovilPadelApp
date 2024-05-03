package com.example.aplicacionpadel.redesip.act.menu

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aplicacionpadel.redesip.MainActivity
import com.example.aplicacionpadel.redesip.R
import com.example.aplicacionpadel.redesip.act.carrito.ItemCompra
import com.example.aplicacionpadel.redesip.act.menu.adapter.ProductosAdapter
import com.example.aplicacionpadel.redesip.databinding.ActivityMenuBinding

class menuActivity : AppCompatActivity() {

    private var cantidadActual: Int = 0
    private lateinit var binding: ActivityMenuBinding



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val botonRegreso = findViewById<Button>(R.id.btnRegresoMenu)
        val botonBebida = findViewById<Button>(R.id.btnFragmentBebidas)
        val botonComida = findViewById<Button>(R.id.btnFragmentComidas)
        botonRegreso.setOnClickListener { intentButtonMenu() }
        botonBebida.setOnClickListener { abrirFragmentBebida() }
        botonComida.setOnClickListener { abrirFragmentComidas() }
    }

    fun intentButtonMenu() {
        val intentRegreso = Intent(this, MainActivity::class.java)
        startActivity(intentRegreso)
        finish()
    }

    fun abrirFragmentBebida() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<BebidasFragment>(R.id.fragmentContainerBebidas)
        }
    }

    fun abrirFragmentComidas() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<ComidasFragment>(R.id.fragmentContainerComidas)

        }
    }
}