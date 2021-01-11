package com.milanbarton.milantest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.math.min

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    var playerPostion: Int = 0 //global variable
    val maxPosition: Int = 10
    val minPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textview)
    }

    fun pressButtonAction(view: View) {
        val textViewText = textView.text.toString()
        val button = view as Button
        val buttonText = button.text.toString()
        textView.text = resources.getString(R.string.hello_world)
        Log.d("MainActivity", textViewText)
        Log.d("MainActivity", buttonText)

        //val test = Song()
        //test.print_song()

//        val tetris = Tetris()
//        tetris.log_current_colors()
//        tetris.change_colors("Brown", "Pink", "Gray", "Black", "White", "Purple", "Gold")
//        tetris.log_current_colors()

        //val controlFlow = ControlFlow()
        //controlFlow.Test()

//        val fizzBuzz = FizzBuzz()
//        fizzBuzz.print_numbers()

        /*
        val fce = Functions()
        fce.test()
        */

        //move()
        //val isValidMove = move(-3)

//        val songFce = SongFunctions()
//        Log.d("msg", songFce.GetName())
//        Log.d("msg", songFce.GetYearReleased().toString())
//        Log.d("msg", songFce.GetDurationInMinutes().toString())

//        val t_shirt = Clothing("t-shirt", 6)
//        val isClean = t_shirt.isClean
//        Log.d("msg", isClean.toString())
//        t_shirt.washClothing()
//        Log.d("msg", isClean.toString())
//
//        val sneakers: ShoesWithLaces = ShoesWithLaces("sneakers", 10)
//        sneakers.laceShoes("checkered laces")
//        sneakers.washClothing()

        val bmw = Cars("BMW", "E39 M5", 2002, 1400f)
        val skoda = Cars("Skoda", "Felicia", 1996, 1450f)
        val fiat = Cars("Fiat", "Punto", 2006, 1200f)
        val boeing = Planes("Boeing", "747-100", 2010, 162400f)

        for (i in 1..101 step 1) {
            bmw.Drive()
            bmw.Stop()
        }

        for (i in 1..50 step 1) {
            skoda.Drive()
            skoda.Stop()
        }

        for (i in 1..70 step 1) {
            fiat.Drive()
            fiat.Stop()
        }

        for (i in 1..110 step 1) {
            boeing.Flying()
            boeing.Landing()
        }

        bmw.PrintValues()
        skoda.PrintValues()
        fiat.PrintValues()
        boeing.PrintValues()
    }

//    fun move() {
//        playerPostion += 2
//    }
//
//    fun move(byAmount: Int): Boolean  {
//        if (playerPostion + byAmount > maxPosition || playerPostion + byAmount < minPosition) {
//            return false
//        }
//        else {
//            playerPostion += byAmount
//            return true
//        }
//    }
}