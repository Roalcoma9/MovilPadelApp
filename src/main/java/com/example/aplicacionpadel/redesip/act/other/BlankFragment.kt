package com.example.aplicacionpadel.redesip.act.other

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.aplicacionpadel.redesip.MainActivity
import com.example.aplicacionpadel.redesip.R
import com.example.aplicacionpadel.redesip.act.menu.menuActivity

class BlankFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        val btnRegresoFragment = view.findViewById<Button>(R.id.btnRegresoFragment)
        btnRegresoFragment?.setOnClickListener { regresoFragment() }
        return view
    }

    private fun regresoFragment() {
        activity?.supportFragmentManager?.beginTransaction()?.remove(this)?.commit()
    }


}