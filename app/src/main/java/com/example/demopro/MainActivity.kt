package com.example.demopro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.demopro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mBinding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mBinding.contact = Contact("Vaibhav","vaibhavoza918@gmail.com")

        mBinding.handler = EventHandler(this)

    }
}