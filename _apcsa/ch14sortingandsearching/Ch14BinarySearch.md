---
layout: project
category: ch14sortingandsearching
title: Binary Search
---
Watch the videos about search routines. You have been utilizing a linear search each time you use a loop to look at each item in an array until you match the element for which you are looking. A binary search, on the other hand, continually divides the data set in half and continues to look for the match in each new half of the data. Before using a binary search, the data must be in sorted order.

Linear Search: [https://drive.google.com/open?id=1vrDwnwQkJSjTc_vosKHJZT2GhYVWO0-F](https://drive.google.com/open?id=1vrDwnwQkJSjTc_vosKHJZT2GhYVWO0-F)

Binary Search: [https://drive.google.com/open?id=16g37sM4SJwvXz8ma_SRxs1NpuQlQLkuT](https://drive.google.com/open?id=16g37sM4SJwvXz8ma_SRxs1NpuQlQLkuT)

Requirements:

Create a static method named binarySearch that requires two arguments, an array of sorted strings and an string search query (what value you are searching for). Returns the index location of the search query if found or returns -1 if not found. USE [THIS PDF](/apcsa\ch14sortingandsearching\SortSearchCode-BinarySeach.pdf) TO GUIDE YOU

Create a public static void main() method to test your binarySearch method. Print the expected result and the actual result.

Example Output
```
Using sorted str array ["apple","coconut","orange"]
Running binarySearch(myArray, "orange"), expected 2
2
Running binarySearch(myArray, "apple"), expected 0
0
Running binarySearch(myArray, "banana"), expected -1
-1
```
