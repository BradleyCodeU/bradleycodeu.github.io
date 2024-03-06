import org.junit.Test;
import static org.junit.Assert.*;

public class Test_U1PaintCalcIntOnly {
    // WALL AREA TESTS
    @Test
    public void testCalculateWallArea() {
        int length = 10;
        int width = 20;
        int height = 8;
        int num_doors = 1;
        int num_windows = 2;

        int expectedArea = 435;
        int actualArea = U1PaintCalcIntOnly.calculateWallArea(length, width, height, num_doors, num_windows);

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
        int actualArea = U1PaintCalcIntOnly.calculateWallArea(length, width, height, num_doors, num_windows);

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
        int actualArea = U1PaintCalcIntOnly.calculateWallArea(length, width, height, num_doors, num_windows);

        assertEquals(expectedArea, actualArea);
    }

    // PAINT GALLONS TESTS
    @Test
    public void testCalculatePaintGallons() {
        int total_area = 432;

        int expectedGallons = 2;
        int actualGallons = U1PaintCalcIntOnly.calculatePaintGallons(total_area);

        assertEquals(expectedGallons, actualGallons);
    }
    @Test
    public void testCalculatePaintGallonsWithExactMultipleOf400() {
        int total_area = 800; // Exact multiple of 400

        int expectedGallons = 3; // Exact multiple of 400 plus 1
        int actualGallons = U1PaintCalcIntOnly.calculatePaintGallons(total_area);

        assertEquals(expectedGallons, actualGallons);
    }
    @Test
    public void testCalculatePaintGallonsWithSmallArea() {
        int total_area = 200;

        int expectedGallons = 1; // 1 extra gallon is always bought
        int actualGallons = U1PaintCalcIntOnly.calculatePaintGallons(total_area);

        assertEquals(expectedGallons, actualGallons);
    }

    // COST ESTIMATE TESTS
    @Test
    public void testCalculateCostEstimate() {
        int gallons_needed = 2;
        int price_per_gallon = 16;
        int sales_tax_percent = 8;

        int expectedCost = 35; // 34 + 1
        int actualCost = U1PaintCalcIntOnly.calculateCostEstimate(gallons_needed, price_per_gallon, sales_tax_percent);

        assertEquals(expectedCost, actualCost);
    }
    @Test
    public void testCalculateCostEstimateWithZeroSalesTax() {
       int gallons_needed = 5;
        int price_per_gallon = 20;
        int sales_tax_percent = 0; // No sales tax

        int expectedCost = 100; // 100 + 1 No sales tax applied
        int actualCost = U1PaintCalcIntOnly.calculateCostEstimate(gallons_needed, price_per_gallon, sales_tax_percent);

        assertEquals(expectedCost, actualCost);
    } 
    @Test
    public void testCalculateCostEstimateWithZeroPricePerGallon() {
        int gallons_needed = 2;
        int price_per_gallon = 0;
        int sales_tax_percent = 8;

        int expectedCost = 1; // 0 + 1
        int actualCost = U1PaintCalcIntOnly.calculateCostEstimate(gallons_needed, price_per_gallon, sales_tax_percent);

        assertEquals(expectedCost, actualCost);
    }
}
