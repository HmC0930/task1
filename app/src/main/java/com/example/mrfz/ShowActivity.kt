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
        companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        var items= ArrayList<Item>()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)
        fab2.setOnClickListener {
            val intent= Intent(this,SelectActivity::class.java)
            startActivity(intent)
        }
        thread{
            items= Repository.getItems() as ArrayList<Item>
        }
        val layoutManager= GridLayoutManager(this,6)
        layoutManager.orientation=GridLayoutManager.HORIZONTAL
        show_recyclerview.layoutManager=layoutManager
        val adapter=ShowActivityAdapter(this,items)
        select_recyclerview.adapter=adapter
    }
}
