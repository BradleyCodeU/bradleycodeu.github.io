import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * The test class TestMain
 *
 * @author  Dave Avis
 * @version 06.22.2018
 */
public class TestIntArrayWorker
{
    private OutputStream os;
    private PrintStream ps;
    

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        //Prepare to redirect output
        os = new ByteArrayOutputStream();
        ps = new PrintStream(os);
        System.setOut(ps);
        String ls = System.getProperty("line.separator");
    }

    /**
     * Tests the output of the IntArrayWorker.getCount method.
     */
    @Test
    public void getCountTest()
    {
        String expectedOutput = "Count should be 6 and count is 6";
        IntArrayWorkerTester.testGetCount();
        assertEquals("Testing IntArrayWorker.getCount()", expectedOutput, os.toString().trim());
    }

    /** 
     * Tests the output of the IntArrayWorker.getLargest method.
     */
    @Test
    public void getLargestTest()
    {
        String expectedOutput = "Largest should be 6 and is 6\nLargest should be 6 and is 6\nLargest should be 6 and is 6\nLargest should be 6 and is 6";
        IntArrayWorkerTester.testGetLargest();
        assertEquals("Testing IntArrayWorker.getLargest()", expectedOutput, os.toString().trim());
    }

    /** 
     * Tests the output of the IntArrayWorker.getColTotal method.
     */
    @Test
    public void getColTotalTest()
    {
        String expectedOutput = "Total for column 0 should be 5 and is 5\nTotal for column 1 should be 7 and is 7\nTotal for column 2 should be 9 and is 9";
        IntArrayWorkerTester.testGetColTotal();
        assertEquals("Testing IntArrayWorker.getColTotal()", expectedOutput, os.toString().trim());
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        //Restore normal output
        PrintStream originalOut = System.out;
        System.setOut(originalOut);
    }
}