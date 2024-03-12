# Binary Search

Watch these videos about search routines. 

Linear Search: [https://drive.google.com/open?id=1vrDwnwQkJSjTc_vosKHJZT2GhYVWO0-F](https://drive.google.com/open?id=1vrDwnwQkJSjTc_vosKHJZT2GhYVWO0-F)

You have been utilizing a linear search each time you use a loop to look at each item in an array until you match the element for which you are looking. A linear search or sequential search is a method for finding an element within a list. It sequentially checks each element of the list until a match is found or the whole list has been searched.

Imagine going into a library and trying to find the book "War And Peace" by inspecting the first book on the shelf and then the next and then the next.  A linear search is NOT the most efficient as every element might need to be examined.

Binary Search: [https://drive.google.com/open?id=16g37sM4SJwvXz8ma_SRxs1NpuQlQLkuT](https://drive.google.com/open?id=16g37sM4SJwvXz8ma_SRxs1NpuQlQLkuT)

A binary search, on the other hand, continually divides the data set in half and continues to look for the match in each new half of the data. Before using a binary search, the data must be in sorted order. A binary search is much more efficient, as the search field is split in half each pass.



Requirements:

1. A starter template has been provided. The Search class is a utility class (aka a static class) that contains 2 methods:
   - binarySearch(int[] array, int target)
   - binarySearch(String[] array, String target)

 1. The binarySearch(int[] array, int target) method is complete but contains 1 bug that you MUST fix. Read the pseudocode comments to help you find and fix the bug.
 1. Copy the binarySearch(int[] array, int target) code and paste it into the binarySearch(String[] array, String target) method. Adjust the code for a String[] array.
 1. Finally, test both methods using the Main class.

## Example Output
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