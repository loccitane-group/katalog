package com.katas.caesarcipher


import spock.lang.Specification

class CaesarCipherSpec extends Specification {

    def "tous mes tests à un character"() {
        given:
        def cipher = new CaesarCipher(input)

        when:
        def result = cipher.compute(shift)

        then:
        result == expected

        where:
        input | shift || expected
        "A"   | 1     || "B"
        "1"   | 1     || "1"
        "Z"   | 1     || "A"
        "a"   | 1     || "B"
        "y"   | 2     || "A"
        "A"   | -1     || "Z"
        "A"   | 27     || "B"
        "A"   | -53     || "Z"
    }
}
