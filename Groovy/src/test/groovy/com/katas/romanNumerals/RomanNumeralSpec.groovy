package com.katas.romanNumerals

import spock.lang.Specification
import spock.lang.Unroll

class RomanNumeralSpec  extends Specification{

    @Unroll
    def "Can convert arabic #arabic to roman #expected"() {
        given:
         def arabicNumerals = new ArabicNumerals()

        expect:
        arabicNumerals.getRoman(arabic) == expected

        where:
        arabic || expected
        1      || 'I'
        2      || 'II'
        3      || 'III'
        4      || 'IV'
        5      || 'V'
        6      || 'VI'
        9      || 'IX'
        27     || 'XXVII'
        48     || 'XLVIII'
        49     || 'XLIX'
        59     || 'LIX'
        93     || 'XCIII'
        141    || 'CXLI'
        163    || 'CLXIII'
        402    || 'CDII'
        575    || 'DLXXV'
        911    || 'CMXI'
        1024   || 'MXXIV'
        3000   || 'MMM'
    }

}
