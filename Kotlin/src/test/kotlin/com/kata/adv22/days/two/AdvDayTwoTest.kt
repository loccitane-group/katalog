package com.kata.adv22.days.two

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AdvDayTwoTest {
    @Test
    fun should_get_score_of_round() {
        val round = listOf("A", "X")
        Assertions.assertEquals(2, AdvDayTwo(round).getRoundScore())
    }
}