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

calculateChiliScore( playerDictionary ) returns an int. uses the numBanana, numPoblano, numJalapeno keys along with the random Scoville functions above to calculate a chili score. Set the playerDictionary's chiliScore and then return the chili score.

setChefGrade( playerDictionary, heatGoal, chiliScore ) returns a decimal number from 0.0 to 100.0.
if the chiliScore is less than the heatGoal, set the playerDictionary's chefGrade to be chiliScore x 99 / heatGoal + random(), then return the chefGrade.
if the chiliScore is greater than the heatGoal, set the playerDictionary's chefGrade to be heatGoal x 50 / chiliScore - random(), then return the chefGrade.
if the chiliScore equals the heatGoal, set the playerDictionary's chefGrade to be 99 + random(), then return the chefGrade.

getRoundResults( p1Dictionary , p2Dictionary ) returns a string. The players' chef grades are compared. the winning player's Heat Goal gets doubled, then the function returns "[insert player's name here] Wins This Round!"

```
def main():
  roundNumber = 1
  print("Player 1:")
  p1Dictionary = newPlayer()
  print("Player 2:")
  p2Dictionary = newPlayer()
  while True:
    print("Current Round Number = " + str(roundNumber))
    # print in red player 1's name and then player 1's heat goal
    print(p1Dictionary["name"])
    time.sleep(1)
    # print in red
    print("Your goal = " + str(p1Dictionary["heatGoal"]))
    time.sleep(1)
    promptUser(p1Dictionary)
    # print in green player 2's name and then player 2's heat goal
    print(p2Dictionary["name"])
    time.sleep(1)
    # print in green
    print("Your goal = " + str(p2Dictionary["heatGoal"]))
    time.sleep(1)
    promptUser(p2Dictionary)
    # print in red the chili score for player 1
    print("Chili Score: " + str(p1Dictionary['chiliScore']))
    time.sleep(1)
    # print in red the chef grade for player 1
    print("Chef Grade: " + str(p1Dictionary["chefGrade"]))
    time.sleep(1)
    # print in green the chili score for player 2
    print("Chili Score: " + str(p2Dictionary['chiliScore']))
    time.sleep(1)
    # print in green the chef grade for player 2
    print("Chef Grade: " + str(p2Dictionary["chefGrade"]))
    time.sleep(1)
    # print this round's results in white
    print(getRoundResults(p1Dictionary, p2Dictionary))
    time.sleep(1)
    roundNumber += 1
    if p1Dictionary["heatGoal"] > 50000:
        # print in red
        print(p1Dictionary["name"] + " wins the game!")
        break
    elif p2Dictionary["heatGoal"] > 50000:
        # print in green
        print(p2Dictionary["name"] + " wins the game!")
        break
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
