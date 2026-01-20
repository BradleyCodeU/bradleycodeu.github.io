import static org.junit.Assert.*;
import org.junit.Test;

public class Test_ClubMeetingApp {

    @Test
    public void testRandomNumberExclusive_rangeCheck() {
        int min = 1;
        int max = 10;
        // Run the test multiple times to account for randomness
        for (int i = 0; i < 100; i++) {
            int result = ClubMeetingApp.randomNumberExclusive(min, max);
            assertTrue("Result should be >= min", result >= min);
            assertTrue("Result should be < max", result < max);
        }
    }

    @Test
    public void testRandomNumberExclusive_singleValueRange() {
        // If min is 5 and max is 6, the only possible integer is 5
        int result = ClubMeetingApp.randomNumberExclusive(5, 6);
        assertEquals(5, result);
    }

    @Test
    public void testCheatersDiceMax_rangeCheck() {
        int min = 1;
        int max = 7; // Simulating a 6-sided die
        for (int i = 0; i < 100; i++) {
            int result = ClubMeetingApp.cheatersDiceMax(min, max);
            assertTrue("Result should be >= 1", result >= 1);
            assertTrue("Result should be <= 6", result <= 6);
        }
    }

    @Test
    public void testCheatersDiceMax_sameMinMax() {
        // Range 10 to 11 should always return 10
        int result = ClubMeetingApp.cheatersDiceMax(10, 11);
        assertEquals(10, result);
    }

    @Test
    public void testCheatersDiceMin_rangeCheck() {
        int min = 1;
        int max = 7;
        for (int i = 0; i < 100; i++) {
            int result = ClubMeetingApp.cheatersDiceMin(min, max);
            assertTrue("Result should be >= 1", result >= 1);
            assertTrue("Result should be <= 6", result <= 6);
        }
    }

     @Test
    public void testCheatersDiceMin_sameMinMax() {
        // Range 13 to 14 should always return 13
        int result = ClubMeetingApp.cheatersDiceMin(13, 14);
        assertEquals(13, result);
    }

    @Test
    public void testCheatersDiceMin_largeRange() {
        int result = ClubMeetingApp.cheatersDiceMin(1, 1000);
        assertTrue("Result should be within large range", result >= 1 && result < 1000);
    }

    @Test
    public void testCheatersDiceMax_BiasCheck() {
        int min = 1;
        int max = 7;
        int countOfOnes = 0;
        int countOfSixes = 0;
        
        // Use a higher iteration count to stabilize statistical results
        for (int i = 0; i < 1000; i++) {
            int result = ClubMeetingApp.cheatersDiceMax(min, max);
            if (result == 1) countOfOnes++;
            if (result == 6) countOfSixes++;
            
            // Basic range safety
            assertTrue(result >= 1 && result <= 6);
        }

        // Statistically, 6s should be much more frequent than 1s
        assertTrue("Max dice should have more 6s than 1s. Found 6s: " + 
                   countOfSixes + ", 1s: " + countOfOnes, countOfSixes > countOfOnes);
    }

    @Test
    public void testCheatersDiceMin_BiasCheck() {
        int min = 1;
        int max = 7;
        int countOfOnes = 0;
        int countOfSixes = 0;

        for (int i = 0; i < 1000; i++) {
            int result = ClubMeetingApp.cheatersDiceMin(min, max);
            if (result == 1) countOfOnes++;
            if (result == 6) countOfSixes++;
            
            assertTrue(result >= 1 && result <= 6);
        }

        // Statistically, 1s should be much more frequent than 6s
        assertTrue("Min dice should have more 1s than 6s. Found 1s: " + 
                   countOfOnes + ", 6s: " + countOfSixes, countOfOnes > countOfSixes);
    }

    @Test
    public void testAllValuesGenerated() {
        // Verification that every number 1-6 is possible
        boolean[] hit = new boolean[7]; // index 1-6
        for (int i = 0; i < 500; i++) {
            hit[ClubMeetingApp.randomNumberExclusive(1, 7)] = true;
        }
        for (int i = 1; i <= 6; i++) {
            assertTrue("Value " + i + " was never generated", hit[i]);
        }
    }
}