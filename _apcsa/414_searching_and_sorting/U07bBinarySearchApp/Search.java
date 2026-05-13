public class Search {

  public static int binarySearch(int[] elements, int target) {
    // set left & right to min & max indexes, this is the search range
    int leftIndex = 0;
    int rightIndex = elements.length - 1;
    // loop as long as there is a valid search range
    while (leftIndex <= rightIndex) {
      // set middle to HALFWAY between left & right
      int middleIndex = leftIndex + (rightIndex / 2);
      // if the target is less than value at middleIndex
      if (target < elements[middleIndex]) {
        // set right edge of search range to middleIndex-1
        rightIndex = middleIndex - 1;
      }
      // if the target is GREATER THAN value at middleIndex
      else if (target >= elements[middleIndex]) {
        // set left edge of search range to middleIndex+1
        leftIndex = middleIndex + 1;
      }
      // the target equals the middleIndex
      else {
        // match was found, return the index location
        return middleIndex;
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
