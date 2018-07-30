package com.seanshubin.learn.kotlin.prototype.jvm

import com.seanshubin.learn.kotlin.prototype.common.CommonGreeter

class JvmGreeter(private val commonGreeter:CommonGreeter) {
    fun greet(target:String):String = commonGreeter.greet(target)
}
