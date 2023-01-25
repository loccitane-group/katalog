package com.kata.gameoflife

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class GridTests {

    @Test
    fun `initialize a blank 1x1 grid`() {
        val grid = Grid(1,1)

        assertAll(
            { Assertions.assertEquals(1,grid.size()) }
        )
    }

    @Test
    fun `initialize a blank 5x4 grid`() {
        val grid = Grid(5,4)
        Assertions.assertEquals(20, grid.size())
    }

    @Test
    fun `initialize 1x1 grid with live Cell at (0,0)`(){
        val grid = Grid(1,1)

        Assertions.assertFalse(grid.isAlive(0,0))
        grid.setAlive(0,0)
        Assertions.assertTrue(grid.isAlive(0,0))
    }

    @Test
    fun `initialize 2x10 grid with live cell at (1,9)`(){
        val grid = Grid(2,10)

        grid.setAlive(1,9)
        Assertions.assertTrue(grid.isAlive(1,9))
    }

    @Test
    fun `evolve all cells of grid`(){
        val grid = Grid(3,3)

        grid.setAlive(1,1)
        grid.evolve()
        Assertions.assertFalse(grid.isAlive(1,1))
    }
}