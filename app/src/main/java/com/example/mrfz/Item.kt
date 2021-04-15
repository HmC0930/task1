package com.example.mrfz

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.annotation.DrawableRes
import androidx.room.ColumnInfo

@Entity
data class Item(
                @PrimaryKey
                val name:String,
                @ColumnInfo(name="imageID")
                val imageID:Int?,
                var isChecked:Boolean=false,
)