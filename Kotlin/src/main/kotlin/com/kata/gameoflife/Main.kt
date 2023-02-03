package com.kata.gameoflife

import java.awt.Color
import java.awt.Dimension
import java.awt.EventQueue
import java.awt.Font
import java.awt.event.ComponentAdapter
import java.awt.event.ComponentEvent
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JTable
import javax.swing.Timer
import javax.swing.table.DefaultTableCellRenderer

class SimpleEx(title: String) : JFrame() {

    init {
        createUI(title)
    }

    private fun createUI(title: String) {

        val grid = Grid(7, 7)
            .setAlive(3, 4)
            .setAlive(2, 3)
            .setAlive(4, 6)
            .setAlive(3, 3)
            .setAlive(4, 6)
            .setAlive(3, 5)

        setSize(1000, 1000)
        setTitle(title)
        defaultCloseOperation = EXIT_ON_CLOSE
        setLocationRelativeTo(null)

        // Initializing the JTable
        val table = JTable(Array(grid.height) { Array(grid.length) { "" } }, Array(grid.length) { "" })
        table.gridColor = Color(240, 240, 240)
        table.font = Font("Serif", Font.BOLD, 20)
        updateTable(table, grid)
        table.addComponentListener(object : ComponentAdapter() {
            override fun componentResized(e: ComponentEvent?) {
                //Get new JTable component size
                val size: Dimension = size

                //Check if height or width is the limiting factor and set cell size accordingly
                val cellSize: Int = if (size.height / grid.height > size.width / grid.length) {
                    size.width / grid.length
                } else {
                    size.height / grid.height
                }

                //Set new row height to our new size
                table.rowHeight = cellSize

                val centerRenderer = DefaultTableCellRenderer()
                centerRenderer.horizontalAlignment = JLabel.CENTER
                //Set new column width to our new size
                for (i in 0 until table.columnCount) {
                    val column = table.columnModel.getColumn(i)
                    column.maxWidth = cellSize
                    column.cellRenderer = centerRenderer
                }
            }
        })
        add(table)

        val timer = Timer(1000) {
            grid.evolve()
            updateTable(table, grid)
        }
        timer.start()
    }

    private fun updateTable(table: JTable, grid: Grid) {
        for (j in (0 until grid.height)) {
            for (i in (0 until grid.length)) {
                val valueAt = if (grid.isAlive(i, j)) "*" else ""
                table.setValueAt(valueAt, j, i)
            }
        }
    }
}


private fun createAndShowGUI() {
    val frame = SimpleEx("Game Of Life")
    frame.isVisible = true
}

fun main() {
    EventQueue.invokeLater(::createAndShowGUI)
}
