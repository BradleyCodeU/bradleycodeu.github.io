---
layout: project
category: ch9inheritance
title: Virtual Pet UML
---

Plan an inheritance hierarchy for a virtual pet game. At the top of the hierarchy will be an [abstract](https://www.w3schools.com/java/java_abstract.asp){:target="_blank"} Pet class that contains all of the shared attributes and shared methods. Starter code for the Pet class is [here](/apcsa\ch9inheritance\Pet.java){:target="_blank"}. Each child class only needs to add new attributes, new methods, and override basic methods with more specific implementation.

You can use Notability or Google Drawings or some UML chart making website or take a photo of paper and pencil

Turn in a PDF file

![UML Diagram example](https://bradleycodeu.github.io/apcsa/ch9inheritance/Question%20class%20UML.png)

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
- an String ArrayList actions (for example, "feed", "walk", etc)
- hunger

Next, select attributes from the following list. Pick ones that make sense for the pet. We will store these stats as double and set the initial values to a random value 60-70. 

Pick 3 for your Puppy class and pick 2 for your other classes:

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


You can use Notability or Google Drawings or some UML chart making website or take a photo of paper and pencil

Turn in a PDF file