import static org.junit.Assert.*;
import org.junit.Test;

public class Test_U04aForLoopFun {

    // Test for sumEvensExclusive
    @Test
    public void testSumEvensExclusive() {
        // Between 2 and 10 (4 + 6 + 8)
        assertEquals(18, U04aForLoopFun.sumEvensExclusive(10));
        // Between 2 and 5 (only 4)
        assertEquals(4, U04aForLoopFun.sumEvensExclusive(5));
        // Between 2 and 3 (no evens)
        assertEquals(0, U04aForLoopFun.sumEvensExclusive(3));
        // Between 2 and 25
        assertEquals(154, U04aForLoopFun.sumEvensExclusive(25));
    }

    // Test for sumSquaresExclusive
    @Test
    public void testSumSquaresExclusive() {
        // Between 1 and 10 (1 + 4 + 9)
        assertEquals(14, U04aForLoopFun.sumSquaresExclusive(10));
        // Between 1 and 20 (1 + 4 + 9 + 16)
        assertEquals(30, U04aForLoopFun.sumSquaresExclusive(20));
        // Between 1 and 2 (only 1)
        assertEquals(1, U04aForLoopFun.sumSquaresExclusive(2));
        // Exclusive of boundary: 25 is a square, should NOT be included
        assertEquals(30, U04aForLoopFun.sumSquaresExclusive(25));
    }

    // Test for sumOddsInRangeExclusive
    @Test
    public void testSumOddsInRangeExclusive() {
        // Between 10 and 16 (11 + 13 + 15)
        assertEquals(39, U04aForLoopFun.sumOddsInRangeExclusive(10, 16));
        // Between 25 and 30 (25 + 27 + 29) 
        assertEquals(81, U04aForLoopFun.sumOddsInRangeExclusive(25, 30));
        // Between 5 and 7 (just 5)
        assertEquals(5, U04aForLoopFun.sumOddsInRangeExclusive(5, 7));
        // Between 1 and 5 (1 + 3)
        assertEquals(4, U04aForLoopFun.sumOddsInRangeExclusive(1, 5));
    }

    // Test for sumOddDigits
    @Test
    public void testSumOddFourDigits() {
        // 1325 -> 1 + 3 + 5 = 9
        assertEquals(9, U04aForLoopFun.sumOddFourDigits(1325));
        // 1024 -> only 1
        assertEquals(1, U04aForLoopFun.sumOddFourDigits(1024));
        // 2468 -> no odd digits
        assertEquals(0, U04aForLoopFun.sumOddFourDigits(2468));
        // 1357 -> 1 + 3 + 5 + 7 = 16
        assertEquals(16, U04aForLoopFun.sumOddFourDigits(1357));
        // 8000 -> no odd digits
        assertEquals(0, U04aForLoopFun.sumOddFourDigits(8000));
    }
}