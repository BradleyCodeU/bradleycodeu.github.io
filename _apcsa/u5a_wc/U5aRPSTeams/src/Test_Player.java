import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class Test_Player {

    @Test
    public void testAddLoss() {
        Player player = new Player();
        Stats currentSeasonStats = player.getSeasonStats();
        Stats lifetimeStats = player.getLifetimeStats();
        player.addLoss();
        assertEquals(1, currentSeasonStats.getLosses());
        assertEquals(1, lifetimeStats.getLosses());
    }

    @Test
    public void testAddPointsScored() {
        Player player = new Player();
        Stats currentSeasonStats = player.getSeasonStats();
        Stats lifetimeStats = player.getLifetimeStats();
        player.addPointsScored(10);
        assertEquals(10, currentSeasonStats.getPointsScored());
        assertEquals(10, lifetimeStats.getPointsScored());
    }

    @Test
    public void testAddWin() {
        Player player = new Player();
        Stats currentSeasonStats = player.getSeasonStats();
        Stats lifetimeStats = player.getLifetimeStats();
        player.addWin();
        assertEquals(1, currentSeasonStats.getWins());
        assertEquals(1, lifetimeStats.getWins());
    }

    @Test
    public void testGetName() {
        Player player = new Player();
        assertNotNull(player.getName());
    }

    @Test
    public void testGetPlay() {
        Player player = new Player();
        String play = player.getPlay();
        assertNotNull(play);
        assertTrue(play.equals(player.getFavPlay()) || play.equals(Player.PLAYS[0]) || play.equals(Player.PLAYS[1]) || play.equals(Player.PLAYS[2]));
    }

    @Test
    public void testGetSkillLevel() {
        Player player = new Player();
        assertTrue(player.getSkillLevel() >= 0 && player.getSkillLevel() <= 1);
    }

    @Test
    public void testGetWins() {
        Player player = new Player();
        assertEquals(0, player.getWins());
    }

    @Test
    public void testSetTeamEmoji() {
        Player player = new Player();
        player.setTeamEmoji("🚀");
        assertEquals("🚀", player.getTeamEmoji());
    }

    @Test
    public void testToString() {
        Player player = new Player();
        assertNotNull(player.toString());
    }
}
