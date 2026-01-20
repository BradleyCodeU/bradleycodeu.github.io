import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class Test_DroneDeliveryApp {

    private final double DELTA = 0.001;

    @Test
    public void testGetSignalStrength() {
        // Assertion 1: Positive coordinates
        double actual1 = DroneDeliveryApp.getSignalStrength(12, 16.0, 0.0, 0.0, 100.0);
        assertEquals("Positive coords: Signal should be 0.25", 0.25, actual1, DELTA);

        // Assertion 2: Negative coordinates (Testing Math.abs)
        // Distance between (-3, -4) and (0, 0) is still 5.0
        double actual2 = DroneDeliveryApp.getSignalStrength(-3.0, -4.0, 0.0, 0.0, 100.0);
        assertEquals("Negative coords: Math.abs should ensure distance is still 5.0", 4.0, actual2, DELTA);

        assertEquals("Zero distance", 50.0, DroneDeliveryApp.getSignalStrength(-3.0, -4.0, -3.0, -4.0, 50.0), DELTA);
    }

    @Test
    public void testCalculateImpactVelocity() {
        // Assertion 1: Standard positive elevation
        double actual1 = DroneDeliveryApp.calculateImpactVelocity(25.0, 0.0);
        assertEquals("Positive elevation impact", 5.0, actual1, DELTA);

        // Assertion 2: Negative elevation (Testing Math.abs)
        // Some sensors might report "below sea level" or "below target" as negative
        double actual2 = DroneDeliveryApp.calculateImpactVelocity(-25.0, 0.0);
        assertEquals("Negative elevation: Math.abs should treat -25.0 as 25.0", 5.0, actual2, DELTA);
    }

    @Test
    public void testEstimateDeliveryTime() {
        // Assertion 1: Standard travel
        double actual1 = DroneDeliveryApp.estimateDeliveryTime(0.0, 0.0, 6.0, 8.0, 2.0);
        assertEquals("Forward travel time", 5.0, actual1, DELTA);

        // Assertion 2: Negative to positive travel (Crossing the origin)
        // Distance from -3 to +3 is 6. Distance from -4 to +4 is 8. Total distance = 10.
        double actual2 = DroneDeliveryApp.estimateDeliveryTime(-3.0, -4.0, 3.0, 4.0, 2.0);
        assertEquals("Crossing origin: Time for distance 10 at speed 2", 5.0, actual2, DELTA);

        assertEquals("Zero speed", 0.0, DroneDeliveryApp.estimateDeliveryTime(-3.0, -4.0, 3.0, 4.0, 0.0), DELTA);

        assertEquals("Neg speed", 0.0, DroneDeliveryApp.estimateDeliveryTime(-3.0, -4.0, 3.0, 4.0, -2.0), DELTA);
    }

    @Test
    public void testCalculateBatteryDrain() {
        // Assertion 1: Standard positive distance
        double actual1 = DroneDeliveryApp.calculateBatteryDrain(4.0, 10.0);
        assertEquals("Standard drain", 4.0, actual1, DELTA);

        // Assertion 2: Ensure negative distance is handled (if applicable in logic)
        // If your method uses Math.abs(distance) inside calculateBatteryDrain:
        double actual2 = DroneDeliveryApp.calculateBatteryDrain(4.0, -10.0);
        assertEquals("Negative distance drain", 4.0, actual2, DELTA);
        
        // Assertion 3: Zero weight
        assertEquals("Zero weight drain", 0.0, DroneDeliveryApp.calculateBatteryDrain(0.0, 0.0), DELTA);

        assertEquals("Negative weight drain", 0.0, DroneDeliveryApp.calculateBatteryDrain(-7.0, 7.0), DELTA);
    }
}