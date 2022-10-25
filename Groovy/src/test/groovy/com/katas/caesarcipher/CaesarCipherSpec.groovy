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
        "AT"  | 1    || "BU"
        "AT8"  | 1    || "BU8"
        "FF90E16AAËBACA093543299F8F26FCF1"  | 1 | "GG90F16BBËCBDB093543299G8G26GDG1"
    }
}
