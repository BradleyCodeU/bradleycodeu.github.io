import java.util.*;

public class Sort3 {
  
    /*----------Merge Sort for int[]----------*/
    // NOTE: THERE ARE NO BUGS
    public static void mergeSort(int[] array) {
        int n = array.length;
        int[] temp = new int[n];
        mergeSortHelper(array, 0, n - 1, temp);
    }
    // NOTE: THERE ARE NO BUGS
    private static void mergeSortHelper(int[] array, int from, int to, int[] temp) {
        if (from < to) {
            int middle = (from + to) / 2;
            mergeSortHelper(array, from, middle, temp);
            mergeSortHelper(array, middle + 1, to, temp);
            merge(array, from, middle, to, temp);
        }
    }
    // NOTE: THERE ARE NO BUGS
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