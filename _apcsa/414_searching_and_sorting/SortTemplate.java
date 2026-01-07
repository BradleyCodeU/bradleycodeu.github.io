import java.util.*;
public class SortTemplate{

    /* ----------Selection Sort---------- */

  public static void selectionSort(int[] array){
    for(int i = 0; i < array.length - 1; i++){
      ///
      for(int j = i + 1; j < array.length; j++){
        if(array[j] < array[minIndex]){
          ///
        }
      }
      ///
      ///
      ///
    }
  }

  public static void selectionSort(String[] array){
    /// copy/paste selectionSort(int[] array) and adjust it for a String[] array
  }

    /* ----------Insertion Sort---------- */

  public static void insertionSort(int[] array){
    for(int i = 1; i < array.length; i++){
      ///
      ///
      while(possibleIndex > 0 && temp < array[possibleIndex - 1]){
        ///
        ///
      }
      ///
    }
  }

  public static void insertionSort(String[] array){
    /// copy/paste insertionSort(int[] array) and adjust it for a String[] array
  }


    /* ----------Merge Sort for int[]---------- */


  public static void mergeSort(int[] array){
    ///
    ///
    mergeHelpInt(array, 0, n-1, temp);
  }

  private static void mergeSortHelper(int[] array, int from, int to, int[] temp){
    if (from < to){
      ///
      mergeHelpInt(array, from, mid, temp);
      mergeHelpInt(array, mid+1, to, temp);
      merge(array, from, middle, to, temp);
    }
  }

  private static void merge(int[] array, int from, int mid, int to, int[] temp){
    ///
    ///
    ///
    while (i <= mid && j <= to){
      if (elements[i] < elements[j]){
        ///
        ///
      }
      else{
        ///
        ///
      }
      ///
    }
    while (i <= mid){
      ///
      ///
      ///
    }
    while (j <= to){
      ///
      ///
      ///
    }
    for (k = from; k <= to; k++){
      ///
    }
  }


      /* ----------Merge Sort for String[]---------- */


  public static void mergeSort(String[] elements){
    /// copy/paste and adjust for String[]
  }

  private static void mergeSortHelper(String[] elements, int from, int to, String[] temp){
    /// copy/paste and adjust for String[]
  }

  private static void merge(String[] elements, int from, int mid, int to, String[] temp){
    /// copy/paste and adjust for String[]
  }
}
