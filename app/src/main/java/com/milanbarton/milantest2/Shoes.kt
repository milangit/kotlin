package com.milanbarton.milantest2

class ShoesWithLaces(name: String, size: Int) : Clothing(name, size) {
    var lacesName: String? = null
    var areLacesClean: Boolean = false
    var areShoesLaced: Boolean = false

    fun laceShoes(name: String) {
        this.lacesName = name
        this.areLacesClean = true
        this.areShoesLaced = true
    }

    override fun washClothing() {
        super.washClothing()
        areLacesClean = true
    }
}