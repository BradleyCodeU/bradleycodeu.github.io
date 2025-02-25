---
layout: project
category: ch9inheritance
title: Virtual Pet Game
---

Here is a [demo video](https://drive.google.com/file/d/12lmCfq5ru7Vth4apWrTKk2eomeqEvJ-J/view?usp=sharing) of the Virtual Pet Game

Create an [abstract](https://www.w3schools.com/java/java_abstract.asp) Pet class, a Puppy class, and classes for 3 other types of pet. 

Starter code for the Main class is [here](/apcsa\ch9inheritance\Main.java). Complete the Main class that will contain the game. Lines 8 and 10 need completed.

Starter code for the Pet class is [here](/apcsa\ch9inheritance\Pet.java). Complete the [abstract](https://www.w3schools.com/java/java_abstract.asp) Pet class. Line 22 needs completed.

Create subclasses that will inherit from the Pet class: a Puppy class, and classes for 3 other types of pet.

## Attributes

Each pet MUST have...
- a String name
- a String picture (in ASCII art).
- an String ArrayList actions (for example, "feed", "walk", etc)
- hunger

Next, select attributes from the following list. Pick ones that make sense for the pet. We will store these stats as double and set the initial values to a random value 60-70. Pick 3 "needs" for your Puppy class and pick 2 "needs" for your other classes.

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
- Required: String ArrayList getListOfActions() returns an ArrayList like "feed", "walk", etc.
