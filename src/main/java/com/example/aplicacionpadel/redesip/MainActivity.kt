package com.example.aplicacionpadel.redesip

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.aplicacionpadel.redesip.act.menu.menuActivity
import com.example.aplicacionpadel.redesip.act.other.OtherActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val buttonMenu = findViewById<Button>(R.id.buttonMenu)
        val buttonOther = findViewById<Button>(R.id.buttonOther)

        buttonMenu.setOnClickListener { intentButtonMenu()
        }

        buttonOther.setOnClickListener { intentButtonOther() }

    }

    fun intentButtonMenu() {
        val intentMenu = Intent(this, menuActivity::class.java)
        startActivity(intentMenu)
    }

    private fun intentButtonOther() {
        val intentOther = Intent(this, OtherActivity::class.java)
        startActivity(intentOther)
    }

}