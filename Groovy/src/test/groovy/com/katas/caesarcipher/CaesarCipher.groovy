package com.katas.caesarcipher

class CaesarCipher {

    String input
    String result
    final def alphabetSize = 26
    final def firstASCIUpperLetter = 65

    CaesarCipher(String input) {
        this.input = input
        this.result= ""
    }

    def compute(Integer shift) {
        shift = getMinimumPositiveShift(shift)
        this.input.toCharArray().each { c ->
            getShiftedCharacter(c, shift)
        }
        this.result
    }

    private void getShiftedCharacter(char c, int shift) {
        if (c.toUpperCase()>=65 && c.toUpperCase()<=91){
            throw Exception
        }
        if (Character.isLetter(c)) {
            this.result += (((c.toUpperCase() + shift) - firstASCIUpperLetter) % alphabetSize + firstASCIUpperLetter) as char
        } else
            this.result += c
    }

    private Integer getMinimumPositiveShift(int shift) {
        def temp = shift % alphabetSize
        if (temp < 0) {
            temp = temp + alphabetSize
        }
        temp
    }

}
