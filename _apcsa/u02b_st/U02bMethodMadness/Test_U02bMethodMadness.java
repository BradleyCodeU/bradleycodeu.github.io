import static org.junit.Assert.*;
import org.junit.Test;

public class Test_U02bMethodMadness {

    // Test for whichIsLarger
    @Test
    public void testWhichIsLarger() {
        assertEquals("25 is larger than 15", U02bMethodMadness.whichIsLarger(15, 25));
        assertEquals("6 is larger than 4", U02bMethodMadness.whichIsLarger(6, 4));
        assertEquals("10 is larger than -5", U02bMethodMadness.whichIsLarger(-5, 10));
        assertEquals("0 is larger than -1", U02bMethodMadness.whichIsLarger(-1, 0));
    }

    // Test for funFacts
    @Test
    public void testFunFacts() {
        String result1 = U02bMethodMadness.funFacts(-3, 4);
        assertTrue(result1.contains("Absolute value of -3 is 3"));
        assertTrue(result1.contains("-3 to the power of 4 is 81.0"));
        assertTrue(result1.contains("Square root of -3 is NaN"));
        assertTrue(result1.contains("Random number between -3 and 4 is"));

        String result2 = U02bMethodMadness.funFacts(3, 4);
        assertTrue(result2.contains("Absolute value of 3 is 3"));
        assertTrue(result2.contains("3 to the power of 4 is 81.0"));
        assertTrue(result2.contains("Square root of 3 is"));
        assertTrue(result2.contains("Random number between 3 and 4 is"));

        String result3 = U02bMethodMadness.funFacts(9, 5);
        assertTrue(result3.contains("Absolute value of 9 is 9"));
        assertTrue(result3.contains("9 to the power of 5 is 59049.0"));
        assertTrue(result3.contains("Square root of 9 is 3.0"));
        assertTrue(result3.contains("Random number between 9 and 5 is"));

        String result4 = U02bMethodMadness.funFacts(-9, -5);
        assertTrue(result4.contains("Absolute value of -9 is 9"));
        assertTrue(result4.contains("-9 to the power of -5 is"));
        assertTrue(result4.contains("Square root of -9 is NaN"));
        assertTrue(result4.contains("Random number between -9 and -5 is"));
    }

    // Test for textOrder
    @Test
    public void testTextOrder() {
        assertEquals("apple comes before banana lexicographically", U02bMethodMadness.textOrder("apple", "banana"));
        assertEquals("banana comes before apple lexicographically", U02bMethodMadness.textOrder("banana", "apple"));
        assertEquals("coconut comes before dragonfruit lexicographically", U02bMethodMadness.textOrder("dragonfruit", "coconut"));
        assertEquals("grape comes before grapes lexicographically", U02bMethodMadness.textOrder("grape", "grapes"));
    }
}
