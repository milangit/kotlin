package com.milanbarton.milantest2

import android.util.Log

class Planes(make: String, model: String, year: Int, weight: Float) : Vehicle(make, model, year, weight) {

    var isFlying: Boolean = false

    fun Flying() : Boolean {
        if (this.isFlying == false)
        {
            if (this.needsMaintenance == true)
            {
                Log.d("error", "the plane can't fly until it's repaired")
                return false
            }
            else
            {
                this.isFlying = true
                return true
            }
        }
        else
        {
            Log.d("warn", "the plane is already flying")
            return false
        }
    }

    fun Landing() {
        if (this.isFlying == true) {
            this.isFlying = false
            this.tripsSinceMaintenance += 1
            if (this.tripsSinceMaintenance > 100) {
                this.needsMaintenance = true
            }
        }
    }
}