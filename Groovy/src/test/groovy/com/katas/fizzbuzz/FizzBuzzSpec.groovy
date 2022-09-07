package com.katas.fizzbuzz

import spock.lang.Specification


class FizzBuzzSpec extends Specification {
    def "For multiples of three print Fizz instead of the number other method"() {
        given:
        def value = new FizzBuzz()

        when:
        def result = value.run(3)

        then:
        result == "Fizz"
    }


    def "For the multiples of five print Buzz instead of the number"() {
        given:
        def value = new FizzBuzz()

        when:
        def result = value.run(5)

        then:
        result == "Buzz"
    }

    def "should return fizz when number is multiple of 3"() {
        def value = new FizzBuzz()

        expect:
        value.run(parameter) == expected

        where:
        parameter || expected
        3         || "Fizz"
        6         || "Fizz"
        9         || "Fizz"
        12        || "Fizz"
    }

    def "should return fizz when number is multiple of 5"() {
        def value = new FizzBuzz()

        expect:
        value.run(parameter) == expected

        where:
        parameter || expected
        5         || "Buzz"
        10        || "Buzz"
        20        || "Buzz"
    }


    def "should return the value when it's not a multiple of 3 or 5"() {
        given:
        def value = new FizzBuzz()

        when:
        def result = value.run(1)

        then:
        result == 1
    }


    def "For numbers which are multiples of both three and five print FizzBuzz instead of the number"() {
        def value = new FizzBuzz()

        expect:
        value.run(parameter) == expected

        where:
        parameter || expected
        15        || "FizzBuzz"
        30        || "FizzBuzz"
    }


    def "should send #expected for parameter #parameter"() {
        def value = new FizzBuzz()
        expect:
        value.run(parameter) == expected

        where:
        parameter << getNumbersForFizz() + getNumbersForBuzz() + getNumbersForFizzBuzz() + getNormalNumbers()
        expected << ["Fizz","Fizz","Fizz","Fizz","Fizz","Fizz","Buzz","Buzz","Buzz","Buzz","Buzz","Buzz","FizzBuzz","FizzBuzz","FizzBuzz","FizzBuzz","FizzBuzz","FizzBuzz",1, 2, 4, 7, 8, 11]
    }

    def getNumbersForFizz() {
        return [3, 6, 9, 12, 18, 21]
    }

    def getNumbersForBuzz() {
        return [5, 10, 20, 25, 35, 40]
    }

    def getNumbersForFizzBuzz() {
        return [15, 30, 45, 60, 75, 90]
    }

    def getNormalNumbers () {
        return [1, 2, 4, 7, 8, 11]
    }
}
