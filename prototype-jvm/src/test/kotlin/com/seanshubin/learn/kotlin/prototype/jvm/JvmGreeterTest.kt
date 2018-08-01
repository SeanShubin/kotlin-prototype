package com.seanshubin.learn.kotlin.prototype.jvm

import com.seanshubin.learn.kotlin.prototype.common.CommonGreeter
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertEquals

class JvmGreeterTest {
    @Test
    fun greetTest() {
        val commonGreeter = CommonGreeter()
        val greeter = JvmGreeter(commonGreeter)
        assertEquals("Hello, world!", greeter.greet("world"))
    }
}
