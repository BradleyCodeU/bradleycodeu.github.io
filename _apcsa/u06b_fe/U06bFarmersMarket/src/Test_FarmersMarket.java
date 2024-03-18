import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_FarmersMarket {
    private FarmersMarket market;

    @Before
    public void setUp() {
        market = new FarmersMarket();
    }

    @Test
    public void testInitialization() {
        assertNotNull("Market should not be null", market);
    }

    @Test
    public void testUpdateAllTrackers() {
        market.updateAllTrackers();
        // Check if prices are updated
        assertNotEquals("Corn price should be updated", 10.0, market.getPriceTracker("corn").getPrice(), 0.0);
        assertNotEquals("Apples price should be updated", 8.0, market.getPriceTracker("apples").getPrice(), 0.0);
        assertNotEquals("Eggs price should be updated", 15.0, market.getPriceTracker("eggs").getPrice(), 0.0);
    }

    @Test
    public void testGetPriceTracker() {
        assertNotNull("PriceTracker for corn should not be null", market.getPriceTracker("corn"));
        assertNotNull("PriceTracker for apples should not be null", market.getPriceTracker("apples"));
        assertNotNull("PriceTracker for eggs should not be null", market.getPriceTracker("eggs"));
        assertNull("PriceTracker for invalid item should be null", market.getPriceTracker("invalid"));
    }

    @Test
    public void testGetAvailableSupply() {
        assertTrue("Available supply of corn should be greater than or equal to 0", market.getAvailableSupply("corn") >= 0);
        assertTrue("Available supply of apples should be greater than or equal to 0", market.getAvailableSupply("apples") >= 0);
        assertTrue("Available supply of eggs should be greater than or equal to 0", market.getAvailableSupply("eggs") >= 0);
        assertEquals("Available supply of invalid item should be 0", 0, market.getAvailableSupply("invalid"));
    }

    @Test
    public void testToString() {
        market.getPriceTracker("corn").setPrice(3.99);
        market.getPriceTracker("apples").setPrice(1.23);
        market.getPriceTracker("eggs").setPrice(2.34);
        String result = market.toString();
        // Check if the result contains the name of the market
        assertTrue("Result should contain the name of the market", result.contains(market.getName()));
        // Check if the result contains the price of corn
        assertTrue("Result should contain the price of corn", result.contains(("" + market.getPriceTracker("corn").getPrice())));
        // Check if the result contains the supply of corn
        assertTrue("Result should contain the supply of corn", result.contains("" + market.getPriceTracker("corn").getSupply()));
        // Check if the result contains the price of apples
        assertTrue("Result should contain the price of apples", result.contains(("" + market.getPriceTracker("apples").getPrice())));
        // Check if the result contains the supply of apples
        assertTrue("Result should contain the supply of apples", result.contains("" + market.getPriceTracker("apples").getSupply()));
        // Check if the result contains the price of eggs
        assertTrue("Result should contain the price of eggs", result.contains(("" + market.getPriceTracker("eggs").getPrice())));
        // Check if the result contains the supply of eggs
        assertTrue("Result should contain the supply of eggs", result.contains("" + market.getPriceTracker("eggs").getSupply()));
    }
}
