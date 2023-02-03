package com.kata.gameoflife

fun main() {
    val grid = Grid(7, 7)
        .setAlive(3, 4)
        .setAlive(2, 3)
        .setAlive(4, 6)
        .setAlive(3, 3)
        .setAlive(4, 6)
        .setAlive(3, 5)
    grid.display()

    var cpt = 1
    while (grid.evolve() && cpt > 0) {
        grid.display()
        cpt--
    }
    grid.display()
}
