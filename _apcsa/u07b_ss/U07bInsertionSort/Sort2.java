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
            // loop while possibleIndex is GREATER THAN ZERO & temp is less than possibleIndex-1 value
            while (possibleIndex > 1 && temp.compareTo(array[possibleIndex - 1]) < 0) {
                // shift element at possibleIndex to right one position
                array[possibleIndex] = array[possibleIndex - 1];
                possibleIndex--;
            }
            // found the best place to insert temp
            array[possibleIndex] = temp;
        }
    }

    public static void insertionSort(int[] array) {
        /* for you to complete */
    }
}