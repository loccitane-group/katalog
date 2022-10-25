package com.katas.caesarcipher

class CaesarCipher {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    String input

    CaesarCipher(String input) {
        inputValidation(input)
        this.input = input
    }

    private static void inputValidation(String input) {
        def EMPTY_STRING = ""
        def VALID_INPUT_SIZE = 32

        if (input == EMPTY_STRING) {
            throw new IllegalArgumentException("Empty input provided")
        }
        if (input.length() < VALID_INPUT_SIZE) {
            throw new IllegalArgumentException("Provided input is to short")
        }
        if (input.length() > VALID_INPUT_SIZE) {
            throw new IllegalArgumentException("Provided input is to long")
        }
        input.each { character ->
            if (character ==~ "[^a-zA-Z0-9]") {
                throw new IllegalArgumentException("Provided input contains not valid characters")
            }
        }
    }

    String compute(int slide) {
        def encryptedInput = ""
        this.input.each {character ->
            if (character ==~ "[a-zA-Z]") {
                encryptedInput  += alphabet[(alphabet.indexOf(character.toUpperCase()) + slide).mod(26)]
            }
            else encryptedInput += character
        }
        encryptedInput
    }
}
