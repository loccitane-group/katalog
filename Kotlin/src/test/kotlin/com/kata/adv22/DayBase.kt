package com.kata.adv22

open class DayBase(protected val user: String=System.getenv()["user"]!!,
                   protected val path: String = "./src/test/kotlin/com/kata/adv22") {
    private val results =
        mapOf(
            "test" to mapOf(
                1 to mapOf(
                    1 to 50000,
                    2 to 85000
                ),
                2 to mapOf(
                    1 to 0,
                    2 to 0
                )
            ),
            "peter" to mapOf(
                1 to mapOf(
                    1 to 71934,
                    2 to 211447
                ),
                2 to mapOf(
                    1 to 11150,
                    2 to 8295
                )
            ),
            "jordan" to mapOf(
                1 to mapOf(
                    1 to 67633,
                    2 to 199628
                )
            )
        )

    protected fun getExpectedFor(userName: String, day: Int, part: Int): Int {

        if (!results.containsKey(userName))
            throw Exception("$userName is unknown")

        if (!results[userName]!!.containsKey(day))
            throw Exception("$userName doesn't have expected results for day #$day")

        if (!results[userName]!![day]!!.containsKey(part))
            throw Exception("$userName doesn't have expected results for part $part of day #$day")

        return results[userName]!![day]!![part]!!
    }
}