---
layout: project
category: console
title: Run Errands
---

- Create a new Python project. Copy/paste your FindDistance function from the last project. Do not change the code in your FindDistance function.

You have two errands to run today. Your friend wants you to be able to go out tonight, so they agree to run one of your errands for you.

Imagine that you have a map of the area on a coordinate plane. Prompt for the x and y coordinates of your house. Next, prompt for the x and y coordinates of each errand location. Use your FindDistance function to calculate the distance to each errand. Display the distance to each location. Display the number of the errand that is farther away from your house.

The distances will be considered to have similar distances if the distances are within 0.5 units of each other.

The THREE options are:

  - Similar distances
  - Errand 1 is farther
  - Errand 2 is farther


Sample Run #1:
```
The house x coordinate:
2
The house y coordinate:
1
Errand 1 x coordinate:
6
Errand 1 y coordinate:
1
Errand 1 distance = 4.0
Errand 2 x coordinate:
4
Errand 2 y coordinate:
7
Errand 2 distance = 6.324555320336759
Result = Errand 2 is farther
```
Sample Run #2:
```
The house x coordinate:
0
The house y coordinate:
0
Errand 1 x coordinate:
6
Errand 1 y coordinate:
2
Errand 1 distance = 6.324555320336759
Errand 2 x coordinate:
5
Errand 2 y coordinate:
3
Errand 2 distance = 5.830951894845301
Result = Similar distances
```
Sample Run #3:
```
The house x coordinate:
1
The house y coordinate:
2
Errand 1 x coordinate:
5
Errand 1 y coordinate:
3
Errand 1 distance = 4.123105625617661
Errand 2 x coordinate:
3
Errand 2 y coordinate:
5
Errand 2 distance = 3.605551275463989
Result = Errand 1 is farther
```
