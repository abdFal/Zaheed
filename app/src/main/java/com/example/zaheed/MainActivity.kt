package com.example.zaheed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.zaheed.adapter.SectionPagerAdapter
import com.example.zaheed.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object{
        @StringRes
        private val tab_titles = intArrayOf(
            R.string.tab_text_article,
            R.string.tab_text_dzikir_doa
        )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = SectionPagerAdapter(this)
        val vp = binding.pager

        vp.adapter = adapter

        val tabs = binding.tabLayout
        TabLayoutMediator(tabs, vp){ tab, position ->
            tab.text = resources.getString(tab_titles[position])
        }.attach()

        supportActionBar?.elevation = 0f

        }
}