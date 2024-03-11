

public class Player {

  static final String[] PLAYS = { "r", "p", "s" };
  static private int idCounter = 0;

  public static String getRandomPlay() {
    int rand = (int) (Math.random() * Player.PLAYS.length);
    return Player.PLAYS[rand];
  }

  private String name;
  private String teamEmoji;
  private int idNumber;
  private String favPlay;
  private Stats currentSeasonStats;
  private Stats lifetimeStats;
  private double skillLevel;

  // Constructor for the Player class
  public Player() {
    // Assign the current value of the idCounter to the player's idNumber

    // Increment the idCounter for the next player

    // Generate a name for the player using the static method in the Name class

    // Generate a random favorite play for the player using the static method in the
    // Player class

    // Create a new Stats object to store the player's current season statistics

    // Create a new Stats object to store the player's lifetime statistics

    // Generate a random skill level for the player

  }

  // addLoss() increments the number of losses for the player's current season
  // statistics AND their lifetime stats

  // addPointsScored(int points) increments the number of points scored for the
  // player's current season statistics AND their lifetime stats

  // addWin() increments the number of wins for the player's current season
  // statistics AND their lifetime stats

  // getLifetimeStats() returns the player's lifetime statistics

  // getName() returns the team's emoji + " " + the player's name

  // getPlay() 25% chance to return the player's favorite play and 75% chance to
  // return a random play

  // getSeasonStats() returns the player's current season statistics

  // getSkillLevel() returns the player's skill level

  // getWins() returns the number of wins for the player

  // setTeamEmoji(String emoji) sets the player's team emoji

  // toString

}