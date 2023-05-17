# Minesweeper CLI Game

## Demo & Snippets

Screenshot of CLI where user has lost game by selecting a bomb. \
![image](https://github.com/MacleanJS/minesweeper/assets/102455846/ce5d9d19-0305-4af3-876d-c569397c8f4e)

---

## Requirements / Purpose

###   Purpose of project: 
-   Recreate a simplified version of the Minesweeper game.
### Requirements: 
-   Allow user to select grid size and difficulty. 

---

## Build Steps

1. Download/clone project.
2. Run project from Main.java.
3. Select a grid size (recommendation is 10), and select difficulty (recommendation is 2).
4. To play the game, continue chosing cells by providing the console with coordinates!

---

## Design Goals / Approach

###   Design goals: 
- The design approach was keeping it simple as console's become messy very quickly. 
###   Program design: 
- Separating the logic into the Game class helped to maintain an OOP approach to the program. 

---

## Features

-   Object Oriented Programming - the Game object features getters and setters for all aspects. 
-   User is able to select grid size & difficulty.
-   When a cell is selected, it displays amount of nearby bombs (touching + corners).

---

## Known issues

-   No error handling - added to future goals.

---

## Future Goals

-   Error handling: user inputs out of grid scope, user inputs that aren't integer type.
-   Add replayability feature: allows user to create a new game without restarting CLI app. 
-   Add testing through Junit. 
-   Display all bombs once game is over.
-   Create a GUI. 

---

## Change logs


---

## What did you struggle with?

-   Initially I didn't follow proper OOP principals and created a bit of the game logic within Main.java. 
-   I fixed this by moving the logic into getters and setters with the Game.java class.

---
