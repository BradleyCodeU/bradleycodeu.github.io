---
layout: project
category: oop
title: Mythopoly Game
---

Concepts: creating Python classes, the toString method

In this project we are simulating a board game with a Player class and a Property class.

You will have 4 files: Player.py, Property.py, MythopolyGame.py, and Test_MythopolyGame.py

Write the Player class and Property class. Complete the first 5 functions for the MythopolyGame. Test and play the game.

Player.py
```
from random import *
from colorama import Back

# In Player.py, create a Player class. Each Player object has the following attributes…
# name (set to None at first)
# money (starts at 1500)
# location (starts at 0)
# assets (an empty list)
# color = a random choice from this list [Back.RED, Back.GREEN, Back.YELLOW, Back.BLUE, Back.MAGENTA, Back.CYAN]
# one other attribute! ask Mr. Riley what other attribute you should add for the Player class

# Inside of the Player class, define a __str__(self) method that returns a String. Players do NOT have x,y coordinates. If we HAD an x and y location for every player, then for the str function we MIGHT do something like this…
# def __str__ (self):
#         return "Name= " + self.name +  ", x= " + str(self.x) + ", y= " + str(self.y)


```

Property.py
```
from random import *

# In Property.py, create a Property class. Each Property object has the following attributes…
# name (set to None at first)
# price (random)
# rent (must be 5% of purchase price)
# houses (starts at 0)
# hotels (starts at 0)
# owner (set to None at first)
# one other attribute! ask Mr. Riley what other attribute you should add for the Property class

# Inside of the Property class, define a __str__(self) method that returns a String. Properties do NOT have x,y coordinates. If we HAD an x and y location for every property, then for the str function we MIGHT do something like this…
# def __str__ (self):
#         return "Name= " + self.name +  ", x= " + str(self.x) + ", y= " + str(self.y)
```


