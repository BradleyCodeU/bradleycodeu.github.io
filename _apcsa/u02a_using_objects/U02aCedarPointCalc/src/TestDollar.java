import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDollar {

    private Dollar dollar1;
    private Dollar dollar2;

    @Before
    public void setUp() {
        dollar1 = new Dollar(5, 50);
        dollar2 = new Dollar(3, 25);
    }

    @Test
    public void testConstructorWithDollarsAndCents() {
        Dollar dollar = new Dollar(5, 50);
        assertEquals(550, dollar.toLong());
        dollar = new Dollar(1, 23);
        assertEquals(123, dollar.toLong());
    }

    @Test
    public void testConstructorWithDouble() {
        Dollar dollar = new Dollar(5.75);
        assertEquals(575, dollar.toLong());
        dollar = new Dollar(0.98);
        assertEquals(98, dollar.toLong());
    }

    @Test
    public void testConstructorWithLongCents() {
        Dollar dollar = new Dollar(1000);
        assertEquals(1000, dollar.toLong());
        dollar = new Dollar(0);
        assertEquals(0, dollar.toLong());
    }

    @Test
    public void testAdd() {
        Dollar result = dollar1.add(dollar2);
        assertEquals(875, result.toLong());
        result = dollar1.add(dollar1);
        assertEquals(1100, result.toLong());
        result = dollar2.add(dollar2);
        assertEquals(650, result.toLong());
    }

    @Test
    public void testSub() {
        Dollar result = dollar1.sub(dollar2);
        assertEquals(225, result.toLong());
        result = dollar1.sub(dollar1);
        assertEquals(0, result.toLong());
    }

    @Test
    public void testMult() {
        Dollar result = dollar1.mult(1);
        assertEquals(550, result.toLong());
        result = dollar1.mult(2);
        assertEquals(1100, result.toLong());
        result = dollar2.mult(3);
        assertEquals(975, result.toLong());
    }

    @Test
    public void testToDouble() {
        assertEquals(5.50, dollar1.toDouble(), 0.01);
    }

    @Test
    public void testToString() {
        assertEquals("$5.50", dollar1.toString());
    }

    @Test
    public void testNegativeValues() {
        Dollar result = dollar1.sub(dollar2);
        assertEquals(225, result.toLong());
    }

    @Test
    public void testMultiplicationWithZero() {
        Dollar result = dollar1.mult(0);
        assertEquals(0, result.toLong());
    }

    @Test
    public void testMultiplicationWithNegative() {
        Dollar result = dollar1.mult(-2);
        assertEquals(-1100, result.toLong());
    }
}

