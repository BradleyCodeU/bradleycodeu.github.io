---
layout: project
category: objects
title: Castles And Creatures
---
Concepts: dictionary

# Castles and Creatures

Create a function called printGameTitle that prints a fancy title. Returns nothing. Visit http://patorjk.com/software/taag/ to get a fancy ASCII art title

Create a function rollDice that requires one argument: numDice. Returns a random integer from numDice to numDice x6. Idealy, the function should simulate dice probablity so that rollDice(2) has a higher probablity of rolling 7 than 2.

Create a function makeEnemy that will return an enemy dictionary. Requires 3 arguments: name, power, health


Create a function called setupCastleOne() that prints a brief introduction. Return an enemy dictionary that must NOT be named "Enemy 1 Name"

Create a function called setupCastleTwo() that prints a brief introduction. Return an enemy dictionary that must NOT be named "Enemy 2 Name"

Create a function called setupCastleThree() that prints a brief introduction. Return an enemy dictionary that must NOT be named "Enemy 3 Name"

Create a function called validInput that returns true or false. There is one argument: userInput. Returns True if the userInput is an integer 1 to 3 or 9. Use try/except to convert string to integer without crashing.

Create a function getInput that will prompt and collect input. Return the number that the player selects.
No arguments needed.

Create a function called tryToSteal that will return True or False. No arguments needed. Stealing always has a 30% chance of succeeding.
30% of the time, tell user they were able to steal & return True
Otherwise (70%), tell user they're NOT able to steal & return False


Create function enemyLoseHealth that will return the newEnemyHealth.
There are 2 arguments: playerChoice, enemy

Create a function playerLoseHealth that returns the newPlayerHealth.
There are 2 arguments: playerHealth, enemy

Create a function called isPlayerAlive that will return true or false. needs one argument: playerHealth.

Create a function called gameLevel that gets user input, enemy loses health, player loses health, and finally will return playerHealth. This function needs two arguments: enemy, playerHealth

The main function is already completed for you.

## Tests

|Test|Expected Output|
|--|--|
|rollDice(0)| 0 |
|rollDice(1)| Only returns 1 - 6 |
|rollDice(2)| Only returns 2 - 12 |
|rollDice(10)| Only returns 10 - 60 |
|x = makeEnemy("Shrek",10,20)<br>x['power']|10|
|x = makeEnemy("Donkey",50,60)<br>x['health']|60|
|x = makeEnemy("Fiona",70,77)<br>x['name']|"Fiona"|
|x = makeEnemy("Fiona",70,77)<br>x['weakness']|Only returns 1 - 3|
|validInput(0)| False |
|validInput(1)| True |
|validInput(9)| True |
|validInput("3")| True |
|validInput(5)| False |
|validInput("one")| False |
|tryToSteal()| 30% True, 70% False |
|x = makeEnemy("x",1,200)<br>enemyLoseHealth(5,x)|Only returns 188 - 198|
|x = makeEnemy("x",1,200)<br>x['weakness'] = 2<br>enemyLoseHealth(2,x)|Only returns 182 - 197|
|x = makeEnemy("x",50,60)<br>playerLoseHealth(100,x)|Only returns 50 - 99|
|isPlayerAlive(-1)|False|
|isPlayerAlive(0)|False|
|isPlayerAlive(1)|True|

-------

GOLD MEDAL: Add 2 or more of the following details...
  - You have a one-time-use healing potion that restores the player to full health.
  - Each treasure is a new weapon that you can use in later castles.
  - You have a one-time-use magic spell that reduces one creature's health by half.
  - Add more weapons and each creature has a weakness to a specific weapon that inflicts double-damage. Don't make it obvious: ice dragon's weakness is fire sword. Less obvious and better would be: the minotaur's weakness is lightning spear, the manticore's weakness is ice dagger, and Medusa's weakness is the earth staff.


-------

Tests
```
self.assertEqual(isPlayerAlive(-1), False)
self.assertEqual(isPlayerAlive(0), False)
self.assertEqual(isPlayerAlive(1), True)

x = makeEnemy("x",50,60)
for i in range(100):
  self.assertEqual(50<=playerLoseHealth(100,x)<=99, True)
  self.assertEqual(0<=playerLoseHealth(50,x)<=49, True)

x = makeEnemy("x",1,200)
x['weakness'] = 2
#enemyLoseHealth(2,x)|Only returns 182 - 197
for i in range(100):
  self.assertEqual(182<=enemyLoseHealth(2,x)<=197, True)
  self.assertEqual(188<=enemyLoseHealth(5,x)<=198, True)

wins = 0
fails = 0
for i in range(100):
  if tryToSteal():
    wins += 1
  else:
    fails += 1
self.assertEqual(10 <= wins <= 50 and 50 <= fails <= 90, 1)

self.assertEqual(validInput(0), False)
self.assertEqual(validInput(1), True)
self.assertEqual(validInput(9), True)
self.assertEqual(validInput("3"), True)
self.assertEqual(validInput(5), False)
self.assertEqual(validInput("one"), False)

x1 = makeEnemy("Shrek",10,20)
self.assertEqual(x1['power'], 10)
x2 = makeEnemy("Donkey",50,60)
self.assertEqual(x2['health'], 60)
x3 = makeEnemy("Fiona",70,77)
self.assertEqual(x3['name'], "Fiona")
for i in range(10):
  self.assertEqual(1<=x3['weakness']<=3, True)

for i in range(100):
    self.assertEqual(rollDice(0), 0)
    self.assertEqual(1<=rollDice(1)<=6, True)
    self.assertEqual(2<=rollDice(2)<=12, True)
    self.assertEqual(10<=rollDice(10)<=60, True)
```
