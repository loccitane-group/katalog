package com.kata.gameoflife

data class Grid(val length: Int, val height: Int) {

    private val cells = Array(length) { BooleanArray(height) }

    fun isAlive(x: Int, y: Int): Boolean {
        return cells[x][y]
    }

    fun setAlive(x: Int, y: Int) {
        cells[x][y] = true
    }

    fun size(): Int = length * height
    fun evolve():Boolean {
        for (x in 0 until length) {
            for (y in 0 until height) {
                val neighbours = getNeighbours(x, y)
                val aliveCount = neighbours.count { cells[it.x][it.y] }
                val cell = Cell(cells[x][y], aliveCount)
                cell.evolve()
                cells[x][y] = cell.isAlive
            }
        }

        return gridHasLiveCells()
    }

    private fun gridHasLiveCells():Boolean {
        (0 until length).forEach { x ->
            (0 until height).forEach { y ->
                when {
                    cells[x][y] -> return true
                };
            }
        }
        return false;
    }

    fun getNeighbours(x: Int, y: Int): List<Coord> {
        val west = (x - 1 + length) % length
        val east = (x + 1) % length
        val north = (y - 1 + height) % height
        val south = (y + 1) % height

        return listOf(
            Coord(west, north), Coord(x, north), Coord(east, north),
            Coord(west, y), Coord(east, y),
            Coord(west, south), Coord(x, south), Coord(east, south)
        )
    }

    fun display(comment:String="") {
        println("display grid: $comment")
        for (y in 0 until height) {
            var line = ""
            for (x in 0 until length) {
                line += "${toChar(cells[x][y])}  "
            }
            println(line)
        }
    }

    private fun toChar(status: Boolean): String = if (status) {
        "*"
    } else {
        "-"
    }
}
