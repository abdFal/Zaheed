package com.example.zaheed.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zaheed.databinding.RowDzikirDoaBinding
import com.example.zaheed.databinding.RowItemBinding
import com.example.zaheed.model.DzikirDoaModel

class DzikirDoaAdapter (private val listDoa: ArrayList<DzikirDoaModel>):
    RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>() {
    class MyViewHolder(val binding:RowDzikirDoaBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DzikirDoaAdapter.MyViewHolder {
        val bindingDoaDzikir = RowDzikirDoaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(bindingDoaDzikir)
    }

    override fun onBindViewHolder(holder: DzikirDoaAdapter.MyViewHolder, position: Int) {
        val dataDoaDzikir = listDoa[position]

        holder.binding.apply {
            tvDesc.text = dataDoaDzikir.desc
            tvLafaz.text = dataDoaDzikir.lafaz
            tvTerjemah.text = dataDoaDzikir.terjemah
        }
    }

    override fun getItemCount(): Int = listDoa.size
}