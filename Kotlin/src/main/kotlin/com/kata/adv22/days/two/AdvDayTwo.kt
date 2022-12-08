package com.kata.adv22.days.two

class AdvDayTwo(val round: List<String>) {
    fun getRoundScore(): Int {
        val firstPlayerMove = round.first()
        val secondPlayerMove = round.last()
        var score = 1
        if (moves[firstPlayerMove] == moves[secondPlayerMove]) {
            score *= 2
        }
        return score
    }

}

val moves = mapOf("A" to 1, "B" to 2, "C" to 3, "X" to 1, "Y" to 2, "Z" to 3)