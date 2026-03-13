import static org.junit.Assert.*;
import org.junit.Test;

public class Test_U04aWhileLoopsApp {

    @Test
    public void test_findSquares() {
        assertEquals("0 1 4 9 16 25 36 49 64 81 ", U04aWhileLoopsApp.findSquares(100));
        assertEquals("0 1 4 ", U04aWhileLoopsApp.findSquares(5));
        assertEquals("0 ", U04aWhileLoopsApp.findSquares(1));
    }

    @Test
    public void test_findDivisibleByTen() {
        assertEquals("10 20 30 40 50 60 70 80 90 ", U04aWhileLoopsApp.findDivisibleByTen(100));
        assertEquals("10 20 ", U04aWhileLoopsApp.findDivisibleByTen(25));
        assertEquals("", U04aWhileLoopsApp.findDivisibleByTen(5)); // No positive multiples < 5
    }

    @Test
    public void test_findPowersOfTwo() {
        assertEquals("1 2 4 8 16 32 64 ", U04aWhileLoopsApp.findPowersOfTwo(100));
        assertEquals("1 2 4 8 ", U04aWhileLoopsApp.findPowersOfTwo(10));
        assertEquals("1 ", U04aWhileLoopsApp.findPowersOfTwo(2));
    }

    @Test
    public void test_SumOddDigits() {
        assertEquals(9, U04aWhileLoopsApp.sumOddDigits(816345));
        assertEquals(0, U04aWhileLoopsApp.sumOddDigits(2468));
        assertEquals(16, U04aWhileLoopsApp.sumOddDigits(1357));
        assertEquals(4, U04aWhileLoopsApp.sumOddDigits(-123)); // 1 + 3 = 4
    }
}
