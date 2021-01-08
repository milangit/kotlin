package com.milanbarton.milantest2

import android.util.Log

/**
 * The difference between immutable list and immutable array is for example that we are able to modify item in the immutable array, but we are not able to do it for immutable list.
 * Regarding difference between mutable list and array their implementations look the same to me.
 *
 * public fun <T> mutableListOf(vararg elements: T): MutableList<T> =
 * if (elements.size == 0) ArrayList() else ArrayList(ArrayAsCollection(elements, isVarargs = true))
 *
 * public fun <T> arrayListOf(vararg elements: T): ArrayList<T> =
 * if (elements.size == 0) ArrayList() else ArrayList(ArrayAsCollection(elements, isVarargs = true))
 *
 * So I am not aware any practical difference.
 *
 *
 * mutable =    mutable object can be changed after it's created and immutable object can't
 *              In Kotlin there are mutable and immutable version of lists and mutable and immutable versions of arrays too.
 *              mutable version of these collections have more functionalities and of course we can modify them (add, delete, edit items)
 *              If we do not need these functionalities we should use immutable versions to save resources of the device where our program runs.
 */
class Tetris {
    // https://tetris.fandom.com/wiki/Tetromino
    val names_of_tetrominos = listOf<String>("I", "O", "T", "S", "Z", "J", "L")
    var colors_of_tetrominos = arrayOf<String>("Cyan", "Yellow", "Violet", "Green", "Red", "Blue", "Orange")

    fun change_colors(i_color: String, o_color: String, t_color: String, s_color: String, z_color: String, j_color: String, l_color: String) {
        colors_of_tetrominos[0] = i_color
        colors_of_tetrominos[1] = o_color
        colors_of_tetrominos[2] = t_color
        colors_of_tetrominos[3] = s_color
        colors_of_tetrominos[4] = z_color
        colors_of_tetrominos[5] = j_color
        colors_of_tetrominos[6] = l_color
    }

    fun log_current_colors() {
        Log.d("i_color", colors_of_tetrominos[0])
        Log.d("o_color", colors_of_tetrominos[1])
        Log.d("t_color", colors_of_tetrominos[2])
        Log.d("s_color", colors_of_tetrominos[3])
        Log.d("z_color", colors_of_tetrominos[4])
        Log.d("j_color", colors_of_tetrominos[5])
        Log.d("l_color", colors_of_tetrominos[6])
    }
}