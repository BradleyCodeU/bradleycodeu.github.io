import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_Search {



@Test
public void binarySearch_String_array() {
  // Enter code here
  String[] myStringArray = new String[] {"apple", "coconut", "orange"};
  int result = Search.binarySearch(myStringArray, "orange");
  assertEquals(2, result);
  result = Search.binarySearch(myStringArray, "apple");
  assertEquals(0, result);
  result = Search.binarySearch(myStringArray, "banana");
  assertEquals(-1, result);
}


@Test
public void binarySearch_int_array() {
  int[] myIntArray = new int[] {1, 3, 5, 7, 14, 19, 20, 24, 29};
  int result = Search.binarySearch(myIntArray, 5);
  assertEquals(2, result);
  result = Search.binarySearch(myIntArray, 1);
  assertEquals(0, result);
  result = Search.binarySearch(myIntArray, 18);
  assertEquals(-1, result);
  

}
}