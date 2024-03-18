import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_U02bWeirdCalc {





  @Test
  void testFindSumAndProduct() {
      assertEquals("The sum is 39 and the product is 380", U02bWeirdCalc.findSumAndProduct(19, 20));
      assertEquals("The sum is 15 and the product is 56", U02bWeirdCalc.findSumAndProduct(8, 7));
  }

  @Test
  void testFindDifferenceAndDistance() {
      assertEquals("The difference is -1 and the distance is 1", U02bWeirdCalc.findDifferenceAndDistance(19, 20));
      assertEquals("The difference is 1 and the distance is 1", U02bWeirdCalc.findDifferenceAndDistance(8, 7));
  }

  @Test
  void testFindAverage() {
      assertEquals("The average is 19.5", U02bWeirdCalc.findAverage(19, 20));
      assertEquals("The average is 7.5", U02bWeirdCalc.findAverage(8, 7));
  }

  @Test
  void testFindMaximumAndMinimum() {
      assertEquals("The maximum is 20 and the minimum is 19", U02bWeirdCalc.findMaximumAndMinimum(19, 20));
      assertEquals("The maximum is 8 and the minimum is 7", U02bWeirdCalc.findMaximumAndMinimum(8, 7));
  }

  @Test
  void testFindModulo() {
      assertEquals("19 % 20 = 19 and 20 % 19 = 1", U02bWeirdCalc.findModulo(19, 20));
      assertEquals("8 % 7 = 1 and 7 % 8 = 7", U02bWeirdCalc.findModulo(8, 7));
  }
  @Test
    void testExampleOutput1() {
        int num1 = 19;
        int num2 = 20;

        assertEquals("The sum is 39 and the product is 380", U02bWeirdCalc.findSumAndProduct(num1, num2));
        assertEquals("The difference is -1 and the distance is 1", U02bWeirdCalc.findDifferenceAndDistance(num1, num2));
        assertEquals("The average is 19.5", U02bWeirdCalc.findAverage(num1, num2));
        assertEquals("The maximum is 20 and the minimum is 19", U02bWeirdCalc.findMaximumAndMinimum(num1, num2));
        assertEquals("19 % 20 = 19 and 20 % 19 = 1", U02bWeirdCalc.findModulo(num1, num2));
    }

    @Test
    void testExampleOutput2() {
        int num1 = 8;
        int num2 = 7;

        assertEquals("The sum is 15 and the product is 56", U02bWeirdCalc.findSumAndProduct(num1, num2));
        assertEquals("The difference is 1 and the distance is 1", U02bWeirdCalc.findDifferenceAndDistance(num1, num2));
        assertEquals("The average is 7.5", U02bWeirdCalc.findAverage(num1, num2));
        assertEquals("The maximum is 8 and the minimum is 7", U02bWeirdCalc.findMaximumAndMinimum(num1, num2));
        assertEquals("8 % 7 = 1 and 7 % 8 = 7", U02bWeirdCalc.findModulo(num1, num2));
    }





}