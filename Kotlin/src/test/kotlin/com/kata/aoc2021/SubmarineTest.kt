package com.kata.aoc2021

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class SubmarineTest {
    @Test
    fun `Should return 1 when depth increase with an array of 2 elements`() {
        val depthList: List<Int> = listOf(1, 2)
        val submarine = Submarine(depthList)

        Assertions.assertThat(submarine.countIncreased()).isEqualTo(1)
    }

    @Test
    fun `Should return 0 when depth do not change`() {
        val depthList: List<Int> = listOf(1, 1)
        val submarine = Submarine(depthList)

        Assertions.assertThat(submarine.countIncreased()).isEqualTo(0)
    }

    @Test
    fun `Should return 0 when depth decrease`() {
        val depthList: List<Int> = listOf(2, 1)
        val submarine = Submarine(depthList)

        Assertions.assertThat(submarine.countIncreased()).isEqualTo(0)
    }

    @Test
    fun `Should return 1 when depth increase once`() {
        val depthList: List<Int> = listOf(1, 1, 2)
        val submarine = Submarine(depthList)

        Assertions.assertThat(submarine.countIncreased()).isEqualTo(1)
    }


    @Test
    fun `Should return 0 when depth don't increase`() {
        val depthList: List<Int> = listOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
        val submarine = Submarine(depthList)

        Assertions.assertThat(submarine.countIncreased()).isEqualTo(0)
    }

    @Test
    fun `Should return 10 when depth increases 10 times`() {
        val depthList: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 1, 1, 1, 1)
        val submarine = Submarine(depthList)

        Assertions.assertThat(submarine.countIncreased()).isEqualTo(10)
    }

    @Test
    fun `Should return something`() {
        val depthList: List<Int> = readMeasurements("src/test/kotlin/com/kata/aoc2021/depth.txt")
        val submarine = Submarine(depthList)

        Assertions.assertThat(submarine.countIncreased()).isEqualTo(1564)
    }
    private fun readMeasurements(filePath:String):List<Int> = File(filePath).readLines().map { it.toInt()}


}