package com.example.mrfz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_select.*
import kotlin.concurrent.thread


class SelectActivity : AppCompatActivity() {
    val items=mutableListOf(
        Item("1", R.drawable.image1),
        Item("2", R.drawable.image2),
        Item("3", R.drawable.image3),
        Item("4", R.drawable.image4),
        Item("5", R.drawable.image5),
        Item("6", R.drawable.image6),
        Item("7", R.drawable.image8),
        Item("8", R.drawable.image8),
        Item("9", R.drawable.image9),
        Item("10", R.drawable.image10),
        Item("11", R.drawable.image11),
        Item("12", R.drawable.image12),
        Item("13", R.drawable.image13),
        Item("14", R.drawable.image14),
        Item("15", R.drawable.image15),
        Item("16", R.drawable.image16),
        Item("17", R.drawable.image17),
        Item("18", R.drawable.image18),
        Item("19", R.drawable.image19),
        Item("20", R.drawable.image20)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Repository.db;
        setContentView(R.layout.activity_select)
        NameTextView=nameTextView
        val layoutManager=GridLayoutManager(this,2)
        select_recyclerview.layoutManager=layoutManager
        val adapter=SelectActivityAdapter(this,items)
        select_recyclerview.adapter=adapter
        fab.setOnClickListener {
            thread {
                for (item in Repository.chosenItems){
                    Repository.insert(item)
                }
            }
            val intent= Intent(this,ShowActivity::class.java)
            startActivity(intent)
        }

    }
    companion object Manager{
        lateinit var NameTextView:TextView
    }
}