import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_U1CoinConverter {

    @Test
    public void testConvertCoins() {
        assertEquals("2 dollars, 1 quarters, 1 dimes, 1 nickels, 4 pennies", U1CoinConverter.convertCoins(2.44));
        assertEquals("5 dollars, 2 quarters, 0 dimes, 1 nickels, 0 pennies", U1CoinConverter.convertCoins(5.55));
        assertEquals("9 dollars, 3 quarters, 2 dimes, 0 nickels, 4 pennies", U1CoinConverter.convertCoins(9.99));
    }
}
