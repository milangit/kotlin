package com.milanbarton.milantest2

import android.util.Log

open class Vehicle(var make: String, var model: String, var year: Int, var weight: Float) {
    var needsMaintenance: Boolean = false
    var tripsSinceMaintenance: Int = 0

    fun Repair() {
        this.tripsSinceMaintenance = 0
        this.needsMaintenance = false
    }

    fun PrintValues ()
    {
        Log.d("make", make)
        Log.d("model", model)
        Log.d("year", year.toString())
        Log.d("wight", weight.toString())
        Log.d("needsMaintenance", needsMaintenance.toString())
        Log.d("tripsSinceMaintenance", tripsSinceMaintenance.toString())
        Log.d("===", "===========================")
    }
}