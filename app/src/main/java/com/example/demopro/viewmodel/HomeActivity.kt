package com.example.demopro.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.example.demopro.R

class HomeActivity : AppCompatActivity() {

    lateinit var data: HomeActivityObserver

    lateinit var tvNumber:TextView
    lateinit var bRandom:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tvNumber = findViewById(R.id.tvNumber)
        bRandom = findViewById(R.id.bRandom)

        val model = ViewModelProviders.of(this).get(HomeActivityObserver::class.java)
        val myRandomNumber = model.getNumber()
       /* Log.i(TAG, "Owner onCreate")
        lifecycle.addObserver(HomeActivityObserver())*/
//        data = HomeActivityObserver()
//        val myRandomNumber = data.getNumber()
//        tvNumber.text = myRandomNumber
        myRandomNumber.observe(this, Observer<String> { number ->
            tvNumber.text = number
            Log.i(TAG,"Random Number Set")
        })


        bRandom.setOnClickListener {
            model.createNumber()
        }

    }
    companion object{
        private val TAG: String = "HomeActivity"
    }
}