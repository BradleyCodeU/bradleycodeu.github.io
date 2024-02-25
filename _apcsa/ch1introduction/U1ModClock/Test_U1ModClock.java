import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_U1ModClock {

    @Test
    public void testFormatMinutes() {
        // Test single-digit minute
        assertEquals("09", U1ModClock.formatMinutes(9));
        
        // Test double-digit minute
        assertEquals("15", U1ModClock.formatMinutes(15));
        
        // Test minute equals to 0
        assertEquals("00", U1ModClock.formatMinutes(0));
    }

    @Test
    public void testCalculateFutureTime() {
        // Test future time within the same day
        assertEquals("13:09", U1ModClock.calculateFutureTime(11, 9, 2, 0));

        // Test future time crossing over to the next day
        assertEquals("0:09", U1ModClock.calculateFutureTime(23, 9, 1, 0));

        // Test future time with both hours and minutes later
        assertEquals("2:10", U1ModClock.calculateFutureTime(23, 50, 2, 20));

        // Additional test case based on the provided examples
        // Test future time with hours later exceeding 24
        assertEquals("14:07", U1ModClock.calculateFutureTime(11, 7, 27, 0));

        // Test future time with hours later exceeding 24 and minutes later
        assertEquals("0:00", U1ModClock.calculateFutureTime(23, 59, 48, 1));

        // Test future time with hours later exceeding 48 hours
        assertEquals("12:05", U1ModClock.calculateFutureTime(11, 2, 49, 3));

        // Test future time with hours later 0 and minutes exceeding 120
        assertEquals("1:13", U1ModClock.calculateFutureTime(23, 1, 0, 132));
        assertEquals("0:00", U1ModClock.calculateFutureTime(0, 0, 0, 0));
        assertEquals("10:48", U1ModClock.calculateFutureTime(9, 9, 99999, 99999));
    }

}
