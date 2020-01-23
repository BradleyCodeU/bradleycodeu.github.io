---
layout: project
category: ch762darrays
title: Ticket Prices
permalink: /apcsa/ch762darrays/Ch76TheaterTicketPrices/
---
A theater seating chart is implemented as a two-dimensional array of ticket prices as seen below, along with the Row number.

Write a program that prompts a user to enter the number of tickets they are purchasing, and then pick their seat(s). Mark sold seats by changing the price to 0. When a user specifies a seat, make sure that it is available first. When the sale is complete, display the total sale price for the tickets, the number of tickets sold, and the seat numbers again.

```
Seat#:  1  2  3  4  5  6  7  8  9 10
Row 9: 10 10 10 10 10 10 10 10 10 10
Row 8: 10 10 10 10 10 10 10 10 10 10
Row 7: 10 10 10 10 10 10 10 10 10 10
Row 6: 10 10 20 20 20 20 20 20 10 10
Row 5: 10 10 20 20 20 20 20 20 10 10
Row 4: 10 10 20 20 20 20 20 20 10 10
Row 3: 20 20 30 30 40 40 30 30 20 20
Row 2: 20 30 30 40 50 50 40 30 30 20
Row 1: 30 40 50 50 50 50 50 50 40 30
```

Example: If I choose row 2 seat 4, the total sale price should increase by $40 and the number of tickets sold should increase by 1.

Here is a Sample Output: [ticketPricesSampleOutput.pdf](/apcsa\ch762darrays\ticketPricesSampleOutput.pdf)

There should NOT be repeated blocks of code. If code needs to be utilized multiple times, it is best practice to *create a method* for that function. Methods make your program more readable and efficient.

Create a method called printSeats that requires 1 argument: a 2D array of seats. It contains nested for loops that print the content of the array and it returns nothing.

Create a method called isSeatTaken that requires 3 arguments: a 2D array of seats, rowNumberToCheck, and seatNumberToCheck. Returns true or false.

Create a method called purchaseTicket that requires 1 argument: a 2D array of seats. This method prompts for a row number and seat number, calls the isSeatTaken method. If the seat is not taken, fills the seat with zero and returns the price for that one ticket.

When the sale is complete, display the total sale price for the tickets, the number of tickets sold, and the seat numbers again.

CHALLENGE: Repeat the process so that more than one user can purchase tickets. Display the grand totals of all sale prices, tickets sold, and seat numbers.
