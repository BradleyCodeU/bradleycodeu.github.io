---
layout: project
category: oop
title: Home Run Game
---

In this project you will create a Home Run derby simulator with a BaseballPlayer class to generate multiple pitchers and multiple batters.




main.py
```
import time
from BaseballPlayer import *
from random import *
from colorama import init,Back
init(autoreset=True)

# Create a BaseballPlayer class with attributes:
# firstName (random choice from a list of 12 first names)
# nickName (random choice from a list of 12 nicknames)
# lastName(random choice from a list of 12 last names)
# pitchingStrength (1-10)
# pitchingAccuracy (1-10)
# battingStrength (1-10)
# battingAccuracy (1-10)

# Inside of the BaseballPlayer class, define a boostPitching(self) method that returns nothing. Increase self.pitchingStrength by a random amount (0.0 to 0.9999) and increase self.pitchingAccuracy by a random amount (0.0 to 0.9999).

# Inside of the BaseballPlayer class, define a boostBatting(self) method that returns nothing. Increase self.battingStrength by a random amount (0.0 to 0.9999) and increase self.battingAccuracy by a random amount (0.0 to 0.9999).

# Inside of the BaseballPlayer class, define a getPitchingGrade(self) method that returns the average of self.pitchingStrength and self.pitchingAccuracy.

# Inside of the BaseballPlayer class, define a getBattingGrade(self) method that returns the average of battingStrength and battingAccuracy.

# Inside of the BaseballPlayer class, define a getName(self) method that returns the first name + " " + nickname + " " + last name.

# Inside of the BaseballPlayer class, define a getIfGoodPitch(self) method. Returns True if self's pitch accuracy is greater than a random number 0 to 10. Otherwise, returns False.

# Inside of the BaseballPlayer class, define a getBatSwing function that requires 2 arguments: self, isGoodPitch. If isGoodPitch is True and self’s batting accuracy is greater than a random number 5-10, return True. If isGoodPitch is False and self's batting accuracy is less than a random number 0-6, return True. Otherwise, returns False.


# Inside of the BaseballPlayer class, define a __str__(self) method that returns a String.
# def __str__ (self):
#         return "Name=" + self.getName() +  ", Pitching=" + str(self.getPitchingGrade()) + ", Batting=" + str(self.getBattingGrade())

# In main.py…

# Create an addPlayers function with no arguments. Returns an array of 5 to 10 BaseballPlayer objects. Use a for i in range with a random number to repeatedly append a new BaseballPlayer() to the array.

# Create a validIndex function that requires 2 arguments: myArray, userInput. Returns True if userInput is an integer from 0 to len(myArray) - 1. Otherwise returns False

# Create a selectPlayer function that requires 1 argument: myArray. Returns a number. Ask which player the user wants. Collect input. If userInput is a validIndex, then return the userInput as an int. Otherwise, return 0.

# Create an isBallHit function that requires 2 boolean arguments: isGoodPitch and isBatSwung. Returns a String. If not isGoodPitch and not isBatSwung, then return "Ball". If isGoodPitch and not isBatSwung, then return "Strike Looking". If not isGoodPitch and isBatSwung, then return "Strike Swinging". If isGoodPitch and isBatSwung, then return "Hit".

# Create a randomDistance function that requires 2 arguments: myPitcher, myBatter. Returns a String. Find the difference between myBatter strength - myPitcher strength. Add a random number from -5 to 5 to the difference.  If the difference is less than 1, return "Foul Ball". If the difference is less than 2, return "Hit A Single". If the difference is less than 3, return "Hit A Double". If the difference is less than 4, return "Hit A Triple". Otherwise, return "Hit A Home Run".


def printPlayerList(arr,speed):
  for i in range(len(arr)):
    print(" "+str(i)+": "+str(arr[i]))
    time.sleep(speed)

def doOnePitch(game,currentPitcher,currentBatter):
  isGoodPitch = currentPitcher.getIfGoodPitch()
  if isGoodPitch:
    print(Back.BLACK + "The pitch looks good!")
  else:
    print(Back.BLACK + "A wild pitch...")
  time.sleep(game["speed"])
  isBatSwung = currentBatter.getBatSwing(isGoodPitch)
  if isBatSwung:
    print(Back.BLACK + "The batter swings!")
  else:
    print(Back.BLACK + "No swing...")
  time.sleep(game["speed"])
  result = isBallHit(isGoodPitch, isBatSwung)
  if "strike" in result.lower():
    game["numStrikes"] += 1
  if result.lower() == "hit":
    game["numHits"] += 1
    result = randomDistance(currentPitcher, currentBatter)
  print(Back.BLACK + result)
  time.sleep(game["speed"]*3)

def doOneRound(game,round):
  print(Back.YELLOW + "=*=*=*=*=*= ROUND "+str(round+1)+" =*=*=*=*=*=")
  printScoreboard(game)
  time.sleep(game["speed"])
  currentPitcher = game["pitcherArray"][game["pitcherNum"]]
  currentBatter = game["batterArray"][game["batterNum"]]
  print(Back.BLUE + currentPitcher.getName() + " is pitching")
  time.sleep(game["speed"])
  print(Back.RED + currentBatter.getName() + " is batting")
  time.sleep(game["speed"])
  for i in range(3):
    doOnePitch(game,currentPitcher,currentBatter)
  currentPitcher.boostPitching()
  currentBatter.boostBatting()
  if round < 4:
    userinput = input(Back.BLACK + "Type enter to continue, p for new pitcher, b for new batter: ")
    if userinput == "p":
      print(Back.BLUE + "Select a pitcher:")
      time.sleep(game["speed"])
      printPlayerList(game["pitcherArray"],game["speed"])
      game["pitcherNum"] = selectPlayer(game["pitcherArray"])
    if userinput == "b":
      print(Back.RED + "Select a batter:")
      time.sleep(game["speed"])
      printPlayerList(game["batterArray"],game["speed"])
      game["batterNum"] = selectPlayer(game["batterArray"])

def printScoreboard(game):
  print(Back.BLUE + "Strikes: "+str(game["numStrikes"]))
  time.sleep(game["speed"])
  print(Back.RED + "Hits: "+str(game["numHits"]))
  time.sleep(game["speed"])

def main():
  game = {
    "speed":0.5,
    "numStrikes": 0,
    "numHits": 0,
    "pitcherArray": addPlayers(),
    "batterArray":addPlayers(),
    "pitcherNum": 0,
    "batterNum": 0,
    "cheerForPitchers": (randint(0,1) == 1)
  }
  print(Back.BLACK + "=*=*=*=*=*= HOME RUN DERBY GAME =*=*=*=*=*=")
  time.sleep(game["speed"])
  if game["cheerForPitchers"]:
    print(Back.BLUE + "Your team is THE PITCHERS. You win if there are more strikes, than hits.")
  else:
    print(Back.RED + "Your team is THE BATTERS. You win if there are more hits, than strikes.")
  time.sleep(game["speed"])
  print(Back.BLUE + "Select a pitcher:")
  printPlayerList(game["pitcherArray"],game["speed"])
  game["pitcherNum"] = selectPlayer(game["pitcherArray"])
  print(Back.RED + "Select a batter:")
  printPlayerList(game["batterArray"],game["speed"])
  game["batterNum"] = selectPlayer(game["batterArray"])
  for round in range(5):
    doOneRound(game,round)
  printScoreboard(game)
  if game["cheerForPitchers"] and game["numStrikes"] > game["numHits"]:
    print(Back.BLUE + "You Win!")
  elif not game["cheerForPitchers"] and game["numStrikes"] < game["numHits"]:
    print(Back.RED + "You Win!")
  else:
    print(Back.BLACK + "You Lose :-(")

```



