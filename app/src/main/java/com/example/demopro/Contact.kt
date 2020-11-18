package com.example.demopro

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

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
}