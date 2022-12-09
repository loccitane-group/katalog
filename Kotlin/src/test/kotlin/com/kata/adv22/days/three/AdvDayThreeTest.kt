package com.kata.adv22.days.three

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory

class AdvDayThreeTest {
    @TestFactory
    fun should_get_shared_item_priority() = listOf(
        "abcdABCd" to 4,
        "aaavaaabbbbvbb" to 22,
        "AzertyAZERTY" to 27,
        "qsdfghZjklmQSDFGHJKLZM" to 52,
    ).map { (rucksackContent, expectedPriority) ->
        DynamicTest.dynamicTest("should get priority $expectedPriority for rucksackContent $rucksackContent") {
            assertEquals(expectedPriority, AdvDayThree().getSharedItemPriority(rucksackContent))
        }
    }

    @Test
    fun should_get_priority_157_with_example_file() {
        val path = "${System.getProperty("user.dir")}/src/test/kotlin/com/kata/adv22/days/three/inputTest.txt"
        assertEquals(157, AdvDayThree().getTotalPriorityOfFile(path))
    }

    @Test
    fun should_get_priority_8243_with_day_three_input() {
        val path = "${System.getProperty("user.dir")}/src/test/kotlin/com/kata/adv22/days/three/inputDayThree.txt"
        assertEquals(8243, AdvDayThree().getTotalPriorityOfFile(path))
    }

    @Test
    fun should_get_priority_of_group_badge_item() {
        val firstGroupRucksackContent = setOf(
            "vJrwpWtwJgWrhcsFMMfFFhFp",
            "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
            "PmmdzqPrVvPwwTWBwg"
        )

        val secondGroupRucksackContent = setOf(
            "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
            "ttgJtRGJQctTZtZT",
            "CrZsJsPPZsGzwwsLwLmpwMDw"
        )
        assertEquals(18, AdvDayThree().getGroupBadgeItemPriority(firstGroupRucksackContent))
        assertEquals(52, AdvDayThree().getGroupBadgeItemPriority(secondGroupRucksackContent))
    }
}