





import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_U3NameGames{

    @Test
    public void testSpoonerism() {
        assertEquals("Brilliard Hadley", U3NameGames.spoonerism("Hilliard", "Bradley"));
        assertEquals("Jeve Stobs", U3NameGames.spoonerism("Steve", "Jobs"));
        assertEquals("Fran Sancisco", U3NameGames.spoonerism("San", "Francisco"));
        assertEquals("Melon Usk", U3NameGames.spoonerism("Elon", "Musk"));
    }

    @Test
    public void testScoobyDoo() {
        assertEquals("Rilliard Radley", U3NameGames.scoobyDoo("Hilliard", "Bradley"));
        assertEquals("Reve Robs", U3NameGames.scoobyDoo("Steve", "Jobs"));
        assertEquals("Ran Rancisco", U3NameGames.scoobyDoo("San", "Francisco"));
        assertEquals("Relon Rusk", U3NameGames.scoobyDoo("Elon", "Musk"));
    }

    @Test
    public void testJeringonza() {
        assertEquals("Hipilliard Brapadley", U3NameGames.jeringonza("Hilliard", "Bradley"));
        assertEquals("Stepeve Jopobs", U3NameGames.jeringonza("Steve", "Jobs"));
        assertEquals("Sapan Frapancisco", U3NameGames.jeringonza("San", "Francisco"));
        assertEquals("Elopon Mupusk", U3NameGames.jeringonza("Elon", "Musk"));
    }

    @Test
    public void testUbbiDubbi() {
        assertEquals("Hubilliard Brubadley", U3NameGames.ubbiDubbi("Hilliard", "Bradley"));
        assertEquals("Stubeve Jubobs", U3NameGames.ubbiDubbi("Steve", "Jobs"));
        assertEquals("Suban Frubancisco", U3NameGames.ubbiDubbi("San", "Francisco"));
        assertEquals("Ubelon Mubusk", U3NameGames.ubbiDubbi("Elon", "Musk"));
    }

    @Test
public void testNameFacts() {
    assertEquals("Your name is 5 letters long. Your name is shorter than average. Your name starts with a S. The letter e is at the center of your name. Your name ends with a e.", U3NameGames.nameFacts("Steve"));
    assertEquals("Your name is 4 letters long. Your name is shorter than average. Your name starts with a E. The letter o is at the center of your name. Your name ends with a n.", U3NameGames.nameFacts("Elon"));
    assertEquals("Your name is 7 letters long. Your name is longer than average. Your name starts with a M. The letter s is at the center of your name. Your name ends with a t.", U3NameGames.nameFacts("Mustafa"));
}

@Test
    public void testIsVowel() {
        assertTrue(U3NameGames.isVowel("a"));
        assertTrue(U3NameGames.isVowel("e"));
        assertTrue(U3NameGames.isVowel("i"));
        assertTrue(U3NameGames.isVowel("o"));
        assertTrue(U3NameGames.isVowel("u"));
        assertTrue(U3NameGames.isVowel("y"));
        assertFalse(U3NameGames.isVowel("b"));
        assertFalse(U3NameGames.isVowel("c"));
        assertFalse(U3NameGames.isVowel("d"));
        assertFalse(U3NameGames.isVowel("f"));
    }

    @Test
    public void testFindFirstVowel() {
        assertEquals(2, U3NameGames.findFirstVowel("Bradley"));
        assertEquals(1, U3NameGames.findFirstVowel("Nyx"));
        assertEquals(2, U3NameGames.findFirstVowel("Sky"));
        assertEquals(2, U3NameGames.findFirstVowel("Crybaby"));
        assertEquals(3, U3NameGames.findFirstVowel("String"));
        assertEquals(-1, U3NameGames.findFirstVowel("Jrstrn"));
    }

    @Test
    public void testVowelName() {
        assertEquals("adley", U3NameGames.vowelName("Bradley"));
        assertEquals("yx", U3NameGames.vowelName("Nyx"));
        assertEquals("y", U3NameGames.vowelName("Sky"));
        assertEquals("ybaby", U3NameGames.vowelName("Crybaby"));
        assertEquals("ing", U3NameGames.vowelName("String"));
        assertEquals("Jrstrn", U3NameGames.vowelName("Jrstrn"));
    }
}
