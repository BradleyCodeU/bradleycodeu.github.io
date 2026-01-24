import static org.junit.Assert.*;
import org.junit.Test;
import java.awt.Rectangle;
import java.awt.Point;
import java.awt.geom.Point2D;

public class Test_RectanglesPoints {

    @Test
    public void testGetAreaStandard() {
        Rectangle rec = new Rectangle(0, 0, 10, 5);
        assertEquals("Area of 10x5 should be 50.0", 50.0, RectanglesPoints.calculateArea(rec), 0.001);
        assertEquals("Area of 0x0 should be 0.0", 0.0, RectanglesPoints.calculateArea(new Rectangle(0, 0, 0, 0)), 0.001);
        assertEquals("Area of 1x1 should be 1.0", 1.0, RectanglesPoints.calculateArea(new Rectangle(0, 0, 1, 1)), 0.001);
    }

    /**
     * This test checks if the method handles very large areas.
     * 1,000,000 * 1,000,000 = 1,000,000,000,000.
     * This value fits in a double (or long), but would cause int "overflow" 
     * and return a wrong (often negative) number if stored in an int.
     */
    @Test
    public void testGetAreaLarge() {
        // Create a rectangle with width and height of 1 million
        Rectangle massiveRec = new Rectangle(0, 0, 1000000, 1000000);
        double expected = 1000000000000.0; 
        double actual = RectanglesPoints.calculateArea(massiveRec);
        
        assertEquals("Area should handle values larger than Integer.MAX_VALUE", 
                     expected, actual, 0.001);
    }

    @Test
    public void testGetAreaImmutability() {
        Rectangle rec = new Rectangle(0, 0, 10, 10);
        RectanglesPoints.calculateArea(rec);
        assertEquals("Width should remain 10", 10, (int)rec.getWidth());
        assertEquals("Height should remain 10", 10, (int)rec.getHeight());
    }

    @Test
    public void testJumpRight() {
        Rectangle original = new Rectangle(10, 20, 50, 100);
        Rectangle result = RectanglesPoints.jumpRight(original);
        
        assertEquals("x should be x + width", 60, result.x);
        assertEquals("y should remain same", 20, result.y);
        assertEquals("Original should not change", 10, original.x);
    }

    @Test
    public void testJumpDown() {
        Rectangle original = new Rectangle(10, 20, 50, 100);
        Rectangle result = RectanglesPoints.jumpDown(original);
        
        assertEquals("x should remain same", 10, result.x);
        assertEquals("y should be y + height", 120, result.y);
        assertEquals("Original should not change", 20, original.y);
    }

    @Test
    public void testJumpLeft() {
        Rectangle original = new Rectangle(100, 20, 50, 100);
        Rectangle result = RectanglesPoints.jumpLeft(original);
        
        assertEquals("x should be x - width", 50, result.x);
        assertEquals("Original should not change", 100, original.x);
    }

    @Test
    public void testJumpUp() {
        Rectangle original = new Rectangle(10, 50, 50, 40);
        Rectangle result = RectanglesPoints.jumpUp(original);
        
        assertEquals("y should be y - height", 10, result.y);
        assertEquals("Original should not change", 50, original.y);
    }

    @Test
    public void testDoubleSize() {
        Rectangle original = new Rectangle(10, 10, 100, 50);
        Rectangle result = RectanglesPoints.doubleSize(original);
        
        assertEquals("Width should be doubled", 200, result.width);
        assertEquals("Height should be doubled", 100, result.height);
        assertEquals("Location should remain same", 10, result.x);
    }

    @Test
    public void testGrowFixed() {
        Rectangle original = new Rectangle(0, 0, 100, 100);
        Rectangle result = RectanglesPoints.growFixed(original, 50);
        
        assertEquals("Width should increase by amount", 150, result.width);
        assertEquals("Height should increase by amount", 150, result.height);
        assertEquals("Original should not change", 100, original.width);
    }

    @Test
    public void testIsTouching() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4); // Distance is exactly 5.0
        
        assertTrue("Should be true when distance == minimum", 
                   RectanglesPoints.isTouching(p1, p2, 5.0));
        assertFalse("Should be false when distance > minimum", 
                    RectanglesPoints.isTouching(p1, p2, 4.9));
    }

    @Test
    public void testMidpoint() {
        Point p1 = new Point(3, 3);
        Point p2 = new Point(4, 4);
        Point2D.Double result = RectanglesPoints.findMidpoint(p1, p2);
        
        // Using delta 0.001 for double comparison
        assertEquals("X midpoint should be 3.5", 3.5, result.getX(), 0.001);
        assertEquals("Y midpoint should be 3.5", 3.5, result.getY(), 0.001);
    }
}