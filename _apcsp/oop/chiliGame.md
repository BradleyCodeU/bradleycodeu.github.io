---
layout: project
category: oop
title: Chili Cook-off Game
---

Chili Cook-off Game

Scoville heat units, also known as SHU, are a measure of the spiciness or heat of peppers. In this game, players try to cook a bowl of chili that is closest to their goal (mild chili 7000 SHU, medium 14000 SHU, or spicy 28000 SHU) without going over. After each chili bowl is cooked, the chef will get a grade from 0% to 100%. Highest grade wins the round. If you win a round, you move on to a harder goal, otherwise you keep your current goal.

newPlayer() function prompts user for name, then returns a dictionary with the following keys
- name
- heatGoal = 7000
- numBanana
- numPoblano
- numJalapeno
- chiliScore
- chefGrade

validInteger( userinput ) function. Requires userinput argument. Returns true if a number 0 to 5

promptUser( playerDictionary ) returns nothing. Updates the player dictionary with new amounts of each pepper. Use the validInteger function to determine if the input is valid. Ask how many banana peppers (0-5), then how many poblano peppers (0-5), then how many jalapeno peppers (0-5).

bananaPepper() returns a Scoville Heat Scale number 0 to 500 using a normal distribution (aka a bell curve). Get a random number from 0 to 250, then add another random number from 0 to 250, and return the result.

poblanoPepper() returns a Scoville Heat Scale number 1000 to 2000. Get a random number from 500 to 1000, then add another random number from 500 to 1000, and return the result.

jalapenoPepper() returns a Scoville Heat Scale number 2500 to 8000. Get a random number from 1250 to 4000, then add another random number from 1250 to 4000, and return the result.

calculateChiliScore( playerDictionary ) returns an int. uses the numBanana, numPoblano, numJalapeno keys with the random Scoville functions and returns a total chili score.

getChefGrade( heatGoal, chiliScore ) returns a decimal number from 0.0 to 100.0.
if the chiliScore is less than the heatGoal, return chiliScore x 99 / heatGoal + random().
if the chiliScore is greater than the heatGoal, return heatGoal x 50 / chiliScore - random().
if the chiliScore equals the heatGoal, return 99 + random()

getRoundResults( p1Dictionary , p2Dictionary ) returns a string. The players' chef grades are compared. the winning player's Heat Goal gets doubled, then the function returns "[insert player's name here] Wins This Round!"

```
def main():
# use newPlayer to create player 1's dictionary
# use newPlayer to create player 2's dictionary
while True:
  # print the current round number
  # print player 1's name and then player 1's heat goal
  # prompt player 1 for peppers
  # print player 2's name and then player 2's heat goal
  # prompt player 2 for peppers
  # calculate then print the chili score for player 1
  # calculate then print the chef grade for player 1
  # calculate then print the chili score for player 2
  # calculate then print the chef grade for player 2
  # print this round's results
  # if either players' heat goal is greater than 50000, then they win
  # # print name of the winning player Wins The Game!
  # # break
```

## Tests

|   | Expected Output |
|---|-----------------|
| validInteger(0)  | True |
| validInteger("5")  | True |
| validInteger("two")  | False |
| validInteger(-1)  | False |
| validInteger(6)  | False |
| bananaPepper()  |  Only returns 0 - 500  |
| poblanoPepper() |  Only returns 1000 - 2000 |
| jalapenoPepper() |  Only returns 2500 - 8000 |
|calculateChiliScore( {'numBanana':0, 'numPoblano':0, 'numJalapeno':0} )| 0|
|calculateChiliScore( {'numBanana':1, 'numPoblano':1, 'numJalapeno':1} )| Only returns 3500 - 10500|
|calculateChiliScore( {'numBanana':10, 'numPoblano':10, 'numJalapeno':10} )| Only returns 35000 - 105000|
|getChefGrade( 7000, 5000 )| Only returns 70.714 - 71.715 |
|getChefGrade( 7000, 8000 )| Only returns 42.75 - 43.75 |
|getChefGrade( 14000, 14000 )| Only returns 99.0 - 100.0 |
|getChefGrade( 14000, 14001 )| Only returns 48.996 - 49.996 |
|getRoundResults( {'name':'Alex', 'chefGrade':99.9}, {'name':'Steve', 'chefGrade':88.8} )| "Alex Wins This Round!" |
|getRoundResults( {'name':'Alex', 'chefGrade':0.111}, {'name':'Steve', 'chefGrade':0.999} )| "Steve Wins This Round!" |
