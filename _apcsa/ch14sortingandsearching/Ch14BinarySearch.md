---
layout: project
category: ch14sortingandsearching
title: Binary Search
---
Watch the videos about search routines. You have been utilizing a linear search each time you use a loop to look at each item in an array until you match the element for which you are looking. A linear search or sequential search is a method for finding an element within a list. It sequentially checks each element of the list until a match is found or the whole list has been searched.

Imagine going into a library and trying to find the book "War And Peace" by inspecting the first book on the shelf and then the next and then the next.  A linear search is NOT the most efficient as every element might need to be examined.

Linear Search: [https://drive.google.com/open?id=1vrDwnwQkJSjTc_vosKHJZT2GhYVWO0-F](https://drive.google.com/open?id=1vrDwnwQkJSjTc_vosKHJZT2GhYVWO0-F)

A binary search, on the other hand, continually divides the data set in half and continues to look for the match in each new half of the data. Before using a binary search, the data must be in sorted order. A binary search is much more efficient, as the search field is split in half each pass.

Binary Search: [https://drive.google.com/open?id=16g37sM4SJwvXz8ma_SRxs1NpuQlQLkuT](https://drive.google.com/open?id=16g37sM4SJwvXz8ma_SRxs1NpuQlQLkuT)

Requirements:

1. Copy the templates below. The Search class is a utility class (aka a static class) that contains 2 methods:
   - binarySearch(int[] array)
   - binarySearch(String[] array)

 1. The binarySearch(int[] array) method is complete but contains 1 bug that you MUST fix. Read the pseudocode comments to help you find and fix the bug.
 1. Copy the binarySearch(int[] array) code and paste it into the binarySearch(String[] array) method. Adjust the code for a String[] array.
 1. Finally, test both methods using the Main class.

Example Output
```
Sorted int array [1, 3, 5, 7, 14, 19, 20, 24, 29]
Running binarySearch(myIntArray, 5), expected 2
2
Running binarySearch(myIntArray, 1), expected 0
0
Running binarySearch(myIntArray, 18), expected -1
-1

Sorted str array ["apple","coconut","orange"]
Running binarySearch(myArray, "orange"), expected 2
2
Running binarySearch(myArray, "apple"), expected 0
0
Running binarySearch(myArray, "banana"), expected -1
-1
```

## Starter Templates:

Main.java
```
public class Main
{
    // public static void main

    // run tests of binarySearch(int[] array) and binarySearch(String[] array)

    // use Java utility class Arrays to quickly/easily print contents of an array
    System.out.println(Arrays.toString(myArray));
}
```

Search.java
```
import java.util.*;
public class Search {

    public static int binarySearch(int[] elements, int target) {
        // set left & right to min & max indexes, this is the search range
        int left = 0;
        int right = elements.length - 1;
        // loop as long as there is a valid search range
        while (left <= right) {
            // set middle to halfway between left & right
            int middle = (left + right) / 2;
            if (target < elements[middle]) {
                // target less than middle, set right edge of search range to middle-1
                right = middle - 1;
            }
            else if (target >= elements[middle]) {
                // target greater than middle, set left edge of search range to middle+1
                left = middle + 1;
            } 
            else {
                // match was found, return the index location
                return middle;
            }
        }
        // target is not contained in elements
        return -1;
    }

    public static int binarySearch(String[] elements, String target) {
        /* copy/paste the binarySearch(int[] array) code and adjust it for a String[] array */
    }
}
```
