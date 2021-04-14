package com.example.mrfz

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.lifecycle.LiveData
import com.example.mrfz.ShowActivity.Companion.context
import kotlin.concurrent.thread
import kotlin.coroutines.CoroutineContext

object Repository {
    var chosenItems = mutableListOf<Item>()//放选中的项，之后全部存入
    val db = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "database-name"
    ).build()
    val dao = db.itemDao()
    fun getItems()=dao.getAll()
    fun insert(item: Item) {
            dao.insert(item)
    }

    fun delete(item: Item) {
            dao.delete(item)
    }
}