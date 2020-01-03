---
layout: project
category: textgames
title: Boss Battle
permalink: /apcsp/textgames/bossBattle/
---
At the top of your project, add a comment with you name on line 1. Then import time on line 2.

Define a function named randomHealth that returns a random number between 30 - 50

Define a function named randomTrueFalse that returns true 50% of the time and returns false 50% of the time.

Define a function named diceRoll that returns a random number between 1 - 6

Define a function named hitBoss that requires four arguments: weapon, iceWeakness, magicWeakness.
  - Create a variable called damage and set it to zero.
  - Weapon is a string. Convert weapon to lowercase.
  - If weapon contains either "sword" or "spell" then add diceRoll() to damage.
  - If iceWeakness is true and weapon contains "ice" then add diceRoll() to damage.
  - If iceWeakness is false and weapon contains "fire" then add diceRoll() to damage.
  - If magicWeakness is true and weapon contains "spell" then add diceRoll() to damage.
  - If magicWeakness is false and weapon contains "sword" then add diceRoll() to damage.
  - Print how much damage your attack does to the boss
  - Return the number of damage

Define a function named hitPlayer that require one argument: playerHealth.
  - Create a list/array of enemyAttacks. For example, "Sneak Attack", "Roundhouse Kick", "Punchy Punch", "Hair Whip", "Jump Scare", "Evil Slap"
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
