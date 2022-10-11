package com.katas.caesarcipher

class CaesarCipher {

    String input

    CaesarCipher(String input) {
        this.input = input
    }

    def compute(Integer shift) {
        def temp=shift%26
        if(temp<0){
            temp=temp+26
        }
        def c = this.input.toCharArray()[0]
        if (Character.isLetter(c))
            ((c.toUpperCase() + temp) - 65) % 26 + 65
        else
            c
    }
}
