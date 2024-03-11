

public class Team {

  // - array of players
  private Player[] players;
  private String emoji;
  // - city name
  private String cityName;
  // - adjective mascot name
  private String adjectiveMascotName;
  // - name
  private String name;
  // - currentSeasonStats
  private Stats currentSeasonStats;
  // - lifetimeStats
  private Stats lifetimeStats;

  private int currentPlayerIndex = -1;

  public Team() {
    this.cityName = Name.randomCityName();
    this.adjectiveMascotName = Name.randomMascot();
    this.emoji = Name.randomEmoji();
    // Create a new array of players with a length of 5
    this.players = new Player[5];
    // Assign the current value of the idCounter to the player's idNumber
    for (int i = 0; i < this.players.length; i++) {
      this.players[i] = new Player();
      this.players[i].setTeamEmoji(this.emoji);
    }

    // Create a new Stats object to store the player's current season statistics
    this.currentSeasonStats = new Stats();
    // Create a new Stats object to store the player's lifetime statistics
    this.lifetimeStats = new Stats();
    // Generate a random skill level for the player
    // Generate a random city name using the static method in the Name class
    // Generate a random adjective mascot name using the static method in the Name
    // class

    this.name = this.cityName + " " + this.adjectiveMascotName;
  }

  public void addLoss() {
    this.currentSeasonStats.addLoss();
    for (Player player : this.players) {
      player.getSeasonStats().addLoss();
    }
  }

  public void addPointsScored(int pts) {
    this.currentSeasonStats.addPointsScored(pts);
  }

  public void addWin() {
    this.currentSeasonStats.addWin();
    for (Player player : this.players) {
      player.getSeasonStats().addWin();
    }
  }

  public String getName() {
    return this.name;
  }

  public Player getNextPlayer() {
    currentPlayerIndex++;
    return this.players[currentPlayerIndex % this.players.length];
  }

  public String toString() {
    String result = this.emoji +" "+ this.name + "\n" + this.emoji + " " + this.currentSeasonStats.toString();
    for (int i = 0; i < this.players.length; i++) {
      result += "\n" + this.emoji +" "+ this.players[i].toString();
    }
    return result;
  }

}