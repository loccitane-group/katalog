package com.kata.adv22

class AdvDayOne(text: String) {
    private val elfesCalories = text.split("\n\n").map { elfe -> elfe.split("\n").sumOf { value -> value.toInt() } }
    fun getMaxCalory(): Int {
        return elfesCalories.max()
    }

    fun getSumOfTop3MaxCalory(): Int {
        return elfesCalories.sortedDescending().take(3).sum()
    }
}