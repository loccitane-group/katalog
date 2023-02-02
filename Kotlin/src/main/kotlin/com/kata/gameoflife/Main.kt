package com.kata.gameoflife

fun main() {
    val grid = Grid(7, 7)
    grid.setAlive(3, 4)
    grid.setAlive(2, 3)
    grid.setAlive(4, 6)
    grid.setAlive(3, 3)
    grid.setAlive(4, 6)
    grid.setAlive(3, 5)
    grid.display()

    var cpt = 1
    while (grid.evolve() && cpt>0 ) {
        grid.display()
        cpt--
    }
    grid.display()
}