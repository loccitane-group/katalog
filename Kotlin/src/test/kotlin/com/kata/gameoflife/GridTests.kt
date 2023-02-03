package com.kata.gameoflife


import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GridTests {

    @Test
    fun `initialize a blank 1x1 grid`() {
        val grid = Grid(1, 1)
        assertThat(grid.size()).isEqualTo(1)
    }

    @Test
    fun `initialize a blank 5x4 grid`() {
        val grid = Grid(5, 4)
        assertThat(grid.size()).isEqualTo(20)
    }

    @Test
    fun `initialize 1x1 grid with live Cell at (0,0)`() {
        val grid = Grid(1, 1)

        assertThat(grid.isAlive(0, 0)).isFalse
        grid.setAlive(0, 0)
        assertThat(grid.isAlive(0, 0)).isTrue
    }

    @Test
    fun `initialize 2x10 grid with live cell at (1,9)`() {
        val grid = Grid(2, 10)

        grid.setAlive(1, 9)
        assertThat(grid.isAlive(1, 9)).isTrue
    }

    @Test
    fun `get neighbours`() {
        val grid = Grid(3, 3)

        val coordinates = grid.getNeighbours(1, 1)

        assertThat(coordinates).containsExactlyInAnyOrder(Coord(0, 0), Coord(1, 0), Coord(2, 0),
            Coord(0, 1), Coord(2, 1), Coord(2, 2),
            Coord(0, 2), Coord(1, 2))
    }

    @Test
    fun `evolve all cells of grid`() {
        val grid = Grid(3, 3)

        grid.setAlive(1, 1)
        grid.display()
        grid.evolve()
        grid.display()
        assertThat(grid.isAlive(1, 1)).isFalse
    }
}
