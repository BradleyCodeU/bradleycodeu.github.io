import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_U1bModClock {

    @Test
    public void testFormatMinutes_singleDigit() {
        assertEquals("09", U1bModClock.formatMinutes(9));
    }

    @Test
    public void testFormatMinutes_doubleDigit() {
        assertEquals("15", U1bModClock.formatMinutes(15));
    }

    @Test
    public void testFormatMinutes_zeroMinute() {
        assertEquals("00", U1bModClock.formatMinutes(0));
    }

    @Test
    public void testCalculateFutureTime_sameDay() {
        assertEquals("13:09", U1bModClock.calculateFutureTime(11, 9, 2, 0));
    }

    @Test
    public void testCalculateFutureTime_nextDay() {
        assertEquals("0:09", U1bModClock.calculateFutureTime(23, 9, 1, 0));
    }

    @Test
    public void testCalculateFutureTime_hoursAndMinutesLater() {
        assertEquals("2:10", U1bModClock.calculateFutureTime(23, 50, 2, 20));
    }

    @Test
    public void testCalculateFutureTime_hoursLaterExceeding24() {
        assertEquals("14:07", U1bModClock.calculateFutureTime(11, 7, 27, 0));
    }

    @Test
    public void testCalculateFutureTime_hoursAndMinutesLaterExceeding24() {
        assertEquals("0:00", U1bModClock.calculateFutureTime(23, 59, 48, 1));
    }

    @Test
    public void testCalculateFutureTime_hoursLaterExceeding48() {
        assertEquals("12:05", U1bModClock.calculateFutureTime(11, 2, 49, 3));
    }

    @Test
    public void testCalculateFutureTime_hours0MinutesExceeding120() {
        assertEquals("1:13", U1bModClock.calculateFutureTime(23, 1, 0, 132));
    }

    @Test
    public void testCalculateFutureTime_allZeroes() {
        assertEquals("0:00", U1bModClock.calculateFutureTime(0, 0, 0, 0));
    }

    @Test
    public void testCalculateFutureTime_largeInputs() {
        assertEquals("10:48", U1bModClock.calculateFutureTime(9, 9, 99999, 99999));
    }

}
