package com.milanbarton.milantest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

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

        val fizzBuzz = FizzBuzz()
        fizzBuzz.print_numbers()


    }
}