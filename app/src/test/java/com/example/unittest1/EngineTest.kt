package com.example.unittest1

import org.junit.Test

import org.junit.Assert.*

class EngineTest {

    private val engine = Engine(2000,189,50,false)

    @Test
    fun engineTurnsOn(){

        engine.turnOn()
        assertEquals(true,engine.isTurnedOn)
        assertEquals(90,engine.temperature)

    }

    @Test
    fun engineTurnsOff(){
        engine.turnOff()
        assertEquals(false,engine.isTurnedOn)
        assertEquals(40,engine.temperature)
    }
}