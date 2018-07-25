package com.seanshubin.learn.kotlin.prototype.common

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertEquals

class CommonGreeterTest {
    @Test
    fun greetTest(){
        val greeter = CommonGreeter()
        assertEquals("Hello, world!", greeter.greet("world"))
    }

}
