import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_Sort2 {

    
    @Test
public void sort_string_array() {
  // Enter code here
  String[] stringArray = {"b" , "B" , "a" , "C" , "A" , "c"};
  String[] stringArrayExpected = {"A" , "B" , "C" , "a" , "b" , "c"};
  Sort2.insertionSort(stringArray);
  for(int i=0; i<stringArray.length; i++){
    assertEquals(stringArray[i],stringArrayExpected[i]);
  }
}


@Test
public void sort_int_array() {
  // Enter code here
  int[] intArray = {8, 2, 7, 3, 6, 4, 5};
  int[] intArrayExpected = {2, 3, 4, 5, 6, 7, 8};
  Sort2.insertionSort(intArray);
  for(int i=0; i<intArray.length; i++){
    assertEquals(intArray[i], intArrayExpected[i]);
  }
}

}