package com.example.mrfz

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ItemAdapter_select(fragment: Fragment, items: List<Item>) : ItemAdapter(fragment, items) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item,
            parent,false)
        val holder=ViewHolder(view)
        holder.itemView.setOnClickListener {
//            val position=holder.adapterPosition
//            val item=items[position]
//            Repository.insert(item)
        }
        return holder
    }
}