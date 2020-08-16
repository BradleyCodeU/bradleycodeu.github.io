# Castles & Creatures by Justin Riley
# import random
import time


# create a function called printGameTitle that prints a fancy title
# replace the example text with the fance title
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

    return


# create a function called setupCastleOne()
# prints a brief introduction
# Returns an enemy dictionary which should NOT be named "Enemy 1 Name"
def setupCastleOne():
    # Sleep 1 sec
    time.sleep(1)
    # Print the 1st sentence of your story. Who is the hero?
    print("Example castle 1 story text")
    # Sleep 1 sec

    # Print the 2nd sentence of your story. Where is the hero?

    # Sleep 1 sec

    # Print the 3rd sentence of your story. Why is hero here?

    # Sleep 1 sec

    # Print 4th sentence of your story. Describe castle 1

    # Sleep 1 sec

    # Print 5th sentence of your story. Describe enemy 1

    # Sleep 1 sec

    enemy = makeEnemy(name = "Enemy 1 Name", power = 20, health = 40)
    return enemy


# create a function called setupCastleThree()
# prints a brief introduction to castle 2
# Returns an enemy dictionary which should NOT be named "Enemy 2 Name"
def setupCastleTwo():
    # Sleep 1 sec
    time.sleep(1)
    # Print the 1st sentence of your story. What happens next?
    print("Example castle 2 story text")
    # Sleep 1 sec

    # Print the 2nd sentence of your story. Where is castle 2?

    # Sleep 1 sec

    # Print the 3nd sentence of your story. Describe castle 2

    # Sleep 1 sec

    # Print 4th sentence of your story. Describe enemy 2

    # Sleep 1 sec

    enemy = makeEnemy(name = "Enemy 2 Name", power = 30, health = 60)
    return enemy


# create a function called setupCastleThree()
# prints a brief introduction to castle 3
# Returns an enemy dictionary which should NOT be named "Enemy 3 Name"
def setupCastleThree():
    # Sleep 1 sec
    time.sleep(1)
    # Print the 1st sentence of your story. What happens next?
    print("Example castle 3 story text")
    # Sleep 1 sec

    # Print the 2nd sentence of your story. Where is castle 3?

    # Sleep 1 sec

    # Print the 3nd sentence of your story. Describe castle 3

    # Sleep 1 sec

    # Print 4th sentence of your story. Describe enemy 3

    # Sleep 1 sec

    enemy = makeEnemy(name = "Enemy 3 Name", power = 40, health = 80)
    return enemy


# create a function makeEnemy that will return an enemy dictionary
# there are 3 arguments: _name, _power, _health
# I have completed the first half of the function for you.
# You need to:
# - Make an array with FIVE or more attacks that the enemy could use
# - Set the enemyWeakness to a random integer number between 2 & 4
# - return the enemy dictionary
def makeEnemy(_name, _power, _health):
    # Create an enemy "dictionary" object
    enemy = {}
    # Give the dictionary a "name" key/value using argument _name
    enemy["name"] = _name
    # Give the dictionary a "power" key/value using argument _power
    enemy["power"] = _power
    # Give the dictionary a "health" key/value using argument _health

    # Make an array with FIVE or more attacks that the enemy could use
    # Example: enemy["attacks"] = ["Sneak Attack", "Super Kick", ??? ]

    # Set the enemyWeakness to a random integer number between 2 & 4
    # Example: enemy["weakness"] = ???

    return enemy


# create a function called validInput that returns true or false
# there is one argument: userInput
def validInput(userInput):
    # try
        # Convert userInput to an integer
        # if userInput is between 1 and 4
            return True
        # otherwise
            return False
    # except
        # return False


# create a function getInput that will prompt and collect input.
# Return the number that the player selects
# No arguments needed... so it'll look like this: getInput()
# Return the number that they choose.
def getInput():
    while True:
        # sleep for .5 seconds

        # Ask player if they want to try to steal or use a weapon
        # for example...
        #
        # 1=Steal
        # 2=Use fire sword
        # 3=Use ice dagger
        # 4=Use lightning staff
        # TYPE A NUMBER:

        # Get user input and save in variable userInput

        # If validInput(userInput) is true

            # Convert userInput to an integer

            return userInput

        # otherwise

            # say "Not a number"


