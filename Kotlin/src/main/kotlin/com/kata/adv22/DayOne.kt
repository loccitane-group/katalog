package com.kata.adv22

class DayOne(text: String) {
    private val returnChar: String = System.lineSeparator()
    private val caloriesByElf = text.split("$returnChar$returnChar").map { elf -> elf.split("$returnChar").sumOf { value -> value.toInt() } }
    fun getMaxCalories(): Int {
        return caloriesByElf.max()
    }

    fun getSumOfTop3MaxCalories(): Int {
        return caloriesByElf.sortedDescending().take(3).sum()
    }
}