# Castles & Creatures by Justin Riley
# import random
# import time


# create a function called askPlayer that will prompt, collect input,
# & return the number that the player selects
# No arguments needed... so it'll look like this: askPlayer()
# Ask the player if they want to try to steal or use one of their weapons
# (for example, 1=Steal 2=Use fire sword 3=Use ice dagger 4=Use lightning staff)
# Validate Input. If input is wrong, say "Not a number" & repeat the question.
# Return the number that they choose.
def askPlayer():
    while True:
        # sleep for .5 seconds


        try:

        except:

    return


# create a function called tryToSteal that will return True or False
# Stealing always has a 10% chance of succeeding.
# 10% of the time, tell the user that they were able to steal & return True
# Otherwise (90%), tell the user they were NOT able to steal & return False
def tryToSteal():
    if
        # sleep for .5 seconds


        return True
    else:
        # sleep for .5 seconds


        return False


# create a function called enemyLoseHealth that will return the newEnemyHealth
# there are 2 arguments: playerChoice, enemy
# if the playerChoice equals enemy["weakness"],
#   then generate a large random int & store it in a variable called damage
# otherwise,
#   generate a smaller random int & store it in a variable called damage
# if damage is greater than some amount,
#   then print "IT'S SUPER EFFECTIVE!!!!!"
# print -damage to enemy["name"]
# create a variable called newEnemyHealth & set it to enemy["health"] minus damage
# return newEnemyHealth
def enemyLoseHealth(playerChoice, enemy):
    if

    else:

    if

    # sleep for .5 seconds



    return newEnemyHealth


# create a function called playerLoseHealth that will return the newPlayerHealth
# there are 2 arguments: playerHealth, enemy
# Create a variable called damage
# Set damage to a random int between 0 & the enemy["level"]
# Create a variable called randomAttack
# Set randomAttack to a random choice from the the enemy["attacks"] array list
# Print a message that tells you how much the enemy hurt you
# (for example, enemy["level"] used randomAttack! -damage HP)
# Create a newPlayerHealth variable that is equal to playerHealth minus damage
# Print a message that says You have newPlayerHealth HP
# Return the newPlayerHealth
def playerLoseHealth(playerHealth, enemy):

    random.choice(enemy["attacks"])

    # sleep for .5 seconds



    # sleep for .5 seconds


    return newPlayerHealth


# create a function called gameLevel that will return playerHealth
# this function needs three arguments: castleDescription,enemy,playerHealth
#
def gameLevel(castleDescription,enemy,playerHealth):
    # create a variable called stealSuccess & set it to False

    # print a dividing line like this ==============================================================

    # sleep for .5 seconds

    # print the castleDescription

    # while the playerHealth is greater than zero
    while
        # sleep for .5 seconds

        # print a small dividing line like this ~ ~ ~

        # create a variable called playerChoice & set it to askPlayer()


        if playerChoice == 1:
            # set stealSuccess to tryToSteal(enemy["name"])
            stealSuccess =
        else:
            # A random amount of enemy's health is lost. set enemy["health"] to enemyLoseHealth(playerChoice, enemy)


        # If enemy is still alive
        if
            # A random amount of player's health lost. set playerHealth to playerLoseHealth(playerHealth, enemy)

        else:
            # sleep for .5 seconds

            # print You have defeated enemy["name"]!

            # break out of this loop so that you can go to the next level
            break

        # if player is dead
        if
            # sleep for .5 seconds

            # print Oof.  You have DIED!  R.I.P.  Game Over.
        # if you were able to steal
        if
            # print You steal the treasure & manage to escape past enemy["name"]!

            # break out of this loop so that you can go to the next level
            break
    # return the playerHealth
    return playerHealth


# **************** THE GAME BEGINS HERE!!! ****************
# start the playerHealth at 100
# Print the name of the game
# Visit http://patorjk.com/software/taag/ to get ASCII art version of your title

# Sleep 1 sec
sleep(1)
# Print "by your name"

# Sleep 1 sec
sleep(1)
# Print the 1st sentence of your story

# Sleep 1 sec
sleep(1)
# Print the 2nd sentence of your story

# Sleep 1 sec
sleep(1)
# Print the 3rd sentence of your story

# Sleep 1 sec
sleep(1)
# Setup castle 1
# Write a sentence to describe the first castle
castleDescription =
# Create an enemy "dictionary" object
enemy = {}
# Give the enemy a name
enemy["name"] =
# Set the enemy's level to an integer number, maybe 10?
enemy["level"] =
# Set the enemy's health to an integer number, maybe 10?
enemy["health"] =
# Here are some possible attacks that the enemy could use. You can delete these, create your own, add more, etc.
enemy["attacks"] = ["Sneak Attack", "Roundhouse Kick", "Punchy Punch", "Hair Whip", "Jump Scare", "Evil Slap"]
# Set the enemyWeakness to a random integer number between 2 & 4
enemy["weakness"] =

# Create Level 1 by calling gameLevel()
playerHealth = gameLevel(castleDescription,enemy,playerHealth)
# If you wanna add some story between castle 1 & castle 2, you'd do that here with some sleep 1 sec & print statements
# Setup castle 2
# Set castleDescription to a sentence that describes the castle
# Set enemy name to a new name
# Set enemy level to a new integer number
# Set enemy health to a new integer number
# Set enemy attacks to a new list of some possible attacks that the enemy could use.
# Set the enemy weakness to a random integer number between 2 & 4
# Create Level 2 by calling gameLevel()
playerHealth = gameLevel(castleDescription,enemy,playerHealth)
# If you wanna add some story between castle 2 & castle 3, you'd do that here with some sleep 1 sec & print statements
# Setup castle 3
# Set castleDescription to a sentence that describes the castle
# Set enemy name to a new name
# Set enemy level to a new integer number
# Set enemy health to a new integer number
# Set enemy attacks to a new list of some possible attacks that the enemy could use.
# Set the enemy weakness to a random integer number between 2 & 4
# Create Level 3 by calling gameLevel()
playerHealth = gameLevel(castleDescription,enemyName,enemyLevel,enemyHealth,enemyAttacks,enemyWeakness,playerHealth)
