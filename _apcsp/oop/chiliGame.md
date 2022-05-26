---
layout: project
category: oop
title: Chili Cook-off Game
---



Scoville heat units, also known as SHU, are a measure of the spiciness or heat of peppers. In this game, players try to cook a bowl of chili that is closest to their goal (mild chili 7000 SHU, medium 14000 SHU, or spicy 28000 SHU) without going over. After each chili bowl is cooked, the chef will get a grade from 0% to 100%. Highest grade wins the round. If you win a round, you move on to a harder goal, otherwise you keep your current goal.

newPlayer() function prompts user for name, then returns a dictionary with the following keys
- name
- heatGoal = 7000
- numBanana
- numPoblano
- numJalapeno
- chiliScore
- chefGrade

validInteger( userinput ) function returns True or False. Requires userinput argument. Returns true if a number 0 to 5

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
def takeYourTurn(playerDictionary):
  promptUser(playerDictionary)
  playerDictionary["chiliScore"] = calculateChiliScore(playerDictionary)
  playerDictionary["chefGrade"] = getChefGrade(playerDictionary, playerDictionary["heatGoal"], playerDictionary["chiliScore"]

# You will need to use the colorama module to make the
# text print in red, green, or white
# Colorama documentation: https://pypi.org/project/colorama/
def main():
  roundNumber = 1
  # print in red
  print("Player 1:")
  p1Dictionary = newPlayer()
  # print in green
  print("Player 2:")
  p2Dictionary = newPlayer()
  while True:
    # print in white
    print("----- Round " + str(roundNumber) + " -----")
    # print in red player 1's name and then player 1's heat goal
    print(p1Dictionary["name"])
    time.sleep(1)
    # print in red
    print("Your goal = " + str(p1Dictionary["heatGoal"]))
    time.sleep(1)
    takeYourTurn(p1Dictionary)
    # print in green player 2's name and then player 2's heat goal
    print(p2Dictionary["name"])
    time.sleep(1)
    # print in green
    print("Your goal = " + str(p2Dictionary["heatGoal"]))
    time.sleep(1)
    takeYourTurn(p2Dictionary)
    # print in white
    print("----- Results -----")
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




tests:
```
for i in range(100):
    self.assertEquals(70.704<=getChefGrade( 7000, 5000 )<=71.725, True)
    self.assertEquals(42.74<=getChefGrade( 7000, 8000 )<=43.76, True)
    self.assertEquals(99.0<=getChefGrade( 14000, 14000 )<=100.0, True)
    self.assertEquals(48.986<=getChefGrade( 14000, 14001 )<=50.999, True)

self.assertEquals(calculateChiliScore( {'numBanana':0, 'numPoblano':0, 'numJalapeno':0} ), 0)
 for i in range(100):
   self.assertEquals(3500<=calculateChiliScore( {'numBanana':1, 'numPoblano':1, 'numJalapeno':1} )<=10500, True)
   self.assertEquals(35000<=calculateChiliScore( {'numBanana':10, 'numPoblano':10, 'numJalapeno':10} )<=105000, True)

for i in range(100):
  self.assertEquals(2500<=jalapenoPepper()<=8000, True)

for i in range(100):
    self.assertEquals(1000<=poblanoPepper()<=2000, True)

for i in range(100):
  self.assertEquals(0<=bananaPepper()<=500, True)

self.assertEquals(validInteger(0), True)
self.assertEquals(validInteger("5"), True)
self.assertEquals(validInteger("two"), False)
self.assertEquals(validInteger(-1), False)
self.assertEquals(validInteger(6), False)
self.assertEquals(validInteger(99), False)


```
