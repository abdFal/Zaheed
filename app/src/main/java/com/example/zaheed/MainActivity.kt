package com.example.zaheed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.annotation.StringRes
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.drawerlayout.widget.DrawerLayout
import com.example.zaheed.adapter.SectionPagerAdapter
import com.example.zaheed.databinding.ActivityDoaDzikirBinding
import com.example.zaheed.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    private lateinit var btnOpenDrawer: ImageButton
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

        drawerLayout = findViewById(R.id.drawer_layout)
        btnOpenDrawer = findViewById(R.id.btnOpenDrawer)

        actionBarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)

        // Set up click listener for the ImageButton
        btnOpenDrawer.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                if (drawerLayout.isDrawerOpen(binding.navigationView)) {
                    drawerLayout.closeDrawer(binding.navigationView)
                } else {
                    drawerLayout.openDrawer(binding.navigationView)
                }
            }
        })

        val btnTaubat = binding.btnTaubat

        btnTaubat.setOnClickListener {
            val alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setTitle("Yakin Dan Ikhlas")
            alertDialogBuilder.setMessage("Jalankan taubat mu sekarang agar semua berjalan lancar?")

            alertDialogBuilder.setPositiveButton("Lanjut") { dialog, _ ->
                val intent = Intent(this, DoaDzikirActivity::class.java)
                startActivity(intent)
            }

            alertDialogBuilder.setNegativeButton("Batal") { dialog, _ ->
                dialog.dismiss()
            }

            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
        }


    }
}