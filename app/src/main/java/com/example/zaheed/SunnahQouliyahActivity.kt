package com.example.zaheed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zaheed.adapter.DzikirDoaAdapter
import com.example.zaheed.databinding.ActivitySunnahQouliyahBinding
import com.example.zaheed.model.DzikirDoaData

class SunnahQouliyahActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySunnahQouliyahBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySunnahQouliyahBinding.inflate(layoutInflater)

        binding.rvQauliyahShalat.layoutManager = LinearLayoutManager(this)
        binding.rvQauliyahShalat.adapter = DzikirDoaAdapter(DzikirDoaData.listQauliyah)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Sunnah Qouliah"
        setContentView(binding.root)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}