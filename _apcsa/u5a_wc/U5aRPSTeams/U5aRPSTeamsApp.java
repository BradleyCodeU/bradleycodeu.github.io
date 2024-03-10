// Name class (helper class)
// - array of player names
// - array of city names
// - array of adjectives
// - array of mascot names
// + randomPlayerName
// + randomCityName
// + randomMascot

// Team class
// - array of players
// - city name
// - adjective mascot name
// - name
// - currentSeasonStats
// - lifetimeStats
// - currentPlayerIndex
// + addLoss
// + addPointsScored
// + addWin
// + getNextPlayer
// + toString

// Stats class
// - wins
// - losses
// + addLoss()  <--- TO DO!!!
// + addPointsScored(int points)  <--- TO DO!!!
// + addWin()  <--- TO DO!!!
// + toString()  <--- TO DO!!!

// Player class
// - name
// - team
// - idNumber
// - favPlay
// - currentSeasonStats
// - lifetimeStats
// - skillLevel
// + Constructor  <--- TO DO!!!
// + addLoss()  <--- TO DO!!!
// + addPointsScored(int points)  <--- TO DO!!!
// + addWin()  <--- TO DO!!!
// + getLifetimeStats()  <--- TO DO!!!
// + getPlay()  <--- TO DO!!!
// + getSeasonStats()  <--- TO DO!!!
// + getSkillLevel()  <--- TO DO!!!
// + getWins()  <--- TO DO!!!
// + setTeamEmoji(String emoji)  <--- TO DO!!!)
// + toString()  <--- TO DO!!!

// Game class
// - isGameOver
// - player1
// - player2
// - p1score
// - p2score
// - winner
// + playSingleRound(Player player1, Player player2) <--- TO DO!!!
// + Constructor  <--- TO DO!!!
// + play()  <--- TO DO!!!
// + toString()  <--- TO DO!!!

class U5aRPSTeamsApp {

  public static void main(String[] args) {
    Team[] teams = { new Team(), new Team(), new Team(), new Team() };
    System.out.println(teams[0].toString());

    System.out.println(teams[1].toString());
    Game g1 = new Game(teams[0], teams[1]);
    System.out.println(g1.toString());
    g1.play();

    // Add another game between the other two teams <--- TO DO!!!
    
  }

}
