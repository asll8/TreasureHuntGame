# TreasureHuntGame

Business Rules:
- Game consists of 10 turns
- It is a single-player game.
- At the beginning of the game the size of the board is determined by the player, the board size
cannot be less than 5 cells in width and height.
- After the size is set, two tree objects, a house object, a treasured object, a robot object, and a
player object is placed randomly on the board
- In each turn, the application informs the player about its position and asks which x and y position
it wants to move
o If it hits the robot after a move, the player loses the game
o If it hits a tree or the house, the player cannot move, and game skips to the next turn after
moving the robot
o If it hits the treasure, the player wins the game
o After the player moves, the robot moves to a location randomly, if the robot hits the treasure,
the player loses the game. Robot isn’t affected by tree and house objects
- After each turn, the application informs the player if it is getting closer or far to the treasure.

---

**Imaginary Game Board**

<img width="300" alt="gametable" src="https://github.com/asll8/TreasureHuntGame/blob/master/imaginary_board.png">
