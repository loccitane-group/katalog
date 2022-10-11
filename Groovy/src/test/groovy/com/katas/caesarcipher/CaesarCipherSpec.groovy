package com.katas.caesarcipher

import spock.lang.Shared
import spock.lang.Specification

class CaesarCipherSpec extends Specification{

    def "1 char string Cipher"() {
        when:
        def cipher = new CaesarCipher(input)

        then:
        cipher.compute(shift) == expected

        where:
        input   | shift  || expected
        "A"     | 1      || "B"
    }
}
