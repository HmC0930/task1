package com.example.mrfz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_show.*

class ShowFragment:Fragment() {
    private val viewModel by lazy {
        ViewModelProvider(this)[ItemViewModel::class.java]
    }

    private lateinit var adapter: ItemAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_show,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val item=viewModel.getItems()
        val layoutManager= GridLayoutManager(activity,6)
        show_recyclerview.layoutManager=layoutManager
        adapter= viewModel.getItems().value?.let { ItemAdapter(this, it) }!!
    }
}