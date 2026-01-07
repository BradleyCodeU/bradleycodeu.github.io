import org.junit.Test;
import static org.junit.Assert.*;


public class Test_PaintCalculatorIntOnly {
    // WALL AREA TESTS
    @Test
    public void testCalculateWallArea() {
        int length = 10;
        int width = 20;
        int height = 8;
        int num_doors = 1;
        int num_windows = 2;

        int expectedArea = 435;
        int actualArea = PaintCalculatorIntOnly.calculateWallArea(length, width, height, num_doors, num_windows);

        assertEquals(expectedArea, actualArea);
    }
    @Test
    public void testCalculateWallAreaWithZeroDimensions() {
        int length = 0;
        int width = 0;
        int height = 0;
        int num_doors = 0;
        int num_windows = 0;

        int expectedArea = 0;
        int actualArea = PaintCalculatorIntOnly.calculateWallArea(length, width, height, num_doors, num_windows);

        assertEquals(expectedArea, actualArea);
    }
    @Test
    public void testCalculateWallAreaWithLargeDimensions() {
        int length = 1000;
        int width = 1000;
        int height = 1000;
        int num_doors = 10;
        int num_windows = 20;

        int expectedArea = 3999550; // Total surface area of walls minus doors and windows
        int actualArea = PaintCalculatorIntOnly.calculateWallArea(length, width, height, num_doors, num_windows);

        assertEquals(expectedArea, actualArea);
    }

    // PAINT GALLONS TESTS
    @Test
    public void testCalculatePaintGallons() {
        int total_area = 432;

        int expectedGallons = 2;
        int actualGallons = PaintCalculatorIntOnly.calculatePaintGallons(total_area);

        assertEquals(expectedGallons, actualGallons);
    }
    @Test
    public void testCalculatePaintGallonsWithExactMultipleOf300() {
        int total_area = 600; // Exact multiple of 300

        int expectedGallons = 2; // Exact multiple of 300
        int actualGallons = PaintCalculatorIntOnly.calculatePaintGallons(total_area);

        assertEquals(expectedGallons, actualGallons);
    }
    @Test
    public void testCalculatePaintGallonsWithSmallArea() {
        int total_area = 200;

        int expectedGallons = 1; // Calculation rounds up to 1 gallon
        int actualGallons = PaintCalculatorIntOnly.calculatePaintGallons(total_area);

        assertEquals(expectedGallons, actualGallons);
    }
    @Test
    public void testCalculatePaintGallonsWithZeroArea() {
        int total_area = 0;

        int expectedGallons = 0; // if zero, then zero
        int actualGallons = PaintCalculatorIntOnly.calculatePaintGallons(total_area);

        assertEquals(expectedGallons, actualGallons);
    }

    // COST ESTIMATE TESTS
    @Test
    public void testCalculateCostEstimate() {
        int gallons_needed = 2;
        int price_per_gallon = 16;
        int sales_tax_percent = 8;

        int expectedCost = 34; // Because 2 * 16 * 108 / 100 = 34
        int actualCost = PaintCalculatorIntOnly.calculateCostEstimate(gallons_needed, price_per_gallon, sales_tax_percent);

        assertEquals(expectedCost, actualCost);
    }
    @Test
    public void testCalculateCostEstimateWithZeroSalesTax() {
       int gallons_needed = 7;
        int price_per_gallon = 20;
        int sales_tax_percent = 0; // No sales tax

        int expectedCost = 140; // // Because 7 * 20 * 100 / 100 = 120 No sales tax applied
        int actualCost = PaintCalculatorIntOnly.calculateCostEstimate(gallons_needed, price_per_gallon, sales_tax_percent);

        assertEquals(expectedCost, actualCost);
    } 
    @Test
    public void testCalculateCostEstimateWithZeroPricePerGallon() {
        int gallons_needed = 2;
        int price_per_gallon = 0;
        int sales_tax_percent = 8;

        int expectedCost = 0; // if price per gallon is 0, then expected cost is 0
        int actualCost = PaintCalculatorIntOnly.calculateCostEstimate(gallons_needed, price_per_gallon, sales_tax_percent);

        assertEquals(expectedCost, actualCost);
    }
    @Test
    public void testCalculateCostEstimateWithZeroGallons() {
        int gallons_needed = 0;
        int price_per_gallon = 16;
        int sales_tax_percent = 8;

        int expectedCost = 0; // Because 0 * 16 * 108 / 100 = 0
        int actualCost = PaintCalculatorIntOnly.calculateCostEstimate(gallons_needed, price_per_gallon, sales_tax_percent);

        assertEquals(expectedCost, actualCost);
    }
}
