package com.example.mrfz

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Item::class),version=1)
abstract class AppDatabase:RoomDatabase() {
    abstract fun itemDao():ItemDao

    companion object{
        private var instance:AppDatabase?=null
    }
}