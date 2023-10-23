package com.example.zaheed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zaheed.adapter.DzikirDoaAdapter
import com.example.zaheed.databinding.ActivityDzikirDoaHarianBinding
import com.example.zaheed.model.DzikirDoaData

class DzikirDoaHarianActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDzikirDoaHarianBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirDoaHarianBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvDzikirDoaHarian.layoutManager = LinearLayoutManager(this)
        binding.rvDzikirDoaHarian.adapter = DzikirDoaAdapter(DzikirDoaData.listDzikir)
    }
}