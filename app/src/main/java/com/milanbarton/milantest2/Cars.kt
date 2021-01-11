package com.milanbarton.milantest2

import android.util.Log

class Cars(make: String, model: String, year: Int, weight: Float) : Vehicle(make, model, year, weight) {

    var isDriving: Boolean = false

    fun Drive() {
        if (this.isDriving == false) {
            this.isDriving = true
        }
        else
        {
            Log.d("warn", "the car is already driving")
        }
    }

    fun Stop() {
        if (this.isDriving == true) {
            this.isDriving = false
            this.tripsSinceMaintenance += 1
            if (this.tripsSinceMaintenance > 100) {
                this.needsMaintenance = true
            }
        }
    }

}