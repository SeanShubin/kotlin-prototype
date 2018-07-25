package com.seanshubin.learn.kotlin.prototype.js

import com.seanshubin.learn.kotlin.prototype.common.CommonGreeter
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertEquals

class JsGreeterTest {
    @Test
    fun greetTest() {
        val commonGreeter = CommonGreeter()
        val greeter = JsGreeter(commonGreeter)
        assertEquals("Hello, world!", greeter.greet("world"))
    }
}
