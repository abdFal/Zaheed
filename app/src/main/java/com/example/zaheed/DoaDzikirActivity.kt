package com.example.zaheed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zaheed.adapter.DzikirDoaAdapter
import com.example.zaheed.databinding.ActivityDoaDzikirBinding
import com.example.zaheed.model.DzikirDoaData

class DoaDzikirActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDoaDzikirBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoaDzikirBinding.inflate(layoutInflater)

        binding.rvDzikirSetiapSaat.layoutManager = LinearLayoutManager(this)
        binding.rvDzikirSetiapSaat.adapter = DzikirDoaAdapter(DzikirDoaData.listDoa)
        setContentView(binding.root)
    }
}