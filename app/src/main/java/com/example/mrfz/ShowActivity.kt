package com.example.mrfz

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_select.*
import kotlinx.android.synthetic.main.activity_show.*
import kotlin.concurrent.thread

class ShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)
        var items: List<Item>
        items = Repository.chosenItems
//        thread {
//            items = Repository.getItems()
//        }
        val layoutManager = GridLayoutManager(this, 6)
        layoutManager.orientation = GridLayoutManager.HORIZONTAL
        show_recyclerview.layoutManager = layoutManager
        val adapter = ShowActivityAdapter(this, items)
        show_recyclerview.adapter = adapter
        fab2.setOnClickListener {
            val intent = Intent(this, SelectActivity::class.java)
            startActivity(intent)
        }
    }

}
