package com.kata.adv22.days.three

import java.io.File

class AdvDayThree {
    private val priorities = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

    fun getTotalPriorityOfFile(fileName: String): Int {
        var priority = 0
        File(fileName).forEachLine { priority += getSharedItemPriority(it) }
        return priority
    }

    fun getSharedItemPriority(rucksackContent: String): Int {
        val firstCompartment = rucksackContent.take(rucksackContent.length / 2).toSet()
        val secondCompartment = rucksackContent.takeLast(rucksackContent.length / 2).toSet()
        val sharedItem = firstCompartment.intersect(secondCompartment).elementAt(0)

        return priorities.indexOf(sharedItem) + 1
    }
}