# create a function called tryToSteal that will return True or False
# Stealing always has a 30% chance of succeeding.
# 30% of the time, tell user they were able to steal & return True
# Otherwise (70%), tell user they're NOT able to steal & return False
def tryToSteal():
    # if
        # tell the user that they were able to steal

        # sleep for .5 seconds

        return True
    # otherwise
        # tell the user they were NOT able to steal

        # sleep for .5 seconds

        return False


# create function enemyLoseHealth that will return the newEnemyHealth
# there are 2 arguments: playerChoice, enemy
# return newEnemyHealth
def enemyLoseHealth(playerChoice, enemy):
    damage = 0
    # if the playerChoice equals enemy["weakness"],
        # then generate a large random int & store it in variable damage
    # otherwise,
        # generate a smaller random int & store it in variable damage
    # if damage is greater than some amount,
        # then print "IT'S SUPER EFFECTIVE!!!!!"
    # sleep 0.5 sec
    # print -damage to enemy["name"]
    # set newEnemyHealth to enemy["health"] - damage
    return newEnemyHealth


# create a function playerLoseHealth that returns the newPlayerHealth
# there are 2 arguments: playerHealth, enemy
# Return the newPlayerHealth
def playerLoseHealth(playerHealth, enemy):
    # Create a variable called damage

    # Set damage to a random int between 0 & the enemy["power"]

    # Set randomAttack to random choice from enemy["attacks"] array
    randomAttack = random.choice(enemy["attacks"])
    # Print a message that tells you how much the enemy hurt you
    # (for example, enemy["name"] used randomAttack! -damage HP)

    # sleep for .5 seconds

    # Create newPlayerHealth variable that is playerHealth - damage

    # Print a message that says You have newPlayerHealth HP

    # sleep for .5 seconds

    return newPlayerHealth


# create a function called isPlayerAlive that will return true or false
# needs one argument: playerHealth
# Return true or false
def isPlayerAlive(playerHealth):
    # if playerHealth is greater than 0

        return True
    # otherwise

        return False


# create a function called gameLevel that gets user input, enemy loses
# health, player loses health, and finally will return playerHealth
# this function needs two arguments: enemy, playerHealth
# Return playerHealth
def gameLevel(enemy, playerHealth):
    # create a variable called stealSuccess & set it to False

    # sleep for .5 seconds

    # print a dividing line like this ================================

    # while the player is alive
    while isPlayerAlive(playerHealth) == True:
        # sleep for .5 seconds

        # print a small dividing line like this ~ ~ ~

        # create variable called playerChoice & set it to getInput()

        # If playerChoice is 1
            # set stealSuccess to tryToSteal()
        # otherwise
            # enemy["health"] to enemyLoseHealth(playerChoice, enemy)

        # If enemy health is greater than zero
            # set playerHealth to playerLoseHealth(playerHealth,enemy)
        # otherwise
            # sleep for .5 seconds
            # print You have defeated enemy["name"]!
            # break out of loop so that you can go to the next level
            break

        # if isPlayerAlive with playerHealth as argument is false
            break

        # if stealSuccess is true
            # print You steal the treasure & escape past enemy["name"]
            # break out of loop so player can go to the next level
            break
    # return the playerHealth
    return playerHealth


# The main function is already completed for you
def main():
    playerHealth = 100
    printGameTitle()
    playerHealth = gameLevel(setupCastleOne(), playerHealth)
    if !isPlayerAlive(playerHealth):
        print("Oof.  You have DIED!  R.I.P.  Game Over")
        return
    playerHealth = gameLevel(setupCastleTwo(), playerHealth)
    if !isPlayerAlive(playerHealth):
        print("Oof.  You have DIED!  R.I.P.  Game Over")
        return
    playerHealth = gameLevel(setupCastleThree(), playerHealth)
    if !isPlayerAlive(playerHealth):
        print("Oof.  You have DIED!  R.I.P.  Game Over")
        return
    else:
        print("YOU WIN")