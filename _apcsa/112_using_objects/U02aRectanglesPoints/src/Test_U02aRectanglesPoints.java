import static org.junit.Assert.*;
import org.junit.Test;
import java.awt.Rectangle;
import java.awt.Point;
import java.awt.geom.Point2D;

public class Test_U02aRectanglesPoints {

    @Test
    public void testJumpRight() {
        Rectangle original = new Rectangle(10, 20, 50, 100);
        Rectangle result = U02aRectanglesPoints.jumpRight(original);
        
        assertEquals("x should be x + width", 60, result.x);
        assertEquals("y should remain same", 20, result.y);
        assertEquals("Original should not change", 10, original.x);
    }

    @Test
    public void testJumpDown() {
        Rectangle original = new Rectangle(10, 20, 50, 100);
        Rectangle result = U02aRectanglesPoints.jumpDown(original);
        
        assertEquals("x should remain same", 10, result.x);
        assertEquals("y should be y + height", 120, result.y);
        assertEquals("Original should not change", 20, original.y);
    }

    @Test
    public void testJumpLeft() {
        Rectangle original = new Rectangle(100, 20, 50, 100);
        Rectangle result = U02aRectanglesPoints.jumpLeft(original);
        
        assertEquals("x should be x - width", 50, result.x);
        assertEquals("Original should not change", 100, original.x);
    }

    @Test
    public void testJumpUp() {
        Rectangle original = new Rectangle(10, 50, 50, 40);
        Rectangle result = U02aRectanglesPoints.jumpUp(original);
        
        assertEquals("y should be y - height", 10, result.y);
        assertEquals("Original should not change", 50, original.y);
    }

    @Test
    public void testDoubleSize() {
        Rectangle original = new Rectangle(10, 10, 100, 50);
        Rectangle result = U02aRectanglesPoints.doubleSize(original);
        
        assertEquals("Width should be doubled", 200, result.width);
        assertEquals("Height should be doubled", 100, result.height);
        assertEquals("Location should remain same", 10, result.x);
    }

    @Test
    public void testGrowFixed() {
        Rectangle original = new Rectangle(0, 0, 100, 100);
        Rectangle result = U02aRectanglesPoints.growFixed(original, 50);
        
        assertEquals("Width should increase by amount", 150, result.width);
        assertEquals("Height should increase by amount", 150, result.height);
        assertEquals("Original should not change", 100, original.width);
    }

    @Test
    public void testIsTouching() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4); // Distance is exactly 5.0
        
        assertTrue("Should be true when distance == minimum", 
                   U02aRectanglesPoints.isTouching(p1, p2, 5.0));
        assertFalse("Should be false when distance > minimum", 
                    U02aRectanglesPoints.isTouching(p1, p2, 4.9));
    }

    @Test
    public void testMidpoint() {
        Point p1 = new Point(3, 3);
        Point p2 = new Point(4, 4);
        Point2D.Double result = U02aRectanglesPoints.findMidpoint(p1, p2);
        
        // Using delta 0.001 for double comparison
        assertEquals("X midpoint should be 3.5", 3.5, result.getX(), 0.001);
        assertEquals("Y midpoint should be 3.5", 3.5, result.getY(), 0.001);
    }
}