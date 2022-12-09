package com.kata.adv22.days.two

class AdvDayTwo(val round: List<String>) {
    fun getRoundScore(): Int {
        var score = 1
        val drawValuePoints = 3
        if (isDraw()) {
            score = shapes.getValue(round.last()) + drawValuePoints
        }
        return score
    }

    private fun isDraw(): Boolean {
        return shapes.getValue(round.first()) == shapes.getValue(round.last())
    }

}

val shapes = mapOf("A" to 1, "B" to 2, "C" to 3, "X" to 1, "Y" to 2, "Z" to 3)