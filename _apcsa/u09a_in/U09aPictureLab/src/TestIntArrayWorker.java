import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 * The test class TestMain
 *
 */
public class TestIntArrayWorker
{

    

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
  
    }

    /**
     * Tests the output of the IntArrayWorker.getCount method.
     */
    @Test
    public void getCountTest()
    {
        IntArrayWorker worker = new IntArrayWorker();
        int count = 0;
        int[][] nums = new int[3][4];
        worker.setMatrix(nums);
        worker.fillPattern1();
        count = worker.getCount(1);
        assertEquals(6,count);
    }

    /** 
     * Tests the output of the IntArrayWorker.getLargest method.
     */
    @Test
    public void getLargestTest()
    {
        int largest = 0;
        IntArrayWorker worker = new IntArrayWorker();
        int [][] nums2 = {{1, 2, 3}, {4, 5, 6}};
        worker.setMatrix(nums2);
        largest = worker.getLargest();
        assertEquals(6,largest);
        // test when largest is first
        int[][] nums3 = {{7, 2, 3}, {4, 5, 1}};
        worker.setMatrix(nums3);
        largest = worker.getLargest();
        assertEquals(7,largest);
        // test when largest is in the middle
        int[][] nums4 = {{1, 2, 3}, {8, 5, 1}};
        worker.setMatrix(nums4);
        largest = worker.getLargest();
        assertEquals(8,largest);
        // test when duplicate largest
        int[][] nums5 = {{9, 2, 9}, {4, 5, 1}};
        worker.setMatrix(nums5);
        largest = worker.getLargest();
        assertEquals(9,largest);
    }

    /** 
     * Tests the output of the IntArrayWorker.getColTotal method.
     */
    @Test
    public void getColTotalTest()
    {
        int total = 0;
        IntArrayWorker worker = new IntArrayWorker();
        int [][] nums2 = {{1, 2, 3}, {4, 5, 6}};
        worker.setMatrix(nums2);
        total = worker.getColTotal(0);
        assertEquals(5,total);
        total = worker.getColTotal(1);
        assertEquals(7,total);
        total = worker.getColTotal(2);
        assertEquals(9,total);
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {

    }
}