package com.example.mrfz

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import kotlin.concurrent.thread


class SelectActivityAdapter(context: Context, items: List<Item>) :
    ShowActivityAdapter(context, items) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item,
            parent, false
        )
        val holder = ViewHolder(view)
        holder.itemView.setOnClickListener {
            val position = holder.adapterPosition
            items[position].isChecked = !items[position].isChecked
            SelectActivity.Manager.NameTextView.text = items[position].name
            if (items[position].isChecked) {
//                Repository.chosenItems.add(items[position])
                holder.cardView.setBackgroundColor(Color.parseColor("FF018786"))
            } else {
//                Repository.chosenItems.remove(items[position])
                holder.cardView.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
            }
        }
        return holder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)

    }


}