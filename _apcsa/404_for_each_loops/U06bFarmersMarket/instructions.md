---
layout: project
category: 404_for_each_loops
title: U06b Farmers Market Game
---



A FarmersMarket is a food market at which local farmers sell fruit and vegetables and often meat, cheese, and bakery products directly to consumers.

In this project you will complete the FarmersMarket class. All of the other classes are complete. Each FarmersMarket has...

- a name 
- an array of PriceTracker objects that can calculate prices. For example, could be PriceTrackers for corn, beans, eggs, etc.


In addition to instance variables there are two static variables that belong to the class...

- static String array of city names
- static int cityCounter to keep track of the current city index



Sample Output
```
***********************
* FARMERS MARKET GAME *
***********************

 You start with $1000.00 and some apples, corn, and eggs.

  How long will it take you to double your money???
---------------------------------------------------

New York

Corn: Price = 2.79, Supply = 28

Apples: Price = 1.66, Supply = 35

Eggs: Price = 2.27, Supply = 0

Player has... 
  Corn:   100
  Apples: 50
  Eggs:   20
  Money:  1000.00
What do you want to do? (b = buy, s = sell, m = move to next location, q = quit): b
What do you want to buy? (c = corn, a = apples, e = eggs): a
Buy how many?: 35
---------------------------------------------------

New York

Corn: Price = 2.79, Supply = 23

Apples: Price = 1.66, Supply = 7

Eggs: Price = 2.20, Supply = 7

Player has... 
  Corn:   100
  Apples: 85
  Eggs:   20
  Money:  941.92
What do you want to do? (b = buy, s = sell, m = move to next location, q = quit): 
```