---
layout: project
category: oop
title: Virtual Pet Game
---

We will create a game based on taking care of pets. In order to make this game interesting, you can't tell if a pet is hungry or thirsty or wants to play... you can only see if they are happy or not happy. The player will need to guess what the pet needs to make them happy.


### Part 1

Define a getPetList function with no arguments. Returns a list that contains 4 Pet objects.

Define an updateScore function, requires 2 arguments: score, petList. Returns the updated score.
for each in petList
    - if each isHappy, then score plus 1, else score minus 1
if all pets are happy, then add 3 bonus points to the score
return the score

Define an isGameOver function, requires 1 argument: score. If score is greater than 100, then print you win and return True. If score is less than 0, then print game over and return True. Otherwise return False.

Call the main() function to play the 1-player version.

### Part 2

After playing the 1-player version, create a Player class.
Each player should have a unique list of pets. What other attributes will be unique for each player? Can you add colorama background colors so that it's clear which player is currently taking a turn?
What can each player "do"? Inside you player class you will want to define methods for updateScore and takeATurn

Define an isMultiplayerGameOver(currentPlayer) function.
If the currentPlayer's score is 100 or more then print the currentPlayer's name Wins! and return True.
If the currentPlayer's score is 0 or less then print the currentPlayer's name Loses! All Other Players Win! and return True.
Otherwise return False.

Call the main2() function to play the multiplayer version.


main.py
```
from Pet import *
import time

# Define a getPetList function with no arguments. Returns a list that contains 4 Pet objects.



# Define an updateScore function, requires 2 arguments: score, petList. Returns the updated score.
# for each in petList
#     - if each isHappy, then score plus 1, else score minus 1
# if all pets are happy, then add 3 bonus points to the score
# return the score



# Define an isGameOver function, requires 1 argument: score. If score is greater than 100, then print you win and return True. If score is less than 0, then print game over and return True. Otherwise return False.



# * * * Part 2. After playing the 1-player version, create a Player class.
# * * * Each player should have a unique list of pets. What other attributes will be unique for each player? Can you add colorama background colors so that it's clear which player is currently taking a turn?
# * * * What can each player "do"? Inside you player class you will want to define methods for updateScore and takeATurn
# * * * Define an isMultiplayerGameOver(currentPlayer) function.
# * * * If the currentPlayer's score is 100 or more then print the currentPlayer's name Wins! and return True.
# * * * If the currentPlayer's score is 0 or less then print the currentPlayer's name Loses! All Other Players Win! and return True.
# * * * Otherwise return False.
# * * * Call the main2() function to play the multiplayer version.



def doOneTurn(speed,score,petList):
    print(" = = = = = = = = = = = = = = = = = = = = ")
    time.sleep(speed)
    print("Pets = ")
    time.sleep(speed)
    for i in range(len(petList)):
      petList[i].clockTick()
      print("   "+str(i) + " : " + str(petList[i]))
      time.sleep(speed)
    print("Score = ")
    time.sleep(speed)
    score = updateScore(score,petList)
    print(score)
    time.sleep(speed)
    if isGameOver(score):
      return score
    userinput = input("Select a pet # 0-"+str(len(petList)-1)+": ")
    try:
      userinput = int(userinput)
      if userinput < 0 or userinput > len(petList)-1:
        print("ERROR")
        time.sleep(speed)
        userinput = 0
    except:
      print("ERROR")
      time.sleep(speed)
      userinput = 0
    print(" . . . . . . . . . . . . . . . . . . . . ")
    time.sleep(speed)
    print(str(petList[userinput]))
    time.sleep(speed)
    selectedAction = input("Type p = play, f = give food, w = give water: ")
    if selectedAction.lower() == "p":
      petList[userinput].addPlaytime()
    elif selectedAction.lower() == "f":
      petList[userinput].addFood()
    elif selectedAction.lower() == "w":
      petList[userinput].addWater()
    print(str(petList[userinput]))
    time.sleep(speed)
    return score



def main():
  score = 50
  speed = 0.2
  petList = []
  petList = getPetList()
  for each in ["* * * * * * Virtual Pet Game * * * * * *",",-.___,-.","\\_/_ _\\_/","  )O_O("," { (_) }","  `-^-'"]:
    print(each)
    time.sleep(speed)
  while True:
    score = doOneTurn(speed,score,petList)
    if isGameOver(score):
      break



def main2():
  speed = 0.2
  playerCount = 0
  playerList = []
  gameover = False
  while True:
      userInput = input("How Many Players: ")
      try:
        playerCount = int(userInput)
        break
      except:
          print("Invalid Response")
  for i in range(playerCount):
      p = Player()
      p.name = input("Name: ")
      p.pets = getPetList()
      p.score = 50
      playerList.append(p)
  for each in ["* * * * * * Virtual Pet Game MULTIPLAYER * * * * * *",",-.___,-.","\\_/_ _\\_/","  )O_O("," { (_) }","  `-^-'"]:
    print(each)
    time.sleep(speed)
  while not gameover:
    for player in playerList:
      print(" = = = = = = = = = = = = = = = = = = = = ")
      print(player.color + "Current Player = " + player.name)
      player.score = doOneTurn(speed, player.score, player.pets)
      gameover = isMultiplayerGameOver(player):
      if gameover:
        break

```



tests:
```
y = Pet()
y.hungerLevel = 50
y.boredomLevel = 60
y.thirstLevel = 70
y.addFood()
self.assertTrue(y.hungerLevel < 50)
y.addPlaytime()
self.assertTrue(y.boredomLevel < 60)
y.addWater()
self.assertTrue(y.thirstLevel < 70)


y = Pet()
y.hungerLevel = 0
y.boredomLevel = 0
y.thirstLevel = 0
self.assertTrue(y.isHappy())
x = Pet()
x.hungerLevel = 51
x.boredomLevel = 51
x.thirstLevel = 51
self.assertFalse(x.isHappy())


x = Pet()
totalA = x.hungerLevel
totalA += x.boredomLevel
totalA += x.thirstLevel
x.clockTick()
totalB = x.hungerLevel
totalB += x.boredomLevel
totalB += x.thirstLevel
self.assertTrue(totalA < totalB)


x = Pet()
self.assertTrue(x.name.lower() in str(x).lower())
self.assertTrue("happy".lower() in str(x).lower())


x = Pet()
self.assertTrue(0<=x.hungerLevel<=100)
self.assertTrue(0<=x.thirstLevel<=100)
self.assertTrue(0<=x.boredomLevel<=100)
self.assertTrue(type(x.name) is type("ljks"))
self.assertTrue(type(x.emoji) is type("ljks"))


self.assertTrue(isGameOver(-1))
self.assertEqual(isGameOver(1), False)
self.assertTrue(isGameOver(101))
self.assertEqual(isGameOver(99), False)


x = Pet()
x.hungerLevel = 99
# 4 unhappy -> 46
self.assertEqual(updateScore(50, [x,x,x,x]), 46)


y = Pet()
y.hungerLevel = 0
y.boredomLevel = 0
y.thirstLevel = 0
# 4 happy -> 57
self.assertEqual(updateScore(50, [y,y,y,y]), 57)


arr = getPetList()
self.assertEqual(len(arr), 4)
x = Pet()
for each in arr:
  self.assertTrue(type(each) is type(x) )


# check if isMultiplayerGameOver exists
try:
  isMultiplayerGameOver
except:
  self.assertTrue(False)
else:
  self.assertTrue(True)
```
