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
    }
}