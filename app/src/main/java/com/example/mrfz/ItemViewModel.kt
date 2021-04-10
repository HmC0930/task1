package com.example.mrfz

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mrfz.Repository.dao
import com.example.mrfz.Repository.db
import kotlin.concurrent.thread

class ItemViewModel:ViewModel() {
    private val items=MutableLiveData<List<Item>>()
    fun getItems():LiveData<List<Item>>{
        return items
    }
    //执行异步操作获取items
    private fun loadItems(){
        thread {
            items.value=Repository.getItems()
        }
    }
}