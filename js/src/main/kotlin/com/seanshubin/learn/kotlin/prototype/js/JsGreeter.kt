package com.seanshubin.learn.kotlin.prototype.js

import com.seanshubin.learn.kotlin.prototype.common.CommonGreeter

class JsGreeter(commonGreeter:CommonGreeter) {
    fun greet(target:String):String = commonGreeter.greet(target)
}
