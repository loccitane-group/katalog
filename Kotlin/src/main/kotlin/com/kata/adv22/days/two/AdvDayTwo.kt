package com.kata.adv22.days.two

import java.io.File

class AdvDayTwo {

    fun getTotalScoreOfFile(fileName: String): Int {
        var score = 0
        File(fileName).forEachLine { score += getRoundScoreOfPlayerTwo(it.split(" ")) }
        return score
    }

    fun getTotalScoreOfFileWithStrat(fileName: String): Int {
        var score = 0
        File(fileName).forEachLine {
            val initialRound = it.split(" ")
            val shapeToPlayAccordingStrat = getWhatShapeToPlay(initialRound.first(), shapesAndStrategy.getValue(initialRound.last()))
            val roundWithStrat = listOf(initialRound.first(), shapeToPlayAccordingStrat)
            score += getRoundScoreOfPlayerTwo(roundWithStrat)
        }
        return score
    }

    fun getRoundScoreOfPlayerTwo(round: List<String>): Int {
        val score: Int
        val winValuePoints = 6
        val drawValuePoints = 3
        val defeatValuePoints = 0
        val playerOneShape = shapes.getValue(round.first())
        val playerTwoShape = shapes.getValue(round.last())

        if (isDraw(playerOneShape, playerTwoShape)) {
            score = playerTwoShape + drawValuePoints
        } else if (playerTwoWins(playerOneShape, playerTwoShape)) {
            score = playerTwoShape + winValuePoints
        } else {
            score = playerTwoShape + defeatValuePoints
        }
        return score
    }

    private fun isDraw(playerOneShape: Int, playerTwoShape: Int): Boolean {
        return playerOneShape == playerTwoShape
    }

    private fun playerTwoWins(playerOneShape: Int, playerTwoShape: Int): Boolean {
        return when (playerOneShape) {
            1 -> playerTwoShape == 2
            2 -> playerTwoShape == 3
            else -> playerTwoShape == 1
        }
    }

    private fun getWhatShapeToPlay(playerOneShape: String, strategy: String): String {
        val playerOneShapeValue = shapes.getValue(playerOneShape)
        return when (strategy) {
            "Need to win" -> whatShapeToWin(playerOneShapeValue)
            "Need to lose" -> whatShapeToLose(playerOneShapeValue)
            else -> playerOneShape
        }
    }

    private fun whatShapeToWin(playerOneShape: Int) = if (playerOneShape == 1) "Y" else if (playerOneShape == 2) "Z" else "X"
    private fun whatShapeToLose(playerOneShape: Int) = if (playerOneShape == 1) "Z" else if (playerOneShape == 2) "X" else "Y"
}

val shapes = mapOf("A" to 1, "B" to 2, "C" to 3, "X" to 1, "Y" to 2, "Z" to 3)
val shapesAndStrategy = mapOf("X" to "Need to lose", "Y" to "Need to draw", "Z" to "Need to win")