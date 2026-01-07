---
layout: project
category: 201_boolean_expressions
title: U03a Paint Calc 2
---

Paint Calc 2




We created "Paint Calc Int Only" in Unit 1 that calculated the area to be painted. We will be improving this program. You do NOT need to copy/paste your previous code.

Calculate the number of cans of paint needed to paint the walls of the room.

### Assume 1 gallon of paint will cover 300 square feet.

### Assume 1 quart of paint will cover 75 square feet.

### Only full cans of paint! The result can NOT say that you need 0.6253 gallons. Perform your calculations as doubles, then round and convert to an int at the end.

- *You will only be able to purchase **full cans of paint** (no fractions of a can).*   So if you calculate that you need 1.2 gallons, you would need to purchase 2 gallons.* 

- You may make use of if statements or any built-in Java method that you can find that will round the number of cans up to the next integer.  For example, although not tested on the AP test, there are Math.floor and Math.ceil methods.

```
static double ceil(double a)

static double floor(double a)
```

See explanation and example at:
[**http://www.tutorialspoint.com/java/lang/math_ceil.htm**](http://www.tutorialspoint.com/java/lang/math_ceil.htm)

### Only in gallons OR in gallons and quarts:

- Depending on the type of paint, the store sometimes only has gallons for available and sometimes has both gallons and quarts available. Determine the amount of paint to be purchased in each situation.  

**For example**, if you are painting a room has an area of 340 square feet:

If only gallons are available, you would need 2 gallons.
If gallons and quarts are available, you would need 1 gallon 1 quart

1. Create a public static method named calculateTotalSquareFeet that has 5 parameters: length, width, height, doors, windows. Returns the surface area of the walls as a double.

2. Create a public static method named calculateIfGallonsOnly that has 1 parameter: totalSqFeet. Returns a String that says "If gallons only = " and the number of gallons rounded up.

3. Create a public static method named calculateIfQuartsAvailable that has 1 parameter: totalSqFeet. Returns a String that says "If quarts are available = " and the number of gallons and quarts. NOTE: If there are no quarts needed, do NOT display “0 quarts”.


### Displaying results:

  - If more than 1 gallon is needed display “gallons” next to the number of gallons.   
  - If only 1 gallon is needed, display “gallon”.  
  - For quarts, do the same (choose quart or quarts based on the number needed)
  - If there are no quarts needed, do NOT display “0 quarts”.


### Example calculations: [Paint Calculator Calculation Example.docx](/apcsa/ch5decisions/PaintCalculatorCalculationExample.pdf)


### Sample run 1:
```
Enter the room dimensions below
Length: 10.5
Width: 25.6
Height: 10.7
How many doors does the room have: 1
How many windows does the room have: 2
Total square feet = 727.54 square feet
If gallons only = 3 gallons
If quarts are available = 2 gallons and 2 quarts
```
### Sample run 2:
```
Enter the room dimensions below
Length: 1
Width: 1
Height: 1
How many doors does the room have: 0
How many windows does the room have: 0
Total square feet = 4.0 square feet
If gallons only = 1 gallon
If quarts are available = 0 gallons and 1 quart
```
### Sample run 3:
```
Enter the room dimensions below
Length: 148
Width: 1
Height: 1
How many doors does the room have: 0
How many windows does the room have: 0
Total square feet = 298.0 square feet
If gallons only = 1 gallon
If quarts are available = 1 gallon
```

  
