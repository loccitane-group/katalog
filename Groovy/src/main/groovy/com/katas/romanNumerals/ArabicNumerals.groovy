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


    def getRoman(def myNumber) {
        String acc = ""
        Integer remain = myNumber
        while (remain > 0) {
            def rep = n2romanChunk.find({ it[0] <= remain })
            acc += rep[1]
            remain -= rep[0]
        }
        return acc
    }
}
