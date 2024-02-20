# Castles & Creatures by Justin Riley
# import random
import time



# create a function called printGameTitle that prints a fancy title
# replace the example text with the fancy title
# print "created by Your Name"
# Return nothing
# Visit http://patorjk.com/software/taag/ to getfancy ASCII art title
def printGameTitle():
    print('''
    Example Title
    You can use three
    quotes to print multiple
    lines, like this...
         __
    (___()'`;
    /,___ /`
    ||  ||
    ''')
    time.sleep(1)
    # print "created by Your Name"
    print()
    return



# create a function rollDice that requires one 
# argument: numDice. Returns a random integer from 
# numDice to numDice x6. Idealy, the function should 
# simulate dice probablity so that rollDice(2) has a 
# higher probablity of rolling 7 than 2.
# def rollDice(numDice):
#     return ???



# create a function makeEnemy that will return an enemy dictionary
# there are 3 arguments: name, power, health
# I have completed the first half of the function for you.
# You need to:
# - Make an array with FIVE or more attacks that the enemy could use
# - Set the enemyWeakness to a randint between 1 & 3
# - return the enemy dictionary
# def makeEnemy(name, power, health):
#     # Create an enemy "dictionary" object
#     enemy = {}
#     # Give the dictionary a "name" key/value using argument name
#     enemy["name"] = name
#     # Give the dictionary a "power" key/value using argument power
#     enemy["power"] = power
#     # Give the dictionary a "health" key/value using argument health

#     # Make an array with FIVE or more attacks that the enemy could use
#     # Example: enemy["attacks"] = ["Sneak Attack", "Super Kick", ??? ]

#     # Set the enemyWeakness to a randint between 1 & 3
#     # Example: enemy["weakness"] = ???

#     return enemy



# create a function called setupCastleOne()
# prints a brief introduction
# Return an enemy dictionary that must NOT be named "Enemy 1 Name"
# def setupCastleOne():
#     # Sleep 1 sec
#     time.sleep(1)
#     # Print the 1st sentence of your story. Who is the hero?
#     print("Example castle 1 story text")
#     # Sleep 1 sec

#     # Print the 2nd sentence of your story. Where is the hero?

#     # Sleep 1 sec

#     # Print the 3rd sentence of your story. Why is hero here?

#     # Sleep 1 sec

#     # Print 4th sentence of your story. Describe castle 1

#     # Sleep 1 sec

#     # Print 5th sentence of your story. Describe enemy 1

#     # Sleep 1 sec

#     enemy = makeEnemy(name = "Enemy 1 Name", power = 20, health = 40)
#     return enemy



# create a function called setupCastleTwo()
# prints a brief introduction to castle 2
# Return an enemy dictionary that must NOT be named "Enemy 2 Name"
# def setupCastleTwo():
#     # Sleep 1 sec
#     time.sleep(1)
#     # Print the 1st sentence of your story. What happens next?
#     print("Example castle 2 story text")
#     # Sleep 1 sec

#     # Print the 2nd sentence of your story. Where is castle 2?

#     # Sleep 1 sec

#     # Print the 3nd sentence of your story. Describe castle 2

#     # Sleep 1 sec

#     # Print 4th sentence of your story. Describe enemy 2

#     # Sleep 1 sec

#     enemy = makeEnemy(name = "Enemy 2 Name", power = 30, health = 60)
#     return enemy



# create a function called setupCastleThree()
# prints a brief introduction to castle 3
# Returns an enemy dictionary that must NOT be named "Enemy 3 Name"
# def setupCastleThree():
#     # Sleep 1 sec
#     time.sleep(1)
#     # Print the 1st sentence of your story. What happens next?
#     print("Example castle 3 story text")
#     # Sleep 1 sec

#     # Print the 2nd sentence of your story. Where is castle 3?

#     # Sleep 1 sec

#     # Print the 3nd sentence of your story. Describe castle 3

#     # Sleep 1 sec

#     # Print 4th sentence of your story. Describe enemy 3

#     # Sleep 1 sec

#     enemy = makeEnemy(name = "Enemy 3 Name", power = 40, health = 80)
#     return enemy



# Create a function called validInput that 
# returns true or false. There is one argument: 
# userInput. Returns True if the userInput is 
# an integer 1 to 3 or 9. Use try/except to convert
# string to integer without crashing.
# def validInput(userInput):
#     # try
#     #   # Convert userInput to an integer
#     #   # if userInput is between 1 and 3 or 9
#     #   #   # return True
#     #   # otherwise
#     #   #   # return False
#     # except
#     #   # return False



