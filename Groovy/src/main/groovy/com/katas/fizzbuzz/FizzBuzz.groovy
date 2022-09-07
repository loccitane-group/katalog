package com.katas.fizzbuzz

class FizzBuzz {

    def run(int value) {
        if (value % 3 == 0 && value % 5 == 0) return "FizzBuzz"
        if (value % 5 == 0) return "Buzz"
        if (value % 3 == 0) return "Fizz"
        return value
    }
}
