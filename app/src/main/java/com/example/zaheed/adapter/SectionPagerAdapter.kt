package com.example.zaheed.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.zaheed.ArticleFragment
import com.example.zaheed.DzikirDoaFragment

class SectionPagerAdapter (activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when(position){
            0 -> fragment = ArticleFragment()
            1 -> fragment = DzikirDoaFragment()
        }
        return fragment as Fragment
    }
}