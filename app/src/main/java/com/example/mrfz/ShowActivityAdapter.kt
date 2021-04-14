package com.example.mrfz

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.card.MaterialCardView
import kotlin.concurrent.thread


open class ShowActivityAdapter(val context: Context, val items:List<Item>):
RecyclerView.Adapter<ShowActivityAdapter.ViewHolder>(){
    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val itemName: TextView=view.findViewById(R.id.itemname)
        val itemImage:ImageView=view.findViewById(R.id.imageView)
        val cardView:MaterialCardView=view.findViewById(R.id.card_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item,
        parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=items[position]
        holder.itemName.text=item.name
        Glide.with(context).load(item.imageID).into(holder.itemImage)
    }

    override fun getItemCount(): Int =items.size
}