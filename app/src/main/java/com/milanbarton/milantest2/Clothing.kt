package com.milanbarton.milantest2

open class Clothing(var name: String, var size: Int) {
    var isClean: Boolean = false

    constructor(name: String, size: Int, isClean: Boolean): this(name, size) {
        this.isClean = isClean
    }

    open fun washClothing() {
        this.isClean = true
    }
}