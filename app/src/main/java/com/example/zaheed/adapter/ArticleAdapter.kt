package com.example.zaheed.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zaheed.databinding.RowItemBinding
import com.example.zaheed.model.ArticleModel

class ArticleAdapter (private val listArticle: ArrayList<ArticleModel>):
    RecyclerView.Adapter<ArticleAdapter.MyViewHolder>() {
    class MyViewHolder(val binding:RowItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ArticleAdapter.MyViewHolder {
        val bindingArticle = RowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(bindingArticle)
    }

    override fun onBindViewHolder(holder: ArticleAdapter.MyViewHolder, position: Int) {
        val dataArticle = listArticle[position]

        holder.binding.apply {
            tvTitle.text = dataArticle.title
            tvDesc.text = dataArticle.desc
            tvKategori.text = dataArticle.kategori
        }
    }

    override fun getItemCount(): Int = listArticle.size
}