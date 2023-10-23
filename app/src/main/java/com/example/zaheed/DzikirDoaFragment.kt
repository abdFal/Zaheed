package com.example.zaheed

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.zaheed.databinding.FragmentDzikirDoaBinding

class DzikirDoaFragment : Fragment(), View.OnClickListener {
    private lateinit var binding: FragmentDzikirDoaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDzikirDoaBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.llDzikirDoaShalat.setOnClickListener(this)
        binding.llDzikirDoaHarian.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.ll_dzikir_doa_shalat -> {
                val intentDDS = Intent(requireContext(), SunnahQouliyahActivity::class.java)
                startActivity(intentDDS)
            }R.id.ll_dzikir_doa_harian -> {
                val intentDDS = Intent(requireContext(), DzikirDoaHarianActivity::class.java)
                startActivity(intentDDS)
            }
        }
    }
}