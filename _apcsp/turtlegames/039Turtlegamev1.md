---
layout: project
category: turtlegames
title: Turtle Game v1
---
**This is NOT a group project**

Using [Trinket.io](https://trinket.io/) or [Repl.it](https://repl.it/) you will create a simple game using turtle objects.

Read these first:
- [Naming a Turtle object](https://bradleycodeu.github.io/apcsp/turtlegames/multipleTurtles01-naming-a-turtle-object/)
- [Tina and Tommy's colors](https://bradleycodeu.github.io/apcsp/turtlegames/multipleTurtles02-tina-and-tommys-colors/) (Notice how you can name a turtle and give that specific turtle commands?)
- [Name the Screen object](https://bradleycodeu.github.io/apcsp/turtlegames/multipleTurtles03-name-the-screen-object/)
- [Controlling Tina](https://bradleycodeu.github.io/apcsp/turtlegames/multipleTurtles04-controlling-tina/)
- [How to make Python games with Trinket](https://blog.trinket.io/python-games/)

**BEFORE THE GAME LOOP:**

Create a Screen object with stage = Screen()
```python
stage = Screen()
```
Set stage.tracer() to zero

Create one controllable sprite. Use [screen.onkey()](https://docs.python.org/3.3/library/turtle.html?highlight=turtle#turtle.onkey). to bind functions to keys. In the example below, when the "a" key is pressed, the function goLeft() will run. This code will appear before the game loop.
```python
def goLeft():
  forward(1)
  left(10)

stage.onkey(goLeft,"a")  #notice that goLeft doesn't look like the normal goLeft()
stage.listen()
```
Use stage.listen() to make the screen listen for keys to be pressed.

Create one or more collectible items (like coins). These could be turtles with the "circle" [shape](https://docs.python.org/3.3/library/turtle.html?highlight=turtle#turtle.shape) and a different color.

Create one or more one or more enemies with a different shape and color than the player and collectible(s).

Create a "forever loop" that will serve as the game loop. Use while True:

INSIDE THE GAME LOOP:

Inside the loop, stage.update()

Inside the loop, the enemy/enemies follow the player. Use enemy.towards(player) to get the angle from the enemy to the player. Use enemy.setheading() to turn the enemy to a certain heading.

Inside the loop... if you touch an enemy, change the screen's background color and break the loop. Use player.distance(enemy) < 20 to detect if touching enemy.
```python
player.distance(enemy) < 20
```
Inside the loop... if you touch the collectible (coin), change the screen's background color to green and break the game loop.
