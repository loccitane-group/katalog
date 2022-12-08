package com.kata.adv22.day01

import com.kata.adv22.DayOne
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

class DayOneTest {

    private val user = System.getenv()["user"]

    @Test
    fun should_return_50000_for_example_file() {
        val text = File("./src/test/kotlin/com/kata/adv22/day01/inputTest.txt").readText()
        val elves = DayOne(text)
        assertEquals(50000,elves.getMaxCalories())
    }

    @Test
    fun should_give_max_calories_of_day_one_input() {
        val text = File("./src/test/kotlin/com/kata/adv22/day01/$user/inputDayOne.txt").readText()
        val elves = DayOne(text)
        val expected = when (user) {
            "peter" -> 71934
            "jordan" -> 67633
            else -> throw Exception("Unknown User")
        }
        assertEquals(expected,elves.getMaxCalories())
    }

    @Test
    fun should_return_top3_max_calories_for_example_input() {
        val text = File("./src/test/kotlin/com/kata/adv22/day01/inputTest.txt").readText()
        val elves = DayOne(text)
        assertEquals(85000,elves.getSumOfTop3MaxCalories())
    }

    @Test
    fun should_return_top3_max_calories_of_day_one_input() {
        val text = File("./src/test/kotlin/com/kata/adv22/day01/$user/inputDayOne.txt").readText()
        val expected = when (user) {
            "peter" -> 211447
            "jordan" -> 199628
            else -> throw Exception("Unknown User")
        }
        val elves = DayOne(text)
        assertEquals(expected,elves.getSumOfTop3MaxCalories())
    }
}