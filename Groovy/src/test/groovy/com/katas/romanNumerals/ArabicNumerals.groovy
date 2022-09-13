package com.katas.romanNumerals

class ArabicNumerals {
    def romanDictionnary = ["", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"]

   def getRoman (def myNumber){
       romanDictionnary[myNumber]
    }
}
