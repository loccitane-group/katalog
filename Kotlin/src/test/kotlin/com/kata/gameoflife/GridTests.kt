package com.kata.gameoflife

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class GridTests {

    @Test
    fun `initialize a blank 1x1 grid`() {
        val grid = Grid(1,1)

        assertAll(
            { Assertions.assertNotNull(grid) },
            { Assertions.assertEquals(1,grid.size) }
        )
    }

    @Test
    fun `initialize a blank 5x4 grid`() {
        val grid = Grid(5,4)
        Assertions.assertEquals(20, grid.size)
    }
}