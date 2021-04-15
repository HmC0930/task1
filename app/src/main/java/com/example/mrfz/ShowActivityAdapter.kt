package com.example.mrfz

import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


open class ShowActivityAdapter(val context: Handler, val items:List<Item>):
RecyclerView.Adapter<ShowActivityAdapter.ViewHolder>(){
    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val itemName: TextView=view.findViewById(R.id.itemname)
        val itemImage:ImageView=view.findViewById(R.id.imageView)
        val itemLinearLayout:LinearLayout=view.findViewById(R.id.item_linearlayout)
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