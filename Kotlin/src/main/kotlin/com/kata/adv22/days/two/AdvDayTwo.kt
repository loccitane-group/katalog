package com.kata.adv22.days.two

class AdvDayTwo(val round: List<String>) {
    fun getRoundScoreOfPlayerTwo(): Int {
        var score = 1
        val drawValuePoints = 3
        val defeatValuePoints = 0
        val shapeValue = shapes.getValue(round.last())
        if (isDraw()) {
            score = shapeValue + drawValuePoints
        } else if (playerOneWins()) {
            score = shapeValue + defeatValuePoints
        }
        return score
    }

    private fun isDraw(): Boolean {
        return shapes.getValue(round.first()) == shapes.getValue(round.last())
    }

    private fun playerOneWins(): Boolean {
        val playerOneShape = shapes.getValue(round.first())
        val playerTwoShape = shapes.getValue(round.last())
        return when (playerOneShape) {
            1 -> playerTwoShape == 3
            2 -> playerTwoShape == 1
            else -> playerTwoShape == 2
        }
    }
}

val shapes = mapOf("A" to 1, "B" to 2, "C" to 3, "X" to 1, "Y" to 2, "Z" to 3)