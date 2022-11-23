package com.hassanwasfy.zekri.ui.controllers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hassanwasfy.zekri.R
import com.hassanwasfy.zekri.databinding.FragmentAddBinding

class AddFragment : Fragment() {

    lateinit var binding: FragmentAddBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddBinding.inflate(inflater,container,false)
        return binding.root
    }

}