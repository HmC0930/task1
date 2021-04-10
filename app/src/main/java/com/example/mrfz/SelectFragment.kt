package com.example.mrfz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout.HORIZONTAL
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_select.*
import kotlinx.android.synthetic.main.fragment_show.*

class SelectFragment:Fragment() {
    val items= mutableListOf(Item("1",R.drawable.image1),Item("2",R.drawable.image2),Item("3",R.drawable.image3),
        Item("4",R.drawable.image4),Item("5",R.drawable.image5),Item("6",R.drawable.image6),
        Item("7",R.drawable.image8),Item("8",R.drawable.image8),Item("9",R.drawable.image9),
        Item("10",R.drawable.image10),Item("11",R.drawable.image11),Item("12",R.drawable.image12),
        Item("13",R.drawable.image13),Item("14",R.drawable.image14),Item("15",R.drawable.image15),
        Item("16",R.drawable.image16),Item("17",R.drawable.image17),Item("18",R.drawable.image18),
        Item("19",R.drawable.image19),Item("20",R.drawable.image20))
    private lateinit var adapter: ItemAdapter_select
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_select,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val layoutManager= GridLayoutManager(context,4,GridLayoutManager.HORIZONTAL,false)
        select_recyclerview.layoutManager=layoutManager
        adapter= ItemAdapter_select(this,items)
        select_recyclerview.adapter=adapter
    }
}