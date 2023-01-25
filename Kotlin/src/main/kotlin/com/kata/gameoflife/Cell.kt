package com.kata.gameoflife

class Cell(var isAlive: Boolean=true, var liveNeighbourCount: Int) {
    fun evolve() {
        // underpopulation
        if (isAlive && liveNeighbourCount<2)
            isAlive = false

        // overcrowding
        if (isAlive && liveNeighbourCount>3)
            isAlive = false

        // resurrection
        if (!isAlive && liveNeighbourCount==3)
            isAlive = true
    }
}
