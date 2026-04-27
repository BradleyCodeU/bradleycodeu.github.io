import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test_MergeLists {

    @Test
    public void testMergeLists_Alternating() {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("x", "y"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("a", "x", "b", "y", "c", "d"));
        
        // Asserting that the lists are merged in alternating order
        assertEquals("The lists should alternate elements correctly", expected, MergeListsApp.mergeLists(list1, list2));
    }

    @Test
    public void testMergeLists_EmptyFirst() {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("f"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("f"));
        
        assertEquals("Should return list2 if list1 is empty", expected, MergeListsApp.mergeLists(list1, list2));
    }

    @Test
    public void testDisplayList_Formatting() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B"));
        // Note: Check for exact newline characters as per your requirements
        String expected = "0: A\n1: B\n";
        
        String actual = MergeListsApp.displayList(list);
        assertEquals("The string format must match the index: value\\n pattern", expected, actual);
    }

    @Test
    public void testGetList_ScannerSimulation() {
        // Simulating the user typing 'Hello', 'World', and then 'xxx'
        String inputData = "Hello\nWorld\nxxx\n";
        Scanner testScanner = new Scanner(inputData);
        
        ArrayList<String> result = MergeListsApp.getList(testScanner);
        
        assertEquals("List should contain 2 items", 2, result.size());
        assertEquals("First item should be 'Hello'", "Hello", result.get(0));
        assertEquals("Second item should be 'World'", "World", result.get(1));
    }
}