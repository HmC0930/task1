package com.example.mrfz

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.lifecycle.LiveData
import com.example.mrfz.ThisApplication.Companion.context
import kotlin.coroutines.CoroutineContext

object Repository {
    val db = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "database-name"
    ).build()
    val dao=db.itemDao()
    fun getItems()=dao.getAll()
    fun insert(item:Item){
        dao.insert(item)
    }
}