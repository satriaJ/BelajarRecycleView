package com.example.belajarrecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList


class Adapter (private val list:ArrayList<Users>) : RecyclerView.Adapter<Adapter.Holder>(){

    override onCreateViewHolder(parent: ViewGroup, viewGroup, viewType: Int): Holder{
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Holder, position: Int){
        holder.view.lbList.text = list.get(position).name
    }

    class Holder(val view: View) : RecyclerView.ViewHolder(view)
}