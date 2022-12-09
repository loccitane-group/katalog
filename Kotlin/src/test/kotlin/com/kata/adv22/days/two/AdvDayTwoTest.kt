package com.kata.adv22.days.two

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory

class AdvDayTwoTest {
    @TestFactory
    fun should_get_score_of_round() = listOf(
        listOf("A", "X") to 4,
        listOf("A", "Y") to 8,
        listOf("A", "Z") to 3,
        listOf("B", "X") to 1,
        listOf("B", "Y") to 5,
        listOf("B", "Z") to 9,
        listOf("C", "X") to 7,
        listOf("C", "Y") to 2,
        listOf("C", "Z") to 6
    ).map { (round, expectedScore) ->
        DynamicTest.dynamicTest("should get score $expectedScore for round $round") {
            assertEquals(expectedScore, AdvDayTwo().getRoundScoreOfPlayerTwo(round))
        }
    }

    @Test
    fun should_return_15_for_example_file() {
        val path = "${System.getProperty("user.dir")}/src/test/kotlin/com/kata/adv22/days/two/inputTest.txt"
        assertEquals(15, AdvDayTwo().getTotalScoreOfFile(path))
    }


    @Test
    fun should_return_15422_for_day_two_file() {
        val path = "${System.getProperty("user.dir")}/src/test/kotlin/com/kata/adv22/days/two/inputDayTwo.txt"
        assertEquals(15422, AdvDayTwo().getTotalScoreOfFile(path))
    }

    @Test
    fun should_return_12_for_example_file_with_new_strat() {
        val path = "${System.getProperty("user.dir")}/src/test/kotlin/com/kata/adv22/days/two/inputTest.txt"
        assertEquals(12, AdvDayTwo().getTotalScoreOfFileWithStrat(path))
    }


    @Test
    fun should_return_15442_for_example_file_with_new_strat() {
        val path = "${System.getProperty("user.dir")}/src/test/kotlin/com/kata/adv22/days/two/inputDayTwo.txt"
        assertEquals(15442, AdvDayTwo().getTotalScoreOfFileWithStrat(path))
    }
}