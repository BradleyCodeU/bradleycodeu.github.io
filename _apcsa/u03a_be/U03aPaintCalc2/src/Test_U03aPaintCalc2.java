import static org.junit.Assert.*;
import org.junit.Test;

public class Test_U03aPaintCalc2 {
    
    
        @Test
        public void testCalculateTotalSquareFeet() {
            // Test with sample values
            double result1 = U03aPaintCalc2App.calculateTotalSquareFeet(10.5, 25.6, 10.7, 1, 2);
            assertEquals(727.54, result1, 0.01);
    
            double result2 = U03aPaintCalc2App.calculateTotalSquareFeet(1, 1, 1, 0, 0);
            assertEquals(4.0, result2, 0.01);
    
            double result3 = U03aPaintCalc2App.calculateTotalSquareFeet(148, 1, 1, 0, 0);
            assertEquals(298.0, result3, 0.01);
        }
    
        @Test
        public void testCalculateIfGallonsOnly() {
            // Test with sample values
            String result1 = U03aPaintCalc2App.calculateIfGallonsOnly(727.54);
            assertEquals("If gallons only = 3 gallons", result1);
    
            String result2 = U03aPaintCalc2App.calculateIfGallonsOnly(4.0);
            assertEquals("If gallons only = 1 gallon", result2);
    
            String result3 = U03aPaintCalc2App.calculateIfGallonsOnly(298.0);
            assertEquals("If gallons only = 1 gallon", result3);
        }
    
        @Test
        public void testCalculateIfQuartsAvailable() {
            // Test with sample values
            String result1 = U03aPaintCalc2App.calculateIfQuartsAvailable(727.54);
            assertEquals("If quarts are available = 2 gallons and 2 quarts", result1);
    
            String result2 = U03aPaintCalc2App.calculateIfQuartsAvailable(4.0);
            assertEquals("If quarts are available = 0 gallons and 1 quart", result2);
    
            String result3 = U03aPaintCalc2App.calculateIfQuartsAvailable(298.0);
            assertEquals("If quarts are available = 1 gallon", result3);
        }
    }
    
