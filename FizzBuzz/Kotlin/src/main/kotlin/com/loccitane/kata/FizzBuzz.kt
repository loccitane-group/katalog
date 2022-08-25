package com.loccitane.kata

class FizzBuzz {
    fun run(number: Int): String {
        if (number % 3 == 0)
            return "Fizz"
        return number.toString()
    }
}