MythopolyGame.py
```
from Player import *
from Property import *
from random import *
from colorama import Back
import time

# Mythopoly Game

sleepSpeed = 0.3

# Create a rollTwoDice function that requires no parameters. 
# Returns a random number from 2 to 12. Get a random int 1 to 6 + a random int 1 to 6.
# Rolls two 6-sided dice and returns their sum
# Parameters: None
# Return: int (2–12)



# Create a validNumber function that requires 1 argument userInput. 
# Returns true if userInput is an integer number greater than 0. Otherwise returns false.
# Checks if user input is a valid positive integer
# Parameters: userInput (str)
# Return: bool (True if positive int, False otherwise)



# Create an addPlayers function with no parameters. 
# It returns a playerList that contains Player objects.
# Prompts the user to enter how many players are playing, then gathers their names
# Parameters: None 
# Return: list of Player objects
# First, create an empty playerList.
# Ask the user How Many Players? and collect their input. Check that it is a validNumber. 
# Create a for loop and repeat as many times as they wanted:
# # 1. Construct a Player object and store it in a variable named temp.
# # 2. Ask the user to Enter Player Name:
# # 3. Set temp.name to be the name they typed.
# # 4. Append temp to the playerList
# Finally, return the playerList.



# Create a bankrupt function with 2 parameters: player, removals.
# Declares a player bankrupt and removes them from the game
# Parameters: player (Player), removals (list of Player)
# Return: the list of removals
# Print player's name is bankrupt
# Brief pause
# Print player's name is out of the game
print(player.name + " is out of the game!")
# Brief pause 
# Add the player to the list of players to be removed
# Return the updated list of players to be removed



# Create a checkForWinner function with 2 parameters: players, removals. 
# Checks if the game is over.
# Parameters: players (list of Player), removals (list of Player)
# Return: bool (True if one player remains)
# If the length of players minus the length of removals is 1, then return true. Otherwise return false.



# addProperties makes a list of Property objects with names assigned
# Parameters: None
# Return: list of Property objects
def addProperties():
    properties = []
    for each in [
            "Olympus", "Asgard", "El Dorado", "Atlantis", "Duloc",
            "Sherwood Forest", "Emerald City", "Valhalla", "Camelot", "Xanadu",
            "Neverland", "Shangri-La", "Elysium", "Arcadia"
    ]:
        temp = Property()
        temp.name = each
        properties.append(temp)
    return properties

# buyProperty allows the player to buy an unowned property if they have enough money
# Parameters: thisPlace (Property), player (Player)
# Return: None
def buyProperty(thisPlace, player):
    if player.money < thisPlace.price:
        return
    if input("Do you wanna buy " + thisPlace.name + " for $"+str(thisPlace.price)
             +"? y or n: ").lower() == "y":
        if player.money >= thisPlace.price:
            # # # # update owner for this property
            thisPlace.owner = player
            player.assets.append(thisPlace.name)
            player.money = player.money - thisPlace.price
            print(player.name + " owns " + thisPlace.name)
            time.sleep(sleepSpeed)
            print(player.name + " can buy houses/hotels on next visit to " +
                  thisPlace.name)
            time.sleep(sleepSpeed)
        else:
            print(" :-( Not enough money! :-( ")
            time.sleep(sleepSpeed)

# upgradeProperty allows the player to upgrade a property they own by building a house or hotel
# Parameters: thisPlace (Property), player (Player), housePrice (int), hotelPrice (int)
# Return: None
def upgradeProperty(thisPlace, player, housePrice, hotelPrice):
    building = ["hotel","house"][thisPlace.houses < 4]
    buildingPrice = [hotelPrice,housePrice][thisPlace.houses < 4]
    buildingBonus = [3,2][thisPlace.houses < 4]
    if player.money < buildingPrice:
        return
    if input("Build 1 " + building + " for $" + str(buildingPrice) + " (rent x" +
             str(buildingBonus) + "!), y or n: ").lower() == "y":
        if player.money >= buildingPrice:
            thisPlace.houses += thisPlace.houses < 4
            thisPlace.hotels += thisPlace.houses >= 4
            thisPlace.price = thisPlace.price + buildingPrice
            player.money = player.money - buildingPrice
            print(" +1 " + building + ", -$" + str(buildingPrice))
            time.sleep(sleepSpeed)
            oldRent = thisPlace.rent
            thisPlace.rent = thisPlace.rent * buildingBonus
            print(thisPlace.name + " rent increased from " + str(oldRent) +
                  " to " + str(thisPlace.rent) + "!")
            time.sleep(sleepSpeed)
            if player.money < buildingPrice:
                return
            if input("You have $" + str(player.money) +
                     " remaining. Build more? y or n: ").lower() == "y":
                upgradeProperty(thisPlace, player, housePrice, hotelPrice)
        else:
            print(" :-( Not enough money! :-( ")
            time.sleep(sleepSpeed)

# liquidateProperty forces the player to sell one property back to the bank at 50% value
# Parameters: player (Player), properties (list of Property), housePrice (int), hotelPrice (int)
# Return: None
def liquidateProperty(player, properties, housePrice, hotelPrice):
    forSale = player.assets.pop()
    print(forSale + " MUST be sold back to the bank.")
    time.sleep(sleepSpeed)
    prop = None
    for prop in properties:
        if prop.name == forSale:
            break
    propSale = prop.price * 0.5
    print(" +$" + str(propSale) + " from property sale.")
    time.sleep(sleepSpeed)
    player.money = player.money + propSale
    prop.owner = None

# Handles the process of paying rent to another player, including liquidation if needed
# Parameters: thisPlace (Property), player (Player), properties (list of Property), removals (list of Player), housePrice (int), hotelPrice (int)
# Return: None
def payRent(thisPlace, player, properties, removals, housePrice, hotelPrice):
    owner = thisPlace.owner
    if player.money >= thisPlace.rent:
        player.money = player.money - thisPlace.rent
        print(player.name + " -$" + str(thisPlace.rent))
        time.sleep(sleepSpeed)
        owner.money = owner.money + thisPlace.rent
        print(owner.name + " +$" + str(thisPlace.rent))
        time.sleep(sleepSpeed)
    else:
        print(" :-( Not enough money! :-( ")
        time.sleep(sleepSpeed)
        if len(player.assets) > 0:
            liquidateProperty(player, properties, housePrice, hotelPrice)
            payRent(thisPlace, player, properties, removals, housePrice,
                    hotelPrice)
        else:
            # all remaining money goes to owner
            print(player.name + " -$" + str(player.money))
            time.sleep(sleepSpeed)
            owner.money = owner.money + player.money
            print(owner.name + " +$" + str(player.money))
            time.sleep(sleepSpeed)
            bankrupt(player, removals)

# Sets up the game by initializing properties and players
# Parameters: None
# Return: tuple (list of Properties, list of Players)
def setupGame():
    properties = addProperties()
    players = addPlayers()
    return (properties, players)

# Handles a single player's turn
# Parameters: player (Player), properties (list of Property), removals (list of Player), housePrice (int), hotelPrice (int)
# Return: None
def takeTurn(player, properties, removals, housePrice, hotelPrice):
    print(player.color)
    time.sleep(sleepSpeed)
    line = (choice(["-", "_", "+", "=", "*", "~", " "]) + choice(
        ["-", "_", "+", "=", "*", "~", " "])) * randint(5, 9)
    print(line + " " + player.name + "'s Turn " + line)
    time.sleep(sleepSpeed)
    print(player)
    time.sleep(sleepSpeed)
    input("Press ENTER to roll the dice:")
    dice = rollTwoDice()
    print(dice)
    time.sleep(sleepSpeed)
    # move player
    player.location = player.location + dice
    # if player is at the end of the board
    if player.location >= len(properties):
        print(player.name + " passes GO. +$200")
        time.sleep(sleepSpeed)
        player.money = player.money + 200
        print(player)
        time.sleep(sleepSpeed)
        # wrap around to the beginning of the board
        player.location = player.location % len(properties)
    thisPlace = properties[player.location]
    # # print the property at array index location propertyNumber
    print(player.name + " visits " + thisPlace.name)
    time.sleep(sleepSpeed)
    print(thisPlace)
    time.sleep(sleepSpeed)
    # # if owner's name is None:
    if thisPlace.owner == None:
        buyProperty(thisPlace, player)
    # if you are the owner and you are visiting 2nd time
    elif thisPlace.owner == player:
        upgradeProperty(thisPlace, player, housePrice, hotelPrice)
    # # if owner's name is not None and you are not the owner:
    elif thisPlace.owner != None:
        payRent(thisPlace, player, properties, removals, housePrice,
                hotelPrice)

def main():
    hotelPrice = 300
    housePrice = 100
    properties, players = setupGame()
    removals = []
    while True:
        for player in players:
            if checkForWinner(players, removals):
                print("* * * * * We have a winner! * * * * *")
                time.sleep(sleepSpeed)
                break
            takeTurn(player, properties, removals, housePrice, hotelPrice)
        # remove bankrupt players
        for each in removals:
            players.remove(each)
        removals = []
        if len(players) == 1:
            print("")
            time.sleep(sleepSpeed)
            break
    print(players[0].name + " wins!")

```


