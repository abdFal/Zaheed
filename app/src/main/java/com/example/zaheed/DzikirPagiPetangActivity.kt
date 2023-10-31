package com.example.zaheed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zaheed.adapter.DzikirDoaAdapter
import com.example.zaheed.databinding.ActivityDzikirPagiPetangBinding
import com.example.zaheed.model.DzikirDoaData

class DzikirPagiPetangActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDzikirPagiPetangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPagiPetangBinding.inflate(layoutInflater)
        binding.rvDzikirPagi.layoutManager = LinearLayoutManager(this)
        binding.rvDzikirPagi.adapter = DzikirDoaAdapter(DzikirDoaData.listDzikirPagi)
        binding.rvDzikirPetang.layoutManager = LinearLayoutManager(this)
        binding.rvDzikirPetang.adapter = DzikirDoaAdapter(DzikirDoaData.listDzikirPetang)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir Pagi Petang"
        setContentView(binding.root)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}