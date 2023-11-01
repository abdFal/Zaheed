package com.example.zaheed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zaheed.adapter.ArticleAdapter
import com.example.zaheed.databinding.FragmentArticleBinding
import com.example.zaheed.model.ArticleData
import com.example.zaheed.model.ArticleModel
import com.google.android.material.datepicker.MaterialDatePicker

class ArticleFragment : Fragment() {
    private lateinit var binding: FragmentArticleBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentArticleBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvArticle.layoutManager = LinearLayoutManager(context)
        binding.rvArticle.adapter = ArticleAdapter(ArticleData.listArticle)

        val btnWorld = binding.imgWorldBtn
        btnWorld.setOnClickListener{
            val datePicker =
                MaterialDatePicker.Builder.datePicker()
                    .setTitleText("Select date")
                    .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                    .build()

            fragmentManager?.let { it1 -> datePicker.show(it1, "picker") }
        }
    }
}