Test_MythopolyGame.py
```
import unittest
from unittest.mock import patch
import Mythopoly
from Player import Player
from Property import Property
from colorama import Back

# === Test Class ===
class AutomaticTester(unittest.TestCase):
    def test_player_initial_values(self):
        player = Player()
        self.assertIsNone(player.name, "Player name should be None by default")
        self.assertEqual(player.money, 1500, "Player should start with $1500")
        self.assertEqual(player.location, 0, "Player should start at location 0")
        self.assertEqual(player.assets, [], "Player should start with no assets")
        self.assertIn(player.color, [Back.RED, Back.GREEN, Back.YELLOW, Back.BLUE, Back.MAGENTA, Back.CYAN],
                      "Player color should be a valid background color")

    def test_player_str_representation(self):
        player = Player()
        player.name = "Zeus"
        self.assertTrue("Zeus" in str(player) and "1500" in str(player) and "[]" in str(player), "__str__ output is incorrect")
        player2 = Player()
        player2.name = "Amy"
        self.assertTrue("Amy" in str(player2) and "1500" in str(player2) and "[]" in str(player2), "__str__ output is incorrect")
    
    def test_property_initial_values(self):
        prop = Property()
        self.assertIsNone(prop.name, "Property name should be None by default")
        self.assertIsInstance(prop.price, int, "Property price should be an integer")
        self.assertEqual(prop.rent, int(prop.price * 0.05), "Rent should be 5% of price")
        self.assertEqual(prop.houses, 0, "Property should start with 0 houses")
        self.assertEqual(prop.hotels, 0, "Property should start with 0 hotels")
        self.assertIsNone(prop.owner, "Property owner should be None")

    def test_property_str_representation(self):
        prop = Property()
        prop.name = "Atlantis"
        #expected = f"Name= Atlantis"
        self.assertTrue("Atlantis" in str(prop), "__str__ output should include property name")
        prop.name = "Qwerty"
        self.assertTrue("Qwerty" in str(prop), "__str__ output should include property name")

    def test_rollTwoDice_range(self):
        for _ in range(100):
            result = Mythopoly.rollTwoDice()
            self.assertIn(result, range(2, 13), "Dice roll must be between 2 and 12")

    def test_validNumber(self):
        self.assertTrue(Mythopoly.validNumber("1"), "Should return True for '1'")
        self.assertTrue(Mythopoly.validNumber("100"), "Should return True for '100'")
        self.assertFalse(Mythopoly.validNumber("0"), "Should return False for '0'")
        self.assertFalse(Mythopoly.validNumber("-5"), "Should return False for negative numbers")
        self.assertFalse(Mythopoly.validNumber("abc"), "Should return False for non-numeric string")
        self.assertFalse(Mythopoly.validNumber("3.14"), "Should return False for floats")

    @patch("builtins.input", side_effect=["2", "Alice", "Bob"])
    def test_addPlayers_valid(self, mock_input):
        players = Mythopoly.addPlayers()
        self.assertEqual(len(players), 2, "Should return 2 players")
        self.assertIsInstance(players[0], Player)
        self.assertEqual(players[0].name, "Alice")
        self.assertEqual(players[1].name, "Bob")

    @patch("builtins.input", side_effect=["notanumber", "0", "3", "Zeus", "Hera", "Apollo"])
    def test_addPlayers_invalid_then_valid(self, mock_input):
        # Expect retries until a valid number is entered
        players = Mythopoly.addPlayers()
        self.assertEqual(len(players), 3)
        self.assertEqual(players[0].name, "Zeus")
        self.assertEqual(players[1].name, "Hera")
        self.assertEqual(players[2].name, "Apollo")

    @patch("time.sleep", return_value=None)
    def test_bankrupt(self, mock_sleep):
        removals = []
        player = Player()
        player.name = "Hermes"
        updated_removals = Mythopoly.bankrupt(player, removals)
        self.assertIn(player, updated_removals)
        self.assertEqual(len(updated_removals), 1)
        self.assertEqual(updated_removals[0].name, "Hermes")

    def test_checkForWinner(self):
        # Setup players and removals
        player1 = Player()
        player2 = Player()
        player3 = Player()
        all_players = [player1, player2, player3]

        # 2 bankrupt
        removals = [player1, player2]
        self.assertTrue(Mythopoly.checkForWinner(all_players, removals),
                        "Should return True when only 1 player remains")

        # only 1 bankrupt
        removals = [player1]
        self.assertFalse(Mythopoly.checkForWinner(all_players, removals),
                         "Should return False when more than 1 player remains")

        # no bankrupt
        removals = []
        self.assertFalse(Mythopoly.checkForWinner(all_players, removals),
                         "Should return False when all players are still in")

# CustomTestResult version 240225
class CustomTestResultV240225(unittest.TextTestResult):
    def __init__(self, stream, descriptions, verbosity):
        super().__init__(stream, descriptions, verbosity)
        self.stream = stream
        self.verbosity = verbosity
        self.success_count = 0
        self.failure_count = 0
        self.error_count = 0

    def addSuccess(self, test):
        self.success_count += 1
        if self.verbosity > 0:
            self.stream.write("✅  ")
        else:
            super().addSuccess(test)
        self.stream.writeln(test._testMethodName)

    def addFailure(self, test, err):
        super().addFailure(test, err)
        self.failure_count += 1
        self.stream.write("❌ ")
        self.stream.writeln(f"{test._testMethodName}")

    def addError(self, test, err):  # Define addError method
        super().addError(test, err)
        self.error_count += 1
        self.stream.write("🐝 ")
        self.stream.writeln(f"{test._testMethodName}")

    def startTestRun(self):
        super().startTestRun()
        self.success_count = 0
        self.failure_count = 0
        self.error_count = 0

    def stopTestRun(self):
        super().stopTestRun()
        total_failures = self.failure_count + self.error_count
        if total_failures > 0:
            self.stream.writeln(
                f"❌  {self.success_count}/{self.success_count + total_failures} passed, see failures and errors"
            )
        else:
            self.stream.writeln(
                f"✅  {self.success_count}/{self.success_count + total_failures} passed!"
            )

if __name__ == "__main__":
    result = unittest.TextTestRunner(resultclass=CustomTestResultV240225, verbosity=1).run(
        unittest.TestLoader().loadTestsFromTestCase(AutomaticTester)
    )
    if result.failures or result.errors:
        failed_test_names = [test._testMethodName for test, _ in result.failures]
        error_test_names = [test._testMethodName for test, _ in result.errors]
        for each in failed_test_names:
            print(f"❌  {each}")
        for each in error_test_names:
            print(f"🐝  {each}")
        print()
    else:
        print("✅"*result.success_count + "  All tests passed!\n")
```
