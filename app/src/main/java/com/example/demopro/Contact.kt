package com.example.demopro

import android.widget.ImageView
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

/**
 * Observable of an object refore to the capbility to notify others about it's changes in it's data
 * **/
class Contact( _name:String, _email:String): BaseObservable(){

    @get:Bindable
    var name: String = _name
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }

    @get:Bindable
    var email: String = _email
        set(value) {
            field = value
            notifyPropertyChanged(BR.email)
        }

    //companion object scoped to an instance of another class
    companion object{
        @JvmStatic @BindingAdapter("profileImage")
        fun loadImage(view: ImageView, imageUrl: String){
            Glide.with(view.context)
                .load(imageUrl)
                .into(view)
        }
    }
}