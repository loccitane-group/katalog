package com.katas.romanNumerals

class ArabicNumerals {
    def romanDictionnaryNumber = ["", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"]
    def romanDictionnaryTens = ["", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"]
    def romanDictionnaryHundreds = ["", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"]
    def romanDictionnaryThousands = ["", "M", "MM", "MMM", "MMMM"]

   def getRoman (def myNumber){
       if (myNumber>=5000){
           "Not handled"
       }
       else if (myNumber>=1000){
           romanDictionnaryThousands[myNumber/1000]+romanDictionnaryHundreds[myNumber%1000/100]+romanDictionnaryTens[(myNumber%100)/10]+romanDictionnaryNumber[myNumber%10]
       }
       else if (myNumber>=100){
           romanDictionnaryHundreds[myNumber/100]+romanDictionnaryTens[(myNumber%100)/10]+romanDictionnaryNumber[myNumber%10]
       }
       else if(myNumber>=10){
           romanDictionnaryTens[myNumber/10]+romanDictionnaryNumber[myNumber%10]
       }
       else {
           romanDictionnaryNumber[myNumber]
       }
    }
}
