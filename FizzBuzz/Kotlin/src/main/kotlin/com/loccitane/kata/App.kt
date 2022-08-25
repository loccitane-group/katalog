
package com.loccitane.kata

class App {
    val greeting: String = "Hello World!"
}

fun main() {
    (1..100).forEach{index ->
        println(FizzBuzz().run(index))
    }
}