package com.katas.romanNumerals

class ArabicNumerals {
    def n2romanChunk = [
            [1000, "M"],
            [900, "CM"],
            [500, "D"],
            [400, "CD"],
            [100, "C"],
            [90, "XC"],
            [50, "L"],
            [40, "XL"],
            [10, "X"],
            [9, "IX"],
            [5, "V"],
            [4, "IV"],
            [1, "I"]
    ]

    String getRomanHandler(Integer remain, String acc) {
        if (remain == 0) {
            return acc
        }

        def rep = n2romanChunk.find({ it[0] <= remain })
        return getRomanHandler(remain - rep[0], acc + rep[1])
    }

    def getRoman(def myNumber) {
        return getRomanHandler(myNumber, '')
    }
}
