public class Search {

  public static int binarySearch(int[] elements, int target) {
    // set left & right to min & max indexes, this is the search range
    int left = 0;
    int right = elements.length - 1;
    // loop as long as there is a valid search range
    while (left <= right) {
      // set middle to halfway between left & right
      int middle = (left + right) / 2;
      // if the target is less than middle
      if (target < elements[middle]) {
        // set right edge of search range to middle-1
        right = middle - 1;
      }
      // if the target is GREATER THAN middle
      else if (target >= elements[middle]) {
        // set left edge of search range to middle+1
        left = middle + 1;
      }
      // the target equals the middle
      else {
        // match was found, return the index location
        return middle;
      }
    }
    // target is not contained in elements
    return -1;
  }

  public static int binarySearch(String[] elements, String target) {
    /*
     * copy/paste the binarySearch(int[] array) code and adjust it for a String[]
     * array
     */
    return -1;
  }
}
