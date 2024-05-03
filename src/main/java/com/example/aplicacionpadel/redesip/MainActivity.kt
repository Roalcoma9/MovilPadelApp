package com.example.aplicacionpadel.redesip

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.aplicacionpadel.redesip.act.menu.BebidasFragment
import com.example.aplicacionpadel.redesip.act.menu.menuActivity
import com.example.aplicacionpadel.redesip.act.other.BlankFragment

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val buttonMenu = findViewById<Button>(R.id.buttonMenu)
        val buttonOther = findViewById<Button>(R.id.buttonOther)

        buttonMenu.setOnClickListener { intentButtonMenu()
        }

        buttonOther.setOnClickListener { intentButtonOther()
        }

    }

    fun intentButtonMenu() {
        val intentMenu = Intent(this, menuActivity::class.java)
        startActivity(intentMenu)
    }

    fun intentButtonOther() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<BlankFragment>(R.id.fragmentContainer)
        }
    }

}