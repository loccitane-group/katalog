package com.kata.adv22.days.one

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

class AdvDayOneTest {
    @Test
    fun should_return_50000_for_example_file() {
        val path = "${System.getProperty("user.dir")}/src/test/kotlin/com/kata/adv22/days/one/inputTest.txt"
        val text = File(path).readText()
        val elfes = AdvDayOne(text)
        assertEquals(50000, elfes.getMaxCalory())
    }

    @Test
    fun should_give_max_calory_of_day_one_input() {
        val path = "${System.getProperty("user.dir")}/src/test/kotlin/com/kata/adv22/days/one/inputDayOne.txt"
        val text = File(path).readText()
        val elfes = AdvDayOne(text)
        assertEquals(67633, elfes.getMaxCalory())
    }


    @Test
    fun should_return_top3_max_calory_for_example_input() {
        val path = "${System.getProperty("user.dir")}/src/test/kotlin/com/kata/adv22/days/one/inputTest.txt"
        val text = File(path).readText()
        val elfes = AdvDayOne(text)
        assertEquals(85000, elfes.getSumOfTop3MaxCalory())
    }


    @Test
    fun should_return_top3_max_calory_of_day_one_input() {
        val path = "${System.getProperty("user.dir")}/src/test/kotlin/com/kata/adv22/days/one/inputDayOne.txt"
        val text = File(path).readText()
        val elfes = AdvDayOne(text)
        assertEquals(199628, elfes.getSumOfTop3MaxCalory())
    }
}