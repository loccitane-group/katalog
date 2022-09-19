package com.katas.romanNumerals

class ArabicNumerals {
    def romanMap = [1000: [1: "M", 5: "V̅"], 100: [1: "C", 5: "D"], 10: [1: "X", 5: "L"], 1: [1: "I", 5: "V"]]

    def getRoman(def Integer arabicNumber) {
        var romanNumber = ""

        romanMap.each { unit, translate ->
            var unitCount = (Integer) Math.floor(arabicNumber / unit)

            if (unitCount == 9) {
                romanNumber += translate[1] + GetNextUnitAscending(unit)
            } else if (unitCount == 4) {
                romanNumber += translate[1] + translate[5]
            } else {
                var fiveUnitCount = (Integer) Math.floor(unitCount / 5)
                var remainingUnitCount = (Integer) unitCount - fiveUnitCount * 5
                romanNumber += translate[5].repeat(fiveUnitCount) +  translate[1].repeat(remainingUnitCount)
            }
            arabicNumber -= unitCount * unit
        }

        return romanNumber
    }

    private String GetNextUnitAscending(int unit) {
        romanMap[unit * 10][1]
    }
}
