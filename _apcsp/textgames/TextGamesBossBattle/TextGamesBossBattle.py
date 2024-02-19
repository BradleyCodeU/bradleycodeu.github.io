# your name(s) here

import time

def randomHealth():
  True

def randomTrueFalse():
  True

def diceRoll():
  True

def hitBoss():
  True

def hitPlayer():
  True

def whoWins():
  True


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
    print(whoWins(playerHealth, bossHealth)) 
    if bossHealth > 0:
      damage = hitPlayer(playerHealth)
      # subtract the damage from the playerHealth
      
      time.sleep(1)
      print("You have " + playerHealth + " remaining")
      time.sleep(1)
      print(whoWins(playerHealth, bossHealth))  


