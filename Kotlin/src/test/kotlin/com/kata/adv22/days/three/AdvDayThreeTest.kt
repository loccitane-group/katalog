package com.kata.adv22.days.three

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AdvDayThreeTest{
    @Test
    fun should_get_shared_item_priority() {
        val rucksackContent = "abcdABCd"
        assertEquals(4,AdvDayThree().getSharedItemPriority(rucksackContent))
    }
}