BaseballPlayer.py
```
from random import *

# Create a BaseballPlayer class with attributes:
# firstName (random choice from a list of 12 first names)
# nickName (random choice from a list of 12 nicknames)
# lastName(random choice from a list of 12 last names)
# pitchingStrength (1-10)
# pitchingAccuracy (1-10)
# battingStrength (1-10)
# battingAccuracy (1-10)
class BaseballPlayer:


  # Inside of the BaseballPlayer class, define a boostPitching(self) method that returns nothing. Increase self.pitchingStrength by a random amount (0.0 to 0.9999) and increase self.pitchingAccuracy by a random amount (0.0 to 0.9999).

  # Inside of the BaseballPlayer class, define a boostBatting(self) method that returns nothing. Increase self.battingStrength by a random amount (0.0 to 0.9999) and increase self.battingAccuracy by a random amount (0.0 to 0.9999).

  # Inside of the BaseballPlayer class, define a getPitchingGrade(self) method that returns the average of self.pitchingStrength and self.pitchingAccuracy.

  # Inside of the BaseballPlayer class, define a getBattingGrade(self) method that returns the average of battingStrength and battingAccuracy.

  # Inside of the BaseballPlayer class, define a getName(self) method that returns the first name + " " + nickname + " " + last name.

  # Inside of the BaseballPlayer class, define a getIfGoodPitch(self) method. Returns True if self's pitch accuracy is greater than a random number 0 to 10. Otherwise, returns False.

  # Inside of the BaseballPlayer class, define a getBatSwing function that requires 2 arguments: self, isGoodPitch. If isGoodPitch is True and self’s batting accuracy is greater than a random number 5-10, return True. If isGoodPitch is False and self's batting accuracy is less than a random number 0-6, return True. Otherwise, returns False.


  # Inside of the BaseballPlayer class, define a __str__(self) method that returns a String.
  # def __str__ (self):
  #         return "Name=" + self.getName() +  ", Pitching=" + str(self.getPitchingGrade()) + ", Batting=" + str(self.getBattingGrade())
  def __str__ (self):
    return "Name=" + self.getName() +  "\n     Pitching=" + str(self.getPitchingGrade()) + ", Batting=" + str(self.getBattingGrade())
```
