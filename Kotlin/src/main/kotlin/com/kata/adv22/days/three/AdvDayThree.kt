package com.kata.adv22.days.three

class AdvDayThree {
    private val priorities = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

    fun getSharedItemPriority(rucksackContent: String): Int {
        val firstCompartment = rucksackContent.take(rucksackContent.length/2).toSet()
        val secondCompartment = rucksackContent.takeLast(rucksackContent.length/2).toSet()
        val sharedItem = firstCompartment.intersect(secondCompartment).elementAt(0)

        return priorities.indexOf(sharedItem) + 1
    }
}