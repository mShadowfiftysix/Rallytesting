package com.example.dicerally.homeOption

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.dicerally.databinding.FragmentRecipeBinding

class RecipeFragment : Fragment() {


private var _binding:FragmentRecipeBinding?=null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRecipeBinding.inflate(inflater, container, false)
        binding.forret.setOnClickListener {
            val toast = Toast.makeText( activity,"Du klikkede forret", Toast.LENGTH_LONG)
            toast.show()
        }
        binding.hoved.setOnClickListener {
            val toast = Toast.makeText( activity,"Du klikkede hovedret", Toast.LENGTH_LONG)
            toast.show()
        }
        binding.dessert.setOnClickListener {
            val toast = Toast.makeText( activity,"Du klikkede dessert", Toast.LENGTH_LONG)
            toast.show()
        }
        binding.drinks.setOnClickListener {
            val toast = Toast.makeText( activity,"Du klikkede drinks", Toast.LENGTH_LONG)
            toast.show()
        }




        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}