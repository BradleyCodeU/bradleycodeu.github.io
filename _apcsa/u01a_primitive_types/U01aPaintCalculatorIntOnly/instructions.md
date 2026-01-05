---
layout: project
category: u01a_primitive_types
title: U01a Paint Calc Int Only
---

You are painting a room and need to calculate the amount of paint that must be purchased. All inputs and outputs will be stored as integers. Even the final cost will be an integer.

### Assume 1 gallon of paint will cover 300 square feet.

- Fill in the body of the static method calculateWallArea(int length, width, height, num_doors, num_windows)
Assume that doors are 21 square feet and windows are 12 square feet. This method returns an int

- In the main method...
  - Prompt the user for the length, width, height, etc.
  - Use Scanner to collect keyboard input
  - Use the methods to calculate the results
  - Display the results


Calculate and display the area to be painted. (NOTE: You will NOT be painting the ceiling, floors, doors or windows.)

### SAMPLE OUTPUT #1:
```
Enter the room dimensions below
Length: 10
Width: 20
Height: 8
How many doors does the room have: 1
How many windows does the room have: 2
Enter the price of a gallon of paint: 16
Enter the sales tax percent: 8
Results
Total square feet = 435 square feet
Gallons of paint needed = 2
Total cost = 35
```
### SAMPLE OUTPUT #2:
```
Enter the room dimensions below
Length: 11
Width: 5
Height: 10
How many doors does the room have: 0
How many windows does the room have: 0
Enter the price of a gallon of paint: 15
Enter the sales tax percent: 9
Results
Total square feet = 320 square feet
Gallons of paint needed = 1
Total cost = 17
```

### SAMPLE OUTPUT #3:
```
Enter the room dimensions below
Length: 0
Width: 0
Height: 0
How many doors does the room have: 0
How many windows does the room have: 0
Enter the price of a gallon of paint: 11
Enter the sales tax percent: 5
Results
Total square feet = 0 square feet
Gallons of paint needed = 0
Total cost = 0
```
