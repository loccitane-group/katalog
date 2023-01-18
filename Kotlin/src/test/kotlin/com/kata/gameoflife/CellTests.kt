package com.kata.gameoflife

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CellTests {

    @Test
    fun `Underpopulation - Any live cell with fewer than two live neighbours dies`() {
        val liveCell = Cell(liveNeighbourCount = 0) // Live cell

        assertTrue(liveCell.isAlive)
        liveCell.evolve()
        assertFalse(liveCell.isAlive)
    }

    @Test
    fun `Overcrowding - Any live cell with more than three live neighbours dies`() {
        val liveCell = Cell(liveNeighbourCount = 4) // Live cell

        assertTrue(liveCell.isAlive)
        liveCell.evolve()
        assertFalse(liveCell.isAlive)
    }

    @Test
    fun `Any live cell with two or three live neighbours lives on to the next generation`() {
        val liveCell = Cell(liveNeighbourCount = 3) // Live cell

        assertTrue(liveCell.isAlive)
        liveCell.evolve()
        assertTrue(liveCell.isAlive)
    }

    @Test
    fun `Any dead cell with exactly three live neighbours becomes a live cell`() {
        val liveCell = Cell(isAlive = false, liveNeighbourCount = 3) // Dead cell

        assertFalse(liveCell.isAlive)
        liveCell.evolve()
        assertTrue(liveCell.isAlive)
    }
}