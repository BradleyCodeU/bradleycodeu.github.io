---
layout: project
category: oop
title: Chili Cook-off Game
---



Scoville heat units, also known as SHU, are a measure of the spiciness or heat of peppers. In this game, players try to cook a bowl of chili that is closest to their goal (mild chili 7000 SHU, medium 14000 SHU, or spicy 28000 SHU) without going over. After each chili bowl is cooked, the chef will get a grade from 0% to 100%. Highest grade wins the round. If you win a round, you move on to a harder goal, otherwise you keep your current goal.

Here are the functions that you need to create:

newPlayer(color) function prompts the user for their name and creates a player profile using a dictionary. There is one parameter... color: A value (usually from the colorama module) that determines what color the player's text will appear in during the game. Returns a dictionary with the following keys:
- name
- heatGoal = 7000
- numBanana
- numPoblano
- numJalapeno
- chiliScore
- chefGrade
- color

validInteger( userinput ) function returns True or False. You MUST use try and except so that the program does not crash if the user types something weird. Requires userinput argument. Returns true if a number 0 to 5

getBananaPepper() returns a Scoville Heat Scale number 0 to 500 using a normal distribution (aka a bell curve). Get a random number from 0 to 250, then add another random number from 0 to 250, and return the result.

getPoblanoPepper() returns a Scoville Heat Scale number 1000 to 2000. Get a random number from 500 to 1000, then add another random number from 500 to 1000, and return the result.

getJalapenoPepper() returns a Scoville Heat Scale number 2500 to 8000. Get a random number from 1250 to 4000, then add another random number from 1250 to 4000, and return the result.

calculateChiliScore( playerDictionary ) returns an int. uses the numBanana, numPoblano, numJalapeno keys with the random get____pepper functions and returns a total chili score.

getChefGrade( heatGoal, chiliScore ) returns a decimal number from 0.0 to 100.0.
if the chiliScore is less than the heatGoal, return chiliScore x 99 / heatGoal + random().
if the chiliScore is greater than the heatGoal, return heatGoal x 50 / chiliScore - random().
if the chiliScore equals the heatGoal, return 99 + random()

getRoundResults( playerList ) returns a string. The players' chef grades are compared. the winning player's Heat Goal gets doubled, then the function returns "[insert player's name here] Wins This Round!"


STARTER CODE:
```
# NOTE: You will need to use the colorama module to make the
# text print in red, green, or white
# In the VSCode terminal run this: pip install colorama
# Colorama documentation: https://pypi.org/project/colorama/

def promptUser(playerDictionary):
    while True:
        print("Banana peppers have a Scoville Heat Unit (SHU) rating of 0 to 500 SHU")
        print("How many banana peppers (0-5) for "+ playerDictionary['name'] + "?: ")
        banana = input()
        if validInteger(banana):
            playerDictionary['numBanana'] = int(banana)
            break
        print("Invalid input, please enter a number between 0 and 5.")
    
    while True:
        print("Poblano peppers have a Scoville Heat Unit (SHU) rating of 1000 to 2000 SHU")
        print("How many poblano peppers (0-5) for "+ playerDictionary['name'] + "?: ")
        poblano = input()
        if validInteger(poblano):
            playerDictionary['numPoblano'] = int(poblano)
            break
        print("Invalid input, please enter a number between 0 and 5.")
    
    while True:
        print("Jalapeno peppers have a Scoville Heat Unit (SHU) rating of 2500 to 8000 SHU")
        print("How many jalapeno peppers (0-5) for "+ playerDictionary['name'] + "?: ")
        jalapeno = input()
        if validInteger(jalapeno):
            playerDictionary['numJalapeno'] = int(jalapeno)
            break
        print("Invalid input, please enter a number between 0 and 5.")

def takeYourTurn(playerDictionary):
    promptUser(playerDictionary)
    playerDictionary["chiliScore"] = calculateChiliScore(playerDictionary)
    playerDictionary["chefGrade"] = getChefGrade(playerDictionary["heatGoal"], playerDictionary["chiliScore"])

def displayPlayerIntro(player):
    print(player["color"] + ("-"*10) + player['name'] + ("-"*10))
    print(player["color"] + f"{player['name']}'s turn!")
    print(player["color"] + f"Your goal = {player['heatGoal']}")
    time.sleep(1)
    takeYourTurn(player)

def displayResults(player):
    print(player["color"] + f"{player['name']}'s goal was {player['heatGoal']}")
    print(player["color"] + f"Chili Score: {player['chiliScore']}")
    print(player["color"] + f"Chef Grade: {round(player['chefGrade'], 2)}")
    time.sleep(1)

def checkWinner(player):
    return player["heatGoal"] > 50000

def main():
    roundNumber = 1
    playerList = []

    print(Fore.RED + "Player 1:")
    playerList.append(newPlayer(Fore.RED))

    print(Fore.GREEN + "Player 2:")
    playerList.append(newPlayer(Fore.GREEN))

    while True:
        print(Fore.WHITE + f"----- Round {roundNumber} -----")

        # Player turns
        displayPlayerIntro(playerList[0])
        displayPlayerIntro(playerList[1])

        # Show results
        print(Fore.WHITE + "----- Results -----")
        displayResults(playerList[0])
        displayResults(playerList[1])
        print(Fore.WHITE + getRoundResults(playerList))

        # Check for winner
        if checkWinner(playerList[0]):
            print(playerList[0]["color"] + f"{playerList[0]['name']} wins the game!")
            break
        elif checkWinner(playerList[1]):
            print(playerList[1]["color"] + f"{playerList[1]['name']} wins the game!")
            break

        roundNumber += 1

if __name__ == "__main__":
    main()
```

