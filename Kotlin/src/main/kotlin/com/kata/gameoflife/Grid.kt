package com.kata.gameoflife

data class Grid(val length:Int, val height:Int) {
    val size: Int = length*height
}
