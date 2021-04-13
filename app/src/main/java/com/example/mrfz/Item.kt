package com.example.mrfz

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.annotation.DrawableRes

@Entity
data class Item(val name: String, val imageID: Int?, var isChecked: Boolean = false){
    @PrimaryKey(autoGenerate = true)
    var id:Long=0
}