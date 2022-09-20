package com.katas.romanNumerals

class ArabicNumerals {
    final ROMAN_DICT = [
            "M" : 1000,
            "CM": 900,
            "D" : 500,
            "CD": 400,
            "C" : 100,
            "XC": 90,
            "L" : 50,
            "XL": 40,
            "X" : 10,
            "IX": 9,
            "V" : 5,
            "IV": 4,
            "I" : 1
    ]

    def getRoman(def myNumber) {
        String romanTrad = ""
        def remain = myNumber
        ROMAN_DICT.each { romanDictEntry ->
            while (remain >= romanDictEntry.value) {
                romanTrad += romanDictEntry.key;
                remain -= romanDictEntry.value;
            }
        }
        return romanTrad
    }
}
