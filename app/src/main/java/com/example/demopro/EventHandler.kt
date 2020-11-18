package com.example.demopro

import android.content.Context
import android.widget.Toast

class EventHandler(context: Context) {
    val myContext = context

    fun onButtonClick(name:String){
        Toast.makeText(myContext,"Hello $name",Toast.LENGTH_SHORT).show()
    }
}