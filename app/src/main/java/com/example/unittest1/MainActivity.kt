package com.example.unittest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        val engine = Engine()
        val car = Car(engine,2.5)
         car.turnOn()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}