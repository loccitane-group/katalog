package com.katas.caesarcipher

class CaesarCipher {

    String input

    CaesarCipher(String input) {
        this.input = input
    }

    def compute(Integer shift) {
        def c = this.input.toCharArray()[0]
        if (Character.isLetter(c))
            ((c + shift) - 65) % 26 + 65
        else
            c
    }
}
