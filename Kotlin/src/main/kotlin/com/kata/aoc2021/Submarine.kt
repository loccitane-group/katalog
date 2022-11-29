package com.kata.aoc2021

class Submarine(val depthList: List<Int>) {
    fun countIncreased(): Int {
        var increaseCount = 0
        for (i in depthList.indices) {
            if (i < depthList.size - 1 && depthList[i] < depthList[i + 1]) increaseCount += 1
        }
        return increaseCount
    }

}