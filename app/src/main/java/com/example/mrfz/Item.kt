package com.example.mrfz

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item(val name:String,val imageID:Int){
    @PrimaryKey(autoGenerate = true)
    var id:Long=0
}