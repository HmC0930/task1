package com.example.mrfz

import androidx.room.*

@Dao
interface ItemDao {
    @Insert
    fun insertAll(vararg items:Item)

    @Insert
    fun insert(item:Item):Long

    @Delete
    fun delete(item:Item)

    @Update
    fun updateItems(vararg items:Item)

    @Query("SELECT*FROM item")
    fun getAll():List<Item>
}