package com.kata.adv22.days.two

class AdvDayTwo(private val round: List<String>) {
    fun getRoundScoreOfPlayerTwo(): Int {
        val score: Int
        val winValuePoints = 6
        val drawValuePoints = 3
        val defeatValuePoints = 0
        val shapeValue = shapes.getValue(round.last())

        if (isDraw()) {
            score = shapeValue + drawValuePoints
        } else if (playerTwoWins()) {
            score = shapeValue + winValuePoints
        } else {
            score = shapeValue + defeatValuePoints
        }
        return score
    }

    private fun isDraw(): Boolean {
        return shapes.getValue(round.first()) == shapes.getValue(round.last())
    }

    private fun playerTwoWins(): Boolean {
        val playerOneShape = shapes.getValue(round.first())
        val playerTwoShape = shapes.getValue(round.last())
        return when (playerOneShape) {
            1 -> playerTwoShape == 2
            2 -> playerTwoShape == 3
            else -> playerTwoShape == 1
        }
    }
}

val shapes = mapOf("A" to 1, "B" to 2, "C" to 3, "X" to 1, "Y" to 2, "Z" to 3)