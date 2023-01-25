package com.kata.gameoflife

data class Grid(val length:Int, val height:Int) {

    private val cells = Array(length){BooleanArray(height)}

    fun isAlive(x: Int, y: Int): Boolean {
        return cells[x][y]
    }

    fun setAlive(x: Int, y: Int) {
        cells[x][y] = true
    }

    fun size():Int = length*height
    fun evolve() {
        for (x in 0 until length) {
            for (y in 0 until height){
                val neighbours = getNeighbours(x,y,length,height)
                // ...
            }
        }
    }

    private fun getNeighbours(x: Int, y: Int, length: Int, height: Int): List<Coord> {
        TODO("Not yet implemented")
    }
}
