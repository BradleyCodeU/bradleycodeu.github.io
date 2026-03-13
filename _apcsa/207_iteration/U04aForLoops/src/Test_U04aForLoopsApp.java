import static org.junit.Assert.*;
import org.junit.Test;

public class Test_U04aForLoopsApp {

    // Test for sumEvensExclusive
    @Test
    public void testSumEvensExclusive() {
        // Between 2 and 10 (4 + 6 + 8)
        assertEquals(18, U04aForLoopsApp.sumEvensExclusive(10));
        // Between 2 and 5 (only 4)
        assertEquals(4, U04aForLoopsApp.sumEvensExclusive(5));
        // Between 2 and 3 (no evens)
        assertEquals(0, U04aForLoopsApp.sumEvensExclusive(3));
        // Between 2 and 25
        assertEquals(154, U04aForLoopsApp.sumEvensExclusive(25));
    }

    // Test for sumSquaresExclusive
    @Test
    public void testSumSquaresExclusive() {
        // Between 1 and 10 (1 + 4 + 9)
        assertEquals(14, U04aForLoopsApp.sumSquaresExclusive(10));
        // Between 1 and 20 (1 + 4 + 9 + 16)
        assertEquals(30, U04aForLoopsApp.sumSquaresExclusive(20));
        // Between 1 and 2 (only 1)
        assertEquals(1, U04aForLoopsApp.sumSquaresExclusive(2));
        // Exclusive of boundary: 25 is a square, should NOT be included
        assertEquals(30, U04aForLoopsApp.sumSquaresExclusive(25));
    }

    // Test for sumOddsInRangeExclusive
    @Test
    public void testSumOddsInRangeExclusive() {
        // Between 10 and 16 (11 + 13 + 15)
        assertEquals(39, U04aForLoopsApp.sumOddsInRangeExclusive(10, 16));
        // Between 25 and 30 (27 + 29) - 25 is odd but is the boundary, so exclude
        assertEquals(56, U04aForLoopsApp.sumOddsInRangeExclusive(25, 30));
        // Between 5 and 7 (no odds strictly between)
        assertEquals(0, U04aForLoopsApp.sumOddsInRangeExclusive(5, 7));
        // Between 1 and 5 (only 3)
        assertEquals(3, U04aForLoopsApp.sumOddsInRangeExclusive(1, 5));
    }

    // Test for sumOddDigits
    @Test
    public void testSumOddFourDigits() {
        // 1325 -> 1 + 3 + 5 = 9
        assertEquals(9, U04aForLoopsApp.sumOddFourDigits(1325));
        // 1024 -> only 1
        assertEquals(1, U04aForLoopsApp.sumOddFourDigits(1024));
        // 2468 -> no odd digits
        assertEquals(0, U04aForLoopsApp.sumOddFourDigits(2468));
        // 1357 -> 1 + 3 + 5 + 7 = 16
        assertEquals(16, U04aForLoopsApp.sumOddFourDigits(1357));
        // 8000 -> no odd digits
        assertEquals(0, U04aForLoopsApp.sumOddFourDigits(8000));
    }
}