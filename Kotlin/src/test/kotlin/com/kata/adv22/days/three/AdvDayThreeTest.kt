package com.kata.adv22.days.three

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest
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
}