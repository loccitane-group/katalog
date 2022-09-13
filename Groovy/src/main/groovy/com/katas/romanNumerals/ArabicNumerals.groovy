package com.katas.romanNumerals

class ArabicNumerals {

    def getRoman(def myNumber) {
        (1..myNumber)
                .collect { "I" }
                .join()
                .replaceAll("I{500}", "D")
                .replaceAll("I{400}", "CD")
                .replaceAll("I{100}", "C")
                .replaceAll("I{90}", "XC")
                .replaceAll("I{50}", "L")
                .replaceAll("I{40}", "XL")
                .replaceAll("I{10}", "X")
                .replaceAll("I{9}", "IX")
                .replaceAll("I{5}", "V")
                .replaceAll("I{4}", "IV")
    }
}
