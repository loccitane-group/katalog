package com.kata.adv22

const val Rock = 'A'
const val Paper = 'B'
const val Scissors = 'C'


class DayTwo(private val rounds: List<Pair<Char, Char>>) {

    private val paperScore = 2
    private val rockScore = 1
    private val scissorsScore = 3
    private val winScore = 6
    private val drawScore = 3
    private val loseScore = 0
    private val scoringMap: Map<Pair<Char, Char>, Int> =
        mapOf(
            Pair(Paper, Rock) to rockScore + loseScore,
            Pair(Scissors, Rock) to rockScore + winScore,
            Pair(Rock, Rock) to drawScore+ rockScore,
            Pair(Rock, Paper) to paperScore + winScore,
            Pair(Scissors, Paper) to paperScore + loseScore,
            Pair(Paper, Paper) to drawScore + paperScore,
            Pair(Rock, Scissors) to scissorsScore + loseScore,
            Pair(Paper, Scissors) to scissorsScore + winScore,
            Pair(Scissors, Scissors) to  drawScore + scissorsScore,
        )

    fun getScore(): Int {
        return rounds.map {
            when (it.second) {
                'X' -> Pair(it.first, Rock)
                'Y' -> Pair(it.first, Paper)
                'Z' -> Pair(it.first, Scissors)
                else -> it
            }
        }.fold(0) { acc, pair -> acc + scoringMap[pair]!! }
    }

    fun getScore2(): Int {
        return rounds.map {
            when (it.second) {
                'X' -> Pair(it.first, getLoserFor(it.first))
                'Y' -> Pair(it.first, it.first)
                'Z' -> Pair(it.first, getWinnerFor(it.first))
                else -> throw Exception("unknown value ${it.second}")
            }
        }.fold(0) { acc, pair -> acc + scoringMap[pair]!! }
    }

    private fun getLoserFor(choice: Char): Char {
        return when (choice) {
            Rock -> Scissors
            Paper -> Rock
            Scissors -> Paper
            else -> throw Exception("Impossible value $choice")
        }
    }

    private fun getWinnerFor(choice: Char): Char {
        return when (choice) {
            Rock -> Paper
            Paper -> Scissors
            Scissors -> Rock
            else -> throw Exception("Impossible value $choice")
        }
    }

}
