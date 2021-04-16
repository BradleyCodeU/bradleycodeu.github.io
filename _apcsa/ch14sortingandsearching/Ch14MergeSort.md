---
layout: project
category: ch14sortingandsearching
title: MergeSort
---

Watch the following videos about the Merge sort routine.

Merge Sort: [https://drive.google.com/open?id=1Y6fOAtjB1edAdt_tXgUt1zNK-fzgAw3u](https://drive.google.com/open?id=1Y6fOAtjB1edAdt_tXgUt1zNK-fzgAw3u)

Merge Sort Robot Animation: [https://drive.google.com/open?id=1_zHzD45Y17_P1fsDxnPdX0sjJb1cZACO](https://drive.google.com/open?id=1_zHzD45Y17_P1fsDxnPdX0sjJb1cZACO)

Directions:

1. Copy the templates below. The Sort3 class is a utility class (aka a static class) that contains 6 methods:
   - mergeSort(int[] array)
   - mergeSortHelper(int[] array, int from, int to, int[] temp)
   - merge(int[] array, int from, int mid, int to, int[] temp)
   - mergeSort(String[] array)
   - mergeSortHelper(String[] array, int from, int to, String[] temp)
   - merge(String[] array, int from, int mid, int to, String[] temp)

2. The first three methods are complete. No bugs. These three methods work together to sort an int[]
3. Copy the mergeSort(int[] array) code and paste it into the mergeSort(String[] array) method. Adjust the code for a String[] array. Do the same for the other methods.
4. Finally, test both methods using the Main class.

Expected Output:
```
Testing [348, 3, 39, 333, 37, 397, 99, 9, 73]
Expected Output [3, 9, 37, 39, 73, 99, 333, 348, 397]
Actual Result:
[3, 9, 37, 39, 73, 99, 333, 348, 397]

Testing ["school", "Z", "high", "Java", "Y", "ABC", "Hello", "X", "bradley"]
Expected Output ["ABC", "Hello", "Java", "X", "Y", "Z", "bradley", "high", "school"]
Actual Result:
["ABC", "Hello", "Java", "X", "Y", "Z", "bradley", "high", "school"]
```

## Starter Templates:

Main.java:
```
public class Main
{
    // public static void main

    // run tests of mergeSort(int[] array) and mergeSort(String[] array)

    // use Java utility class Arrays to quickly/easily print contents of an array
    System.out.println(Arrays.toString(myArray));
}
```

Sort3.java
```
import java.util.*;
public class Sort3 {
    /*----------Merge Sort for int[]----------*/

    public static void mergeSort(int[] array) {
        int n = array.length;
        int[] temp = new int[n];
        mergeSortHelper(array, 0, n - 1, temp);
    }

    private static void mergeSortHelper(int[] array, int from, int to, int[] temp) {
        if (from < to) {
            int middle = (from + to) / 2;
            mergeSortHelper(array, from, middle, temp);
            mergeSortHelper(array, middle + 1, to, temp);
            merge(array, from, middle, to, temp);
        }
    }

    private static void merge(int[] array, int from, int mid, int to, int[] temp) {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            }
            else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = array[i];
            i++;
            k++;
        }
        while (j <= to) {
            temp[k] = array[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++) {
            array[k] = temp[k];
        }
    }

    /*----------Merge Sort for String[]----------*/

    public static void mergeSort(String[] array) {
        /* to do */
    }

    private static void mergeSortHelper(String[] array, int from, int to, String[] temp) {
        /* to do */
    }

    private static void merge(String[] array, int from, int mid, int to, String[] temp) {
        /* to do */
    }
}
```
