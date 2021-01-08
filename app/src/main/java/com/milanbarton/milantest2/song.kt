package com.milanbarton.milantest2

import android.util.Log

class Song {

    fun print_song() {

        // Title: My favorite song - My Way
        // This file provides basic info about the song.

        /*
        name: My Way (string)
        artist: Frank Sinatra (string)
        year_released: 1969 (integer)
        year_recorded: 1968 (integer)
        place_recorded: Los Angeles (string)
        genre: Traditional pop (string)
        duration_in_minutes: 4.583333 (float)
        only_instrumental: false (Boolean)
        */

        //declaration and initiation of variables
        val name: String = "My Way"
        val artist: String = "Frank Sinatra"
        val year_released: Int = 1969
        val year_recorded: Int = 1968
        val place_recorded: String = "Los Angeles"
        val genre: String = "Traditional pop"
        val duration_in_minutes: Float = 4.583333f
        val only_instrumental: Boolean = false

        //displaying variables' values
        Log.d("name", name)
        Log.d("artist", artist)
        Log.d("year_released", year_released.toString())
        Log.d("year_recorded", year_recorded.toString())
        Log.d("place_recorded", place_recorded)
        Log.d("genre", genre)
        Log.d("duration_in_minutes", duration_in_minutes.toString())
        Log.d("only_instrumental", only_instrumental.toString())
    }
}