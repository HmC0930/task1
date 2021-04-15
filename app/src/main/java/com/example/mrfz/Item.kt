package com.example.mrfz

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.annotation.DrawableRes
import androidx.room.ColumnInfo

@Entity
data class Item(
                @ColumnInfo(name="name")
                val name:String,
                @ColumnInfo(name="imageID")
                val imageID:Int?,
                var isChecked:Boolean=false,
                @PrimaryKey(autoGenerate = true)
                var id:Long=0
)