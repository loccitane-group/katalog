package com.kata.gameoflife

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertNotNull

class GameOfLifeTest {

    @Test
    fun `initialize a blank 1x1 grid`() {
        val grid = Grid(1,1)

        assertAll(
            { assertNotNull(grid) },
            { assertThat(grid.size).isEqualTo(1)}
        )
    }
}