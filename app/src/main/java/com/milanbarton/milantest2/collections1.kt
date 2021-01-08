package com.milanbarton.milantest2

import android.util.Log

class Collection1 {
    //non-mutable lists, arrays
    // val/var name = listof<type>(val1, val2,..)

    fun test_col() {

        var weekdays = listOf<String>("Mon", "Tue", "Wed", "Thu", "Fri")
        weekdays.get(4)
        weekdays[4]
        weekdays = listOf("")

        val trueOrFalseAnswerKey = arrayOf(false, true, true, false, false)

        trueOrFalseAnswerKey.set(2, false)
        trueOrFalseAnswerKey[2] = false


        //mutable lists and arrays
        var roster = mutableListOf<String>("Nimish","Sarah","John")
        roster.add("Milan")

        val nimish: String = roster.removeAt(0)
        Log.d("tag", roster.toString())

        val bread: String = "Bread"
        var shoppingList = arrayListOf<String>("Carrot", "Onion")
        shoppingList.add(0,bread)
    }



}