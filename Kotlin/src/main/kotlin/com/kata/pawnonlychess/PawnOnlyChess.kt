package com.kata.pawnonlychess

fun main() {

    // Business Rule 1: The Game starts by printing its name
    println(" Pawns-Only Chess")

    // Business Rule 2: Then collect Both players' names through std input
    println("First Player's name:")
    var player1 = readln()
    println("Second Player's name:")
    var player2 = readln()

    // Business Rule 3: Display default board layout & pawns.
    println("  +---+---+---+---+---+---+---+---+")
    println("8 |   |   |   |   |   |   |   |   |")
    println("  +---+---+---+---+---+---+---+---+")
    println("7 | B | B | B | B | B | B | B | B |")
    println("  +---+---+---+---+---+---+---+---+")
    println("6 |   |   |   |   |   |   |   |   |")
    println("  +---+---+---+---+---+---+---+---+")
    println("5 |   |   |   |   |   |   |   |   |")
    println("  +---+---+---+---+---+---+---+---+")
    println("4 |   |   |   |   |   |   |   |   |")
    println("  +---+---+---+---+---+---+---+---+")
    println("3 |   |   |   |   |   |   |   |   |")
    println("  +---+---+---+---+---+---+---+---+")
    println("2 | W | W | W | W | W | W | W | W |")
    println("  +---+---+---+---+---+---+---+---+")
    println("1 |   |   |   |   |   |   |   |   |")
    println("  +---+---+---+---+---+---+---+---+")
    println("    A   B   C   D   E   F   G   H  ")

    // Business Rule 4: Each player moves inputs a move through std input
    // Business Rule 5: A move is invalid if the origin or target is not on the board. When invalid print "Invalid Input"
    // Business Rule 6: Game ends when one player inputs "exit"

    var input = ""
    var count = 0

    while (input != "exit") {
        if (count % 2 == 0) {
            println("$player1's turn:")
        } else {
            println("$player2's turn:")
        }
        input = readln()

        // Business Rule 7: A command to move a pawn is characterized by the pawn's origin and target. ex: a2a4
        // Business Rule 8: A pawn's abscissa letter can be stated in upper or lower case
        val rgx = Regex("([a-hA-H][1-8]){2}")
        if (!rgx.matches(input) && input != "exit") {
            println("Invalid Input")
        } else {
            count += 1
        }
    }

    // Business Rule 9: On exit, print "Bye!"
    println("Bye!")
}





