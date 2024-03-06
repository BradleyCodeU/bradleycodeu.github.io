import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


class Test_U3aBasketballApp {

    @Test
    void haveSameJerseyNumber_SameNumber_Test() {
        BasketballPlayer player1 = new BasketballPlayer("Player1", "Team1", 10);
        BasketballPlayer player2 = new BasketballPlayer("Player2", "Team2", 10);

        assertTrue(U3aBasketballApp.haveSameJerseyNumber(player1, player2));
    }

    @Test
    void haveSameJerseyNumber_DifferentNumber_Test() {
        BasketballPlayer player1 = new BasketballPlayer("Player1", "Team1", 10);
        BasketballPlayer player2 = new BasketballPlayer("Player2", "Team2", 20);

        assertFalse(U3aBasketballApp.haveSameJerseyNumber(player1, player2));
    }

    @Test
    void areOnSameTeam_SameTeam_Test() {
        BasketballPlayer player1 = new BasketballPlayer("Player1", "Team1", 10);
        BasketballPlayer player2 = new BasketballPlayer("Player2", "Team1", 20);

        assertTrue(U3aBasketballApp.areOnSameTeam(player1, player2));
    }

    @Test
    void areOnSameTeam_DifferentTeam_Test() {
        BasketballPlayer player1 = new BasketballPlayer("Player1", "Team1", 10);
        BasketballPlayer player2 = new BasketballPlayer("Player2", "Team2", 20);

        assertFalse(U3aBasketballApp.areOnSameTeam(player1, player2));
    }

    @Test
    void areOnSameTeam_Null_Test() {
        BasketballPlayer player1 = new BasketballPlayer();
        BasketballPlayer player2 = new BasketballPlayer("Player2", "Team2", 20);

        assertFalse(U3aBasketballApp.areOnSameTeam(player1, player2));
        assertFalse(U3aBasketballApp.areOnSameTeam(player2, player1));
    }

    @Test
    void areInSameLocation_SameLocation_Test() {
        BasketballPlayer player1 = new BasketballPlayer("Player1", "Team1", 10);
        player1.setLocation(new Point(0, 0));
        BasketballPlayer player2 = new BasketballPlayer("Player2", "Team1", 20);
        player2.setLocation(new Point(0, 0));

        assertTrue(U3aBasketballApp.areInSameLocation(player1, player2));
    }

    @Test
    void areInSameLocation_DifferentLocation_Test() {
        BasketballPlayer player1 = new BasketballPlayer("Player1", "Team1", 10);
        player1.setLocation(new Point(0, 0));
        BasketballPlayer player2 = new BasketballPlayer("Player2", "Team1", 20);
        player2.setLocation(new Point(3, 4));

        assertFalse(U3aBasketballApp.areInSameLocation(player1, player2));
    }
    @Test
    void areInSameLocation_Null_Test() {
        BasketballPlayer player1 = new BasketballPlayer();
        BasketballPlayer player2 = new BasketballPlayer("Player2", "Team1", 20);
        player2.setLocation(new Point(3, 4));

        assertFalse(U3aBasketballApp.areInSameLocation(player1, player2));
        assertFalse(U3aBasketballApp.areInSameLocation(player2, player1));
    }

    @Test
    void findDistance_Test() {
        BasketballPlayer player1 = new BasketballPlayer("Player1", "Team1", 10);
        player1.setLocation(new Point(0, 0));
        BasketballPlayer player2 = new BasketballPlayer("Player2", "Team1", 20);
        player2.setLocation(new Point(3, 4));

        assertEquals(5.0, U3aBasketballApp.findDistance(player1, player2));
        assertEquals(0.0, U3aBasketballApp.findDistance(player1, player1));
    }
    @Test
    void test_findDistanceNull() {
        BasketballPlayer player1 = new BasketballPlayer();
        BasketballPlayer player2 = new BasketballPlayer("Player2", "Team1", 20);
        player2.setLocation(new Point(3, 4));

        assertEquals(-1.0, U3aBasketballApp.findDistance(player1, player2));

    }

    @Test
    void longestName_Test() {
        BasketballPlayer player1 = new BasketballPlayer("John", "Team1", 10);
        BasketballPlayer player2 = new BasketballPlayer("Michael", "Team2", 20);

        assertEquals("Michael", BasketballPlayer.longestName(player1, player2));
        assertEquals("Michael", BasketballPlayer.longestName(player2, player1));
        assertEquals("Equal length", BasketballPlayer.longestName(player1, player1));
    }

    @Test
    void tradePlayer_AlreadyOnNewTeam_Test() {
        BasketballPlayer player1 = new BasketballPlayer("Player1", "Team1", 10);

        assertFalse(BasketballPlayer.tradePlayer(player1, "Team1"));
        assertEquals("Team1", player1.getTeamName());
    }

    @Test
    void tradePlayer_SuccessfulTrade_Test() {
        BasketballPlayer player1 = new BasketballPlayer("Player1", "Team1", 10);

        assertTrue(BasketballPlayer.tradePlayer(player1, "Team2"));
        assertNotEquals("Team1", player1.getTeamName());
        assertTrue(player1.getJerseyNumber() >= 0 && player1.getJerseyNumber() <= 55);
    }
}
