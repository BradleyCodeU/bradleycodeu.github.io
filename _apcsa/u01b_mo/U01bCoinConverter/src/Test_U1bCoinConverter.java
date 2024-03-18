import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_U01bCoinConverter {

    @Test
    public void testConvertCoins244() {
        assertEquals("2 dollars, 1 quarters, 1 dimes, 1 nickels, 4 pennies", U01bCoinConverter.convertCoins(2.44));
    }
    @Test
    public void testConvertCoins555() {
        assertEquals("5 dollars, 2 quarters, 0 dimes, 1 nickels, 0 pennies", U01bCoinConverter.convertCoins(5.55));
    }
    @Test
    public void testConvertCoins999() {
        assertEquals("9 dollars, 3 quarters, 2 dimes, 0 nickels, 4 pennies", U01bCoinConverter.convertCoins(9.99));
    }
}
