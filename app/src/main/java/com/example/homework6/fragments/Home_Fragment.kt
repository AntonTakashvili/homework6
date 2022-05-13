package com.example.homework6.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework6.R

class Home_Fragment:Fragment(R.layout.fragment_home) {

    private lateinit var button: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button=view.findViewById(R.id.button)
        button.setOnClickListener {

            findNavController().navigate(id)
        }
    }
}