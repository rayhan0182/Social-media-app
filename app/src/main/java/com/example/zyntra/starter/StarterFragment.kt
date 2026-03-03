package com.example.zyntra.starter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.zyntra.R
import com.example.zyntra.basefrag.BaseFragment
import com.example.zyntra.databinding.FragmentStarterBinding

class StarterFragment : BaseFragment<FragmentStarterBinding>(

    FragmentStarterBinding::inflate

) {
    override fun usercreate() {

        with(binding){

            login.setOnClickListener {

                findNavController().navigate(R.id.action_starterFragment_to_loginFragment)

            }

            regis.setOnClickListener {

                findNavController().navigate(R.id.action_starterFragment_to_registerFragment)

            }

        }

    }

    override fun datarespons() {
    }


}