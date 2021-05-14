package com.example.dicerally.homeOption

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.dicerally.R
import com.example.dicerally.databinding.FragmentFavouritesBinding
import com.example.dicerally.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        var v=inflater.inflate(R.layout.fragment_home,container,false)



            var fManager=requireActivity().supportFragmentManager

            var tx =fManager.beginTransaction()
            tx.add(R.id.fl_wrapper,RecipeFragment())
            tx.addToBackStack(null)
            tx.commit()





        return v
    }

}




