package com.katas.hamming

import spock.lang.Ignore
import spock.lang.Shared
import spock.lang.Specification

class HammingSpec extends Specification {

    @Shared
    def hamming = new Hamming()

    def "Empty strands"() {
        expect:
        hamming.distance(strand1, strand2) == expected

        where:
        strand1 | strand2 || expected
        ''      | ''      || 0
    }

    def "Single letter identical strands"() {
        expect:
        hamming.distance(strand1, strand2) == expected

        where:
        strand1 | strand2 || expected
        'A'     | 'A'     || 0
    }

    def "Single letter different strands"() {
        expect:
        hamming.distance(strand1, strand2) == expected

        where:
        strand1 | strand2 || expected
        'G'     | 'T'     || 1
    }

    def "Long identical strands"() {
        expect:
        hamming.distance(strand1, strand2) == expected

        where:
        strand1         | strand2         || expected
        'GGACTGAAATCTG' | 'GGACTGAAATCTG' || 0
    }

    def "Long different strands"() {
        expect:
        hamming.distance(strand1, strand2) == expected

        where:
        strand1        | strand2        || expected
        'GGACGGATTCTG' | 'AGGACGGATTCT' || 9
    }

    @Ignore
    def "Disallow first strand longer"() {
        when:
        hamming.distance(strand1, strand2)

        then:
        thrown(ArithmeticException)

        where:
        strand1 | strand2
        'AATG'  | 'AAA'
    }

    @Ignore
    def "Disallow second strand longer"() {
        when:
        hamming.distance(strand1, strand2)

        then:
        thrown(ArithmeticException)

        where:
        strand1 | strand2
        'ATA'   | 'AGTG'
    }

    @Ignore
    def "Disallow left empty strand"() {
        when:
        hamming.distance(strand1, strand2)

        then:
        thrown(ArithmeticException)

        where:
        strand1 | strand2
        ''      | 'G'
    }

    @Ignore
    def "Disallow right empty strand"() {
        when:
        hamming.distance(strand1, strand2)

        then:
        thrown(ArithmeticException)

        where:
        strand1 | strand2
        'G'     | ''
    }

}
