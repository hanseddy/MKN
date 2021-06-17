package com.example.mkn.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.mkn.R
import com.example.mkn.databinding.FragWarningBinding


class Warning : Fragment() {

    private lateinit var binding: FragWarningBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //binding.checkBox.isChecked = false
        // Inflate the layout for this fragment
        binding = FragWarningBinding.inflate(layoutInflater)
        val view =binding.root
        return view
        //return inflater.inflate(R.layout.frag_warning, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
/*        if (binding.checkBox.isChecked == true){
            Toast.makeText(requireContext(),"checkbox is set",Toast.LENGTH_SHORT).show()
        }
        binding.checkBox.setOnClickListener {
            if (binding.checkBox.isChecked == true){
              // binding.nextButtonWarn.visibility=View.VISIBLE
            //Toast.makeText(requireContext(),"checkbox is set",Toast.LENGTH_SHORT).show()
            } else {
                binding.nextButtonWarn.visibility=View.GONE
            }
        }*/


        //button is clicked
        binding.nextButtonWarn.setOnClickListener {
            findNavController().navigate(R.id.action_warning_to_home2)
            binding.checkBox.isChecked = false
        }
    }
}