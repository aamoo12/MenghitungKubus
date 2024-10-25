package com.example.mirhamni

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.mirhamni.databinding.FragmentCalculatorBinding

class CalculatorFragment : Fragment() {
    private lateinit var binding: FragmentCalculatorBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCalculatorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnHitung.setOnClickListener { hitung() }
    }

    private fun hitung() {
        val sisiStr = binding.edtSisi.text.toString()
        if (sisiStr.isNotEmpty()) {
            val sisi = sisiStr.toDouble()
            val volume = sisi * sisi * sisi
            val luas = 6 * sisi * sisi
            binding.txtHasil.text = "Volume: $volume\nLuas Permukaan: $luas"
        } else {
            Toast.makeText(requireContext(), "Masukkan nilai sisi!", Toast.LENGTH_SHORT).show()
        }
    }
}
