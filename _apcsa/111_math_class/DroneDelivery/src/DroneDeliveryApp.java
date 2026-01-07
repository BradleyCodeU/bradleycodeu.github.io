import java.util.Scanner;

public class DroneDeliveryApp {

    /**
     * Calculates battery loss based on weight and distance.
     * Uses Math.pow for non-linear drain.
     * 
     * @param weight   The weight of the package in kilograms.
     * @param distance The total travel distance in kilometers.
     * @return The estimated percentage of battery consumed (e.g., 15.5 for 15.5%).
     */
    public static double calculateBatteryDrain(double weight, double distance) {
        // use absolute value on the distance to ensure that it's a positive value

        // calculate the weightFactor which is weight to the power of 1.5

        // calculate the battery loss by doing distance times weight factor times 0.05

        // return the result
        return -1;
    }

    /**
     * Estimates the total travel time between two points at a constant speed.
     * 
     * @param x1    Starting X coordinate (Longitude-style)
     * @param y1    Starting Y coordinate (Latitude-style)
     * @param x2    Destination X coordinate
     * @param y2    Destination Y coordinate
     * @param speed The constant travel speed of the drone
     * @return Total time required to cover the distance
     */
    public static double estimateDeliveryTime(double x1, double y1, double x2, double y2, double speed) {
        // diffence in x location is the absolute value of x1 minus x2

        // diffence in y location is the absolute value of y1 minus y2

        // Use the Pythagorean theorem (a^2 + b^2 = c^2) to find the distance
        // distance is the square root of (diff in x to the 2nd power) plus (diff in y
        // to the 2nd power)

        // if speed is zero, return 0 to prevent division by zero errors
        // if (speed == 0){
        //      return 0;
        // }

        // the time is the distance divided by the speed

        // return the result
        return -1;
    }

    /**
     * Calculates signal strength using 2D coordinates (X and Y).
     * 
     * @param droneX       The horizontal position of the drone.
     * @param droneY       The vertical position (or altitude) of the drone.
     * @param hubX         The horizontal position of the transmission hub.
     * @param hubY         The vertical position of the transmission hub.
     * @param initialPower The signal strength at the source.
     * @return The calculated signal strength based on 2D distance.
     */
    public static double getSignalStrength(double droneX, double droneY, double hubX, double hubY,
            double initialPower) {
        // diffence in x location is the absolute value of droneX minus hubX

        // diffence in y location is the absolute value of drone y minus hub y

        // Use the Pythagorean theorem (a^2 + b^2 = c^2) to find the distance
        // distance is the square root of (diff in x to the 2nd power) plus (diff in y
        // to the 2nd power)

        // if distance is zero, return initialPower to prevent division by zero errors
        // if (distance == 0){
        //      return initialPower;
        // }

        // power is the initial power divided by (distance to the 2nd power)

        // return the result
        return -1;
    }

    /**
     * Calculates the impact velocity based on wind speed and elevation.
     * Uses: Math.pow to square the wind speed, Math.abs for elevation safety,
     * and Math.sqrt to find the final velocity magnitude.
     * 
     * @param elevation The vertical distance from the ground (altitude) in meters.
     * @param windSpeed The horizontal wind velocity in meters per second.
     *                  This is squared using Math.pow to calculate its kinetic
     *                  contribution.
     * @return The theoretical impact velocity (speed) at the point of contact.
     */
    public static double calculateImpactVelocity(double elevation, double windSpeed) {
        // Calculate the wind factor by squaring the wind speed

        // Use absolute value to ensure elevation is treated as a positive distance

        // impact velocity is the square root of (wind factor plus absolute elevation)

        // return the result
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Drone Flight Command Center ===");

        // 1. Test Delivery Time & Battery
        System.out.print("Enter current X and Y separated by a space (for example, 0 0): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        System.out.print("Enter destination X and Y separated by a space (for example, 6 7): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        System.out.print("Enter package weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter drone speed (mph): ");
        double speed = input.nextDouble(); // Corrected variable name from weight to speed
        
        // Pass the user-provided speed into the method
        double time = estimateDeliveryTime(x1, y1, x2, y2, speed);
        
        // Calculating distance for the battery method
        // We reuse our logic: sqrt((x2-x1)^2 + (y2-y1)^2)
        double dist = Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));
        double drain = calculateBatteryDrain(weight, dist);

        System.out.printf("= = = Results = = =\nTravel Time = %.2f hours\nBattery Drain = %.2f%%\n", time, drain);
        System.out.println("-----------------------------------");

        // 2. Test Signal Strength
        System.out.print("Enter Hub X and Y separated by a space: ");
        double hX = input.nextDouble();
        double hY = input.nextDouble();
        
        // Using current drone position (x1, y1) to check signal against Hub
        double signal = getSignalStrength(x1, y1, hX, hY, 100.0);
        System.out.printf("Current Signal Strength = %.2f units\n", signal);
        System.out.println("-----------------------------------");

        // 3. Test Impact Safety
        System.out.print("Enter Landing Elevation and Wind Speed: ");
        double elev = input.nextDouble();
        double wind = input.nextDouble();
        
        double impact = calculateImpactVelocity(elev, wind);
        System.out.printf("Calculated Impact Velocity = %.2f m/s\n", impact);

        input.close();
        System.out.println("=== Simulation Complete ===");
    }
}
