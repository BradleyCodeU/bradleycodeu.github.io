import static org.junit.Assert.assertEquals;
import org.junit.Test;

import io.github.bradleycodeu.Player;
import io.github.bradleycodeu.Team;

public class Test_Game {

    @Test
    public void testPlaySingleRound() {
        Player player1 = new Player();
        Player player2 = new Player();
        Player roundWinner = Game.playSingleRound(player1, player2);
        assertNotNull(roundWinner);
        assertEquals(true, roundWinner == player1 || roundWinner == player2);
    }

    @Test
    public void testPlay() {
        Team team1 = new Team();
        Team team2 = new Team();
        Game game = new Game(team1, team2);
        String result = game.play();
        assertNotNull(result);
    }

    @Test
    public void testToStringGameNotOver() {
        Team team1 = new Team();
        Team team2 = new Team();
        Game game = new Game(team1, team2);
        String result = game.toString();
        int zeroCount = 0;
        for (char c : result.toCharArray()) {
            if (c == '0') {
                zeroCount++;
            }
        }
        assertEquals(2, zeroCount);
    }

    @Test
    public void testToStringGameOver() {
        Team team1 = new Team();
        Team team2 = new Team();
        Game game = new Game(team1, team2);
        String result = game.toString();
        assertEquals(true, result.contains(team1.getName()));
        assertEquals(true, result.contains(team2.getName()));
    }
}

