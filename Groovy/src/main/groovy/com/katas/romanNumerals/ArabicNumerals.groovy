package com.katas.romanNumerals

class ArabicNumerals {
    def romanDictionnary = ["", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"]

    def getRoman (int myNumber) {
        if (myNumber >= 1000) return 'M' + getRoman(myNumber - 1000)
        if (myNumber >= 900) return 'CM' + getRoman(myNumber - 900)
        if (myNumber >= 500) return 'D' + getRoman(myNumber - 500)
        if (myNumber >= 400) return 'CD' + getRoman(myNumber - 400)
        if (myNumber >= 100) return 'C' + getRoman(myNumber - 100)
        if (myNumber >= 90) return 'XC' + getRoman(myNumber - 90)
        if (myNumber >= 50) return 'L' + getRoman(myNumber - 50)
        if (myNumber >= 40) return 'XL' + getRoman(myNumber - 40)
        if (myNumber >= 10) return 'X' + getRoman(myNumber - 10)
        return romanDictionnary[myNumber]
    }
}
