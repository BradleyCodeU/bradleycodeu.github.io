---
layout: project
category: oop
title: Mythopoly Game
---

In this project we are simulating a board game with a Player class and a Property class.



main.py
```
from Player import *
from Property import *
from random import *
from colorama import Back
import time
# Mythopoly Game

# In Player.py, create a Player class. Each Player object has the following attributes…
# name (set to None at first)
# money (starts at 1500)
# location (starts at 0)
# assets (an empty list)
# color = a random choice from this list [Back.RED, Back.GREEN, Back.YELLOW, Back.BLUE, Back.MAGENTA, Back.CYAN]

# Inside of the Player class, define a __str__(self) method that returns a String. For example… if we have an x and y location for each property, then we might do something like this…
# def __str__ (self):
#         return "Name=" + self.name +  ", Money=" + str(self.money) + ", Assets=" + str(self.assets)

# In Property.py, create a Property class. Each Property object has the following attributes…
# name (set to None at first)
# price (random)
# rent (must be 5% of purchase price)
# houses (starts at 0)
# hotels (starts at 0)
# owner (set to None at first)

# Inside of the Property class, define a __str__(self) method that returns a String. For example… if we have an x and y location for every property, then we might do something like this…
# def __str__ (self):
#         return "Name= " + self.name +  ", x= " + str(self.x) + ", y= " + str(self.y)

# In main.py...

# Create a rollTwoDice function that requires no arguments. Returns a random number from 2 to 12. Get a random int 1 to 6 + a random int 1 to 6.

# Create a validNumber function that requires 1 argument userInput. Returns true if userInput is an integer number greater than 0. Otherwise returns false.

# Create an addPlayers function with no arguments. It returns a playerList that contains Player objects. First, ask the user How Many Players? and collect their input. Check if it is a validNumber. Create a for loop and repeat as many times as they wanted:
# 1. Construct a Player object and store it in a variable named temp.
# 2. Ask the user to Enter Player Name:
# 3. Set temp.name to be the name they typed.
# 4. Append temp to the playerList
# Finally, return the playerList.



def addProperties():
    mylist = []
    for each in [
            "Olympus", "Asgard", "El Dorado", "Atlantis", "Duloc",
            "Sherwood Forest", "Emerald City", "Valhalla", "Camelot", "Xanadu",
            "Neverland", "Shangri-La", "Elysium", "Arcadia"
    ]:
        temp = Property()
        temp.name = each
        mylist.append(temp)
    return mylist


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
            time.sleep(speed)
            print(player.name + " can buy houses/hotels on next visit to " +
                  thisPlace.name)
            time.sleep(speed)
        else:
            print(" :-( Not enough money! :-( ")
            time.sleep(speed)


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
            time.sleep(speed)
            oldRent = thisPlace.rent
            thisPlace.rent = thisPlace.rent * buildingBonus
            print(thisPlace.name + " rent increased from " + str(oldRent) +
                  " to " + str(thisPlace.rent) + "!")
            time.sleep(speed)
            if player.money < buildingPrice:
                return
            if input("You have $" + str(player.money) +
                     " remaining. Build more? y or n: ").lower() == "y":
                upgradeProperty(thisPlace, player, housePrice, hotelPrice)
        else:
            print(" :-( Not enough money! :-( ")
            time.sleep(speed)

def liquidateProperty(player, properties, housePrice, hotelPrice):
    forSale = player.assets.pop()
    print(forSale + " MUST be sold back to the bank.")
    time.sleep(speed)
    prop = None
    for prop in properties:
        if prop.name == forSale:
            break
    propSale = prop.price * 0.5
    print(" +$" + str(propSale) + " from property sale.")
    time.sleep(speed)
    player.money = player.money + propSale
    prop.owner = None


def bankrupt(player, removals):
    print(player.name + " IS BANKRUPT!")
    time.sleep(speed)
    print(player.name + " is out of the game!")
    time.sleep(speed)
    removals.append(player)


def payRent(thisPlace, player, properties, removals, housePrice, hotelPrice):
    owner = thisPlace.owner
    if player.money >= thisPlace.rent:
        player.money = player.money - thisPlace.rent
        print(player.name + " -$" + str(thisPlace.rent))
        time.sleep(speed)
        owner.money = owner.money + thisPlace.rent
        print(owner.name + " +$" + str(thisPlace.rent))
        time.sleep(speed)
    else:
        print(" :-( Not enough money! :-( ")
        time.sleep(speed)
        if len(player.assets) > 0:
            liquidateProperty(player, properties, housePrice, hotelPrice)
            payRent(thisPlace, player, properties, removals, housePrice,
                    hotelPrice)
        else:
            # all remaining money goes to owner
            print(player.name + " -$" + str(player.money))
            time.sleep(speed)
            owner.money = owner.money + player.money
            print(owner.name + " +$" + str(player.money))
            time.sleep(speed)
            bankrupt(player, removals)

speed = 0.3

def main():
    hotelPrice = 300
    housePrice = 100
    properties = addProperties()
    players = addPlayers()
    removals = []
    while True:
        for player in players:
            print(player.color)
            time.sleep(speed)
            if len(players) - len(removals) == 1:
                print("We have a winner!")
                time.sleep(speed)
                break
            line = (choice(["-", "_", "+", "=", "*", "~", " "]) + choice(
                ["-", "_", "+", "=", "*", "~", " "])) * randint(5, 9)
            print(line + " " + player.name + "'s Turn " + line)
            time.sleep(speed)
            print(player)
            time.sleep(speed)
            input("Press ENTER to roll the dice:")
            dice = rollTwoDice()
            print(dice)
            time.sleep(speed)
            # move player
            player.location = player.location + dice
            # if player is at the end of the board
            if player.location >= len(properties):
                print(player.name + " passes GO. +$200")
                time.sleep(speed)
                player.money = player.money + 200
                print(player)
                time.sleep(speed)
                # wrap around to the beginning of the board
                player.location = player.location % len(properties)
            thisPlace = properties[player.location]
            # # print the property at array index location propertyNumber
            print(player.name + " visits " + thisPlace.name)
            time.sleep(speed)
            print(thisPlace)
            time.sleep(speed)
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
        # remove bankrupt players
        for each in removals:
            players.remove(each)
        removals = []
        if len(players) - len(removals) == 1:
            print("")
            time.sleep(speed)
            break
    print(players[0].name + " wins!")

```


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

# Inside of the Player class, define a __str__(self) method that returns a String. For example… if we have an x and y location for each property, then we might do something like this…
# def __str__ (self):
#         return "Name=" + self.name +  ", Money=" + str(self.money) + ", Assets=" + str(self.assets)


```

Property.py
```
from random import *

# In Property.py, create a Property class. Each Property object has the following attributes…
# name
# price (random)
# rent (must be 5% of purchase price)
# houses (starts at 0)
# hotels (starts at 0)
# owner (set to None at first)

# Inside of the Property class, define a __str__(self) method that returns a String. For example… if we have an x and y location for every property, then we might do something like this…
# def __str__ (self):
#         return "Name= " + self.name +  ", x= " + str(self.x) + ", y= " + str(self.y)
```
