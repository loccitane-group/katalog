package com.katas.caesarcipher

class CaesarCipher {

    String input

    CaesarCipher(String input){
        this.input = input
    }

    def compute(Integer shift){
        this.input.toCharArray()[0] + shift
    }
}
