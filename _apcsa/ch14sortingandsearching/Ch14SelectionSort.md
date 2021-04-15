---
layout: project
category: ch14sortingandsearching
title: SelectionSort
---

For the AP Exam, you are required to know how 3 popular sort routines work. Watch the following video about the Selection sort routine.

Selection Sort: [https://drive.google.com/open?id=19ZCklKIltbEx3uHw0gUJHf8q1f0NrohH](https://drive.google.com/open?id=19ZCklKIltbEx3uHw0gUJHf8q1f0NrohH)

Directions:

1. Copy the templates below. The SelectionSort class is a utility class (aka a static class) that contains 2 methods:
   - selectionSort(int[] array)
   - selectionSort(String[] array)

1. The selectionSort(int[] array) method is complete but contains 1 bug that you MUST fix. Read the pseudocode comments to help you find and fix the bug.
1. Copy the selectionSort(int[] array) code and paste it into the selectionSort(String[] array) method. Adjust the code for a String[] array.
1. Finally, test both methods using the Main class.

Expected Output:
```
Testing [6,3,4,7,1,8,2,9,0]
Expected Output [0, 1, 2, 3, 4, 6, 7, 8, 9]
Actual Result:
[0, 1, 2, 3, 4, 6, 7, 8, 9]

Testing ["my", "name", "is", "SelectionSort", "Hi"]
Expected Output ["Hi", "SelectionSort", "is", "my", "name"]
Actual Result:
["Hi", "SelectionSort", "is", "my", "name"]
```


## Starter Templates:

Main.java
```
public class Main
{
  // public static void main

  // run tests of selectionSort(int[] array) and selectionSort(String[] array)

  // use Java utility class Arrays to quickly/easily print contents of an array
  System.out.println(Arrays.toString(myIntArray));
}
```

SelectionSort.java
```
import java.util.*;
public class SelectionSort {

  public static void selectionSort(int[] array){
    // loop from j=0 to j=length-2 (inclusive) in order to complete length-1 passes
    for(int j = 0; j < array.length - 1; j++){
      int minIndex = j;
      // find the minimum item in the rest of the array
      for(int k = i + 1; k < array.length; k++){
        if(array[k] < array[minIndex]){
          minIndex = k;
        }
      }
      // swap the item at index j with the minimum item in the rest of the array
      int temp = array[j];
      array[minIndex] = temp;
      array[j] = array[minIndex];
    }
  }

  public static void selectionSort(String[] array){
    /* copy/paste the selectionSort(int[] array) code and adjust it for a String[] array */
  }
}
```
