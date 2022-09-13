package com.katas.romanNumerals

import spock.lang.Specification
import spock.lang.Unroll

class RomanNumeralSpec  extends Specification{

    @Unroll
    def "getRomanChunk convert one digit, given the log10"() {
        given:
         def arabicNumerals = new ArabicNumerals()

        expect:
        arabicNumerals.getRomanChunk(arabic, log10) == expected

        where:
        arabic || log10 || expected
        1      || 0     || 'I'
        2      || 0     || 'II'
        3      || 0     || 'III'
        4      || 0     || 'IV'
        5      || 0     || 'V'
        6      || 0     || 'VI'
        7      || 0     || 'VII'
        8      || 0     || 'VIII'
        9      || 0     || 'IX'
        0      || 1     || ''
        1      || 1     || 'X'
        2      || 1     || 'XX'
        6      || 1     || 'LX'
    }
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
