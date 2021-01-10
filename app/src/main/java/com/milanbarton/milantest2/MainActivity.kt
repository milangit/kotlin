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

        val songFce = SongFunctions()
        Log.d("msg", songFce.GetName())
        Log.d("msg", songFce.GetYearReleased().toString())
        Log.d("msg", songFce.GetDurationInMinutes().toString())
    }

    fun move() {
        playerPostion += 2
    }

    fun move(byAmount: Int): Boolean  {
        if (playerPostion + byAmount > maxPosition || playerPostion + byAmount < minPosition) {
            return false
        }
        else {
            playerPostion += byAmount
            return true
        }
    }
}