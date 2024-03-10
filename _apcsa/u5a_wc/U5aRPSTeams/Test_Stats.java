import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_Stats {

    @Test
    public void test_Stats_AddLoss() {
        Stats stats = new Stats();
        stats.addLoss();
        assertEquals(1, stats.getLosses());
    }

    @Test
    public void test_Stats_AddPointsScored() {
        Stats stats = new Stats();
        stats.addPointsScored(10);
        assertEquals(10, stats.getPointsScored());
    }

    @Test
    public void test_Stats_AddWin() {
        Stats stats = new Stats();
        stats.addWin();
        assertEquals(1, stats.getWins());
    }

    @Test
    public void test_Stats_GetWins() {
        Stats stats = new Stats();
        assertEquals(0, stats.getWins());
    }

    @Test
    public void test_Stats_GetLosses() {
        Stats stats = new Stats();
        assertEquals(0, stats.getLosses());
    }

    @Test
    public void test_Stats_ToString() {
        Stats stats = new Stats();
        assertEquals("Wins: 0, Losses: 0, Points Scored: 0", stats.toString());
    }
}
