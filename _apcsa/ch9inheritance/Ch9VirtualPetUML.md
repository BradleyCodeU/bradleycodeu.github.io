---
layout: project
category: ch9inheritance
title: Virtual Pet UML
---

Plan an inheritance hierarchy for a virtual pet game. At the top of the hierarchy will be an [abstract](https://www.w3schools.com/java/java_abstract.asp) Pet class that contains all of the shared attributes and shared methods. Each child class only needs to add new attributes, new methods, and override basic methods with more specific implementation.

Your child classes will include Puppy and 3 others.

Select 3 from...
- Cat
- Fish
- Rodent (includes Mouse, Hamster, Guinea Pig, etc)
- Bird
- Reptile (includes Snake, Iguana, Turtle, etc)
- Rabbit
- Horse
- Ferret
- Tarantula
- Hermit Crab

## Attributes

Each pet MUST have...
- a String name
- a String picture (in ASCII art).
- a String[] actions (for example, "feed", "walk", etc)

Next, select attributes from the following list. Pick ones that make sense for the pet. We will store these stats as double and set the initial values to be 50. Pick 4 for your Puppy class and pick 3 for you other classes.

- hunger
- needToGoOutside
- petDirtiness
- habitatDirtiness or litterboxDirtiness
- boredom
- tiredness

## Mutator methods

Each pet MUST have...
- Required: void doAction(String action)
- Required: void addOneHour() increases each attribute by a random amount 1-6

Also, select the actions that correspond with your selected attributes
- feed (decreases hunger by random number 50-70)
- walk (decreases needToGoOutside by random number 50-70)
- giveBath (you get the idea)
- cleanHabitat or cleanLitterbox
- play
- nap


## Accessor methods

- Required: boolean isHappy() look at all instance vars, return false if any above the limit of 66
- Required: String toString() return string with only name, ascii pic, & NOT HAPPY in all caps (only if not happy)
- Required: String[] getListOfActions() return list like ["feed", "walk"]
