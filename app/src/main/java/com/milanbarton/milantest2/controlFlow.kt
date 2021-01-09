package com.milanbarton.milantest2

import android.util.Log

class ControlFlow {

    fun Test() {
/*
        var isDoorOpen: Boolean = false
        var isDoorLocked: Boolean = true
        var doesHaveKey: Boolean = true
        var action: String = ""

        if (isDoorLocked == true && doesHaveKey == false) {
            action = "Leave"
        } else if (isDoorOpen == true) {
            action = "Enter"
        } else {
            action = "Open door"
        }

        action = if (isDoorOpen == true) "Enter" else "Leave"

        when (isDoorOpen) {
            true -> action = "Enter"
            false -> action = "Leave"
        }

        action = when (isDoorOpen) {
            true -> "Enter"
            false -> "Leave"
        }

        var current: Int = 1
        val max: Int = 100
        var total: Int = 0
        while (current <= 100) {
            total += current
            current += 1
        }

        val roster = listOf<String>("Nimish", "Milan", "Tom")
        var namesString: String = ""

        for (name in roster) {
            namesString += name + ", "
        }*/

        for (i in 6 downTo 0 step 2) {
            Log.d("i", i.toString())
        }

        for (i in 6..20 step 2) {
            Log.d("i", i.toString())
        }
    }


}
