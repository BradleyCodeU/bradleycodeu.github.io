import java.util.*;

public class Sort1 {

    public static void selectionSort(int[] array) {
        // loop from j=0 to j=length-2 (inclusive) in order to complete length-1 passes
        for (int j = 0; j < array.length - 1; j++) {
            int minIndex = j;
            // find the minimum item in the rest of the array
            for (int k = j + 1; k < array.length; k++) {
                if (array[k] < array[minIndex]) {
                    minIndex = k;
                }
            }
            // SWAP the item at index j with the minimum item in the rest of the array
            int temp = array[j];
            array[minIndex] = temp;
            array[j] = array[minIndex];
        }
    }

    public static void selectionSort(String[] array) {
        /* copy/paste the selectionSort(int[] array) code and adjust it for a String[] array */
    }
}