package io.github.bradleycodeu;
// Create a public class called Game
public class Game{
// Create public static Player playSingleRound(Player player1, Player player2)
// that returns the winner of a single round of rock, paper, scissors. The
// winner of the round gets 1 point (if both players play the same thing then
// the player with the higher skill level gets the point). Add 1 point to the
// player's stats using the addPointsScored method. The method should also print
// out the plays of each player and getName() + " scores the point". Return the
// winner of the round.

// A Game has a boolean isGameOver, Team team1, Team team2, int t1score, int
// t2score, and Team winner

// A Game has a constructor that takes two teams and assigns them to team1 and
// team2

// public String method play() that simulates a 5-round game between the two
// teams.
// If not isGameOver,
// Loop for 5 rounds...
// Each round 0-4, getNextPlayer() from team1 and getNextPlayer() from team2.
// Player roundWinner = playSingleRound(player1, player2);
// if roundWinner == player1, add to t1score
// else, add to t2score
// print the current score
// After the 5 rounds, the winner of the game is the team with the most points.
// Add the t1score to team1's points using the addPointsScored method
// Add the t2score to team2's points using the addPointsScored method
// Add 1 win to the winning team using the addWin method
// Add 1 loss to the losing team using the addLoss method
// Set isGameOver to true
// Print the winner of the game and the final score
// Return a String that looks like this... "Atlanta Red Shoes: 2, Boston Blue
// Fish: 3"

// toString() if the game is NOT over, Return a String that looks like this...
// "Atlanta Red Shoes: 0, Boston Blue Fish: 0". if the game is over, Return a
// String that looks like this... "Atlanta Red Shoes: 2, Boston Blue Fish: 3"
}