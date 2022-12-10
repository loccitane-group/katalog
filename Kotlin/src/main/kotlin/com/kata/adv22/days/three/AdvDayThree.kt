package com.kata.adv22.days.three

import java.io.File

class AdvDayThree {
    private val priorities = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

    fun getGroupsBadgeItemTotalPriorityOfFile(fileName: String): Int {
        var priority = 0
        val groupSize = 3
        val groupRuckSack = mutableSetOf<String>()
        File(fileName).forEachLine {
            groupRuckSack.add(it)
            if (groupRuckSack.size == groupSize) {
                priority += getGroupBadgeItemPriority(groupRuckSack)
                groupRuckSack.clear()
            }
        }
        return priority
    }

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

    fun getGroupBadgeItemPriority(groupRucksackContent: Set<String>): Int {
        val firstElement = groupRucksackContent.elementAt(0).toList()
        val groupBadge = groupRucksackContent.fold(firstElement) { intersection: List<Char>, it: String ->
            intersection.intersect(it.toList()).toList()
        }[0]
        return priorities.indexOf(groupBadge) + 1
    }
}