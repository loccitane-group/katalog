package com.katas.romanNumerals

class ArabicNumerals {

   def getRoman (def myNumber){
       (1..myNumber)
               .collect{"I"}
               .join()
    }
}
