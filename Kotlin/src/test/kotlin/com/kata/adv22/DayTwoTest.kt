package com.kata.adv22

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

class DayTwoTest : DayBase("peter") {

    @Test
    fun should_return_victory_for_rock_over_scissors() {
        val round = listOf(Pair(Scissors,Rock))
        val expected = 7
        val shifumi = DayTwo(round)
        assertEquals(expected,shifumi.getScore())
    }

    @Test
    fun should_return_defeat_for_rock_over_paper() {
        val round = listOf(Pair(Paper,Rock))
        val expected = 1
        val shifumi = DayTwo(round)
        assertEquals(expected,shifumi.getScore())
    }

    @Test
    fun should_return_draw_for_rock_over_rock() {
        val round = listOf(Pair(Rock,Rock))
        val expected = 4
        val shifumi = DayTwo(round)
        assertEquals(expected,shifumi.getScore())
    }

    @Test
    fun should_return_victory_for_paper_over_rock() {
        val round = listOf(Pair(Rock, Paper))
        val expected = 8
        val shifumi = DayTwo(round)
        assertEquals(expected,shifumi.getScore())
    }

    @Test
    fun should_return_victory_for_scissors_over_paper() {
        val round = Pair(Paper, Scissors)
        val expected = 9
        val shifumi = DayTwo(listOf(round))
        assertEquals(expected,shifumi.getScore())
    }

    @Test
    fun should_convert_XYZ_to_ABC() {
        val input = "A X\n" + "B Y\n" + "C Z\n"
        val lines:List<Pair<Char,Char>> = input.reader().readLines().map { Pair(it[0],it[2]) }
        val expected = 15
        val shifumi = DayTwo(lines)
        assertEquals(expected,shifumi.getScore())
    }

    @Test
    fun should_getScore_for_dayTwo_Part1() {
        val lines:List<Pair<Char,Char>> = File("$path/$user/inputDayTwo.txt").reader().readLines().map { Pair(it[0],it[2]) }
        val expected = getExpectedFor(user, 2, 1)
        val shifumi = DayTwo(lines)
        assertEquals(expected,shifumi.getScore())
    }

    @Test
    fun should_getScore_for_dayTwo_Part2() {
        val lines:List<Pair<Char,Char>> = File("$path/$user/inputDayTwo.txt").reader().readLines().map { Pair(it[0],it[2]) }
        val expected = getExpectedFor(user, 2, 2)
        val shifumi = DayTwo(lines)
        assertEquals(expected,shifumi.getScore2())
    }

}