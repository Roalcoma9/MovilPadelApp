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
import androidx.fragment.app.replace
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aplicacionpadel.redesip.MainActivity
import com.example.aplicacionpadel.redesip.R
import com.example.aplicacionpadel.redesip.act.carrito.ItemCompra
import com.example.aplicacionpadel.redesip.act.menu.adapter.ProductosAdapter
import com.example.aplicacionpadel.redesip.databinding.ActivityMenuBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class menuActivity : AppCompatActivity() {

    private var cantidadActual: Int = 0
    lateinit var navegation: BottomNavigationView

    private val mOnNavMenu = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.fragmentBebidas -> {
                supportFragmentManager.commit {
                    replace<BebidasFragment>(R.id.fragmentContainerBebidas)
                    setReorderingAllowed(true)
                }
                return@OnNavigationItemSelectedListener true
            }

            R.id.fragmentComidas -> {
                supportFragmentManager.commit {
                    replace<ComidasFragment>(R.id.fragmentContainerBebidas)
                    setReorderingAllowed(true)
                }
                return@OnNavigationItemSelectedListener true
            }


        }
        false
    }


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        abrirFragmentBebida()
        navegation = findViewById(R.id.navMenu)
        navegation.setOnNavigationItemSelectedListener(mOnNavMenu)
        val botonRegreso = findViewById<Button>(R.id.btnRegresoMenu)
        botonRegreso.setOnClickListener { intentButtonMenu() }
    }

    fun intentButtonMenu() {
        val intentRegreso = Intent(this, MainActivity::class.java)
        startActivity(intentRegreso)
        finish()
    }

    fun abrirFragmentBebida() {
        supportFragmentManager.commit {
            replace<BebidasFragment>(R.id.fragmentContainerBebidas)
            setReorderingAllowed(true)
        }
    }
}