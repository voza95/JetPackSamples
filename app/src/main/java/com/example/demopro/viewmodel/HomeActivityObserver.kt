package com.example.demopro.viewmodel

import android.util.Log
import androidx.lifecycle.*
import com.example.demopro.MainActivity
import java.util.*


class HomeActivityObserver: ViewModel() {//LifecycleObserver

    private lateinit var myRandomNumber: MutableLiveData<String>

    fun getNumber(): MutableLiveData<String>{
        Log.i(TAG,"Get Number")
        if (!::myRandomNumber.isInitialized){
            myRandomNumber = MutableLiveData()
            this.createNumber()
        }
        return myRandomNumber
    }

    fun createNumber(){
        Log.i(TAG,"Create new number")
        val random = Random()
        myRandomNumber.value = "Number: "+(random.nextInt(10-1)+1)
    }

    /*@OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateEvent(){
        Log.i(TAG,"Observer onCreateEvent")
    }*/

    override fun onCleared() {
        super.onCleared()
        Log.i(TAG,"ViewModel onCleared")
    }
    companion object{
        private val TAG: String = "HomeActivityObserver"
    }
}