package com.example.mrfz

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mrfz.Repository.db
import kotlinx.android.synthetic.main.activity_select.*
import kotlinx.android.synthetic.main.activity_show.*
import kotlin.concurrent.thread

class ShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)

        var items:List<Item> = emptyList()
        val adapter = ShowActivityAdapter(this, items)
        val handler=object :Handler(Looper.getMainLooper()){
            override fun handleMessage(msg: Message) {
//                Log.d("TAG", "msg: " + msg)
//                adapter.notifyDataSetChanged()
                when(msg.what){

                    1 -> {adapter.notifyDataSetChanged()
                         Log.d("TAG", "msg: " + msg)
                    }
                }
            }
        }
        show_recyclerview.adapter = adapter
        thread {
            val msg=Message()
            items = Repository.getItems()
            Log.d("TAG", "onCreate: "+items.toString())
            msg.what=1
            handler.sendMessage(msg)
        }
        val layoutManager = GridLayoutManager(this, 6)
        layoutManager.orientation = GridLayoutManager.HORIZONTAL
        show_recyclerview.layoutManager = layoutManager
        show_recyclerview.adapter = adapter
        fab2.setOnClickListener {
            val intent = Intent(this, SelectActivity::class.java)
            startActivity(intent)
        }

    }

}
