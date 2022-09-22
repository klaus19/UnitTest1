package com.example.unittest1

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Car(
    val engine:Engine,
    val fuel:Double
) {

    fun turnOn(){
        fuel==8.5
        CoroutineScope(Dispatchers.Main).launch {
            engine.turnOn()
        }

    }
}