# Castles and Creatures by Justin Riley
# from random import everything
# from time import everything


# create a function called askPlayer that will return the number that the player selects
# No arguments needed... so it'll look like this: askPlayer()
# Ask the player if they want to try to steal or use one of their weapons (for example, 1=Steal 2=Use fire sword 3=Use ice dagger 4=Use lightning staff)
# Validate Input. If the user types something wrong, say "Not a number" and repeat the question.
# Return the number that they choose.
def askPlayer():
    while True:
        # sleep for 1 second
        
        
        try:
            
        except:
            
    return 
    

# create a function called tryToSteal that will return True or False
# There is one argument, enemyName, so it will look like this: tryToSteal(enemyName)
# If the enemyName equals your final boss (for example, Mutant Spider), then say you cannot steal from enemyName and return False.
# Stealing always has a 20% chance of succeeding.
# 20% of the time, print a message telling the user that they were able to steal and return True
# Otherwise, print a message telling the user they were NOT able to steal and return False (80% of the time)
def tryToSteal(enemyName):
    if 
        
    if 
        # sleep for 1 second
        
        
        return True
    else:
        # sleep for 1 second
        
        
        return False


# create a function called enemyLoseHealth that will return the newEnemyHealth
# there are 4 arguments: playerChoice, enemyHealth, enemyName, enemyWeakness
# like this, enemyLoseHealth(playerChoice, enemyHealth, enemyName, enemyWeakness)
# if the playerChoice equals the enemyWeakness, then generate a large random int and store it in a variable called damage
# otherwise, generate a smaller random int and store it in a variable called damage
# if damage is greater than some amount, print something like "IT'S SUPER EFFECTIVE!!!!!"
# print -damage to enemyName
# create a variable called newEnemyHealth and set it to enemyHealth minus damage
# return newEnemyHealth
def enemyLoseHealth(playerChoice, enemyHealth, enemyName, enemyWeakness):
    if 
        
    else:
        
    if  
        
    # sleep for 1 second
    
    
    
    return newEnemyHealth


# create a function called playerLoseHealth that will return the newPlayerHealth
# there are 4 arguments: playerHealth, enemyName, enemyLevel, enemyAttacks
# Like this, playerLoseHealth(playerHealth, enemyName, enemyLevel, enemyAttacks)
# Create a variable called damage and set it to a random int between 0 and the enemyLevel
# Shuffle the enemyAttacks array list
# Create a variable called randomAttack and set it to enemyAttacks[0]
# Print a message that tells you how much the enemy hurt you (for example, enemyName used randomAttack! -damage HP)
# Create a variable called newPlayerHealth that is equal to playerHealth minus damage
# Print a message that says You have newPlayerHealth HP
# Return the newPlayerHealth
def 
    
    shuffle(
    
    # sleep for 1 second
    
    
    
    # sleep for 1 second
    
    
    return newPlayerHealth


# create a function called gameLevel that will return playerHealth
# this function needs lots of arguments: roomDescription,enemyName,enemyLevel,enemyHealth,enemyAttacks,enemyWeakness,playerHealth
# Like this, gameLevel(roomDescription,enemyName,enemyLevel,enemyHealth,enemyAttacks,enemyWeakness,playerHealth)
# 
def 
    # create a variable called stealSuccess and set it to False
    
    # print a dividing line like this ==============================================================
    
    # sleep for 1 second
    
    # print the roomDescription
    
    # while the playerHealth is greater than zero
    while
        # sleep for 1 second
        
        # print a small dividing line like this ~ ~ ~
        
        # create a variable called playerChoice and set it to askPlayer()
        
        
        if playerChoice == 1:
            # set stealSuccess to tryToSteal(enemyName)
            
        else:
            # A random amount of enemy's health is lost. set enemyHealth to enemyLoseHealth(playerChoice, enemyHealth, enemyName, enemyWeakness)
            
        
        # If enemy is still alive
        if 
            # A random amount of player's health lost. set playerHealth to playerLoseHealth(playerHealth, enemyName, enemyLevel, enemyAttacks)
            
        else:
            # sleep for 1 second
            
            # print You have defeated enemyName!
            
            # break out of this loop so that you can go to the next level
            break
        
        # if player is dead
        if 
            # sleep for 1 second
            
            # print Oof.  You have DIED!  R.I.P.  Game Over.
        # if you were able to steal
        if 
            # print You steal the treasure and manage to escape past enemyName!
            
            # break out of this loop so that you can go to the next level
            break
    # return the playerHealth
    return playerHealth

    
# **************** THE GAME BEGINS HERE!!! ****************
# start the playerHealth at 100
# Print the name of the game 

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
# Setup Room 1
# Write a sentence to describe the room
roomDescription = 
# Give the enemy a name
enemyName = 
# Set enemyLevel to an integer number, maybe 10?

# Set enemyHealth to an integer number, maybe 10?

# Here are some possible attacks that the enemy could use. You can delete these, create your own, add more, etc.
enemyAttacks = ["Sneak Attack", "Roundhouse Kick", "Punchy Punch", "Hair Whip", "Jump Scare", "Evil Slap"]
# Set the enemyWeakness to a random integer number between 2 and 4
enemyWeakness = 
# Create Level 1 by calling gameLevel()
playerHealth = gameLevel(roomDescription,enemyName,enemyLevel,enemyHealth,enemyAttacks,enemyWeakness,playerHealth)
# If you wanna add some story between Room 1 and Room 2, you'd do that here with some sleep 1 sec and print statements
# Setup Room 2
# Set roomDescription to a sentence that describes the room
# Set enemyName to a name
# Set enemyLevel to an integer number
# Set enemyHealth to an integer number
# Set enemyAttacks to a list of some possible attacks that the enemy could use.
# Set the enemyWeakness to a random integer number between 2 and 4
# Create Level 2 by calling gameLevel()
playerHealth = gameLevel(roomDescription,enemyName,enemyLevel,enemyHealth,enemyAttacks,enemyWeakness,playerHealth)
# If you wanna add some story between Room 2 and Room 3, you'd do that here with some sleep 1 sec and print statements
# Setup Room 3
# Set roomDescription to a sentence that describes the room
# Set enemyName to a name
# Set enemyLevel to an integer number
# Set enemyHealth to an integer number
# Set enemyAttacks to a list of some possible attacks that the enemy could use.
# Set the enemyWeakness to a random integer number between 2 and 4
# Create Level 3 by calling gameLevel()
playerHealth = gameLevel(roomDescription,enemyName,enemyLevel,enemyHealth,enemyAttacks,enemyWeakness,playerHealth)