---
layout: project
category: 307_static_variables
title: Random Pitcher
---


Create a class for a RandomPitcher

Your RandomPitcher class MUST have:
  - a static method named findBest that takes two RandomPitcher objects as arguments.
    - use each pitcher's getEarnedRunAverage() method to figure out which is better
    - return the better pitcher object OR return null if they are equal.
  - a static method named combinePitchers that takes two RandomPitcher objects as arguments.
    - average the two pitchers or use the betters stats or somehow merge their stats
    - return a NEW RandomPitcher object that is a combo of the original two
  - 5 or more instance variables including earnedRunsAllowed and inningsPitched. Do NOT store earnedRunAverage as an instance variable.
  - 2 constructors: a no-argument constructor and a constructor with 1 or more parameters
  - a few mutator methods
  - a few accessor methods including getEarnedRunAverage()  
    - learn how to calculate earned run average here: [https://en.wikipedia.org/wiki/Earned_run_average](https://en.wikipedia.org/wiki/Earned_run_average)
    - if the RandomPitcher has pitched for 0 innings, then return an ERA of Double.POSITIVE_INFINITY
  - a toString() method
  - a getPitch() method that uses the pitcher's stats and generates random pitches
    - some ideas for types of pitches that COULD be thrown... fastball, curveball, slider, changeup, screwball, knuckleball
    - here is a different idea. a pitch COULD be... high and outside, low and outside, high and inside, low and inside
    - MUST only use the Math.random() method to generate random numbers




Your public static void main (in the RandomPitcherApp.java file) MUST:
- construct two different RandomPitcher objects
- print the stats for each RandomPitcher object
- throw a few pitches and demonstrate that the pitches are random
- use findBest to compare the two pitchers, then print the name of the best one
- update their stats to get a different result, then use findBest to compare again
- test the static combinePitchers method and print the new pitcher that it returns