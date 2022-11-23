package com.hassanwasfy.zekri.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.hassanwasfy.zekri.R
import com.hassanwasfy.zekri.databinding.OneZekrModelBinding
import com.hassanwasfy.zekri.db.entity.ZekrModel

class ZekrAdapter(val list: List<ZekrModel>): RecyclerView.Adapter<ZekrAdapter.ZekrViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZekrViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.one_zekr_model,parent,false)
        return ZekrViewHolder(view)
    }

    override fun onBindViewHolder(holder: ZekrViewHolder, position: Int) {
        val currentZekr = list[position]
        holder.binding.apply {
            zekrName.text = currentZekr.zekrName
            zekrPercent.progress = currentZekr.zekrPercent
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }


    class ZekrViewHolder(itemView: View) : ViewHolder(itemView){
        val binding = OneZekrModelBinding.bind(itemView)
    }
}