# create a function getInput that will prompt and collect input.
# Return the number that the player selects
# No arguments needed... so it'll look like this: getInput()
# Return the number that they choose.
# def getInput():
#     while True:
#     #   # sleep for .5 seconds

#     #   # Ask player if they want to try to steal or use a weapon
#     #   # for example...
#     #   #
#     #   #
#     #   # 1=Use fire sword
#     #   # 2=Use ice dagger
#     #   # 3=Use lightning staff
#     #   # 9=Steal
#     #   # TYPE A NUMBER:

#     #   # Get user input and save in variable userInput

#     #   # If validInput(userInput) is true

#     #   #   # Convert userInput to an integer

#     #   #   return userInput

#     #   # otherwise

#     #   #   # say "Not a number"



# create a function called tryToSteal that will return True or False
# Stealing always has a 30% chance of succeeding.
# 30% of the time, tell user they were able to steal & return True
# Otherwise (70%), tell user they're NOT able to steal & return False
# def tryToSteal():
#     # if ???
#     #   # tell the user that they were able to steal


#     #   # return True
#     # otherwise
#     #   # tell the user they were NOT able to steal



#     #   # return False



# create function enemyLoseHealth that will return the newEnemyHealth
# there are 2 arguments: playerChoice, enemy
# return newEnemyHealth
# def enemyLoseHealth(playerChoice, enemy):
#     damage = 0
#     # if the playerChoice equals enemy["weakness"],
#     #   # rollDice(3) & store it in variable damage
#     # otherwise,
#     #   # rollDice(2) & store it in variable damage
#     # if damage is greater than some amount,
#     #   # then print "IT'S SUPER EFFECTIVE!!!!!"
#     # print -damage to enemy["name"]
#     # set newEnemyHealth to enemy["health"] - damage
#     # return newEnemyHealth



# create a function playerLoseHealth that returns the newPlayerHealth
# there are 2 arguments: playerHealth, enemy
# Return the newPlayerHealth
# def playerLoseHealth(playerHealth, enemy):
#     # Create a variable called damage

#     # Set damage to a random int between 1 & the enemy["power"]

#     # Set randomAttack to random choice from enemy["attacks"] array
#     randomAttack = random.choice(enemy["attacks"])
#     # Print a message that tells you how much the enemy hurt you
#     # (for example, enemy["name"] used randomAttack! -damage HP)

#     # Create newPlayerHealth variable that is playerHealth - damage

#     # Print a message that says You have newPlayerHealth HP

#     return newPlayerHealth



# create a function called isPlayerAlive that will return true or false
# needs one argument: playerHealth
# Return true or false
# def isPlayerAlive(playerHealth):
#     # if playerHealth is greater than 0

#         # return True
#     # otherwise

#         # return False



# create a function called gameLevel that gets user input, enemy loses
# health, player loses health, and finally will return playerHealth
# this function needs two arguments: enemy, playerHealth
# Return playerHealth
def gameLevel(enemy, playerHealth):
    # create a variable called stealSuccess & set it to False
    # sleep for .5 seconds
    time.sleep(0.5)
    # print a dividing line like this ================================
    while isPlayerAlive(playerHealth) == True:
       # sleep for .5 seconds
       time.sleep(0.5)
       # print a small dividing line like this ~ ~ ~
       # create variable called playerChoice & set it to getInput()
       # If the player said nine
       #   # set stealSuccess to tryToSteal()
       # otherwise
       #   # enemy["health"] = enemyLoseHealth(playerChoice, enemy)
       # sleep for .5 seconds
       time.sleep(0.5)
       # If enemy health is greater than zero
       #   # set playerHealth to playerLoseHealth(playerHealth,enemy)
       # otherwise
       #   # sleep for .5 seconds
       #   # print You have defeated enemy["name"]!
       #   # break out of loop so that you can go to the next level
       # if isPlayerAlive( playerHealth ) is false
       #   # break out of loop
       # if stealSuccess is true
       #   # print You steal the treasure & escape past enemy["name"]
       #   # break out of loop so player can go to the next level
    return playerHealth



# The main function is already completed for you
def main():
    playerHealth = 100
    printGameTitle()
    playerHealth = gameLevel(setupCastleOne(), playerHealth)
    if isPlayerAlive(playerHealth):
        playerHealth = gameLevel(setupCastleTwo(), playerHealth)
    if isPlayerAlive(playerHealth):
        playerHealth = gameLevel(setupCastleThree(), playerHealth)
    if not isPlayerAlive(playerHealth):
        print("Oof.  You have DIED!  R.I.P.  Game Over")
        return
    else:
        print("YOU WIN")
