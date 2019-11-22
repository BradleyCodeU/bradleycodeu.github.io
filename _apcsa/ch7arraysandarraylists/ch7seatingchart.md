---
layout: project
category: ch7arraysandarraylists
title: Seating Chart
---
When people are in unfamiliar seating arrangement, they generally prefer to maximize their distance from already occupied seats, by occupying the middle of the longest region of empty seats.

Write a program that prompts the user for a number of seats (any integer number >1) and then prints out diagrams similar to the format given below, showing when the seats become filled, one at a time.

For input validation, you may want to use a loop that asks for an integer while NOT scanner hasNextInt()

For example, consider the situation where 10 seats are arranged in one row and are empty.

```
__ __ __ __ __ __ __ __ __ __
```

The first visitor will occupy a middle position:

```
__ __ __ __ __  X  __ __ __ __
```

The left region has five empty seats and the right region has four. The next visitor will be in the middle of the empty region at the left.
```
__ __  X  __ __  X  __ __ __ __
```
The right-most region has four empty seats, so the next visitor will go to the right-most region.
```
__ __  X  __ __  X  __ __  X  __
```
This will continue until all seats are filled.

Example Output 1
```
Number of seats:  10
_ _ _ _ X _ _ _ _ _
_ _ _ _ X _ _ X _ _
_ X _ _ X _ _ X _ _
_ X X _ X _ _ X _ _
_ X X _ X X _ X _ _
_ X X _ X X _ X X _
X X X _ X X _ X X _
X X X X X X _ X X _
X X X X X X X X X _
X X X X X X X X X X
```
Example Output 2
```
Number of seats:  11
_ _ _ _ _ _ _ _ _ _
_ _ _ _ _ X _ _ _ _
_ _ X _ _ X _ _ _ _
_ _ X _ _ X _ _ X _
X _ X _ _ X _ _ X _
X _ X X _ X _ _ X _
X _ X X _ X X _ X _
X X X X _ X X _ X _
X X X X X X X _ X _
X X X X X X X X X _
X X X X X X X X X X
```

HINTS:

Use an array of boolean values to indicate whether a seat is occupied.

Pseudocode:

  - Main method
    - get number of seats from user
    - repeat prompt if invalid
    - create empty array of seats
    - for loop that repeats number of seats times
      - call the findSeat method to get the index of the best seat
      - set the best seat to true (aka occupied)
      - call the printArray method
  - static int findSeat requires one argument: array of booleans
    - In your findSeat method, create variables to count:
      - starting index in longest empty region
      - number of seats in longest empty region
      - starting index of current empty region being counted
      - number of seats in current empty region being counted
    - Create nested loops:
      - an outer loop that repeats number of seats times (so that each seat will be checked)
      - an inner loop that repeats number of seats times (so that the largest empty region can be found)
    - return the start of longest + ((number of seats in longest-1) / 2)
  - static void printArray requires one argument: array of booleans
    - iterates through the array and prints "X " if true or "_ " if false
