package com.dilara.viewbinding

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.dilara.viewbinding.databinding.FragmentBinding

class FragmentTest : Fragment(R.layout.fragment) {

    private lateinit var binding: FragmentBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentBinding.bind(view)
        binding.textView2
    }
}