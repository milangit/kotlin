package com.milanbarton.milantest2

import android.util.Log
import kotlin.math.log

class FizzBuzz {

    fun print_numbers() {
        for (i in 1..100 step 1) {
            if (is_prime(i)) {
                custom_print("prime", i)
            }
            else if ((i.rem(3) == 0) && (i.rem(5) == 0)) {
                custom_print("FizzBuzz", i)
            }
            else if (i.rem(3) == 0) {
                custom_print("Fizz", i)
            }
            else if (i.rem(5) == 0) {
                custom_print("Buzz", i)
            }
            else {
                Log.d("msg", i.toString())
            }
        }
    }

    fun is_prime(num: Int): Boolean {
        if (num <= 1)
            return false

        var count: Int = 0

        //Log.d("num", num.toString())
        for (j in 2..num step 1) {
            //Log.d("j", j.toString())
            if (num.rem(j) == 0)
            {
                count += 1
            }
        }

        if (count == 1)
        {
            return true
        }
        else
        {
            return false
        }
    }

    fun custom_print(word: String, i: Int) {
        val testMode : Boolean = false
        if (testMode == true) {
            Log.d("msg", word + " " + i.toString())
        }
        else {
            Log.d("msg", word)
        }
    }
}