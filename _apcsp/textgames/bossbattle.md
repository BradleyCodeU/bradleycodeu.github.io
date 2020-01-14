---
layout: project
category: textgames
title: Boss Battle
permalink: /apcsp/textgames/bossBattle/
---
Read this article about the [random choice method](https://www.w3schools.com/python/ref_random_choice.asp)

Read this article about the [Python string lower method](https://www.w3schools.com/python/ref_string_lower.asp)

At the top of your project, add a comment with you name on line 1. Then import time on line 2.

Define a function named randomHealth that returns a random number between 30 - 50

Define a function named randomTrueFalse that returns true 50% of the time and returns false 50% of the time.

Define a function named diceRoll that returns a random number between 1 - 6

Define a function named hitBoss that requires three arguments: weapon, iceWeakness, magicWeakness.
  - Create a variable called damage and set it to zero.
  - Weapon is a string. Convert the string to lowercase.
  - If weapon contains either "sword" or "spell" then add diceRoll() to damage.
  - If iceWeakness is true and weapon contains "ice" then add diceRoll() to damage.
  - If iceWeakness is false and weapon contains "fire" then add diceRoll() to damage.
  - If magicWeakness is true and weapon contains "spell" then add diceRoll() to damage.
  - If magicWeakness is false and weapon contains "sword" then add diceRoll() to damage.
  - Print how much damage your attack does to the boss
  - Return the number of damage

Define a function named hitPlayer that require one argument: playerHealth.
  - Create a list/array of 7 enemyAttacks. For example, "Sneak Attack", "Roundhouse Kick", "Punchy Punch"
  - Randomly pick one of the enemyAttacks
  - Print a message that says which random attack the dragon uses. For example, "Dragon Uses Hair Whip" or "Dragon Uses Jump Scare"
  - Create a variable called damage and set it to zero.
  - Add diceRoll() to damage.
  - If playerHealth is greater than 25 then add another diceRoll() to damage
  - Print how much damage the dragon does to you
  - Return the number of damage

Define a function named whoWins that requires two arguments: playerHealth, bossHealth. Print a message that says who won the game.


Here is the code for the main function:
```
def main():
  playerHealth = 50
  bossHealth = randomHealth()
  iceWeakness = randomTrueFalse()
  magicWeakness = randomTrueFalse()
  while playerHealth > 0 and bossHealth > 0:
    print("The dragon has " + bossHealth + " health")
    time.sleep(1)
    print("What do you want to use?")
    print("Ice Spell")
    print("Fire Spell")
    print("Ice Sword")
    print("Fire Sword")
    weapon = input()
    time.sleep(1)
    damage = hitBoss(weapon, iceWeakness, magicWeakness)
    bossHealth = bossHealth - damage
    if bossHealth > 0:
      damage = hitPlayer(playerHealth)
      time.sleep(1)
      print("You have " + playerHealth + " remaining")
      time.sleep(1)
  whoWins(playerHealth, bossHealth)
```


Run the following tests:

|  |  |
|--|--|
|`randomHealth()` | only returns 30-50|
|`randomTrueFalse()` | returns True 50% of the time & False 50%|
|`diceRoll()` | only returns 1-6   |
|`hitBoss("ice spell",True,True)` | returns 3-18 (make sure you sometimes get >12) |
|`hitBoss("fire sword",False,False)` | returns 3-18 (make sure you sometimes get >12) |
|`hitBoss("s",False,True)` | always returns 0   |
|`hitBoss("ice",False,True)` | always returns 0   |   
|`hitBoss("ice sword",False,True)` | returns 1-6   |
|`hitBoss("fire magic",True,False` | returns 1-6   |
|`hitPlayer(50)`   |  returns 2-12 (make sure you sometimes get >6)|
|`hitPlayer(5)`   |  returns 1-6 |
|`whoWins(1,0)`   | says You Win  |
|`whoWins(0,1)`   | says You Lose  |
