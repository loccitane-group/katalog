package com.kata.adv22

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

class DayOneTest : DayBase("peter") {

    @Test
    fun should_return_50000_for_example_file() {
        val text = File("$path/inputTest.txt").readText()
        val expected = getExpectedFor("test", 1, 1)
        val elves = DayOne(text)
        assertEquals(expected,elves.getMaxCalories())
    }

    @Test
    fun should_give_max_calories_of_day_one_input() {
        val text = File("$path/$user/inputDayOne.txt").readText()
        val elves = DayOne(text)
        val expected = getExpectedFor(user, 1, 1)
        assertEquals(expected,elves.getMaxCalories())
    }

    @Test
    fun should_return_top3_max_calories_for_example_input() {
        val text = File("$path/inputTest.txt").readText()
        val elves = DayOne(text)
        val expected = getExpectedFor("test", 1, 2)
        assertEquals(expected,elves.getSumOfTop3MaxCalories())
    }

    @Test
    fun should_return_top3_max_calories_of_day_one_input() {
        val text = File("$path/$user/inputDayOne.txt").readText()
        val expected = getExpectedFor(user, 1, 2)
        val elves = DayOne(text)
        assertEquals(expected,elves.getSumOfTop3MaxCalories())
    }
}