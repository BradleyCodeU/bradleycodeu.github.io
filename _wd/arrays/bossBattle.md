---
layout: project
category: arrays
title: Boss Battle
permalink: /wd/arrays/bossBattle/
---
In your HTML file...
- create a div and give it the id "bossHealthBox"
- create a div and give it the id "playerHealthBox"
- create a div and give it the id "playerButtons" and inside of it put four buttons:
  - create a button that says "Ice Spell" and when clicked "fight('ice spell')"
  - create a button that says "Fire Spell" and when clicked "fight('fire spell')"
  - create a button that says "Ice Sword" and when clicked "fight('ice sword')"
  - create a button that says "Fire Sword" and when clicked "fight('fire sword')"


The rest of the code will be in your JS file...

At the top, add a comment with you name.

Create variables:
  - playerHealth = 50
  - bossHealth = randomHealth()
  - iceWeakness = randomTrueFalse()
  - magicWeakness = randomTrueFalse()

Define a function named randomHealth that returns a random number between 30 - 50

Define a function named randomTrueFalse that returns true 50% of the time and returns false 50% of the time.

Define a function named diceRoll that returns a random number between 1 - 6

Define a function named hitBoss that requires one argument: weapon.
  - Create a variable called damage and set it to zero.
  - Add diceRoll() to damage.
  - If iceWeakness is true and weapon contains "ice" then add diceRoll() to damage.
  - If iceWeakness is false and weapon contains "fire" then add diceRoll() to damage.
  - If magicWeakness is true and weapon contains "spell" then add diceRoll() to damage.
  - If magicWeakness is false and weapon contains "sword" then add diceRoll() to damage.
  - Popup a message that says how much damage your attack does to the boss
  - Return the number of damage

Define a function named hitPlayer
  - Create a list/array of 7 enemyAttacks. For example, "Sneak Attack", "Roundhouse Kick", "Punchy Punch", "Hair Whip", "Jump Scare", "Evil Slap"
  - Randomly pick one of the enemyAttacks
  - Popup a message that says which random attack the dragon uses. For example, "Dragon Uses Hair Whip" or "Dragon Uses Jump Scare"
  - Create a variable called damage and set it to zero.
  - Add diceRoll() to damage.
  - If playerHealth is greater than 25 then add another diceRoll() to damage
  - Popup a message that says how much damage the dragon does to you
  - Return the number of damage

Define a function named checkForWins
  - If the player is dead
    - Popup a message that says you lose
    - use document.getElementById to hide the playerButtons div
  - If the dragon is dead
    - Popup a message that says you win
    - use document.getElementById to hide the playerButtons div


Here is the starter code for the fight function:
```
function fight(weapon){
  let damage = hitBoss(weapon);
  bossHealth = bossHealth - damage;
  # use document.getElementById to update the bossHealthBox
  if bossHealth > 0
      damage = hitPlayer();
      playerHealth = playerHealth - damage;
  # use document.getElementById to update the playerHealthBox
  checkForWins();
}
```
