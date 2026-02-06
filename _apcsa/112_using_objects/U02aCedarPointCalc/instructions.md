---
layout: project
category: 112_using_objects
title: U02a Cedar Point Calc
---
Cedar Point Calc

NOTE 1: You do NOT need to use any "if" statements for this project

NOTE 2: Use the Dollar class. Documentation for the Dollar class is here: https://bradleycodeu.github.io/apcsa/112_using_objects/U02aCedarPointCalc/doc/Dollar.html 
- A new subtraction method has been added: Dollar sub(Dollar other) 
- A new multiplication method has been added: Dollar mult(double multiplier)

Project Directions:

Mr. Cook has decided to send all student class officers from grades 7 - 12 to Cedar Point to thank them for their work. He doesn't know *exactly* how many students will be attending right now, but he has asked you to write a program that can  calculate and display the total expenses of the trip.

He will need to send 1 teacher chaperone for every 4 students (rounded down). Use modulo to determine the number of chaperones.

The trip could EITHER be held in the fall or held in the spring. Calculate and display the costs for both options...
- Fall admission price is $43 per ticket for students and $43 per chaperone. Spring admission is $36.99 per student and $45.99 per chaperones.

Coupons...
- Every 16th STUDENT earns a coupon for 1 free student admission (either -$43 in fall or -$36.99 in spring). If 33 students go, then you'd earn 2 free student admission coupons. Use modulo to determine the number of coupons.

They could EITHER take school buses ($1300.42 per 44 person bus) or take charter buses ($1738.92 per 55 person bus). Calculate and display the costs for both options.

Finally, Mr. Cook needs to budget a $25 food allowance for every chaperone and student.


1. YOU MUST WRITE YOUR PSEUDOCODE AS COMMENTS (Mr Riley USUALLY does this for you!)
1. Prompt user for number of students
1. Calculate and print how many teacher chaperones will be needed
1. Calculate and print how many free student coupons will be earned
1. Calculate and print the cost of admission for fall. Don't forget to subtract coupons!
1. Calculate and print the cost of admission for spring. Don't forget to subtract coupons!
1. Calculate and print the number of school buses needed.
1. Calculate and print the school bus cost.
1. Calculate and print the number of charter buses needed.
1. Calculate and print the charter bus cost
1. Calculate and print the cost for the food allowance
1. Calculate and print the FINAL cost of ALL FOUR OPTIONS:
  - a fall trip with school buses
  - a spring trip with school buses
  - a fall trip with charter buses
  - a spring trip with charter buses

Aesthetics are important!!! Keep your pseudocode as comments in order to explain your thinking. Make sure your input and output looks neat and is spaced nicely (USE print for the prompt). Make sure you have used appropriate/readable variable names.

Example Output 1
```
Students attending: 33
=====RESULTS=====
Chaperones = 8
Free student coupons = 2
Fall admission = $1,677.00
Spring admission = $1,514.61
Number of School Buses = 1
Cost of School Buses = $1,300.42
Number of Charter Buses = 1
Cost of Charter Buses = $1,738.92
Food cost = $1,025.00
FINAL TOTALS...Fall Cost...Spring Cost
School Buses   $4,002.42   $3,840.03
Charter Buses   $4,440.92   $4,278.53
```

Example Output 2
```
Students attending: 80
=====RESULTS=====
Chaperones = 20
Free student coupons = 5
Fall admission = $4,085.00
Spring admission = $3,694.05
Number of School Buses = 3
Cost of School Buses = $3,901.26
Number of Charter Buses = 2
Cost of Charter Buses = $3,477.84
Food cost = $2,500.00
FINAL TOTALS...Fall Cost...Spring Cost
School Buses   $10,486.26   $10,095.31
Charter Buses   $10,062.84   $9,671.89
```
  
