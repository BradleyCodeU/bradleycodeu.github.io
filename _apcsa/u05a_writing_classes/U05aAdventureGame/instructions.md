---
layout: project
category: u05a_writing_classes
title: Adventure Game
---

We will divide up the work of coding these classes and we will "call dibs" on different parts of the code.

List of classes and methods that we need to create (54 total tasks)
🔳 = incomplete, ✅ = completed

Enemy extends Npc (7 tasks)
  - 🔳 - private instance vars for health, int magicWeakness, attackName
  - 🔳 + NoArgsConstructor
  - 🔳 + Enemy(String _name, String _description)
  - 🔳 + String getAttackName()
  - 🔳 + int getHealth
  - 🔳 + int getMagicWeakness()
  - 🔳 + void loseHealth(int h)
  - 🔳 + void setAttackName()

Item (11 tasks)
  - 🔳 - private instance vars for name, strength, description, int magicType
  - 🔳 + NoArgsConstructor
  - 🔳 + Item(String _name, String _description)
  - 🔳 + int getMagicType()
  - 🔳 + String getName()
  - 🔳 + int getStrength()
  - 🔳 + void setDescription(String d)
  - 🔳 + void setName(String _name)
  - 🔳 + isBroken() // returns true if the strength is zero or less, otherwise returns true
  - 🔳 + toString() // returns the description
  - 🔳 + void weaken() // sets strength to be strength divided by two

Npc (9 tasks)
  - 🔳 - private instance vars for name, speech, description
  - 🔳 + NoArgsConstructor
  - 🔳 + Npc(String _name, String _description)
  - 🔳 + String getName
  - 🔳 + String getSpeech
  - 🔳 + void setDescription(String d)
  - 🔳 + void setName(String _name)
  - 🔳 + void setSpeech
  - 🔳 + toString() // returns the description

Player (13 tasks)
  - 🔳 - private instance vars for health, kickStrength, punchStrength, enemiesDefeated, Room currentRoom, Item backpack
  - 🔳 + NoArgsConstructor
  - 🔳 + int getEnemiesDefeated
  - 🔳 + int getHealth
  - 🔳 + int getKickStrength
  - 🔳 + int getPunchStrength
  - 🔳 + Room getCurrentRoom
  - 🔳 + Item getBackpack
  - 🔳 + void increaseEnemiesDefeated // increases by 1
  - 🔳 + void loseHealth(int damage) // reduces health by damage 
  - 🔳 + void setCurrentRoom(Room newRoom) 
  - 🔳 + void setBackpack(Item newItem) 
  - 🔳 + toString() // returns all the player stats

Room (14 tasks)
  - 🔳 - private instance vars for name, description, character, roomItem, Room north, Room south, Room east, Room west
  - 🔳 + NoArgsConstructor
  - 🔳 + Room(String _name)
  - 🔳 + Npc getCharacter()
  - 🔳 + Item getItem()
  - 🔳 + Room getLocationTo(String direction)
  - 🔳 + String getName()
  - 🔳 + String getPossibleDirections()
  - 🔳 + void linkRoom(Room r, String direction)
  - 🔳 + void setCharacter(Npc character)
  - 🔳 + void setDescription(String d)
  - 🔳 + void setItem(Item i)
  - 🔳 + void setName(String _name)
  - 🔳 + toString() // returns the description 


Map:

```
+---------+-------------+-------------+---------------+
|         | billiardsRm | theBasement | masterBedroom |
+---------+-------------+-------------+---------------+
| kitchen | diningHall  | mainHallway | theStudy      |
+---------+-------------+-------------+---------------+
|         | ballroom    | grandFoyer  |               |
+---------+-------------+-------------+---------------+
```