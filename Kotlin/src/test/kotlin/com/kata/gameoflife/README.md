Conway's Game of Life
---------------------

This application is a small implementation of [Conway's Game of Life](https://en.wikipedia.org/wiki/Conway's_Game_of_Life).
Given a grid of both living and dead cells, cells will die and come to life as the game progresses through generations
based on some basic rules:

1. Any live cell with fewer than two live neighbours dies, as if caused by under-population.
2. Any live cell with two or three live neighbours lives on to the next generation.
3. Any live cell with more than three live neighbours dies, as if by overcrowding.
4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

The game can be seeded with randomly generated number of cells, or load an initial cell configuration.

Cell grid example:

```
......O.
OOO...O.
......O.
........
...OO...
...OO...
```


The nature of these rules creates scenarios where all cells may die (extinction) and where no cells can change their
state (utopia).  In either of these scenarios, the game will stop.

