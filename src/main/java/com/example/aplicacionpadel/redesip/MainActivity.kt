package com.example.aplicacionpadel.redesip

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aplicacionpadel.redesip.act.menu.menuActivity
import com.example.aplicacionpadel.redesip.act.other.OtherActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val buttonMenu = findViewById<AppCompatButton>(R.id.buttonMenu)
        val buttonOther = findViewById<AppCompatButton>(R.id.buttonOther)

        buttonMenu.setOnClickListener {
            val intentMenu = Intent(this, menuActivity::class.java)
            startActivity(intentMenu)
        }

        buttonOther.setOnClickListener {
            val intentOther = Intent(this, OtherActivity::class.java)
            startActivity(intentOther)
        }



    }
}