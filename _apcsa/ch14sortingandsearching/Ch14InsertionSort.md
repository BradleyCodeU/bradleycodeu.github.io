---
layout: project
category: ch14sortingandsearching
title: Insertion Sort
---

Watch the following video about the Insertion sort routine

Insertion Sort: [https://drive.google.com/open?id=1jRg0mKpKaiB0Pc0v4wE90b3f3FiWdZv3](https://drive.google.com/open?id=1jRg0mKpKaiB0Pc0v4wE90b3f3FiWdZv3)

Directions:

1. Copy the templates below. The Sort2 class is a utility class (aka a static class) that contains 2 methods:
   - insertionSort(String[] array)
   - insertionSort(int[] array)

2. The insertionSort(String[] array) method is complete but contains 1 bug that you MUST fix. Read the pseudocode comments to help you find and fix the bug.
3. Copy the insertionSort(String[] array) code and paste it into the insertionSort(int[] array) method. Adjust the code for a int[] array.
4. Finally, test both methods using the Main class.

Expected Output:
```
Testing [66, 3, 44, 7, 1, 88, 22, 9]
Expected Output [1, 3, 7, 9, 22, 44, 66, 88]
Actual Result:
[1, 3, 7, 9, 22, 44, 66, 88]

Testing ["works", "like", "sorting", "a", "hand", "while", "playing", "cards", "InsertionSort"]
Expected Output ["InsertionSort", "a", "cards", "hand", "like", "playing", "sorting", "while", "works"]
Actual Result:
["InsertionSort", "a", "cards", "hand", "like", "playing", "sorting", "while", "works"]
```

## Starter Templates:

Main.java:
```
public class Main
{
    // public static void main

    // run tests of insertionSort(String[] array) and insertionSort(int[] array)

    // use Java utility class Arrays to quickly/easily print contents of an array
    System.out.println(Arrays.toString(myStringArray));
}
```

Sort2.java:
```
import java.util.*;
public class Sort2 {

    public static void insertionSort(String[] array) {
        // loop from j=1 to j=length-1 (inclusive) completing length-1 passes
        for (int j = 1; j < array.length; j++) {
            // copy index j value to temp creating an "empty" space at index j
            // temp is the value we are moving/inserting
            String temp = array[j];
            // use possibleIndex to store the best place to put index j
            int possibleIndex = j;
            // loop from j-1 to ZERO and stop if temp comes before possibleIndex-1
            while (possibleIndex > 1 && temp.compareTo(array[possibleIndex - 1]) < 0) {
                // shift element at possibleIndex to right one position
                array[possibleIndex] = array[possibleIndex - 1];
                possibleIndex--;
            }
            // we found the best place to insert temp
            array[possibleIndex] = temp;
        }
    }

    public static void insertionSort(int[] array) {
        /* for you to complete */
    }
}
```
