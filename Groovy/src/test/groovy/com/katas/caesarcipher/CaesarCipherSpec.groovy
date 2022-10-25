package com.katas.caesarcipher


import spock.lang.Specification

class CaesarCipherSpec extends Specification {
    def "Should trigger exception with not well formatted ids"() {
        when:
        new CaesarCipher(input)

        then:
        def error = thrown(IllegalArgumentException)
        errorMessage == error.message

        where:
        input                                     | errorMessage
        ""                                        | "Empty input provided"
        "notEnoughCharacters"                     | "Provided input is to short"
        "thisidisstartingtobeveryveryverytoolong" | "Provided input is to long"
        "%%%%%%1AAEBACA093543299F8F26FCF1"        | "Provided input contains not valid characters"
        "FF90E16AAE  CA093543299F8F26FCF1"        | "Provided input contains not valid characters"
    }

    def "should compute caesar ciphers with valid input"() {
        when:
        def caesar = new CaesarCipher(input)

        then:
        computedCipher == caesar.compute(shift)

        where:
        input                              | computedCipher                     | shift
        "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" | "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" | 0
        "FF90E16AAEBACA093543299F8F26FCF1" | "FF90E16AAEBACA093543299F8F26FCF1" | 0
        "FF90E16AAEBACA093543299F8F26FCF1" | "FF90E16AAEBACA093543299F8F26FCF1" | 26
        "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" | "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB" | 1
        "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ" | "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" | 1
        "FF90E16AAEBACA093543299F8F26FCF1" | "GG90F16BBFCBDB093543299G8G26GDG1" | 1
        "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB" | "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" | -1
        "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" | "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB" | 27
        "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB" | "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" | 25
        "12345678912345678912345678912345" | "12345678912345678912345678912345" | 10
    }
}
