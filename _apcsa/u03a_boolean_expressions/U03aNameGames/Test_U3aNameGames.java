





import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_U03NameGames{

    @Test
    public void testSpoonerism() {
        assertEquals("Brilliard Hadley", U03NameGames.spoonerism("Hilliard", "Bradley"));
        assertEquals("Jeve Stobs", U03NameGames.spoonerism("Steve", "Jobs"));
        assertEquals("Fran Sancisco", U03NameGames.spoonerism("San", "Francisco"));
        assertEquals("Melon Usk", U03NameGames.spoonerism("Elon", "Musk"));
    }

    @Test
    public void testScoobyDoo() {
        assertEquals("Rilliard Radley", U03NameGames.scoobyDoo("Hilliard", "Bradley"));
        assertEquals("Reve Robs", U03NameGames.scoobyDoo("Steve", "Jobs"));
        assertEquals("Ran Rancisco", U03NameGames.scoobyDoo("San", "Francisco"));
        assertEquals("Relon Rusk", U03NameGames.scoobyDoo("Elon", "Musk"));
    }

    @Test
    public void testJeringonza() {
        assertEquals("Hipilliard Brapadley", U03NameGames.jeringonza("Hilliard", "Bradley"));
        assertEquals("Stepeve Jopobs", U03NameGames.jeringonza("Steve", "Jobs"));
        assertEquals("Sapan Frapancisco", U03NameGames.jeringonza("San", "Francisco"));
        assertEquals("Elopon Mupusk", U03NameGames.jeringonza("Elon", "Musk"));
    }

    @Test
    public void testUbbiDubbi() {
        assertEquals("Hubilliard Brubadley", U03NameGames.ubbiDubbi("Hilliard", "Bradley"));
        assertEquals("Stubeve Jubobs", U03NameGames.ubbiDubbi("Steve", "Jobs"));
        assertEquals("Suban Frubancisco", U03NameGames.ubbiDubbi("San", "Francisco"));
        assertEquals("Ubelon Mubusk", U03NameGames.ubbiDubbi("Elon", "Musk"));
    }

    @Test
public void testNameFacts() {
    assertEquals("Your name is 5 letters long. Your name is shorter than average. Your name starts with a S. The letter e is at the center of your name. Your name ends with a e.", U03NameGames.nameFacts("Steve"));
    assertEquals("Your name is 4 letters long. Your name is shorter than average. Your name starts with a E. The letter o is at the center of your name. Your name ends with a n.", U03NameGames.nameFacts("Elon"));
    assertEquals("Your name is 7 letters long. Your name is longer than average. Your name starts with a M. The letter s is at the center of your name. Your name ends with a t.", U03NameGames.nameFacts("Mustafa"));
}

@Test
    public void testIsVowel() {
        assertTrue(U03NameGames.isVowel("a"));
        assertTrue(U03NameGames.isVowel("e"));
        assertTrue(U03NameGames.isVowel("i"));
        assertTrue(U03NameGames.isVowel("o"));
        assertTrue(U03NameGames.isVowel("u"));
        assertTrue(U03NameGames.isVowel("y"));
        assertFalse(U03NameGames.isVowel("b"));
        assertFalse(U03NameGames.isVowel("c"));
        assertFalse(U03NameGames.isVowel("d"));
        assertFalse(U03NameGames.isVowel("f"));
    }

    @Test
    public void testFindFirstVowel() {
        assertEquals(2, U03NameGames.findFirstVowel("Bradley"));
        assertEquals(1, U03NameGames.findFirstVowel("Nyx"));
        assertEquals(2, U03NameGames.findFirstVowel("Sky"));
        assertEquals(2, U03NameGames.findFirstVowel("Crybaby"));
        assertEquals(3, U03NameGames.findFirstVowel("String"));
        assertEquals(-1, U03NameGames.findFirstVowel("Jrstrn"));
    }

    @Test
    public void testVowelName() {
        assertEquals("adley", U03NameGames.vowelName("Bradley"));
        assertEquals("yx", U03NameGames.vowelName("Nyx"));
        assertEquals("y", U03NameGames.vowelName("Sky"));
        assertEquals("ybaby", U03NameGames.vowelName("Crybaby"));
        assertEquals("ing", U03NameGames.vowelName("String"));
        assertEquals("Jrstrn", U03NameGames.vowelName("Jrstrn"));
    }
}