## Tests

|   | Expected Output |
|---|-----------------|
| validInteger(0)  | True |
| validInteger("5")  | True |
| validInteger("two")  | False |
| validInteger(-1)  | False |
| validInteger(6)  | False |
| getBananaPepper()  |  Only returns 0 - 500  |
| getPoblanoPepper() |  Only returns 1000 - 2000 |
| getJalapenoPepper() |  Only returns 2500 - 8000 |
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
import unittest
import random
# === Include or import your game functions here ===
# For example... from your_game_file import *
from ChiliGame import *

# === Test Class ===
class TestChiliGame(unittest.TestCase):
    def test_validInteger(self):
        self.assertTrue(validInteger(0))
        self.assertTrue(validInteger("5"))
        self.assertFalse(validInteger("two"))
        self.assertFalse(validInteger(-1))
        self.assertFalse(validInteger(6))
        self.assertFalse(validInteger(99))

    def test_bananaPepper_range(self):
        for _ in range(100):
            self.assertTrue(0 <= getBananaPepper() <= 500)

    def test_poblanoPepper_range(self):
        for _ in range(100):
            self.assertTrue(1000 <= getPoblanoPepper() <= 2000)

    def test_jalapenoPepper_range(self):
        for _ in range(100):
            self.assertTrue(2500 <= getJalapenoPepper() <= 8000)

    def test_calculateChiliScore(self):
        self.assertEqual(calculateChiliScore({'numBanana': 0, 'numPoblano': 0, 'numJalapeno': 0}), 0)
        for _ in range(100):
            score = calculateChiliScore({'numBanana': 1, 'numPoblano': 1, 'numJalapeno': 1})
            self.assertTrue(3500 <= score <= 10500)
        for _ in range(100):
            score = calculateChiliScore({'numBanana': 10, 'numPoblano': 10, 'numJalapeno': 10})
            self.assertTrue(35000 <= score <= 105000)

    def test_getChefGrade_ranges(self):
        for _ in range(100):
            grade = getChefGrade(7000, 5000)
            self.assertTrue(70.704 <= grade <= 71.725)

            grade = getChefGrade(7000, 8000)
            self.assertTrue(42.74 <= grade <= 43.76)

            grade = getChefGrade(14000, 14000)
            self.assertTrue(99.0 <= grade <= 100.0)

            grade = getChefGrade(14000, 14001)
            self.assertTrue(48.986 <= grade <= 50.999)

    def test_getRoundResults(self):
        result1 = getRoundResults([{'name': 'Alex', 'chefGrade': 99.9, 'heatGoal': 7000},
                                  {'name': 'Steve', 'chefGrade': 88.8, 'heatGoal': 7000}])
        self.assertEqual(result1, "Alex Wins This Round!")

        result2 = getRoundResults([{'name': 'Alex', 'chefGrade': 0.111, 'heatGoal': 7000},
                                  {'name': 'Steve', 'chefGrade': 0.999, 'heatGoal': 7000}])
        self.assertEqual(result2, "Steve Wins This Round!")

if __name__ == '__main__':
    unittest.main()
```
