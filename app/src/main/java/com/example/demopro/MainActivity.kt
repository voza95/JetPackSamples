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

        mBinding.imageUrl = "https://images.unsplash.com/photo-1605699472625-f7fd8c0d844f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80"
    }
}