Castles and Creatures

Demo video here: https://drive.google.com/open?id=1JlEKlaDlWA8AcpCWbkH0wlF7noETYy8T (Links to an external site.)Links to an external site.

Download this starter file: castlesAndCreaturesTemplate.py

Write a program to play a simple adventure-style interactive game. Come up with a unique name and story for your game. The game consists of 3 or more rooms. Each room has a treasure and a creature guarding the treasure.The object of the game is to visit all 3 rooms and gain as many treasures as possible.

Begin each room by describing the room, the creature, and the treasure.

The treasure can be captured by stealing or fighting with 2 or more elemental weapons (fire sword, ice dagger, lightning staff, etc). Stealing always has a 20% chance of succeeding, but always results in a random amount of player's health lost. Fighting results in a random amount of damage to the creature and a random amount of player's health lost.

You will repeat this battle while the player's health is greater than zero.

Ask the player if they want to try to steal or use one of their weapons (for example, "What do you want to do? 1=Steal 2=Use fire sword 3=Use ice dagger 4=Use lightning staff").

Calculate the random amount of damage to the creature and random amount of player's health lost. Tell the player what happened. If the player is out of health, game over. If the creature is dead or the treasure was stolen, then tell the player what happened, break out of this loop, and continue to the next room.

If the player is not dead, describe the next room, the creature, and the treasure.

You will repeat this next battle while the player's health is greater than zero.

You should know what to do next.

-=-=-=-=-=-=-=-=-=-
GOLD MEDAL: Use 3 or more of the following details...
You have a one-time-use healing potion that restores the player to full health.
Each treasure is a new weapon that you can use in later rooms.
You have a one-time-use magic spell that reduces one creature's health by half.
Each creature has a weakness, a specific weapon that inflicts double-damage. Don't make it obvious: ice dragon's weakness is fire sword. Less obvious would be: the minotaur's weakness is lightning staff, the manticore's weakness is ice dagger, and Medusa's weakness is also lightning staff.
