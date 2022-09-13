package com.katas.romanNumerals

class ArabicNumerals {

    def getRoman(def myNumber) {
        (1..myNumber)
                .collect { "I" }
                .join()
                .replaceAll("I{9}", "IX")
                .replaceAll("I{5}", "V")
                .replaceAll("I{4}", "IV")
    }
}
