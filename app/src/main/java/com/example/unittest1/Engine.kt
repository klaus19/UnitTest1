package com.example.unittest1

import android.util.Log
import kotlinx.coroutines.delay

class Engine(
    var temperature:Int=15,
    var isTurnedOn:Boolean=false
){

    suspend fun turnOn(){
        isTurnedOn=true
        delay(6000)
        temperature=95

        Log.d("Course","Engine has turned on")
    }



}